package com.example.loginviabrcode;

import com.example.loginviabrcode.R;
import java.lang.reflect.InvocationTargetException;
import java.util.Timer;
import org.json.JSONObject;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity  { 
	//UI instance variables
	boolean isGPSEnabled =false;
	LocationListener locationListener;
	LocationManager lm;
	Location l;
	String provider;
     Dialog dialog; 
		private Button scanBtn;
		private Button Btns;
		private TextView formatTxt, contentTxt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_screen1);
		
		Btns = (Button)findViewById(R.id.button1);
		formatTxt = (TextView)findViewById(R.id.scan_format);
		contentTxt = (TextView)findViewById(R.id.scan_content);
		Intent iin= getIntent();
        Bundle b = iin.getExtras();
        String format =(String) b.get("FORMAT");
        String content =(String) b.get("CONTENT");
        formatTxt.setText(format);
        contentTxt.setText(content);

	//	scanNow();
	}
	

 
 
 

 
 
 
  private void scanNow(){
 
	  Intent intent = new Intent("com.google.zxing.client.android.SCAN");
      startActivityForResult(intent, 0);
 
}
  
  
  
  
  
  
  
	
	
	
	
	
 
	 
	   
	 
	  
		 
	  

}
 
