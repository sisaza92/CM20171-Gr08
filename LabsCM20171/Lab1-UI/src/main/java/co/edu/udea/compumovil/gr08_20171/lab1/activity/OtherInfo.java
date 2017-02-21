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

        tvResumen.setText(datos.toString());

    }
}
