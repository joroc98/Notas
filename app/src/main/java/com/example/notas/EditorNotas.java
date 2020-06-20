package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class EditorNotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor_notas);

        EditText editText =(EditText) findViewById(R.id.editText);
        Intent intent = getIntent();
        int noteId = intent.getIntExtra("noteId",-1);
        if (noteId!= -1){
            editText.setText(MainActivity.notes.get(noteId));
        }

    }
}
