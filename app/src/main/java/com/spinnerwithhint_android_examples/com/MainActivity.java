package com.spinnerwithhint_android_examples.com;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	Spinner spinner;
	String[] spinnerValue = {
			"PHP",
			"ANDROID",
			"WEB-DESIGN",
			"PHOTOSHOP"
			};
	
	 @TargetApi(Build.VERSION_CODES.HONEYCOMB)
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_main);
	 
	 spinner =(Spinner)findViewById(R.id.spinner1);
	 
	 
	 spinnerAdapter adapter = new spinnerAdapter(MainActivity.this, android.R.layout.simple_list_item_1);
	  adapter.addAll(spinnerValue);
	  adapter.add("Hint Demo");
	  spinner.setAdapter(adapter);
	  spinner.setSelection(adapter.getCount());
	  
	  spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> parent, View view,
				int position, long id) {
			// TODO Auto-generated method stub
			
			if(spinner.getSelectedItem() == "This is Hint Text")
			{
			
				//Do nothing.
			}
			else{
			
			Toast.makeText(MainActivity.this, spinner.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
			
			}
		}

		@Override
		public void onNothingSelected(AdapterView<?> parent) {
			// TODO Auto-generated method stub
			
		}
	});
	 
	}
	}