package com.tejasvedantham.masalachat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

import static com.tejasvedantham.masalachat.SetProfile.myProfile;

public class Rank extends AppCompatActivity {

//    private boolean[] religions;
//    private boolean[] astrologies;
//    private boolean[] educations;
//    private boolean[] foods;
//    private boolean[] sociabilties;
//    private boolean[] languages;
//    private boolean[] hobbies;
//    private boolean[] music;
//    private boolean[] sports;
//    private boolean[] movies;

    private Button setValues;

    final boolean[][] arrays = {new boolean[6], new boolean[12], new boolean[5], new boolean[5],
            new boolean[3], new boolean[13], new boolean[13], new boolean[8], new boolean[6]};

    final int[] ids = {R.id.religion, R.id.astrology, R.id.education, R.id.food, R.id.sociability, R.id.language,
            R.id.hobbies, R.id.music, R.id.sports, R.id.movies};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);

        setValues = ((Button) findViewById(R.id.setValues));

        setValues.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                for (int i = 0; i < ids.length; i++) {
                    EditText rank = (EditText) findViewById(ids[i]);
                    Integer rankInt = Integer.parseInt(rank.getText().toString());
                    myProfile.setResumeArray(rankInt - 1, arrays[i]);
                }

                FirebaseDatabase.getInstance().getReference("Profile").child("resumeArray").
                        setValue(myProfile.getResumeArray());

            }
        });



    }

}
