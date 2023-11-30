package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal, Pow;

    Button clear,del,mod,div,multi,sub,add,equal,power,zero,dot;
    Button seven,eight,nine,six,five,four,three,two,one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TEXT REFERENCE
        TextView problem = findViewById(R.id.problem);
        TextView solution = findViewById(R.id.solution);

        // FUNCTIONS
        clear = findViewById(R.id.clear);
        del = findViewById(R.id.del);

        // OPERATOR
        mod = findViewById(R.id.mod);
        div = findViewById(R.id.divide);
        multi = findViewById(R.id.multiplication);
        sub = findViewById(R.id.minus);
        add = findViewById(R.id.plus);
        power = findViewById(R.id.power);
        equal = findViewById(R.id.equal);
        dot = findViewById(R.id.dot);

        // NUMBERS
        nine = findViewById(R.id.nine);
        eight = findViewById(R.id.eight);
        seven = findViewById(R.id.seven);
        six = findViewById(R.id.six);
        five = findViewById(R.id.five);
        four = findViewById(R.id.four);
        three = findViewById(R.id.three);
        two = findViewById(R.id.two);
        one = findViewById(R.id.one);
        zero = findViewById(R.id.zero);

        // WORKING OF BUTTONS
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem.setText(problem.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem.setText(problem.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem.setText(problem.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem.setText(problem.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem.setText(problem.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem.setText(problem.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem.setText(problem.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem.setText(problem.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem.setText(problem.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem.setText(problem.getText() + "9");
            }
        });

        // BASIC FUNCTION
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem.setText("");
                solution.setText("");
                input1 =0;
                input2 =0;
            }
        });

        // ERASE
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = (String) problem.getText();
                int n = s.length()-1;
                s = s.substring(0,n);
                problem.setText(s);
            }
        });

        // ADDITION
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solution.getText().length() != 0) {
                    problem.setText(solution.getText() + "");
                }
                if (problem.getText().length()!=0){

                    // input1 = float.parsFloat(problem.getText().+ "");
                    Addition = true;
                    decimal = false;
                    problem.setText(problem.getText() + "+");
                }
            }
        });

        //SUBTRACTION
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solution.getText().length() != 0) {
                    problem.setText(solution.getText() + "");
                }
                if (problem.getText().length()!=0){

                    // input1 = float.parsFloat(problem.getText().+ "");
                    Subtract = true;
                    decimal = false;
                    problem.setText(problem.getText() + "-");
                }
            }
        });
        // MULTIPLICATION
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solution.getText().length() != 0) {
                    problem.setText(solution.getText() + "");
                }
                if (problem.getText().length()!=0){

                    // input1 = float.parsFloat(problem.getText().+ "");
                    Multiplication = true;
                    decimal = false;
                    problem.setText(problem.getText() + "x");
                }
            }
        });

        // DIVISION
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solution.getText().length() != 0) {
                    problem.setText(solution.getText() + "");
                }
                if (problem.getText().length()!=0){

                    // input1 = float.parsFloat(problem.getText().+ "");
                    Division = true;
                    decimal = false;
                    problem.setText(problem.getText() + "/");
                }
            }
        });

        // REMAINDER
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // THis will work on output
                if (solution.getText().length() != 0) {
                    problem.setText(solution.getText() + "");
                }

                // this will work for first input
                if (problem.getText().length()!=0){

                    // input1 = float.parsFloat(problem.getText().+ "");
                    mRemainder = true;
                    decimal = false;
                    problem.setText(problem.getText() + "%");
                }
            }
        });

        // DECIMAL
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal){

                }
                else {
                    problem.setText(problem.getText() + ".");
                    decimal = true;
                }
            }
        });

        // POWER
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solution.getText().length() != 0) {
                    problem.setText(solution.getText() + "");
                }
                if (problem.getText().length()!=0){

                    // input1 = float.parsFloat(problem.getText().+ "");
                    Pow = true;
                    decimal = false;
                    problem.setText(problem.getText() + "^");
                }
            }
        });

        // EQUAL TO
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder ){
//                    input2 = Float.parseFloat(problem.getText() + "");
                }

                if (Addition) {
                    String s = (String) problem.getText();
                    int index = s.indexOf('+');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1, s.length()));
                    solution.setText(input1 + input2 + "");
                    Addition = false;
                }

                if (Subtract) {
                    String s = (String) problem.getText();
                    int index = s.indexOf('-');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1, s.length()));
                    solution.setText(input1 - input2 + "");
                    Subtract = false;
                }

                if (Multiplication) {
                    String s = (String) problem.getText();
                    int index = s.indexOf('*');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1, s.length()));
                    solution.setText(input1 * input2 + "");
                    Multiplication = false;
                }

                if (Division) {
                    String s = (String) problem.getText();
                    int index = s.indexOf('/');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1, s.length()));
                    solution.setText(input1 / input2 + "");
                    Division = false;
                }

                if (mRemainder) {
                    String s = (String) problem.getText();
                    int index = s.indexOf('%');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1, s.length()));
                    solution.setText(input1 % input2 + "");
                    mRemainder = false;
                }

                if (Pow) {
                    String s = (String) problem.getText();
                    int index = s.indexOf('^');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1, s.length()));
                    double ans = Math.pow(input1,input2);
                    solution.setText(ans+"");
                    Pow = false;
                }
            }
        });
    }
}