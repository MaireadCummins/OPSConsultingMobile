package com.opsconsulting.mcummins.opsconsultingmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class ActivityAnalytics extends aa_ActivityBase {

    @Override
    //onCreate method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analytics);

        //home button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityAnalytics.this, ActivityMenu.class);
                startActivity(intent);
            }
        });
        toolbarAndMenu();
    }

    //calls onBackPressed
    @java.lang.Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    //highlights button of selected page
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        menu.findItem(R.id.trainingMenu).setChecked(true);
        return true;
    }

    //creates dot menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.analytics_menu, menu);
        return true;
    }

    //dot menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    //main menu
    @java.lang.Override
    public boolean onNavigationItemSelected(MenuItem item) {
        return super.onNavigationItemSelected(item);
    }
}