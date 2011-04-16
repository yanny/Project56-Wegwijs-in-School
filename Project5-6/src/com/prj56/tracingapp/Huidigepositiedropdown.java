package com.prj56.tracingapp;
import com.prj56.tracingapp.R;

import android.app.Activity;
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
        
        //vleugels ophalen en tonen in spinner
        Spinner huidigeVleugelSpinner = (Spinner) findViewById(R.id.vleugel);
        ArrayAdapter<CharSequence> vleugelsAdap = ArrayAdapter.createFromResource(
                this, R.array.vleugels, android.R.layout.simple_spinner_item);
        vleugelsAdap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        huidigeVleugelSpinner.setAdapter(vleugelsAdap);
        
        //verdiepingen ophalen en tonen in spinner
        Spinner verdiepingSpinner = (Spinner) findViewById(R.id.verdieping);
        ArrayAdapter<CharSequence> verdiepingAdap = ArrayAdapter.createFromResource(
                this, R.array.verdiepingen, android.R.layout.simple_spinner_item);
        verdiepingAdap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        verdiepingSpinner.setAdapter(verdiepingAdap);
        
        //lokaalnummers ophalen en tonen in spinner
        Spinner lokaalnummersSpinner = (Spinner) findViewById(R.id.lokaalnummer);
        ArrayAdapter<CharSequence> lokaalnummersAdap = ArrayAdapter.createFromResource(
                this, R.array.lokaalnummers, android.R.layout.simple_spinner_item);
        lokaalnummersAdap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lokaalnummersSpinner.setAdapter(lokaalnummersAdap);
        
        //Als je klikt op knop
        /*
        spinner4.setOnClickListener(new View.OnClickListener() {
	        	public void onClick(View view) {
	                Intent intent = new Intent(view.getContext(), Huidigepositiedropdown.class);
	                startActivity(intent);
	        	} 
        });
        */

	    //Afsluiten button click
	    Button b2 = (Button) findViewById(R.id.btnAfsluiten);
	    
	    b2.setOnClickListener(new View.OnClickListener() {
	    	public void onClick(View view) {
	            finish();
	        }
	    });
    }
}