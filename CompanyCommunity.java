package com.opsconsulting.mcummins.opsconsultingmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class CompanyCommunity extends aa_ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companycommunity);

        //home button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CompanyCommunity.this, ActivityMenu.class);
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
        menu.findItem(R.id.communityMenu).setChecked(true);
        return true;
    }

    //creates dot menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.company_menu, menu);
        return true;
    }

    //dot menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        Intent intent;

        switch(id) {
            case R.id.companyMenu:
                intent = new Intent(this, ActivityAbout.class);
                startActivity(intent);
                break;
            case R.id.leadershipMenu:
                intent = new Intent(this, CompanyLeadership.class);
                startActivity(intent);
                break;
            case R.id.communityMenu:
                intent = new Intent(this, CompanyCommunity.class);
                startActivity(intent);
                break;
            case R.id.strategicPartnersMenu:
                intent = new Intent(this, CompanyStrategicPartners.class);
                startActivity(intent);
                break;
            case R.id.achievementsMenu:
                intent = new Intent(this, CompanyAchievements.class);
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
