package zeev.fraiman.cyber1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class Aboutapps extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutapps);
	}

	public void back(View v) {
		finish();
	}

}
