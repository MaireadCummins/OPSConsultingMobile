package com.opsconsulting.mcummins.opsconsultingmobile;

import android.os.Bundle;
import android.view.MenuItem;

public class ActivityMenu extends aa_ActivityBase {

    @Override
    //onCreate method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        toolbarAndMenu();
        viewFlipper();
    }

    //calls onBackPressed
    @java.lang.Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    //main menu
    @java.lang.Override
    public boolean onNavigationItemSelected(MenuItem item) {
        return super.onNavigationItemSelected(item);
    }
}
