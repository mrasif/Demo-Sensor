package com.famoussoft.org.demosensor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLocation=(Button) findViewById(R.id.btnLocation);
        btnLocation.setOnClickListener(this);
        Button btnAccelerometer=(Button) findViewById(R.id.btnAccelerometer);
        btnAccelerometer.setOnClickListener(this);
        Button btnProximity=(Button) findViewById(R.id.btnProximity);
        btnProximity.setOnClickListener(this);
        Button btnAmbient=(Button)findViewById(R.id.btnAmbient);
        btnAmbient.setOnClickListener(this);
        Button btnLight=(Button)findViewById(R.id.btnLight);
        btnLight.setOnClickListener(this);
        Button btnPressure=(Button)findViewById(R.id.btnPressure);
        btnPressure.setOnClickListener(this);
        Button btnMagnetic=(Button)findViewById(R.id.btnMagnetic);
        btnMagnetic.setOnClickListener(this);
        Button btnHumidity=(Button)findViewById(R.id.btnHumidity);
        btnHumidity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btnLocation:
                intent=new Intent(MainActivity.this,Location.class);
                startActivity(intent);
                break;
            case R.id.btnAccelerometer:
                intent=new Intent(MainActivity.this,Accelerometer.class);
                startActivity(intent);
                break;
            case R.id.btnProximity:
                intent=new Intent(MainActivity.this,Proximity.class);
                startActivity(intent);
                break;
            case R.id.btnAmbient:
                intent=new Intent(MainActivity.this,Ambient.class);
                startActivity(intent);
                break;
            case R.id.btnLight:
                intent=new Intent(MainActivity.this,Light.class);
                startActivity(intent);
                break;
            case R.id.btnPressure:
                intent=new Intent(MainActivity.this,Pressure.class);
                startActivity(intent);
                break;
            case R.id.btnMagnetic:
                intent=new Intent(MainActivity.this,Magnetic.class);
                startActivity(intent);
                break;
            case R.id.btnHumidity:
                intent=new Intent(MainActivity.this,Humidity.class);
                startActivity(intent);
                break;
        }

    }
}
