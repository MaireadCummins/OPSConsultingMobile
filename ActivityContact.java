package com.opsconsulting.mcummins.opsconsultingmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.MenuItem;
import android.net.Uri;
import android.widget.TextView;
import android.text.Html;
import android.text.method.LinkMovementMethod;

public class ActivityContact extends aa_ActivityBase {

    @Override
    //onCreate method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        //home button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityContact.this, ActivityMenu.class);
                startActivity(intent);
            }
        });
        toolbarAndMenu();

        TextView feedback = (TextView) findViewById(R.id.humanResourcesEmail);
        feedback.setText(Html.fromHtml("<a href=\"mailto:hr@opsconsulting.com\">hr@opsconsulting.com</a>"));
        feedback.setMovementMethod(LinkMovementMethod.getInstance());
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

    public void goToLinkedin (View view) {
        goToUrl("http://www.linkedin.com/company/130290?trk=tyah");
    }

    public void goToFacebook (View view) {
        goToUrl("https://www.facebook.com/Ops-Consulting-LLC-161221233896483/");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}