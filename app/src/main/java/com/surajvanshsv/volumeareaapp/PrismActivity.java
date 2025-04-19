package com.surajvanshsv.volumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrismActivity extends AppCompatActivity {
    TextView title, result;
    EditText prism_length,prism_width, prism_height;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prism);
        prism_height = findViewById(R.id.editText_prism_height);
        prism_length = findViewById(R.id.editText_prism_length);
        prism_width = findViewById(R.id.editText_prism_width);

        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String height = prism_height.getText().toString();
                String length = prism_height.getText().toString();
                String width = prism_width.getText().toString();



                int h = Integer.parseInt(height);
                int w = Integer.parseInt(width);
                int l = Integer.parseInt(height);

                double volume = l * w * h ;
                result.setText("V = "+volume + " m^3");
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}
