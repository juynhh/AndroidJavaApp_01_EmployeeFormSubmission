package com.juynhh.android.myjavatest;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onPreviewClicked();
    }

    private void onPreviewClicked() {
        TextInputEditText contactNameEditText = findViewById(R.id.edit_text_contact_name);
        TextInputEditText contactNumberEditText = findViewById(R.id.edit_text_contact_number);
        String testString = contactNumberEditText.getText().toString();
    }
}