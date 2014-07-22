package com.example.square;

import android.content.Context;
import android.graphics.*;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.*;

public class SquareMainActivity extends ActionBarActivity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MyView myView= new MyView(this);
		setContentView(myView);
	}

	//MyView is where the shape is drawn
	public class MyView extends View {
		public MyView(Context context)
		{
			super(context);
		}
	
		//Square is created in this method
		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			//Paint.ANTI_ALIAS_FLAG makes it smoother
			Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
			paint.setColor(Color.GREEN);
			paint.setStyle(Paint.Style.FILL);//Fills in the outline
			Rect rect = new Rect(); 
			rect.set(100,100,300,300);
			canvas.drawRect(rect, paint);
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.square_main, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_square_main,
					container, false);
			return rootView;
		}
	}

}
