package com.prj56.tracingapp;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.prj56.tracingapp.R;


public class Traceit extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.traceit);
        
        //Local list
        
        Spinner spinner3 = (Spinner) findViewById(R.id.spLocal);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(
                this, R.array.arrayLocal, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);    
         
    
        //Anuleren button click
        Button b2 = (Button) findViewById(R.id.btnAnuleren);
    
	    b2.setOnClickListener(new View.OnClickListener() {
	    	public void onClick(View view) {
	            finish();
	        }
	    });
    }
}

