package com.example.instantrun_test_1;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.j1lib.MyClass1;
import com.example.j2lib.MyClass2;
import com.example.mya1library.AL1;
import com.example.mya2library.JLA;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int x = 30;
        int y = 20;

        AL1 al1 = new AL1();
        JLA jla = new JLA();

        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();

        Gson gson = new Gson();

        Log.d("Test", "Test");

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        ((LocationManager) getSystemService(Context.LOCATION_SERVICE)).getLastKnownLocation("gps");
    }
}
