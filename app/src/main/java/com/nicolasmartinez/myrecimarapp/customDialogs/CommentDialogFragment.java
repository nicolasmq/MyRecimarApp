package com.nicolasmartinez.myrecimarapp.customDialogs;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.nicolasmartinez.myrecimarapp.R;
import com.nicolasmartinez.myrecimarapp.model.Comment;
import com.nicolasmartinez.myrecimarapp.sqlite.ConexionSQLiteHelper;
import com.nicolasmartinez.myrecimarapp.utilities.Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * A simple {@link Fragment} subclass.
 */
public class CommentDialogFragment extends DialogFragment {

    private Activity actividad;
    private Button btnEnviar;
    private EditText etComentario, etComentarioCli;
    private ConexionSQLiteHelper conn;
    private DatabaseReference databaseReference;

    public CommentDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comment_dialog, container, false);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
      return crearDialogoComentario();
    }

    private AlertDialog crearDialogoComentario() {

        Bundle b = getArguments();
        String id = b.get("id").toString();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        String dayOfTheWeek = sdf.format(d);

        databaseReference = FirebaseDatabase.getInstance().getReference();
        databaseReference.child("Rutas").child("ruta_" + dayOfTheWeek).child(id).child("nombre").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String nombre = dataSnapshot.getValue().toString();
                etComentarioCli.setText(nombre);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        conn = new ConexionSQLiteHelper(getContext(),"db_recimar",null,1);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_comment_dialog, null);
        builder.setView(view);

        etComentario = view.findViewById(R.id.etComentario);
        etComentarioCli = view.findViewById(R.id.etComentarioCli);
        btnEnviar = view.findViewById(R.id.btnEnviar);
        enviar();

        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Activity){
            this.actividad = (Activity) context;
        }else {
            throw new RuntimeException(context.toString()+
                     "must implement OnFragmentInteractionListener");
        }
    }

    private void enviar() {

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                conn = new ConexionSQLiteHelper(getContext(),"db_recimar",null,1);
                SQLiteDatabase db = conn.getWritableDatabase();

                if (etComentarioCli.getText().toString().equals("")){
                    etComentarioCli.setError("Requerido");
                }else {

                    ContentValues values = new ContentValues();
                    values.put(Utilities.CAMPO_COMENTARIO, etComentario.getText().toString());
                    values.put(Utilities.CAMPO_COMENTARIO_CLIENTE, etComentarioCli.getText().toString());
                    db.insert(Utilities.TABLA_COMENTARIO, null, values);


                    Comment c = new Comment();
                    c.setUid(UUID.randomUUID().toString());
                    c.setComment(etComentario.getText().toString());
                    c.setClient(etComentarioCli.getText().toString());
                    c.setState("ingresado");
                    databaseReference.child("Comentarios").child(c.getUid()).setValue(c);
                    dismiss();
                    db.close();
                }
            }

        });
    }
}
