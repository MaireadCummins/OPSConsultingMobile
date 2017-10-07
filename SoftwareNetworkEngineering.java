package com.opsconsulting.mcummins.opsconsultingmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class SoftwareNetworkEngineering extends aa_ActivityBase {

    @Override
    //onCreate method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_softwarenetworkengineering);

        //home button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SoftwareNetworkEngineering.this, ActivityMenu.class);
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
        menu.findItem(R.id.networkMenu).setChecked(true);
        return true;
    }

    //creates dot menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.software_menu, menu);
        return true;
    }

    //dot menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        Intent intent;

        switch(id){
            case R.id.systemsDevMenu:
                intent = new Intent(this, ActivitySoftware.class);
                startActivity(intent);
                break;
            case R.id.softwareMenu:
                intent = new Intent(this, SoftwareSoftwareEngineering.class);
                startActivity(intent);
                break;
            case R.id.databaseMenu:
                intent = new Intent(this, SoftwareDatabaseEngineering.class);
                startActivity(intent);
                break;
            case R.id.networkMenu:
                intent = new Intent(this, SoftwareNetworkEngineering.class);
                startActivity(intent);
                break;
            case R.id.systemMenu:
                intent = new Intent(this, SoftwareSystemEngineering.class);
                startActivity(intent);
                break;
            case R.id.administrationMenu:
                intent = new Intent(this, SoftwareITSystemsAdministration.class);
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
