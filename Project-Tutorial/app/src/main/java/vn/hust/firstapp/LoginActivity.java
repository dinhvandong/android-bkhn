package vn.hust.firstapp;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.Manifest.permission.ACCESS_FINE_LOCATION;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    private FusedLocationProviderClient fusedLocationClient;
    private ArrayList permissionsToRequest;
    private ArrayList permissionsRejected = new ArrayList();
    private ArrayList permissions = new ArrayList();

    private final static int ALL_PERMISSIONS_RESULT = 101;
    LocationTrack locationTrack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        RelativeLayout btn7 = (RelativeLayout) findViewById(R.id.btn7);
        Log.d("OnCreate", "OnCreate");

    }
    @Override
    protected void onStart() {
       super.onStart();

        Log.d("OnStart","OnStart");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("OnStop","OnStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("OnDestroy","onDestroy");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("OnPause","OnPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","onResume");

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing Activity")
                .setMessage("Are you sure you want to close this activity?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }


}