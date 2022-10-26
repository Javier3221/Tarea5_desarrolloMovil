package com.example.tarea5;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity; import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class recetas extends AppCompatActivity {
    ListView lstOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);

        Bundle data = getIntent().getExtras();

        switch (data.getString("comida")) {
            case "Carne":
                carne();
                break;
            case "Pan":
                pan();
                break;
            case "Sopas y cremas":
                sopa();
                break;
            case "Pescado":
                pescado();
                break;
            case "Ensalada":
                ensalada();
                break;
        }
    }
    private void ensalada() {

        lstOptions = findViewById(R.id.lstOptions);
        final String[] datos = new String[]{"Ensalada de pasta, queso y huevo",
                "Ensalada de lechuga, bacalao y aguacate", "Ensalada de pepino, " +
                "cebolleta y aceitunas", "Judías verdes con setas y huevo", "Ensalada de bonito y patata"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        lstOptions.setAdapter(adapter);
        lstOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i,long l) {
                String position = String.valueOf(i); Intent intent = new Intent(recetas.this, recetaCompleta.class);
                Bundle data = new Bundle();
                data.putString("p", position); data.putString("comida", "ensalada");
                intent.putExtras(data);
                startActivity(intent);
            }
        });
    }

        private void pescado() {
            lstOptions = findViewById(R.id.lstOptions);
            final String[] datos = new String[]{"Mejillones con mahonesa verde picante",
                    "Fogonero con salsa de tomate y pimiento", "Verdel con patatas y tomate",
                    "Merluza rellena de setas y pistachos", "Calamares con mojo verde"};
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
            lstOptions.setAdapter(adapter);
            lstOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                  String position = String.valueOf(i);
                  Intent intent = new Intent(recetas.this, recetaCompleta.class);
                  Bundle data = new Bundle(); data.putString("p", position);
                  data.putString("comida", "pescado"); intent.putExtras(data);
                  startActivity(intent);
              }
            });
        }

        private void sopa() {
            lstOptions = findViewById(R.id.lstOptions);
            final String[] datos = new String[]{"Vichyssoise con delicias de queso",
                    "Gazpacho andaluz tradicional", "Sopa de pescado con fideos",
                    "Sopa de fideos", "Puré de colores"};
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
            lstOptions.setAdapter(adapter);
            lstOptions.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String position = String.valueOf(i);
                    Intent intent = new Intent(recetas.this, recetaCompleta.class);
                    Bundle data = new Bundle(); data.putString("p", position);
                    data.putString("comida", "sopa"); intent.putExtras(data);
                    startActivity(intent);
                }
            });
        }

        private void pan() {
            lstOptions = findViewById(R.id.lstOptions);
            final String[] datos = new String[]{"Pan casero fácil y rápido",
                    "Pan especiado", "Pan integral", "Pan y bollos de leche", "Pan de cereales"};
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
            lstOptions.setAdapter(adapter);
            lstOptions.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String position = String.valueOf(i);
                    Intent intent = new Intent(recetas.this, recetaCompleta.class);
                    Bundle data = new Bundle();
                    data.putString("p", position); data.putString("comida", "pan");
                    intent.putExtras(data); startActivity(intent);
                }
            });
        }
        private void carne() {
            lstOptions = findViewById(R.id.lstOptions);
            final String[] datos = new String[]{"Costilla asada al txakoli",
                    "Costilla de cerdo con champiñones", "Paloma asada con puré de manzana",
                    "Costillas asadas con cítricos", "Pintada asada con uvas"};
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, datos);
            lstOptions.setAdapter(adapter);
            lstOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String position = String.valueOf(i);
                    Intent intent = new Intent(recetas.this, recetaCompleta.class);
                    Bundle data = new Bundle(); data.putString("p", position);
                    data.putString("comida", "carne"); intent.putExtras(data);
                    startActivity(intent);
                }
            });
        }
}
