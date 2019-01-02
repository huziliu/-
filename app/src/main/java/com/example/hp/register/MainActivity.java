package com.example.hp.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
public Spinner spinner;
public List<String> list=new ArrayList<String>();
public ArrayAdapter<String> arrayAdapter;
public Button button1;
public Button button2;
public Switch aSwitch;
public Switch aSwitch5;
public Switch aSwitch6;
public EditText editText1;
    public EditText editText2;
    public EditText editText3;
    public EditText editText4;
    public RadioButton radioButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       list.add("         0~6岁");
        list.add("         7~22岁");
        list.add("         23~36岁");
        list.add("         37~46岁");
        list.add("         47~56岁");
        list.add("         57~66岁");
        list.add("         67~76岁");
        list.add("         77~86岁");
        list.add("         87~96岁");
        list.add("         97~106岁");
        spinner=(Spinner)findViewById(R.id.sp_1);
        arrayAdapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,list);
        spinner.setAdapter(arrayAdapter);
        aSwitch=(Switch)findViewById(R.id.sw_1);
        aSwitch5=(Switch)findViewById(R.id.sw_5);
        aSwitch6=(Switch)findViewById(R.id.sw_6);
        editText1=(EditText)findViewById(R.id.et_1);
        editText2=(EditText)findViewById(R.id.et_2);
        editText3=(EditText)findViewById(R.id.et_3);
        editText4=(EditText)findViewById(R.id.et_4);
        radioButton1=(RadioButton)findViewById(R.id.rb_1);
        button1=(Button)findViewById(R.id.btn_regist);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aSwitch.setChecked(true);
                aSwitch5.setChecked(true);
                aSwitch6.setChecked(true);
                editText1.setText("zj");
                editText2.setText("12");
                editText3.setText("zhangjian");
                editText4.setText("zj@163.com");
                radioButton1.setChecked(true);
                spinner.setSelection(1,true);
            }
        });
       button2=(Button)findViewById(R.id.btn_cancel);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aSwitch.setChecked(false);
                aSwitch5.setChecked(false);
                aSwitch6.setChecked(false);
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");
                radioButton1.setChecked(false);
                spinner.setSelection(0,true);
            }
        });
    }
}
