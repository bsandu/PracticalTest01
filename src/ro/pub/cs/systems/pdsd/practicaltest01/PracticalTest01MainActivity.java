package ro.pub.cs.systems.pdsd.practicaltest01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01MainActivity extends Activity {

	String name = "";
	String email = "";
	String phone = "";
	String last_pressed = "";
	
	
	private class ButtonClickListener implements Button.OnClickListener {

		EditText ed1 = (EditText)findViewById(R.id.editText1);
		
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
				case R.id.button_name: {
					if(last_pressed=="email") {
						email = ed1.getText().toString();
					}
					if(last_pressed=="phone") {
						phone = ed1.getText().toString();
					}
					if(name=="" || name == null) {
						ed1.setHint("Name");
					}
					else {
						ed1.setText(name);
					}
					last_pressed="name";
					break;
				}
				case R.id.button_email: {
					if(last_pressed=="name") {
						name = ed1.getText().toString();
					}
					if(last_pressed=="phone") {
						phone = ed1.getText().toString();
					}
					if(email=="" || email == null) {
						ed1.setHint("Email");
					}
					else {
						ed1.setText(email);
					}
					last_pressed="email";
					break;
				}
				case R.id.button_phone: {
					if(last_pressed=="email") {
						email = ed1.getText().toString();
					}
					if(last_pressed=="name") {
						name = ed1.getText().toString();
					}
					if(phone=="" || phone == null) {
						ed1.setHint("Phone");
					}
					else {
						ed1.setText(phone);
					}
					last_pressed="phone";
					break;
				}
				default: {
					break;
				}
				
			}
		}
		
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_practical_test01_main);
		
		EditText ed1 = (EditText)findViewById(R.id.editText1);
		ed1.setHint("Name");
		
		ButtonClickListener listenhere = new ButtonClickListener();
		
		Button b_name = (Button)findViewById(R.id.button_name);
		b_name.setOnClickListener(listenhere);
		Button b_email = (Button)findViewById(R.id.button_email);
		b_email.setOnClickListener(listenhere);
		Button b_phone = (Button)findViewById(R.id.button_phone);
		b_phone.setOnClickListener(listenhere);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.practical_test01_main, menu);
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
}
