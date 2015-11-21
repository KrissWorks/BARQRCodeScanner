package com.jwetherell.quick_response_code;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by KrissRaj on 07-11-2015.
 */
public class MainActivity  extends Activity{

    Button qrcodeButton_btn;
    TextView qrcodeType_tv;
    TextView qrcodeText_tv;
    TextView qrcodeFormat_tv;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        qrcodeButton_btn = (Button) findViewById(R.id.QRCode_btn);

        qrcodeFormat_tv = (TextView) findViewById(R.id.QRCode_Format);
        qrcodeType_tv = (TextView) findViewById(R.id.QRCode_type);
        qrcodeText_tv = (TextView) findViewById(R.id.QRCode_txt);



        qrcodeButton_btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent QRCodeIntentCaller = new Intent(MainActivity.this, CaptureActivity.class);
                startActivity(QRCodeIntentCaller);
            }
        });

            Log.i("INTENT WITH RESULT", "---------------------Came Here----------------------------");

            Intent i = getIntent();
            final String QRCodeFormat = i.getStringExtra("CodeFormat");
            final String QRCodeType = i.getStringExtra("CodeType");
            final String QRCodeText = i.getStringExtra("CodeText");

        if(QRCodeText != null) {
            qrcodeButton_btn.setVisibility(View.GONE);
            qrcodeType_tv.setVisibility(View.VISIBLE);
            qrcodeFormat_tv.setVisibility(View.VISIBLE);
            qrcodeText_tv.setVisibility(View.VISIBLE);

            qrcodeType_tv.setText(QRCodeType);
            qrcodeFormat_tv.setText(QRCodeFormat);
            qrcodeText_tv.setText(QRCodeText);
        }
    }

}
