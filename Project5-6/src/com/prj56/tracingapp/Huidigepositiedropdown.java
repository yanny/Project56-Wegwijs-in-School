package com.prj56.tracingapp;
import com.prj56.tracingapp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class Huidigepositiedropdown extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.huidigepositiedropdown);
        
        //Local list
        final Spinner spinner4 = (Spinner) findViewById(R.id.spLocal);
        
        spinner4.setOnClickListener(new View.OnClickListener() {
	        	public void onClick(View view) {
	                Intent intent = new Intent(view.getContext(), Traceme.class);
	                startActivity(intent);
	            
	        
	        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(
	                this, R.array.arrayLocal, android.R.layout.simple_spinner_item);
	        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        spinner4.setAdapter(adapter4);
	        
	        
	          
	    
		    //Afsluiten button click
		    Button b2 = (Button) findViewById(R.id.btnAfsluiten);
		    
		    b2.setOnClickListener(new View.OnClickListener() {
		    	public void onClick(View view) {
		            finish();
		        }
		    });
	    
        }
    }
}