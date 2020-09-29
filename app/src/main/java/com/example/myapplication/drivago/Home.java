 package com.example.myapplication.drivago;

 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.ImageButton;

 import androidx.appcompat.app.AppCompatActivity;

 import com.google.firebase.auth.FirebaseAuth;

 public class Home extends AppCompatActivity {
     private ImageButton button1;
     private ImageButton sign_btn;
     private ImageButton vehi_btn;
     Button btnSignOut;
     FirebaseAuth mAuth;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_home);

         mAuth = FirebaseAuth.getInstance();

         btnSignOut = findViewById(R.id.logout);

         btnSignOut.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 mAuth.signOut();
                 signOutUser();
             }
         });



         button1 = (ImageButton) findViewById(R.id.teacher);
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
//                startActivity(new Intent(Home.this,
//                        Teacher.class));
                 Intent i = new Intent(Home.this, teacherN.class);
                 startActivity(i);

             }


         });

         sign_btn = (ImageButton) findViewById(R.id.signTab);
         sign_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
//                startActivity(new Intent(Home.this,
//                        Teacher.class));
                 Intent i = new Intent(Home.this, signs_mand.class);
                 startActivity(i);

             }
         });


         vehi_btn = (ImageButton) findViewById(R.id.vehicletab);
         vehi_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
//                startActivity(new Intent(Home.this,
//                        Teacher.class));
                 Intent i = new Intent(Home.this, category.class);
                 startActivity(i);

             }
         });

     }
     private void signOutUser() {
         Intent mainActivity = new Intent(Home.this, MainActivity.class);
         mainActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
         startActivity(mainActivity);
         finish();
     }
 }