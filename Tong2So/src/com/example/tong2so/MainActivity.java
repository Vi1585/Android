package com.example.tong2so;

import com.example.tong2so.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
    }
    public void btnTong2So(View v)
    {
    	EditText edita = (EditText)findViewById(R.id.edita);
    	int a = Integer.parseInt(edita.getText()+"");
    	
    	EditText editb = (EditText)findViewById(R.id.editb);
    	int b = Integer.parseInt(editb.getText()+"");
    	
    	TextView txtkq = (TextView)findViewById(R.id.txtKq);
    	txtkq.setText((a+b)+"");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
