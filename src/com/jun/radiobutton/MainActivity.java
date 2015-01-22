package com.jun.radiobutton;

import com.jun.widget.CommonRadioGroup;

import android.support.v7.app.ActionBarActivity;
import android.text.InputFilter.LengthFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends ActionBarActivity implements OnCheckedChangeListener {
	
	private CommonRadioGroup segmentText;
	private RadioButton buttonAll;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		init();
	}

	private final void init() {
		// TODO Auto-generated method stub
        segmentText = (CommonRadioGroup) findViewById(R.id.segment_text);
        segmentText.setOnCheckedChangeListener(this);
        buttonAll = (RadioButton) findViewById(R.id.button_all);
        buttonAll.setChecked(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		if (group == segmentText) {
			if (checkedId == R.id.button_all) {
				Toast.makeText(getApplicationContext(), "全部", Toast.LENGTH_SHORT).show();
			} else if (checkedId == R.id.button_one) {
				Toast.makeText(getApplicationContext(), "选项一", Toast.LENGTH_SHORT).show();
			} else if (checkedId == R.id.button_two) {
				Toast.makeText(getApplicationContext(), "选项二", Toast.LENGTH_SHORT).show();
			} else if (checkedId == R.id.button_three) {
				Toast.makeText(getApplicationContext(), "选项三", Toast.LENGTH_SHORT).show();
			}
		}
		
		
	}
}
