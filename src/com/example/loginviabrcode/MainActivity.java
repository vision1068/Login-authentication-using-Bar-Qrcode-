package com.example.loginviabrcode;







import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
	public void scanNow(View v)  {

		 Intent intent = new Intent("com.google.zxing.client.android.SCAN");
	      startActivityForResult(intent, 0);
	 
		//run and show About Activity(Screen) in popup
    //	Intent i = new Intent(this, Main.class);
    	//startActivity(i);
    	//finish();
       // return;

    }

	
	  public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		  String format="";
		  String contents="";
		  if (requestCode == 0) {
	          if (resultCode == RESULT_OK) {
	             contents = intent.getStringExtra("SCAN_RESULT");
	            format = intent.getStringExtra("SCAN_RESULT_FORMAT");
	           if(contents.equalsIgnoreCase("6935364050566"))
	            {
	        	   finish();
				Intent i = new Intent(this, Main.class);
				String keyIdentifer  = null;
				i.putExtra("FORMAT", format);
				i.putExtra("CONTENT", contents);
			 	startActivity(i);
			 	 return;
	            }
	           else 
	           { Toast t = Toast.makeText(this, "Password is wrong", Toast.LENGTH_SHORT);
		    	t.show();
	        	   finish();
					Intent i = new Intent(this, MainActivity.class);
					String keyIdentifer  = null;
					i.putExtra("FORMAT", format);
					i.putExtra("CONTENT", contents);
				 	startActivity(i);
				 	 return;
	           }
					
	         } 
	          else if (resultCode == RESULT_CANCELED) {
	        	finish();
					Intent i = new Intent(this, MainActivity.class);
				 	startActivity(i);
				 	return;
	         }
	      }
	      
	      else{
	    	  
	    	Toast t = Toast.makeText(this, "record not found", Toast.LENGTH_SHORT);
	    	t.show();
				Intent i = new Intent(this, MainActivity.class);
			 	startActivity(i);
			 	return;
	    	  
	      }
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
