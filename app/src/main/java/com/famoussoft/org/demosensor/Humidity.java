package com.famoussoft.org.demosensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Humidity extends AppCompatActivity implements SensorEventListener {

    Sensor mySensor;
    SensorManager SM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humidity);
        SM=(SensorManager) getSystemService(SENSOR_SERVICE);
        mySensor=SM.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY);
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
        TextView tvOutput=(TextView) findViewById(R.id.txtOutput);
        tvOutput.setText("Humidity: "+sensorEvent.values[0]+" %");
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
