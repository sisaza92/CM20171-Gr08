package co.edu.udea.compumovil.gr08_20171.lab1.activity;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import co.edu.udea.compumovil.gr08_20171.lab1.util.DatePickerFragment;
import co.edu.udea.compumovil.gr08_20171.lab1.R;

/**
 * @author Cristian Camilo Isaza
 * @email sisaza92@gmail.com
 * @date 17/02/2017
 * Esta clase Controla la vista de la actividad PersonalInfo.
 */
public class PersonalInfo extends AppCompatActivity{

    EditText input_nombres,input_apellidos;
    RadioGroup rgSexo;
    Spinner sprGradoEscolaridad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        input_nombres = (EditText) findViewById(R.id.input_nombres);
        input_apellidos = (EditText) findViewById(R.id.input_apellidos);
        rgSexo = (RadioGroup) findViewById(R.id.rgSexo);
        sprGradoEscolaridad = (Spinner) findViewById(R.id.sprGradoEscolaridad);
    }

    /**
     * Método creado para mostrar el diálogo con el
     * selector de fecha y que es accionado por el boton
     * cambiar desde el XML.
     * @param view parámetro requerido para llamar el método a travéz del onClick en el XML.
     */
    public void showDatePicker(View view){
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "timePicker");
    }

    /**
     * Método ejecutado por el boton siguiente de la actividad y
     * que se encarga de recopilar los datos y lanzar la proxima
     * actividad.
     * @param view parámetro requerido para llamar el método a travéz del onClick en el XML.
     */
    public void showNextActivity(View view){

        Bundle datos = new Bundle();

        datos.putString("nombres", input_nombres.getText().toString());
        datos.putString("apellidos", input_apellidos.getText().toString());

        RadioButton rbChecked = (RadioButton) findViewById(rgSexo.getCheckedRadioButtonId());
        datos.putString("sexo", rbChecked.getText().toString());
        //TODO: Agregar la fecha al Bundle.
        datos.putString("grado", sprGradoEscolaridad.getSelectedItem().toString());

        Intent otherInfo = new Intent(view.getContext(),ContactInfo.class);
        otherInfo.putExtra("datos",datos);
        startActivity(otherInfo);

    }

}
