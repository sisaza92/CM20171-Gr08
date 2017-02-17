package co.edu.udea.compumovil.gr08_20171.lab1.activity;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import co.edu.udea.compumovil.gr08_20171.lab1.util.DatePickerFragment;
import co.edu.udea.compumovil.gr08_20171.lab1.R;


public class PersonalInfo extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
    }

    public void showDatePicker(View view){
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "timePicker");
        Log.d("showDatePicker","Registro");
    }

}

