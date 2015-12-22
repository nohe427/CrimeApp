package com.bignerdranch.andrid.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by alex7370 on 12/21/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
