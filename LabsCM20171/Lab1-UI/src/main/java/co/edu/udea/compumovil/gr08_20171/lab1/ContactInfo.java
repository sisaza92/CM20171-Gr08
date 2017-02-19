package co.edu.udea.compumovil.gr08_20171.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class ContactInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);

        // Get a reference to the AutoCompleteTextView in the layout
        AutoCompleteTextView TextViewPais = (AutoCompleteTextView) findViewById(R.id.AutoCompletePaises);

        // Get the string array
        String[] paises = getResources().getStringArray(R.array.paises_arrays);

        // Create the adapter and set it to the AutoCompleteTextView
        ArrayAdapter<String> adapterPais =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, paises);
        TextViewPais.setAdapter(adapterPais);

        // Get a reference to the AutoCompleteTextView in the layout
        AutoCompleteTextView TextViewCiudad = (AutoCompleteTextView) findViewById(R.id.AutoCompleteCiudades);

        // Get the string array
        String[] ciudades = getResources().getStringArray(R.array.ciudades_arrays);

        // Create the adapter and set it to the AutoCompleteTextView
        ArrayAdapter<String> adapterCiudad =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ciudades);
        TextViewCiudad.setAdapter(adapterCiudad);
    }
}
