package com.opsconsulting.mcummins.opsconsultingmobile;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

abstract public class aa_ActivityBase extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //finishes current activity
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void toolbarAndMenu() {

        //creates toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //creates main menu
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        //allows you to click things on the menu
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    //viewFlipper
    public void viewFlipper(){
        ViewFlipper mFlipper;
        mFlipper = (ViewFlipper) findViewById(R.id.flipper);
        mFlipper.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right));
        mFlipper.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left));
        mFlipper.setFlipInterval(7000); //in milliseconds
        mFlipper.startFlipping();
    }

    //main menu
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent;

        switch(id)
        {
            case R.id.about: //goes to Our Company
                intent = new Intent(this, ActivityAbout.class);
                startActivity(intent);
                break;
            case R.id.seta: // goes to SETA and Acquisition Support
                intent = new Intent(this, ActivitySETA.class);
                startActivity(intent);
                break;
            case R.id.software: // goes to Software and Systems Development
                intent = new Intent(this, ActivitySoftware.class);
                startActivity(intent);
                break;
            case R.id.training:  // goes to Intelligence Analytics and Training
                intent = new Intent(this, ActivityAnalytics.class);
                startActivity(intent);
                break;
            case R.id.QACSTUFF: // goes to QAC
                intent = new Intent(this, ActivityQAC.class);
                startActivity(intent);
                break;
            case R.id.careers: // goes to Careers
                intent = new Intent(this, ActivityCareers.class);
                startActivity(intent);
                break;
            case R.id.contactUs: // goes to Contact Us
                intent = new Intent(this, ActivityContact.class);
                startActivity(intent);
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //dot menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        Intent intent;

        switch(id) {
            case R.id.trainingMenu:
                intent = new Intent(this, ActivityAnalytics.class);
                startActivity(intent);
                break;
            case R.id.growingAnalystMenu:
                intent = new Intent(this, AnalyticsGrowingAnalyst.class);
                startActivity(intent);
                break;
            case R.id.networkExploitationMenu:
                intent = new Intent(this, AnalyticsNetworkExploitation.class);
                startActivity(intent);
                break;
            case R.id.networkDefenseMenu:
                intent = new Intent(this, AnalyticsNetworkDefense.class);
                startActivity(intent);
                break;
            case R.id.networkAttackMenu:
                intent = new Intent(this, AnalyticsNetworkAttack.class);
                startActivity(intent);
                break;
            case R.id.networkOperationsMenu:
                intent = new Intent(this, AnalyticsNetworkOperations.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
