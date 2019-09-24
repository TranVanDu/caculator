package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView result;
    TextView editText;
    int stateNumber;
    int state;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.tvResult);
        editText = (TextView) findViewById(R.id.inputText);
        stateNumber = 0;
        state = 0;
        result.setVisibility(View.INVISIBLE);


        findViewById(R.id.btn0).setOnClickListener(this);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);
        findViewById(R.id.btnCong).setOnClickListener(this);
        findViewById(R.id.btnTru).setOnClickListener(this);
        findViewById(R.id.btnNhan).setOnClickListener(this);
        findViewById(R.id.btnChia).setOnClickListener(this);
        findViewById(R.id.btnCanBacHai).setOnClickListener(this);
        findViewById(R.id.btnPi).setOnClickListener(this);
        findViewById(R.id.btnST).setOnClickListener(this);
        findViewById(R.id.btnPhanSo).setOnClickListener(this);
        findViewById(R.id.btnMod).setOnClickListener(this);
        findViewById(R.id.btnBang).setOnClickListener(this);
        findViewById(R.id.btnC).setOnClickListener(this);
        findViewById(R.id.btnBinhPhuong).setOnClickListener(this);
        findViewById(R.id.btnAC).setOnClickListener(this);
        findViewById(R.id.btnOpposite).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                if (state <=1||stateNumber ==1) {
                    addNumber("0");
                    stateNumber =1;
                }
                break;
            case R.id.btn1:
                if (state <=1||stateNumber ==1) {
                    addNumber("1");
                    stateNumber =1;
                }
                break;
            case R.id.btn2:
                if (state <=1||stateNumber ==1) {
                    addNumber("2");
                    stateNumber =1;
                }
                break;
            case R.id.btn3:
                if (state <=1||stateNumber ==1) {
                    addNumber("3");
                    stateNumber = 1;
                }
                break;
            case R.id.btn4:
                if (state <=1||stateNumber ==1) {
                    addNumber("4");
                    stateNumber =1;
                }
                break;
            case R.id.btn5:
                if (state <=1||stateNumber ==1) {
                    addNumber("5");
                    stateNumber =1;
                }
                break;
            case R.id.btn6:
                if (state <=1||stateNumber ==1) {
                    addNumber("6");
                    stateNumber =1;
                }
                break;
            case R.id.btn7:
                if (state <=1||stateNumber ==1) {
                    addNumber("7");
                    stateNumber = 1;
                }
                break;
            case R.id.btn8:
                if (state <=1||stateNumber ==1) {
                    addNumber("8");
                    stateNumber = 1;
                }
                break;
            case R.id.btn9:
                if (state <=1||stateNumber ==1) {
                    addNumber("9");
                    stateNumber = 1;
                }
                break;
            case R.id.btnAC:
                editText.setText("0");
                result.setText("=0");
                result.setVisibility(View.INVISIBLE);
                state =0; stateNumber =0;
                break;
            case R.id.btnBinhPhuong:
                if (state == 0) {
                    addNumber("^");
                    state+= 1;
                }
                break;
            case R.id.btnCanBacHai:
                try {
                    String can = String.valueOf(Math.sqrt(Double.parseDouble(editText.getText().toString())));
                    editText.setText(can);
                    result.setText("=" + can);
                    result.setVisibility(View.VISIBLE);
                } catch (Exception e) {
                    result.setText("0");
                    state = 3;
                    Toast.makeText(this, "Synctax ERROR", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnChia:
                if (state == 0) {
                    addNumber("/");
                    state +=1;
                }
                break;
            case R.id.btnCong:
                if (state == 0) {
                    addNumber("+");
                    state +=1;
                }
                break;
            case R.id.btnMod:
                try {
                    String mod = String.valueOf(Double.parseDouble(editText.getText().toString()) / 100
                    );
                    editText.setText(mod);
                    result.setText("=" + mod);
                    result.setVisibility(View.VISIBLE);
                } catch (Exception e) {
                    result.setText("0");
                    state = 3;
                    Toast.makeText(this, "Synctax ERROR", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnTru:
                if (state == 0) {
                    addNumber("-");
                    state +=1;
                }
                break;
            case R.id.btnNhan:
                if (state ==0 ) {
                    addNumber("*");
                    state +=1;
                }
                break;
            case R.id.btnST:
                addNumber(".");
                break;
            case R.id.btnPhanSo:
                try {
                    String ps = String.valueOf(1.0 / Double.parseDouble(editText.getText().toString()));
                    editText.setText(ps);
                    result.setText("=" + ps);
                    result.setVisibility(View.VISIBLE);
                } catch (Exception e) {
                    result.setText("0");
                    Toast.makeText(this, "Synctax ERROR", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnPi:
                try{
                    String text = editText.getText().toString();
                    double a = Double.parseDouble(text) *3.14;
                    editText.setText(String.valueOf(a));
                    result.setText("="+String.valueOf(a));
                    result.setVisibility(View.VISIBLE);

                }catch(Exception e){
                    Toast.makeText(this, "Synctax ERROR", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnOpposite:
                try {
                    String text = editText.getText().toString();
                    double a = -Double.parseDouble(text);
                    editText.setText(String.valueOf(a));
                } catch (Exception e) {
                    Toast.makeText(this, "Synctax ERROR", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnC:
                if (editText.getText().toString() != null) {
                    String newInput = removeNumber(editText.getText().toString());
                    editText.setText(newInput);
                }
                break;
            case R.id.btnBang:
                resultNumber(editText.getText().toString());
                break;
        }
    }

    public void resultNumber(String input) {
        try {
            char ch[] = input.toCharArray();
            char operator;
            int k = -1;
            double sh1 =0,sh2;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '*' || ch[i] == '/' || ch[i] == '+' || ch[i] == '-' || ch[i] == '^'|| ch[i]=='√') {
                    k = i;
                }
            }
            if(k == -1){
                sh1 = Double.parseDouble(input);
                editText.setText(String.valueOf(sh1));
                result.setText("="+ String.valueOf(sh1));
                result.setVisibility(View.VISIBLE);
                state =0;
                stateNumber =0;
            }else{
            operator = ch[k];
            try {
                 sh1 = Double.parseDouble(input.substring(0, k));
            }catch (Exception e){
                if(operator =='-'||operator=='+') {
                    sh1 = 0;
                }else if(operator=='√'){
                    sh1 =1;
                }
            }
             sh2 = Double.parseDouble(input.substring(k + 1, input.length()));
            double resulti = 0;
            switch (operator) {
                case '+':
                    resulti = sh1 + sh2;
                    break;
                case '-':
                    resulti = sh1 - sh2;
                    break;
                case '*':
                    resulti = sh1 * sh2;
                    break;
                case '/':
                    resulti = sh1 / sh2;
                    break;
                case '^':
                    resulti = Math.pow(sh1, sh2);
                    break;
                 default:
                     break;

            }
            editText.setText(String.valueOf(resulti));
            result.setText("="+ String.valueOf(resulti));
            result.setVisibility(View.VISIBLE);
            state =0;
            stateNumber =0;}
        }catch (Exception e) {
            Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();
        }


    }

    public void addNumber(String x) {

            if (editText.getText().toString().equals("0")) {
                editText.setText(x);
            } else {
                editText.append(x);
            }
    }

    public String removeNumber(String number) {
        int x = number.length();
        String y = number.substring(0, x - 1);
        return y;
    }

}


