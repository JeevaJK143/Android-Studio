package com.example.biglist;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView distributor,beat,outlet,distributorName,vehicleType,products,visitReason;
    CheckBox checkBoxsupply,checkBoxcurrent,checkBoxtake,checkBoxreturn,checkBoxcollection,checkBoxgeneral,checkBoxordervisible,pcs,box1;
    TextView textView,outletorder,phoneorder,cash,banktransfer,cheque,refnum,cancel,deliveryDate,paymentDate,chequeDate;
    LinearLayout purpose,supply,current,take,take1,take2,rturn,collection,comment,photo,general,chequevisible,ordervisible;
    ImageView phone;
    List<String> languageList,beatList,beatIdList,outletList,outletIdList,distributorNameList,vehicleList,productList,visitList;
    List<String> languageIdList=new ArrayList<>();
    public int f=0,fl=0;
    final Calendar myCalendar= Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        distributor = findViewById(R.id.disributor);
        beat = findViewById(R.id.beat);
        outlet = findViewById(R.id.outlet);
        textView = findViewById(R.id.t);
        phone=findViewById(R.id.phone);
        purpose=findViewById(R.id.purpose);
        checkBoxsupply = findViewById(R.id.checkboxsupply);
        checkBoxcurrent = findViewById(R.id.checkboxcurrent);
        checkBoxgeneral = findViewById(R.id.checkboxgeneral);
        checkBoxtake = findViewById(R.id.checkboxtake);
        checkBoxreturn = findViewById(R.id.checkboxreturn);
        checkBoxcollection = findViewById(R.id.checkboxcollection);
        supply=findViewById(R.id.supply);
        take=findViewById(R.id.take);
        take1=findViewById(R.id.take1);
        take2=findViewById(R.id.take2);
        current=findViewById(R.id.current);
        rturn=findViewById(R.id.return1);
        collection=findViewById(R.id.collection);
        comment=findViewById(R.id.comment);
        photo=findViewById(R.id.photos);
        general=findViewById(R.id.general);
        outletorder=findViewById(R.id.outletorder);
        phoneorder=findViewById(R.id.phoneorder);
        cash=findViewById(R.id.cash);
        banktransfer=findViewById(R.id.banktransfer);
        cheque=findViewById(R.id.cheque);
        chequevisible=findViewById(R.id.chequevisible);
        refnum=findViewById(R.id.refnumber);
        checkBoxordervisible=findViewById(R.id.checkboxordervisible);
        ordervisible=findViewById(R.id.ordervisible);
        cancel=findViewById(R.id.cancel);
        pcs=findViewById(R.id.pcs);
        box1=findViewById(R.id.box);
        distributorName=findViewById(R.id.distributorname);
        vehicleType=findViewById(R.id.vehicletype);
        products=findViewById(R.id.productsearch);
        visitReason=findViewById(R.id.visitreason);
        deliveryDate=findViewById(R.id.deliverydate);


        languageList=new ArrayList<>();
        languageList.add("Magiva Aravind Agencies");
        languageList.add("naveen");
        languageList.add("naveen1");

        languageIdList.add("1");
        languageIdList.add("2");
        languageIdList.add("3");

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, languageList);
        distributor.setAdapter(adapter1);

        distributorNameList=new ArrayList<>();
        distributorNameList.add("Magiva aravind Agencies(AA001)");
        ArrayAdapter<String> dName = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, distributorNameList);
        distributorName.setAdapter(dName);

        vehicleList=new ArrayList<>();
        vehicleList.add("Company Vehicle");
        vehicleList.add("Own Vehicle");
        ArrayAdapter<String> vehicleName = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, vehicleList);
        vehicleType.setAdapter(vehicleName);

        productList=new ArrayList<>();
        productList.add("APPALAM");
        productList.add("ATTA");
        productList.add("CHEESE");
        productList.add("CHOCALATE");
        productList.add("GHEE");
        productList.add("GULABJAMUN");
        productList.add("CURD");
        productList.add("MEALS");
        ArrayAdapter<String> productAdap = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, productList);
        products.setAdapter(productAdap);

        visitList=new ArrayList<>();
        visitList.add("Owner Not Available");
        visitList.add("Inspection");
        visitList.add("Postpond to Next Day");
        visitList.add("No");
        visitList.add("Visiting");
        visitList.add("Markrt Visit");
        visitList.add("Stock Available");
        visitList.add("Stock Already Available");
        ArrayAdapter<String> visitAdapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, visitList);
        visitReason.setAdapter(visitAdapter);

        distributor.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                distributor.showDropDown();
                return false;
            }
        });
        beat.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                beat.showDropDown();
                return false;
            }
        });
        outlet.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                outlet.showDropDown();
                return false;
            }
        });
        distributorName.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                distributorName.showDropDown();
                return false;
            }
        });
        visitReason.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                visitReason.showDropDown();
                return false;
            }
        });
        products.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                products.showDropDown();
                return false;
            }
        });
        vehicleType.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                vehicleType.showDropDown();
                return false;
            }
        });
        distributor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                beat.setText("");
                outlet.setText("");
                String item=distributor.getText().toString(),id=null;
                int j;
                for(j=0;j<languageList.size();j++){
                    if(languageList.get(j).equals(item)){
                        id=languageIdList.get(j).toString();
                        break;
                    }

                }
                if (id!=null && !id.isEmpty()){
                    adapterset(id);
                }
            }
        });
        beat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item=beat.getText().toString(),id=null;
                int j;
                for(j=0;j<beatList.size();j++){
                    if(beatList.get(j).equals(item)){
                        id=beatIdList.get(j).toString();
                        break;
                    }

                }
                if (id!=null && !id.isEmpty()){
                    adapterOutlet(id);
                }
            }
        });
        outlet.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                purpose.setVisibility(View.VISIBLE);
                comment.setVisibility(View.VISIBLE);
                photo.setVisibility(View.VISIBLE);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6379914216"));
                startActivity(intent);
            }
        });
        checkBoxsupply.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBoxsupply.isChecked()){
                    checkBoxgeneral.setChecked(false);
                    supply.setVisibility(View.VISIBLE);
                }
                else supply.setVisibility(View.GONE);
            }
        });
        checkBoxcurrent.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBoxcurrent.isChecked()){
                    checkBoxgeneral.setChecked(false);
                    current.setVisibility(View.VISIBLE);
                }
                else current.setVisibility(View.GONE);
            }
        });
        checkBoxgeneral.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBoxgeneral.isChecked()){
                    if (checkBoxsupply.isChecked() ||checkBoxcurrent.isChecked() ||checkBoxtake.isChecked() ||checkBoxreturn.isChecked() ||checkBoxcollection.isChecked())
                    checkBoxsupply.setChecked(false);
                    checkBoxcurrent.setChecked(false);
                    checkBoxtake.setChecked(false);
                    checkBoxreturn.setChecked(false);
                    checkBoxcollection.setChecked(false);
                    general.setVisibility(View.VISIBLE);
                    comment.setVisibility(View.GONE);
                }
                else general.setVisibility(View.GONE);
            }
        });
        checkBoxtake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBoxtake.isChecked()){
                    checkBoxgeneral.setChecked(false);
                    take.setVisibility(View.VISIBLE);
                    take1.setVisibility(View.VISIBLE);
                    take2.setVisibility(View.VISIBLE);
                    if (fl!=1) {
                        outletorder.setTextColor(Color.parseColor("#ffffff"));
                        outletorder.setBackground(getResources().getDrawable(R.drawable.textcolor));
                        ordervisible.setVisibility(View.GONE);
                    }
                }
                else {
                    take.setVisibility(View.GONE);
                    take1.setVisibility(View.GONE);
                    take2.setVisibility(View.GONE);
                }
            }
        });
        checkBoxreturn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBoxreturn.isChecked()){
                    checkBoxgeneral.setChecked(false);
                    rturn.setVisibility(View.VISIBLE);
                }
                else rturn.setVisibility(View.GONE);
            }
        });
        checkBoxcollection.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBoxcollection.isChecked()){
                    checkBoxgeneral.setChecked(false);
                    collection.setVisibility(View.VISIBLE);
                    if (f!=1) {
                        cash.setTextColor(Color.parseColor("#ffffff"));
                        cash.setBackground(getResources().getDrawable(R.drawable.textcolor));
                        outletorder.setBackground(getResources().getDrawable(R.drawable.textcolor));
                        refnum.setVisibility(View.GONE);
                        chequevisible.setVisibility(View.GONE);
                    }
                }
                else collection.setVisibility(View.GONE);
            }
        });

        outletorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outletorder.setBackground(getResources().getDrawable(R.drawable.textcolor));
                phoneorder.setBackground(getResources().getDrawable(R.drawable.textviewbgcolor));
                outletorder.setTextColor(Color.parseColor("#ffffff"));
                phoneorder.setTextColor(Color.parseColor("#5C4080"));
            }
        });
        phoneorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl=1;
                phoneorder.setTextColor(Color.parseColor("#ffffff"));
                phoneorder.setBackground(getResources().getDrawable(R.drawable.textcolorright));
                outletorder.setBackground(getResources().getDrawable(R.drawable.shape));
                outletorder.setTextColor(Color.parseColor("#5C4080"));
            }
        });
        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cash.setBackground(getResources().getDrawable(R.drawable.textcolor));
                banktransfer.setBackground(getResources().getDrawable(R.drawable.centerbg));
                cheque.setBackground(getResources().getDrawable(R.drawable.textviewbgcolor));
                banktransfer.setTextColor(Color.parseColor("#5C4080"));
                cheque.setTextColor(Color.parseColor("#5C4080"));
                cash.setTextColor(Color.parseColor("#ffffff"));
                refnum.setVisibility(View.GONE);
                chequevisible.setVisibility(View.GONE);
            }
        });
        banktransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=1;
                cash.setTextColor(Color.parseColor("#5C4080"));
                cheque.setTextColor(Color.parseColor("#5C4080"));
                banktransfer.setTextColor(Color.parseColor("#ffffff"));
                banktransfer.setBackground(getResources().getDrawable(R.drawable.centertext));
                cash.setBackground(getResources().getDrawable(R.drawable.shape));
                cheque.setBackground(getResources().getDrawable(R.drawable.textviewbgcolor));
                refnum.setVisibility(View.VISIBLE);
                chequevisible.setVisibility(View.GONE);
            }
        });
        cheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=1;
                banktransfer.setTextColor(Color.parseColor("#5C4080"));
                cash.setTextColor(Color.parseColor("#5C4080"));
                cheque.setTextColor(Color.parseColor("#ffffff"));
                banktransfer.setBackground(getResources().getDrawable(R.drawable.centerbg));
                cash.setBackground(getResources().getDrawable(R.drawable.shape));
                cheque.setBackground(getResources().getDrawable(R.drawable.textcolorright));
                refnum.setVisibility(View.VISIBLE);
                chequevisible.setVisibility(View.VISIBLE);
            }
        });
        checkBoxordervisible.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBoxordervisible.isChecked()){
                    ordervisible.setVisibility(View.VISIBLE);
                }
                else ordervisible.setVisibility(View.GONE);
            }
        });
        pcs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (pcs.isChecked())
                    box1.setChecked(false);
            }
        });
        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (box1.isChecked())
                    pcs.setChecked(false);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Exit Alert");
                builder.setMessage("Do you want to close this app");
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();

            }
        });
    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
        @Override

        public void onDateSet(DatePicker view, int year, int month, int day) {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH,month);
            myCalendar.set(Calendar.DAY_OF_MONTH,day);

            String myFormat="dd-MM-yy";
            SimpleDateFormat dateFormat=new SimpleDateFormat(myFormat, Locale.US);
            deliveryDate.setText(dateFormat.format(myCalendar.getTime()));
        }
    };
    deliveryDate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            myCalendar.add(Calendar.DATE, 0);

            DatePickerDialog  datePickerDialog =new DatePickerDialog(
                    MainActivity.this,date,myCalendar.get(Calendar.YEAR),myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH));
            datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
            datePickerDialog.show();

        }
    });



    }

    private void adapterOutlet(String id) {
        try {
            if (id.equals("1")) {
                outletList = new ArrayList<>();
                outletIdList = new ArrayList<>();
                outletList.add("Magiva Balu Enterprices");

                outletIdList.add("1");
            }
            if (id.equals("2")) {
                outletList = new ArrayList<>();
                outletIdList = new ArrayList<>();
                outletList.add("Ammu Agencies");

                outletIdList.add("1");
            }
            if (id.equals("3")) {
                outletList = new ArrayList<>();
                outletIdList = new ArrayList<>();
                outletList.add("Bhavi");

                outletIdList.add("1");
            }
            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>
                    (this, android.R.layout.select_dialog_item, outletList);
            outlet.setAdapter(adapter3);

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void adapterset(String id) {
        try {
            if (id.equals("1")) {
                beatList=new ArrayList<>();
                beatIdList=new ArrayList<>();
                beatList.add("Hattori 3");
                beatList.add("Sub Distributer");
                beatList.add("Beat1");


                beatIdList.add("1");
                beatIdList.add("2");
                beatIdList.add("3");
            }
            if (id.equals("2")) {
                beatList = new ArrayList<>();
                beatIdList = new ArrayList<>();
                Toast.makeText(MainActivity.this, "Beat is not available for this naveen", Toast.LENGTH_SHORT).show();
            }
            if (id.equals("3")) {
                beatList=new ArrayList<>();
                beatIdList=new ArrayList<>();
                beatList.add("navee1");
                beatList.add("navee2");

                beatIdList.add("1");
                beatIdList.add("2");
            }
            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>
                    (this, android.R.layout.select_dialog_item, beatList);
            beat.setAdapter(adapter2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }



}