package ru.geekbrains.merphy.calc_the_beginning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }




    private void initButton1ClickListener() {
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(button1ClickListener);
    }

        @Override
        protected void onStart() {
            super.onStart();

        }

        @Override
        protected void onRestoreInstanceState(Bundle saveInstanceState){
            super.onRestoreInstanceState(saveInstanceState);

        }

        @Override
        protected void onResume() {
            super.onResume();

        }

        @Override
        protected void onPause() {
            super.onPause();

        }

        @Override
        protected void onSaveInstanceState(Bundle saveInstanceState){
            super.onSaveInstanceState(saveInstanceState);

        }

        @Override
        protected void onStop() {
            super.onStop();

        }

        @Override
        protected void onRestart() {
            super.onRestart();

        }

        @Override
        protected void onDestroy() {
            super.onDestroy();

        }

    @Override
    public void onClick(View v) {

    }
}
}