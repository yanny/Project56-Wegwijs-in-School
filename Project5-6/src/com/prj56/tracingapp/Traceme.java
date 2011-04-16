package com.prj56.tracingapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class Traceme extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.traceme);
	
    
    //Docent list
    Spinner spinner = (Spinner) findViewById(R.id.sptxtdocent);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
            this, R.array.arrayDocent, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);

    //Anuleren button click
    Button b2 = (Button) findViewById(R.id.btnAnuleren);
    
    b2.setOnClickListener(new View.OnClickListener() {
    	public void onClick(View view) {
            finish();
        }
    });
}
}