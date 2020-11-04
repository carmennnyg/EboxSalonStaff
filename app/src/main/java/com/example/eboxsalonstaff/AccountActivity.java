package com.example.eboxsalonstaff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AccountActivity extends AppCompatActivity {
    private ImageView mProfileIV, mJobsIV, mAppointHistoryIV, mScheduledIV, mRateReviewIV, mHelpSupportIV, mAboutIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        mProfileIV = findViewById(R.id.profile_image_view);
        mJobsIV = findViewById(R.id.jobs_image_view);
        mAppointHistoryIV = findViewById(R.id.appointHistory_image_view);
        mScheduledIV = findViewById(R.id.scheduled_image_view);
        mRateReviewIV = findViewById(R.id.rateReview_image_view);
        mHelpSupportIV = findViewById(R.id.helpSupport_image_view);
        mAboutIV = findViewById(R.id.about_image_view);

        mProfileIV.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(AccountActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });


    }
}