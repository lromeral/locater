package com.foromtb.luroga.locater;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LocaterActivity extends SingleFragmentActivityLoader {

    @Override
    protected Fragment createFragment() {
        return FragmentLocater.newInstance();
    }

}
