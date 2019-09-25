package com.example.shivani.sample.Leave1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shivani.sample.ApiClient;
import com.example.shivani.sample.ApplyLeave;
import com.example.shivani.sample.R;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LeaveActivity extends AppCompatActivity {


    //Button apply = (Button)findViewById(R.id.apply_btn);



    String emp_code;

    public void apply_leave(View v){
        //System.out.println("$$$$$$$$$$ in applyfunc");
        Intent myIntent = new Intent(LeaveActivity.this, ApplyLeave.class);
        myIntent.putExtra("Code",emp_code);
       // myIntent.putExtra("key", value); //Optional parameters
       // System.out.println("$$$$$$$$$$ in applyfunc1");
        LeaveActivity.this.startActivity(myIntent);
        recreate();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave);

        Bundle extras = getIntent().getExtras();
        String name_from_web = extras.getString("Name");
        emp_code = extras.getString("Code");
        //System.out.println("****************************"+emp_code+name_from_web);
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(name_from_web);



        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.leave_types);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);



        LeaveListInterface apiService =
                ApiClient.getClient().create(LeaveListInterface.class);


        Call<LeaveList> call = apiService.getLeaveList();



        call.enqueue(new Callback<LeaveList>() {



                         @Override
                         public void onResponse(Call<LeaveList> call, Response<LeaveList> response) {

                             //String[] leave_types;
                             //Integer[] no_of_leaves;
                             //leave_types = new String[5];
                             //no_of_leaves = new Integer[5];
                             HashMap<String,Double> m = new HashMap();

                             List<Datum> list= response.body().getData();
                             System.out.println("------------------------------------------------------");


                             int j=0;
                             for (Datum i :list){
                                System.out.println(i.getLeave().getLeaveName() + i.getLeave().getNumberOfLeave());
                                //leave_types[j] = i.getLeave().getLeaveName();
                                //Double d = i.getLeave().getNumberOfLeave();
                                //no_of_leaves[j] = (int) Math.round(i.getLeave().getNumberOfLeave());
                                // no_of_leaves[j] = d.intValue();
                                 m.put(i.getLeave().getLeaveName(),i.getLeave().getNumberOfLeave());
                                j++;
                             }

                             for(int i=0;i<3;i++)
                             {
                                 //System.out.println(leave_types[i] + no_of_leaves[i]);
                             }

                             recyclerView.setAdapter(new CustomAdapter(m,LeaveActivity.this,emp_code));



                         }

                         @Override
                         public void onFailure(Call<LeaveList> call, Throwable t) {

                             Toast.makeText(getApplicationContext(),"Query failed!",Toast.LENGTH_SHORT).show();

                         }
                     });












        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        //CustomAdapter customAdapter = new CustomAdapter(LeaveActivity.this, personNames);
       // recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView







    }


}
