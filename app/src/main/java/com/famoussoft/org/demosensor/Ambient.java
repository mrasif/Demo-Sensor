package com.famoussoft.org.demosensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ambient extends AppCompatActivity implements SensorEventListener {

    Sensor mySensor;
    SensorManager SM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambient);
        SM=(SensorManager) getSystemService(SENSOR_SERVICE);
        mySensor=SM.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
        SM.registerListener(this,mySensor,SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SM.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        TextView txtOutput=(TextView) findViewById(R.id.txtOutput);
        txtOutput.setText("Temperature: "+sensorEvent.values[0]+" C");
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
