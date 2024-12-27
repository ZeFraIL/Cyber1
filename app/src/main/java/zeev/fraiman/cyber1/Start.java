package zeev.fraiman.cyber1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Start extends Activity {
	
	EditText et;
	String stcode="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		
		et=(EditText) findViewById(R.id.et);
	}

	public void goShift (View v)  {
		stcode=et.getText().toString();
		if (!stcode.equals("")) {
			Intent itgo=new Intent(this, Shift.class);
			itgo.putExtra("stcode", stcode);
			startActivity(itgo);
		}
	}
	
	public void goRev (View v)  {
		stcode=et.getText().toString();
		if (!stcode.equals("")) {
			Intent itgo=new Intent(this, Reverse.class);
			itgo.putExtra("stcode", stcode);
			startActivity(itgo);
		}
	}
	
	public void goZz (View v)  {
		stcode=et.getText().toString();
		if (!stcode.equals("")) {
			Intent itgo=new Intent(this, Zigzag.class);
			itgo.putExtra("stcode", stcode);
			startActivity(itgo);
		}
	}
	
	public void about(View v)  {
		Intent itabout=new Intent(this, About.class);
		startActivity(itabout);
	}
	
	
	public void aboutapps(View v)  {
		Intent itabout=new Intent(this, Aboutapps.class);
		startActivity(itabout);
	}
}
