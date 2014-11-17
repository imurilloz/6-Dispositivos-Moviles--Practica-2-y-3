package com.cut.login3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	EditText name;
	EditText pass;
	Button login;
	Button cancel;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		name = (EditText)findViewById(R.id.editUser);
		pass = (EditText)findViewById(R.id.editPass);
		login = (Button)findViewById(R.id.btnLogin);
		cancel = (Button)findViewById(R.id.btnCancel);
		login.setOnClickListener(this);
		cancel.setOnClickListener(this);
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
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String na = name.getText().toString();
		String pa = pass.getText().toString();
		
		switch (v.getId()) {
		case R.id.btnLogin:
			
				if (na.equals("root") && pa.equals("moviles")){
					Intent i=new Intent(this,Second.class);
					startActivity(i);
				}
			
			break;
			
		case R.id.btnCancel:
			
				name.setText(" ");
				pass.setText(" ");
			
			break;
		default:
			
			break;
			
		
		}
		
	}
}
