package com.opsconsulting.mcummins.opsconsultingmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class QACSoftwareAnalysis extends aa_ActivityBase {

    @Override
    //onCreate method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qacsoftwareanalysis);

        //home button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QACSoftwareAnalysis.this, ActivityMenu.class);
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

    //creates dot menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.qac_menu, menu);
        return true;
    }

    //highlights button of selected page
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        menu.findItem(R.id.softwareQualityAnalysisMenu).setChecked(true);
        return true;
    }

    //dot menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        Intent intent;

        switch(id){
            case R.id.estimateSoftwareMenu:
                intent = new Intent(this, ActivityQAC.class);
                startActivity(intent);
                break;
            case R.id.softwareQualityAnalysisMenu:
                intent = new Intent(this, QACSoftwareAnalysis.class);
                startActivity(intent);
                break;
            case R.id.softwareDevelopmentMenu:
                intent = new Intent(this, QACSoftwareDevelopment.class);
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