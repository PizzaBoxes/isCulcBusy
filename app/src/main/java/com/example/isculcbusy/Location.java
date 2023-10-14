package com.example.isculcbusy;
import static androidx.activity.result.ActivityResultCallerKt.registerForActivityResult;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import android.Manifest;
import androidx.activity.ComponentActivity.*;

public class Location {
    ActivityResultLauncher<String[]> locationPermissionRequest =
            registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(),
                    result -> {
                        Boolean fineLocationGranted = false;
                        if (android.Manifest.permission.ACCESS_FINE_LOCATION != null) {
                            fineLocationGranted = true;
                        }
                        Boolean coarseLocationGranted = false;
                        if (Manifest.permission.ACCESS_COARSE_LOCATION != null) {
                            coarseLocationGranted = true;
                        }
                        if (fineLocationGranted && coarseLocationGranted) {
                            // Precise location access granted.
                        } else if (coarseLocationGranted != null && coarseLocationGranted) {
                            // Only approximate location access granted.
                        } else {
                            // No location access granted.
                        }
                    }
            );

}


