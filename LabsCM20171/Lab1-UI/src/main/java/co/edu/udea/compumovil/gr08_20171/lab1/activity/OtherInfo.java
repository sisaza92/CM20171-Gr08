package co.edu.udea.compumovil.gr08_20171.lab1.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import co.edu.udea.compumovil.gr08_20171.lab1.R;

public class OtherInfo extends AppCompatActivity {

    TextView tvResumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_info);

        tvResumen = (TextView)findViewById(R.id.tvResumen);
    }

    public void mostrarInformacion(View view){

        Bundle datos = getIntent().getBundleExtra("datos");

        String nombres = datos.getString("nombres");
        String apellidos = datos.getString("apellidos");
        String sexo = datos.getString("sexo");
        String fechaNaci = datos.getString("fechaNaci");
        String gradoEscolar = datos.getString("grado");
        String telefono = datos.getString("telefono");
        String correo = datos.getString("correo");
        String pais = datos.getString("pais");
        String ciudad = datos.getString("ciudad");
        String direccion = datos.getString("direccion");


        tvResumen.setText(
                "Nombres:"+nombres+
                        "\nApellidos: "+apellidos+
                        "\nSexo: "+sexo+
                        "\nFecha de Nacimiento: "+fechaNaci+
                        "\nGrado de Escolaridad: "+gradoEscolar+
                        "\nTeléfono: "+telefono+
                        "\nCorreo: "+correo+
                        "\nPaís: "+pais+
                        "\nCiudad: "+ciudad+
                        "\nDirección: "+direccion
        );

    }
}
