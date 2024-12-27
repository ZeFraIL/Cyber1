package zeev.fraiman.cyber1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Reverse extends Activity {
	
	TextView tvBefore, tvAfter;
	Button btnBack;
	String st="", stnew="",basic="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String st1="Your text before coding:",st2="Your text after coding:";
	int how=basic.length();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reverse);
		
		tvBefore=(TextView) findViewById(R.id.tvBefore);
		tvAfter=(TextView) findViewById(R.id.tvAfter);
		btnBack=(Button) findViewById(R.id.btnBack);
		
		Intent gi=getIntent();
		st=gi.getStringExtra("stcode");
		
		go(st);
	}

	public void go (String st) {
		int k;
		int n=st.length();
		for (int i=0; i<n; i++) {
			if (st.charAt(i)==' ')  stnew=stnew+"#";
			else {
				k=basic.indexOf(st.charAt(i));
				k=how-k-1;
				stnew=stnew+basic.charAt(k);
			}
		tvBefore.setText(st1+"\n"+st);
		tvAfter.setText(st2+"\n"+stnew);
		}
	}
	
	public void back (View v)  {
		finish();
	}

}
