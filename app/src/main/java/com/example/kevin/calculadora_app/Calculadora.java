package com.example.kevin.calculadora_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class Calculadora extends AppCompatActivity {

    Button button_0;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_ac;
    Button button_ce;
    Button button_div;
    Button button_igu;
    Button button_mul;
    Button button_res;
    Button button_sum;
    TextView txt_op;
    TextView txt_resul;

    int op1;
    int op2;
    int igual;

    int tmp;

    boolean primero;
    boolean pigual;

    String signo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        inicio();
        eventos();
    }

    public void inicio(){

        button_0=(Button) findViewById(R.id.btn_0);
        button_1=(Button) findViewById(R.id.btn_1);
        button_2=(Button) findViewById(R.id.btn_2);
        button_3=(Button) findViewById(R.id.btn_3);
        button_4=(Button) findViewById(R.id.btn_4);
        button_5=(Button) findViewById(R.id.btn_5);
        button_6=(Button) findViewById(R.id.btn_6);
        button_7=(Button) findViewById(R.id.btn_7);
        button_8=(Button) findViewById(R.id.btn_8);
        button_9=(Button) findViewById(R.id.btn_9);
        button_ac=(Button) findViewById(R.id.btn_ac);
        button_ce=(Button) findViewById(R.id.btn_ce);
        button_div=(Button) findViewById(R.id.btn_div);
        button_igu=(Button) findViewById(R.id.btn_igu);
        button_mul=(Button) findViewById(R.id.btn_mul);
        button_res=(Button) findViewById(R.id.btn_res);
        button_sum=(Button) findViewById(R.id.btn_sum);

        txt_op=(TextView) findViewById(R.id.op);
        txt_resul=(TextView) findViewById(R.id.resul);

        txt_op.setText("");
        txt_resul.setText(0+"");

        op1=0;
        op2=0;
        igual=0;

        tmp=0;

        signo=null;

        primero=false;
        pigual=false;

        button_ce.setEnabled(false);
    }

    public void eventos(){
        button_0.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pigual==false) {
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(txt_op.getText() + button_0.getText().toString());
                }else{
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(button_0.getText().toString());
                    txt_resul.setText("");
                    pigual=false;
                }
            }
        });

        button_1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pigual==false) {
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(txt_op.getText() + button_1.getText().toString());
                }else{
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(button_1.getText().toString());
                    pigual=false;
                }
            }
        });

        button_2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pigual==false) {
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(txt_op.getText() + button_2.getText().toString());
                }else{
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(button_2.getText().toString());
                    pigual=false;
                }
            }
        });

        button_3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pigual==false) {
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(txt_op.getText() + button_3.getText().toString());
                }else{
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(button_3.getText().toString());
                    pigual=false;
                }
            }
        });

        button_4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pigual==false) {
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(txt_op.getText() + button_4.getText().toString());
                }else{
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(button_4.getText().toString());
                    pigual=false;
                }
            }
        });

        button_5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pigual==false) {
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(txt_op.getText() + button_5.getText().toString());
                }else{
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(button_5.getText().toString());
                    pigual=false;
                }
            }
        });

        button_6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pigual==false) {
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(txt_op.getText() + button_6.getText().toString());
                }else{
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(button_6.getText().toString());
                    pigual=false;
                }
            }
        });

        button_7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pigual==false) {
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(txt_op.getText() + button_7.getText().toString());
                }else{
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(button_7.getText().toString());
                    pigual=false;
                }
            }
        });

        button_8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pigual==false) {
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(txt_op.getText() + button_8.getText().toString());
                }else{
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(button_8.getText().toString());
                    pigual=false;
                };
            }
        });

        button_9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pigual==false) {
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(txt_op.getText() + button_9.getText().toString());
                }else{
                    button_ce.setEnabled(true);
                    button_ac.setEnabled(false);
                    txt_op.setText(button_9.getText().toString());
                    pigual=false;
                }
            }
        });

        button_sum.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primero == false) {
                    txt_op.setText(txt_op.getText() + button_sum.getText().toString());
                    signo = "\\+";
                    primero=true;
                } else {
                    tmp = operacion();
                    txt_op.setText(tmp+"");
                    txt_op.setText(txt_op.getText() + button_sum.getText().toString());
                    signo = "\\+";
                }
            }
        });

        button_res.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primero == false) {
                    txt_op.setText(txt_op.getText() + button_res.getText().toString());
                    signo = "\\-";
                    primero=true;
                } else {
                    tmp = operacion();
                    txt_op.setText(tmp+"");
                    txt_op.setText(txt_op.getText() + button_res.getText().toString());
                    signo = "\\-";
                }
            }
        });

        button_mul.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primero == false) {
                    txt_op.setText(txt_op.getText() + button_mul.getText().toString());
                    signo = "\\*";
                    primero=true;
                } else {
                    tmp = operacion();
                    txt_op.setText(tmp+"");
                    txt_op.setText(txt_op.getText() + button_mul.getText().toString());
                    signo = "\\*";
                }
            }
        });

        button_div.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primero == false) {
                    txt_op.setText(txt_op.getText() + button_div.getText().toString());
                    signo = "\\/";
                    primero=true;
                } else {
                    tmp = operacion();
                    txt_op.setText(tmp+"");
                    txt_op.setText(txt_op.getText() + button_div.getText().toString());
                    signo = "\\/";
                }
            }
        });

        button_ac.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                inicio();
            }
        });

        button_ce.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt_op.length()>0){
                    if(signo==null || txt_op.getText().toString().contains(signo)==true) {
                        txt_op.setText(txt_op.getText().toString().substring(0, txt_op.length() - 1));
                        button_ac.setEnabled(false);
                    }else{
                        txt_op.setText(txt_op.getText().toString().substring(0, txt_op.length() - 1));
                        primero=false;
                        button_ac.setEnabled(false);
                    }
                }else{
                    inicio();
                }

            }
        });

        button_igu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt_op.getText().toString()!=""&&txt_op.getText().toString()!=null) {
                    tmp = operacion();
                    txt_op.setText(txt_op.getText() + "=");
                    txt_resul.setText(tmp + "");
                    button_ac.setEnabled(true);
                    button_ce.setEnabled(false);
                    pigual = true;
                    primero = false;
                    op1 = 0;
                    op2 = 0;
                }else{
                    inicio();
                    button_ac.setEnabled(true);
                }
            }
        });

    }

    public int operacion() {
        String[] ops = txt_op.getText().toString().split(signo);
        op1 = Integer.parseInt(ops[0]);
        op2 = Integer.parseInt(ops[1]);
        switch (signo) {
            case "\\+":
                igual = op1 + op2;
            break;
            case "\\-":
                igual = op1 - op2;
            break;
            case "\\*":
                igual = op1 * op2;
            break;
            case "\\/":
                if (op2 != 0) {
                    igual = op1 / op2;
                    }
                break;
            default:
                igual=0;
            break;
            }
        return igual;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
