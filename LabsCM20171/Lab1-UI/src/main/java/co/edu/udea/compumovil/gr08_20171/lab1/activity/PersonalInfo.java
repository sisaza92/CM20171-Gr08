package co.edu.udea.compumovil.gr08_20171.lab1.activity;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import co.edu.udea.compumovil.gr08_20171.lab1.util.DatePickerFragment;
import co.edu.udea.compumovil.gr08_20171.lab1.R;


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
        RadioGroup rgSex = (RadioGroup) findViewById(R.id.rgSexo);
        sprGradoEscolaridad = (Spinner) findViewById(R.id.sprGradoEscolaridad);
    }

    public void showDatePicker(View view){
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "timePicker");
    }

    public void showNextActivity(View view){

        Bundle datos = new Bundle();

        datos.putString("nombres", input_nombres.getText().toString());
        datos.putString("apellidos", input_apellidos.getText().toString());

        RadioButton rbChecked = (RadioButton) findViewById(rgSexo.getCheckedRadioButtonId());
        datos.putString("sexo", rbChecked.getText().toString());
        datos.putString("grado", sprGradoEscolaridad.getSelectedItem().toString());

    }

}
