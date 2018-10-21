package com.tejasvedantham.masalachat;

import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

public class SetProfile extends Activity {
    private Button submitButton;
    public static Profile myProfile = new Profile (null, null, 0, null, null, Profile.resumeArray);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_profile);

        submitButton = ((Button) findViewById(R.id.submit));

        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText name = (EditText)findViewById(R.id.name);
                myProfile.setName(name.getText().toString());
                EditText location = (EditText)findViewById(R.id.location);
                myProfile.setLocation((Location) location.getText());
                EditText age = (EditText)findViewById(R.id.age);
                myProfile.setAge(Integer.parseInt(age.getText().toString()));
                EditText intro = (EditText) findViewById(R.id.intro);
                myProfile.setIntroduction(intro.getText().toString());

                FirebaseDatabase.getInstance().getReference("Profile").
                        setValue(myProfile);
            }
        });

        CheckBox male = (CheckBox) findViewById(R.id.male);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myProfile.setGender(Gender.MALE);
            }
        });

        CheckBox female = (CheckBox) findViewById(R.id.female);
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myProfile.setGender(Gender.FEMALE);
            }
        });

        CheckBox bisexual = (CheckBox) findViewById(R.id.bisexual);
        bisexual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myProfile.setGender(Gender.BISEXUAL);
            }
        });

    }
}
