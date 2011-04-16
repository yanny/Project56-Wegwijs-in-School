package com.prj56.tracingapp;
import com.prj56.tracingapp.Main;
import com.prj56.tracingapp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
    //Trace me button click
    /* deze is tijdelijk op onklikbaar gemaakt, we focus op trace it */
    Button b1 = (Button) findViewById(R.id.btnTraceme);

    b1.setOnClickListener(new View.OnClickListener() {
    	public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), Traceit.class);

            startActivity(intent);
        }
    });
    
    //Trace it button click
    Button b2 = (Button) findViewById(R.id.btnTraceit);    
    
    b2.setOnClickListener(new View.OnClickListener() {
    	public void onClick(View view) {
    		Intent intent = new Intent(view.getContext(),Vertrekpunt.class);
    		
            startActivity(intent);
        }
    });
    
  //Afsluiten button click
    Button b3 = (Button) findViewById(R.id.btnAfsluiten);
    
    b3.setOnClickListener(new View.OnClickListener() {
    	public void onClick(View view) {	    		
    		AlertDialog.Builder alt = new AlertDialog.Builder(Main.this);
    		alt.setMessage("Wilt u zeker afsluiten ?")
    		.setCancelable(false)
    		.setPositiveButton("Ja", new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface dialog, int id) {
    			finish(); // quit
    		}
    		})
    		.setNegativeButton("Nee", new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface dialog, int id) {
    			dialog.cancel(); //don't quit
    		}
    		});
    		AlertDialog alert = alt.create();
    		// Title for AlertDialog
    		alert.setTitle("Afsluiten?");
    		// Icon for AlertDialog
    		alert.setIcon(R.drawable.icon);
    		alert.show();
        }
    });
    
}
}