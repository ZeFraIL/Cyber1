package zeev.fraiman.cyber1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Zigzag extends Activity {
	
	TextView tvBefore, tvAfter;
	Button btnBack;
	String st="", stnew="",basic="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String st1="Your text before coding:",st2="Your text after coding:";
	int how=basic.length();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zigzag);
		
		tvBefore=(TextView) findViewById(R.id.tvBefore);
		tvAfter=(TextView) findViewById(R.id.tvAfter);
		btnBack=(Button) findViewById(R.id.btnBack);
		
		Intent gi=getIntent();
		st=gi.getStringExtra("stcode");
		
		go(st);
	}

	public void go (String st)  {
		int n=st.length();
		String stnew="",st11="",st22="";
		for (int i=0; i<n; i++) 
			if (st.charAt(i)==' ')  st22+="#";
			else st22+=st.charAt(i);
		for (int i=0; i<n; i+=2)
			st11+=st22.charAt(i);
		for (int i=1; i<n; i+=2)
			st11+=st22.charAt(i);
		for (int i=0; i<n; i++)
			if(i%4==0&&i!=0) stnew+=" "+st11.charAt(i);
			else stnew+=st11.charAt(i);
		tvBefore.setText(st1+"\n"+st);
		tvAfter.setText(st2+"\n"+stnew);
	}
	
	public void back (View v)  {
		finish();
	}
}
