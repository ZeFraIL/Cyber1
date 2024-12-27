package zeev.fraiman.cyber1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class About extends Activity {
	
	TextView tv1;
	String st1="Dr. Evgeny Kanel & Ze'ev Fraiman", st2="\n"+"AMIT High school Be'er Sheva";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		tv1=(TextView) findViewById(R.id.tv1);
		tv1.setText(st1+st2);
		
	}

	public void back(View v) {
		finish();
	}

}
