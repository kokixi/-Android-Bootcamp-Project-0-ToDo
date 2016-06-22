package com.anagrande.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    private int positionItem;
    private String item;
    private EditText etEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        positionItem = getIntent().getIntExtra("position", 0);
        item = getIntent().getStringExtra("item");

        etEditText = (EditText) findViewById(R.id.etEditText);
        etEditText.setText(item);
        etEditText.setSelection(item.length());

    }

    public void onSaveItem(View view) {
        Intent data = new Intent();

        data.putExtra("item", etEditText.getText().toString());
        data.putExtra("position", positionItem);

        setResult(RESULT_OK, data);

        finish();
    }
}
