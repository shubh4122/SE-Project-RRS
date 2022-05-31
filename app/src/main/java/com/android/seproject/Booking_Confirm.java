package com.android.seproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class Booking_Confirm extends AppCompatActivity {

    String train_name, class_type, no_of_tickets, name, age, mob_number, final_price, berth_type ,price;
    TextView train_value, class_value, tickets_value, name_value, age_value,mobile_value, final_value, berth_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirm);

        train_value = findViewById(R.id.train_value);
        class_value = findViewById(R.id.class_value);
        tickets_value = findViewById(R.id.ticket_count);
        name_value = findViewById(R.id.name_value);
        age_value = findViewById(R.id.age_value);
        mobile_value = findViewById(R.id.mob_value);
        final_value = findViewById(R.id.price_value);
        berth_value = findViewById(R.id.berth_value);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

//        Bundle extras = getIntent().getExtras();
//        assert extras != null;

        train_name = sharedPreferences.getString("train",null);
        class_type = sharedPreferences.getString("type",null);
        no_of_tickets = sharedPreferences.getString("no. of ticket",null);
        name = sharedPreferences.getString("name on ticket",null);
        age = sharedPreferences.getString("age",null);
        mob_number = sharedPreferences.getString("mobile no",null);
        price = sharedPreferences.getString("price",null);
        berth_type = sharedPreferences.getString("berth type",null);

        int temp = Integer.valueOf(price)*Integer.valueOf(no_of_tickets);
        final_price = String.valueOf(temp);

        train_value.setText(train_name);
        class_value.setText(class_type);
        tickets_value.setText(no_of_tickets);
        name_value.setText(name);
        age_value.setText(age);
        mobile_value.setText(mob_number);
        berth_value.setText(berth_type);
        final_value.setText(final_price);

    }
}