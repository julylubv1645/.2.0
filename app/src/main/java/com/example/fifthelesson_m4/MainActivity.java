package com.example.fifthelesson_m4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // поля
    private Button button;
    private EditText editEngineg, editTransmission, editBody; // поля вводных данных

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка разметки к полям
        button = findViewById(R.id.button);
        editEngineg = findViewById(R.id.editString);
        editTransmission = findViewById(R.id.editInt);
        editBody = findViewById(R.id.editDouble);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }
    // слушатель нажатия кнопки
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // считывание данных
            int engine = Integer.parseInt(editEngineg.getText().toString());
            int transmission = Integer.parseInt(editTransmission.getText().toString());
            int body = Integer.parseInt(editBody.getText().toString());

            int sum = engine + transmission + body;

            // создание намерения
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            // упаковка в намерение простых данных
            intent.putExtra("sum",sum);


            // запуск намерения
            startActivity(intent);
        }
    };
}