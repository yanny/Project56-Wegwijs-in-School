package com.prj56.tracingapp;

import com.prj56.tracingapp.R;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Huidigepositiedropdown extends Activity {
	/** Called when the activity is first created. */

	private Spinner lokaalnummersSpinner, verdiepingSpinner,
			huidigeVleugelSpinner;
	public String vertrekLokaalnummer, vertrekVleugel, vertrekVerdieping;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.huidigepositiedropdown);

		lokaalnummersSpinner = (Spinner) findViewById(R.id.lokaalnummer);
		verdiepingSpinner = (Spinner) findViewById(R.id.verdieping);
		huidigeVleugelSpinner = (Spinner) findViewById(R.id.vleugel);

		vleugelsTonen();
		verdiepingenTonen();
		lokaalnummersTonen();

		okKnopTonen();
		annulerenKnopTonen();

	}

	/**
	 * Vleugels ophalen en tonen in spinner
	 */
	private void vleugelsTonen() {
		ArrayAdapter<CharSequence> vleugelsAdap = ArrayAdapter
				.createFromResource(this, R.array.vleugels,
						android.R.layout.simple_spinner_item);
		vleugelsAdap
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		huidigeVleugelSpinner.setAdapter(vleugelsAdap);
		huidigeVleugelSpinner.setPrompt("Vleugel");
		setVleugelListener();
	}

	/**
	 * Verdiepingen ophalen en tonen in spinner
	 */
	private void verdiepingenTonen() {
		ArrayAdapter<CharSequence> verdiepingAdap = ArrayAdapter
				.createFromResource(this, R.array.verdiepingen,
						android.R.layout.simple_spinner_item);
		verdiepingAdap
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		verdiepingSpinner.setAdapter(verdiepingAdap);
		verdiepingSpinner.setPrompt("Verdieping");
		setVerdiepingListener();
	}

	/**
	 * Lokaalnummers ophalen en tonen in spinner
	 */
	private void lokaalnummersTonen() {
		ArrayAdapter<CharSequence> lokaalnummersAdap = ArrayAdapter
				.createFromResource(this, R.array.lokaalnummers,
						android.R.layout.simple_spinner_item);
		lokaalnummersAdap
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		lokaalnummersSpinner.setAdapter(lokaalnummersAdap);
		lokaalnummersSpinner.setPrompt("Lokaalnummer");
		setLokaalnummerListener();
	}

	/**
	 * Ok knop tonen
	 */
	private void okKnopTonen() {
		Button okKnop = (Button) findViewById(R.id.btnVerder);

		okKnop.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				String vertrekLokaal = vertrekVleugel + "." + vertrekVerdieping
						+ "." + vertrekLokaalnummer;

				// opslaan in preferences
				int mode = Activity.MODE_PRIVATE;
				SharedPreferences mijnPreferences = getSharedPreferences(
						"mijnPreferences", mode);
				SharedPreferences.Editor editor = mijnPreferences.edit();
				editor.putString("vertrekLokaal", vertrekLokaal);
				editor.commit();

				// Volgende scherm is positie bevestigen
				Intent intent = new Intent(view.getContext(),
						HuidigePositieBevestigen.class);
				startActivity(intent);
			}
		});
	}

	private void setVleugelListener() {
		huidigeVleugelSpinner
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					public void onItemSelected(AdapterView<?> parent,
							View view, int pos, long id) {
						Object item = parent.getItemAtPosition(pos);
						vertrekVleugel = item.toString();
					}

					public void onNothingSelected(AdapterView<?> parent) {
					}
				});
	}

	private void setLokaalnummerListener() {
		lokaalnummersSpinner
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					public void onItemSelected(AdapterView<?> parent,
							View view, int pos, long id) {
						Object item = parent.getItemAtPosition(pos);
						vertrekLokaalnummer = item.toString();
					}

					public void onNothingSelected(AdapterView<?> parent) {
						System.out.println("hallo");
					}
				});
	}

	private void setVerdiepingListener() {
		verdiepingSpinner
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					public void onItemSelected(AdapterView<?> parent,
							View view, int pos, long id) {
						Object item = parent.getItemAtPosition(pos);
						vertrekVerdieping = item.toString();
					}

					public void onNothingSelected(AdapterView<?> parent) {
					}
				});
	}

	/**
	 * Annuleren knop
	 */
	private void annulerenKnopTonen() {
		Button b2 = (Button) findViewById(R.id.btnAnuleren);
		b2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				finish();
			}
		});
	}

}