package zeev.fraiman.cyber1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Shift extends Activity {
	
	TextView tvBefore, tvAfter;
	Button btnBack;
	EditText etSh;
	String st="", stnew="",basic="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String st1="Your text before coding:",st2="Your text after coding:";
	int how=basic.length();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shift);
		
		tvBefore=(TextView) findViewById(R.id.tvBefore);
		tvAfter=(TextView) findViewById(R.id.tvAfter);
		btnBack=(Button) findViewById(R.id.btnBack);
		etSh=(EditText) findViewById(R.id.etSh);
		
		Intent gi=getIntent();
		st=gi.getStringExtra("stcode");
		
		//go(st);
	}

	public void go (View v)  {
		int n=st.length();
		String stnew="";
		String stsh=etSh.getText().toString();
		int shift=Integer.parseInt(stsh);
		shift=Math.abs(shift);
		int k;
		for (int i=0; i<n; i++) 
			if (st.charAt(i)==' ')  stnew=stnew+"#";
			else {
				k=basic.indexOf(st.charAt(i))+shift;
				if (k>=how) k=k-how;
				stnew=stnew+basic.charAt(k);
			}
		tvBefore.setText(st1+"\n"+st);
		tvAfter.setText(st2+"\n"+stnew);
	}
}
