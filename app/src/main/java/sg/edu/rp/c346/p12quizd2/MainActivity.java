package sg.edu.rp.c346.p12quizd2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Spinner spnCountry;
    CheckBox cbEnglish, cbChinese, cbMalay;
    Button btnSubmit;

    ArrayList<String> alCountries;
    ArrayAdapter<String> aaCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Declaration Form");

        etName = findViewById(R.id.editTextName);
        spnCountry = findViewById(R.id.spinnerCountry);
        cbEnglish = findViewById(R.id.checkboxEnglish);
        cbChinese = findViewById(R.id.checkboxChinese);
        cbMalay = findViewById(R.id.checkboxMalay);
        btnSubmit = findViewById(R.id.buttonSubmit);

        // TODO: Question 3: Do the required initialization of the ArrayList and ArrayAdapter and populating the spinner with the required values





        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO: Question 4: Do the required form validation and show the corresponding message using AlertDialog





            }
        });
    }
}