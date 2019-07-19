package lk.ac.kln.dim.medicinereminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
       EditText userName = findViewById(R.id.txtUserName);
       EditText password = findViewById(R.id.txtPassword);

        System.out.println("\n=========\n"+userName.getText().toString()+"============"+password.getText().toString());
    }

    public void register(View view){

        Intent intent=new Intent(getApplicationContext(),Register.class);
        startActivity(intent);
    }
}
