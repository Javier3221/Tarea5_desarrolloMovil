package com.example.tarea5;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Spinner spinner;
    String[] datos = {"Carne","Pan","Sopas y cremas","Pescado","Ensalada"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.CmbOptions);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, datos);
        spinner.setAdapter(adaptador);
    }

    @Override
    public void onClick(View view) {
        String comida = spinner.getSelectedItem().toString();
        Intent intent = new Intent(this, recetas.class);
        Bundle data = new Bundle();
        data.putString("comida", comida);
        intent.putExtras(data);
        startActivity(intent);
    }
}