package com.example.shivani.sample.Login;

import android.content.Intent;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.shivani.sample.ApiClient;
import com.example.shivani.sample.Leave1.LeaveActivity;
import com.example.shivani.sample.R;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//import android.provider.Settings.Secure;



public class MainActivity extends AppCompatActivity {

//    private String android_id = Secure.getString(MainActivity.this.getContentResolver(),
//            Secure.ANDROID_ID);
    private TextInputEditText username,password;
    private TextInputLayout username_text_input , password_text_input;
    private Button btn_login;
    private int flag =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (TextInputEditText) findViewById(R.id.username);
        password = (TextInputEditText) findViewById(R.id.password);
        username_text_input =(TextInputLayout)findViewById(R.id.username_text_input);
        password_text_input =(TextInputLayout)findViewById(R.id.password_text_input);
        btn_login=findViewById(R.id.btn_login);


        username_text_input.setHintAnimationEnabled(true);



        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String Username =username.getText().toString();
                String Password = password.getText().toString();
                String IPaddress = "357294067667343";
                String DeviceId="davff6o3344:APA91bGVHO3zXJFN8Bw_6-yxJnZXSPScAnLkyyDkPKqErINFTBnLrK5V6x8lZH6uRF-c47sg1ijVtvmjE1ictbanHGE-PSo78FTnj-DVS8EN0JwvXrBxnYL5e1_BjIgl-hm4zC7GnOZ0";


        //------------------------username/password empty validations

                if(Username.length() == 0)
                {username_text_input.setErrorEnabled(true);
                    username_text_input.setError("Please enter Username. ");

                    }

                if(Password.length() == 0)
                {password_text_input.setErrorEnabled(true);
                    password_text_input.setError("Please enter password. ");

                    }
                if(Username.length() != 0 && Password.length() != 0)
                    flag =1;


                if(flag == 1)
                //------------------------sending retrofit body parameters
                    send_data(Username,Password,IPaddress,DeviceId);
    }




    public void send_data(String Username,String Password,String IPaddress,String DeviceId){

        LoginApi apiService =
                ApiClient.getClient().create(LoginApi.class);

        Map<String,String> obj = new HashMap<>();
        //obj.put("Username","jitendra");
       // obj.put("Password","654321");
         obj.put("Username",Username);
        obj.put("Password",Password);
        obj.put("IPaddress",IPaddress);
        obj.put("DeviceId",DeviceId);


        Call<Example> call = apiService.getInfo(obj);

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                System.out.println("___________________________");

                // info = null;
                try {
                    List<LoginInfo> info = response.body().getData();
                    for(int i = 0; i < info.size(); i++) {
                        System.out.println(info.get(i).getEmployeeCode());
                        System.out.println(info.get(i).getEmpName());
                    }


                    Intent intent = new Intent(MainActivity.this, LeaveActivity.class);
                    String message = info.get(0).getEmpName();
                    String message1 = info.get(0).getEmployeeCode();
                    intent.putExtra("Name", message);
                    intent.putExtra("Code",message1);
                    startActivity(intent);
                    recreate();

                    //startActivity(new Intent(MainActivity.this, LeaveActivity.class));
                }
                catch(NullPointerException e)
                {
                    Toast.makeText(getApplicationContext(),"Invalid Username or Password. Please try again.",Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });


    }
        });
    }



}
