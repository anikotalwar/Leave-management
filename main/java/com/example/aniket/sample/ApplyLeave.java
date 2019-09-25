package com.example.shivani.sample;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApplyLeave extends AppCompatActivity  {

    TextInputEditText from,to,no_of_leaves,reason,address,contact;
    TextInputLayout to_label,from_label,reason_label;
    RadioGroup radioGroup;
    Calendar myCalendar;
    Date fromd,tod;
    int flag;
    String emp_code;
    String leave_type;
    String leave_category;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_leave);

        Bundle extras = getIntent().getExtras();
        emp_code = extras.getString("Code");

        leave_category = extras.getString("leave_category");

        from= (TextInputEditText) findViewById(R.id.from);
        to= (TextInputEditText) findViewById(R.id.to);
        reason= (TextInputEditText) findViewById(R.id.reason);
        address= (TextInputEditText) findViewById(R.id.address);
        contact= (TextInputEditText) findViewById(R.id.contact);
        to_label=(TextInputLayout)findViewById(R.id.to_label);
        from_label=(TextInputLayout)findViewById(R.id.from_label);
        reason_label=(TextInputLayout)findViewById(R.id.reason_label);
        no_of_leaves =(TextInputEditText)findViewById(R.id.no_of_leaves);
        radioGroup = (RadioGroup)findViewById(R.id.rad_grp);
        radioGroup.setVisibility(View.INVISIBLE);
        no_of_leaves.setEnabled(false);

         myCalendar = Calendar.getInstance();


         final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };

        from.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                flag=0;
                new DatePickerDialog(ApplyLeave.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });


        to.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                flag=1;
                // TODO Auto-generated method stub
                new DatePickerDialog(ApplyLeave.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


    }


    @SuppressLint("WrongConstant")
    private void updateLabel() {
        String myFormat = "yyyy-MM-dd"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        if(flag==0) {
            from.setText(sdf.format(myCalendar.getTime()));
            fromd = myCalendar.getTime();


        }

        if(flag==1) {
            to.setText(sdf.format(myCalendar.getTime()));
            tod = myCalendar.getTime();

            long diffInMillies = Math.abs(tod.getTime() - fromd.getTime());
            Integer diff = Math.round(TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS))+1;
            if(diff != 1){
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
                    //spinner.setVisibility(4);
                    radioGroup.setVisibility(4);
                    //TextView leave_type_label = (TextView)findViewById(R.id.leave_type_label);
                    //leave_type_label.setVisibility(4);
            }else{
                //spinner.setVisibility(0);
                //TextView leave_type_label = (TextView)findViewById(R.id.leave_type_label);
                //leave_type_label.setVisibility(0);
                radioGroup.setVisibility(0);
            }


            no_of_leaves.setText(Integer.toString(diff));



        }


    }


    public void apply_function(View v){
        String to, from,address,contact,no_of_leaves,reason;
        to = this.to.getText().toString();
        from = this.from.getText().toString();
        address = this.address.getText().toString();
        contact = this.contact.getText().toString();
        reason = this.reason.getText().toString();
        no_of_leaves = this.no_of_leaves.getText().toString();
        //leave_type = this.leave_type.getText().toString();


        // compulsory fields' validation :


        if(to.isEmpty()){
            to_label.setError("Please enter Date ");
        }
        if(from.isEmpty()){
            from_label.setError("Please enter Date ");
        }



        if(reason.isEmpty()){
           reason_label.setError("Please enter Reason ");
        }


        if(!to.isEmpty() && !from.isEmpty() && !reason.isEmpty()) {

            ApplyLeaveInterface apiService =
                    ApiClient.getClient().create(ApplyLeaveInterface.class);

            Map<String, String> obj = new HashMap<>();
            obj.put("EmpCode", "EC-01");
            obj.put("LeaveFromDate", from);
            obj.put("LeaveToDate", to);
            obj.put("Status", "Pending");
            if (no_of_leaves == "1") {
                obj.put("LeaveType", leave_type);
            } else {
                obj.put("LeaveType", "FULL DAY");
            }
            obj.put("ReasonForLeave", reason);
            obj.put("AddressForCorrespondence", address);
            obj.put("ContactNumber", contact);

            Call<ApplyLeavePOJO> call = apiService.getLeaveInfo(obj);

            call.enqueue(new Callback<ApplyLeavePOJO>() {
                @Override
                public void onResponse(Call<ApplyLeavePOJO> call, Response<ApplyLeavePOJO> response) {


                    //System.out.println("%%%%%%%%%%%%%%%%%");
                    String data = response.body().getData();
                    String message = response.body().getMessage();
                    Toast.makeText(getApplicationContext(), data, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<ApplyLeavePOJO> call, Throwable t) {
                    Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });


       }


    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.fd:
                if (checked)
                    leave_type="FULL DAY";
                    break;
            case R.id.hd:
                if (checked)
                    leave_type="HALF DAY";
                    break;
        }
    }

}
