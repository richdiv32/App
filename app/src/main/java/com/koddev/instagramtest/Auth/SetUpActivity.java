package com.koddev.instagramtest.Auth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.koddev.instagramtest.MainActivity;
import com.koddev.instagramtest.R;

import java.util.HashMap;


public class SetUpActivity extends AppCompatActivity {

//    //Wigets
//    private EditText gender, birthday, fullname, telephone_number
//            , institution, faculty, department, relationship_status, bio;
    private Button Finish_Button;
////    private CircleImageView profileImage;
//
//    //Firebase
//    FirebaseAuth auth;
//    DatabaseReference UserRef;
//    String currentUserID;
//
//    ProgressDialog pd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up);

        Finish_Button = (Button) findViewById(R.id.finish_btn);
        Finish_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SetUpActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

//        auth = FirebaseAuth.getInstance();
//        UserRef = FirebaseDatabase.getInstance().getReference().child("Users");
//        currentUserID = auth.getCurrentUser().getUid();
//
//        intiWegits();
//        inti();


    }

//    private void intiWegits() {
//
//        gender = (EditText) findViewById(R.id.input_gender);
//        birthday = (EditText) findViewById(R.id.input_birthday);
//        telephone_number = (EditText) findViewById(R.id.input_number);
//        institution = (EditText) findViewById(R.id.input_institution);
//        faculty = (EditText) findViewById(R.id.input_faculty);
//        department = (EditText) findViewById(R.id.input_department);
//        relationship_status = (EditText) findViewById(R.id.input_relationship_status);
//        bio = (EditText) findViewById(R.id.input_bio);
//        fullname = (EditText) findViewById(R.id.input_fullname);
//
//        Finish_Button = (Button) findViewById(R.id.finish_btn);
//    }
//
//    private void inti(){
//
//        Finish_Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                saveUserInfo();
//
//            }
//        });
//    }
//
//    private void saveUserInfo() {
//
//        pd = new ProgressDialog(SetUpActivity.this);
//        pd.setMessage("Please wait...");
//        pd.show();
//
//        String str_fullname = fullname.getText().toString();
//        String str_bio = bio.getText().toString();
//        String str_birthday = birthday.getText().toString();
//        String str_gender = gender.getText().toString();
//        String str_institution = institution.getText().toString();
//        String str_faculty = faculty.getText().toString();
//        String str_department = department.getText().toString();
//        String str_relationship_status = relationship_status.getText().toString();
//        String str_telephone_number = telephone_number.getText().toString();
//
//
//        if (TextUtils.isEmpty(str_fullname) || TextUtils.isEmpty(str_bio) || TextUtils.isEmpty(str_birthday) || TextUtils.isEmpty(str_gender) ||
//                TextUtils.isEmpty(str_institution) || TextUtils.isEmpty(str_faculty) || TextUtils.isEmpty(str_department) || TextUtils.isEmpty(str_relationship_status) ||
//                TextUtils.isEmpty(str_telephone_number)){
//            Toast.makeText(SetUpActivity.this, "All fields are required!", Toast.LENGTH_SHORT).show();
//        }
//        else {
//
//            HashMap<String, Object> map = new HashMap<>();
//            map.put("fullname", fullname);
//            map.put("birthday", birthday);
//            map.put("gender", gender);
//            map.put("institution", institution);
//            map.put("faculty", faculty);
//            map.put("department", department);
//            map.put("relationship_status", relationship_status);
//            map.put("telephone_number", telephone_number);
//            map.put("imageurl", "https://firebasestorage.googleapis.com/v0/b/instagramtest-fcbef.appspot.com/o/placeholder.png?alt=media&token=b09b809d-a5f8-499b-9563-5252262e9a49");
//            map.put("bio", bio);
//
//            UserRef.updateChildren(map).addOnCompleteListener(new OnCompleteListener<Void>() {
//                @Override
//                public void onComplete(@NonNull Task<Void> task) {
//                    if (task.isSuccessful()){
////                        pd.dismiss();
//                        Intent intent = new Intent(SetUpActivity.this, MainActivity.class);
//                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent);
//                        finish();
//                    }
//                    else {
////                        pd.dismiss();
//                        String message = task.getException().getMessage();
//                        Toast.makeText(SetUpActivity.this, "Error Occurred: " + message, Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//        }
//    }


}
