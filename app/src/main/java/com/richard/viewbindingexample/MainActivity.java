package com.richard.viewbindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.richard.viewbindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked button", Toast.LENGTH_SHORT).show();
            }
        });
        binding.button.setText("My button");

        binding.myTextView.setText("View Binding example");
        binding.myTextView.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white));

        binding.imageView.setImageResource(R.drawable.ic_launcher_background);
    }
}
