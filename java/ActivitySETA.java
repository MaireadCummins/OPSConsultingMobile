package com.opsconsulting.mcummins.opsconsultingmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class ActivitySETA extends aa_ActivityBase {

    @Override
    //onCreate method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seta);

        //home button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivitySETA.this, ActivityMenu.class);
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
        menu.findItem(R.id.setaMenu).setChecked(true);
        return true;
    }

    //creates dot menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.seta_menu, menu);
        return true;
    }

    //dot menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        Intent intent;

        switch(id){
            case R.id.setaMenu:
                intent = new Intent(this, ActivitySETA.class);
                startActivity(intent);
                break;
            case R.id.supportMenu:
                intent = new Intent(this, SETAMissionandAcquisitionSupport.class);
                startActivity(intent);
                break;
            case R.id.costMenu:
                intent = new Intent(this, SETACostEconomicAnalysis.class);
                startActivity(intent);
                break;
            case R.id.programMenu:
                intent = new Intent(this, SETAProgramManagement.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    //main menu
    @java.lang.Override
    public boolean onNavigationItemSelected(MenuItem item) {
        return super.onNavigationItemSelected(item);
    }
}
