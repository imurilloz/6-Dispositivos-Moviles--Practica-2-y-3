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

public class Second extends Activity {
	Button enviar;
	EditText destinatario,asunto,texto;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		enviar=(Button)findViewById(R.id.btnEnviar);
		destinatario=(EditText)findViewById(R.id.editDestino);
		asunto=(EditText)findViewById(R.id.editAsunto);
		texto=(EditText)findViewById(R.id.editContenido);
		
		enviar.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (!destinatario.getText().toString().equals("")){
					enviarMail();
				}
			}
			
			
		});
		
	}
	
	public void enviarMail(){
		
		Intent intent = new Intent(android.content.Intent.ACTION_SEND); 
		intent.setType("text/plain");
		intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{destinatario.getText().toString()});
		intent.putExtra(android.content.Intent.EXTRA_SUBJECT, new String[]{asunto.getText().toString()});
		intent.putExtra(android.content.Intent.EXTRA_TEXT, new String[]{texto.getText().toString()});
		try{
			startActivity(Intent.createChooser(intent, "Enviando Correo"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
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
