package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private String str="Hello!";
    private String num1S="", num2S="";
    private Integer num1=null, num2=null;
    private boolean pressedPlus=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textV = (TextView) findViewById(R.id.text_view);

        Button btn0= (Button) findViewById(R.id.btn0_view);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    str="0";
                    num1S="0";
                }else{
                    str=str+"0";
                    if(pressedPlus){
                        num2S=num2S+"0";
                    }else{
                        num1S=num1S+"0";
                    }
                }
                textV.setText(str);

            }
        });

        Button btn1= (Button) findViewById(R.id.btn1_view);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    str="1";
                    num1S="1";
                }else{
                    str=str+"1";
                    if(pressedPlus){
                        num2S=num2S+"1";
                    }else{
                        num1S=num1S+"1";
                    }
                }
                textV.setText(str);

            }
        });

        Button btn2= (Button) findViewById(R.id.btn2_view);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    str="2";
                    num1S="2";
                }else{
                    str=str+"2";
                    if(pressedPlus){
                        num2S=num2S+"2";
                    }else{
                        num1S=num1S+"2";
                    }
                }
                textV.setText(str);

            }
        });

        Button btn3= (Button) findViewById(R.id.btn3_view);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    str="3";
                    num1S="3";
                }else{
                    str=str+"3";
                    if(pressedPlus){
                        num2S=num2S+"3";
                    }else{
                        num1S=num1S+"3";
                    }
                }
                textV.setText(str);

            }
        });

        Button btn4= (Button) findViewById(R.id.btn4_view);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    str="4";
                    num1S="4";
                }else{
                    str=str+"4";
                    if(pressedPlus){
                        num2S=num2S+"4";
                    }else{
                        num1S=num1S+"4";
                    }
                }
                textV.setText(str);

            }
        });

        Button btn5= (Button) findViewById(R.id.btn5_view);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    str="5";
                    num1S="5";
                }else{
                    str=str+"5";
                    if(pressedPlus){
                        num2S=num2S+"5";
                    }else{
                        num1S=num1S+"5";
                    }
                }
                textV.setText(str);

            }
        });

        Button btn6= (Button) findViewById(R.id.btn6_view);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    str="6";
                    num1S="6";
                }else{
                    str=str+"6";
                    if(pressedPlus){
                        num2S=num2S+"6";
                    }else{
                        num1S=num1S+"6";
                    }
                }
                textV.setText(str);

            }
        });

        Button btn7= (Button) findViewById(R.id.btn7_view);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    str="7";
                    num1S="7";
                }else{
                    str=str+"7";
                    if(pressedPlus){
                        num2S=num2S+"7";
                    }else{
                        num1S=num1S+"7";
                    }
                }
                textV.setText(str);

            }
        });

        Button btn8= (Button) findViewById(R.id.btn8_view);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    str="8";
                    num1S="8";
                }else{
                    str=str+"8";
                    if(pressedPlus){
                        num2S=num2S+"8";
                    }else{
                        num1S=num1S+"8";
                    }
                }
                textV.setText(str);

            }
        });

        Button btn9= (Button) findViewById(R.id.btn9_view);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    str="9";
                    num1S="9";
                }else{
                    str=str+"9";
                    if(pressedPlus){
                        num2S=num2S+"9";
                    }else{
                        num1S=num1S+"9";
                    }
                }
                textV.setText(str);

            }
        });

        Button btnEx= (Button) findViewById(R.id.btnEx_view);
        btnEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    str="Enter Numbers First!!";
                    textV.setText(str);
                    str="Hello!";
                }else{
                    if(!pressedPlus){
                        String strSave=str;
                        str="You need to summarize numbers";
                        textV.setText(str);
                        str=strSave;
                    }else{
                        if(!num2S.equals("")) {
                            try {
                                num2 = Integer.parseInt(num2S);
                                str=Integer.toString(num1+num2);
                                textV.setText(str);
                                pressedPlus=false;
                                num1=num1+num2;
                                num2=null;
                                num1S=str;
                                num2S="";
                            }catch (Exception e){
                                String strSave=str;
                                str="Error:"+e.getMessage();
                                textV.setText(str);
                                str=strSave;
                            }

                        }else{
                            String strSave=str;
                            str="Enter the second number!!";
                            textV.setText(str);
                            str=strSave;
                        }
                    }
                }


            }
        });

        Button btnPl= (Button) findViewById(R.id.btnPl_view);
        btnPl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Hello!")){
                    String strSave=str;
                    str="Enter Numbers First!!";
                    textV.setText(str);
                    str=strSave;
                }else{
                    if(pressedPlus){
                        String strSave=str;
                        str="You can summarize only 2 numbers";
                        textV.setText(str);
                        str=strSave;
                    }else{
                        str=str+"+";
                        pressedPlus=true;
                        try {
                            num1 = Integer.parseInt(num1S);
                            textV.setText(str);
                        }catch (Exception e){
                            String strSave=str;
                            str="Error:"+e.getMessage();
                            textV.setText(str);
                            str=strSave;
                        }
                    }
                }

            }
        });
        Button btnR=(Button) findViewById(R.id.refresh_view);
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str="Hello!";
                pressedPlus=false;
                num1=null;
                num2=null;
                num1S="";
                num2S="";
                textV.setText(str);
            }
        });
    }

}
