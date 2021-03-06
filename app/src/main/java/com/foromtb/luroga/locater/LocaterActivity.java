package com.foromtb.luroga.locater;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class LocaterActivity extends SingleFragmentActivityLoader {
    private static final int REQUEST_ERROR=0;

    @Override
    protected Fragment createFragment() {
        return FragmentLocater.newInstance();
    }
    @Override
    public void onResume() {
        super.onResume();

        GoogleApiAvailability apiDisponible = GoogleApiAvailability.getInstance();
        int errorCode = apiDisponible.isGooglePlayServicesAvailable(this);

        if(errorCode!= ConnectionResult.SUCCESS){
            Dialog errorDialog = apiDisponible.getErrorDialog(this, errorCode, REQUEST_ERROR, new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialog) {
                    finish();
                }
            });
            errorDialog.show();
        }
    }
}
