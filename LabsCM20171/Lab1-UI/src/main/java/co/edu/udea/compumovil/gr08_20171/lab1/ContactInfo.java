package co.edu.udea.compumovil.gr08_20171.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class ContactInfo extends AppCompatActivity {

    EditText inputTelefono ;
    EditText inputEmail;
    AutoCompleteTextView inputPais;
    AutoCompleteTextView inputCiudad;
    EditText inputDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);

        inputTelefono = (EditText)findViewById(R.id.telefonoInfoContact) ;
        inputEmail = (EditText) findViewById(R.id.correoInfoContact) ;
        inputPais = (AutoCompleteTextView) findViewById(R.id.AutoCompletePaises);
        inputDireccion = (EditText) findViewById(R.id.direccionInfoContact);

        // Crea el autocompletar para los paises
        inputPais = (AutoCompleteTextView) findViewById(R.id.AutoCompletePaises);
        String[] paises = getResources().getStringArray(R.array.paises_arrays);
        ArrayAdapter<String> adapterPais =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, paises);
        inputPais.setAdapter(adapterPais);

        // Crea el autocompletar para las ciudades
        inputCiudad = (AutoCompleteTextView) findViewById(R.id.AutoCompleteCiudades);
        String[] ciudades = getResources().getStringArray(R.array.ciudades_arrays);
        ArrayAdapter<String> adapterCiudad =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ciudades);
        inputCiudad.setAdapter(adapterCiudad);

        Button button = (Button) findViewById(R.id.SiguienteInfoContact);
        button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), OtherInfo.class);
                startActivityForResult(intent, 0);
            }
        });

    }

 }
