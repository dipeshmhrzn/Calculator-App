package com.example.calculator;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;

    Button button_add;
    Button button_sub;
    Button button_divide;
    Button button_mul;
    Button button_dot;
    Button button_clear;
    Button button_answer;

    EditText editText;

    static float ValueOne = 0;
    static float ValueTwo = 0;

    boolean add, sub, mul, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

    }

    public void initialize() {
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        button_add = findViewById(R.id.button_add);
        button_sub = findViewById(R.id.button_sub);
        button_divide = findViewById(R.id.button_divide);
        button_mul = findViewById(R.id.button_mul);
        button_dot = findViewById(R.id.button_dot);
        button_clear = findViewById(R.id.button_clear);
        button_answer = findViewById(R.id.button_answer);

        editText = findViewById(R.id.edittext_input);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);

        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
        button_divide.setOnClickListener(this);
        button_mul.setOnClickListener(this);
        button_clear.setOnClickListener(this);
        button_answer.setOnClickListener(this);
        button_dot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0: {
                editText.setText(editText.getText().toString() + 0);
                break;
            }
            case R.id.button1: {
                editText.setText(editText.getText().toString() + 1);
                break;
            }
            case R.id.button2: {
                editText.setText(editText.getText().toString() + 2);
                break;
            }
            case R.id.button3: {
                editText.setText(editText.getText().toString() + 3);
                break;
            }
            case R.id.button4: {
                editText.setText(editText.getText().toString() + 4);
                break;
            }
            case R.id.button5: {
                editText.setText(editText.getText().toString() + 5);
                break;
            }
            case R.id.button6: {
                editText.setText(editText.getText().toString() + 6);
                break;
            }
            case R.id.button7: {
                editText.setText(editText.getText().toString() + 7);
                break;
            }
            case R.id.button8: {
                editText.setText(editText.getText().toString() + 8);
                break;
            }
            case R.id.button9: {
                editText.setText(editText.getText().toString() + 9);
                break;
            }
            case R.id.button_dot: {
                if (!editText.getText().toString().contains(".")) {
                    editText.setText(editText.getText().toString() + ".");
                }
                break;
            }
            case R.id.button_add: {
                if (editText == null) {
                    editText.setText("");
                } else {
                    ValueOne = Float.parseFloat(editText.getText() + "");
                    add = true;
                    editText.setText(null);
                }
                break;
            }
            case R.id.button_sub: {
                if (editText == null) {
                    editText.setText("");
                } else {
                    ValueOne = Float.parseFloat(editText.getText() + "");
                    sub = true;
                    editText.setText(null);
                }
                break;
            }
            case R.id.button_mul: {
                if (editText == null) {
                    editText.setText("");
                } else {
                    ValueOne = Float.parseFloat(editText.getText() + "");
                    mul = true;
                    editText.setText(null);
                }
                break;
            }
            case R.id.button_divide: {
                if (editText == null) {
                    editText.setText("");
                } else {
                    ValueOne = Float.parseFloat(editText.getText() + "");
                    divide = true;
                    editText.setText(null);
                }
                break;
            }
            case R.id.button_clear: {
                editText.setText("");
                break;
            }
            case R.id.button_answer: {
                ValueTwo = Float.parseFloat(editText.getText() + "");
                if (add == true) {
                    float value = Calculator.add(ValueOne, ValueTwo);
                    if (value % 1 == 0) {
                        editText.setText(String.valueOf((int) value));
                    } else {
                        editText.setText(String.valueOf(value));
                    }
                    add = false;
                }
                if (sub == true) {
                    float value = Calculator.sub(ValueOne, ValueTwo);
                    if (value % 1 == 0) {
                        editText.setText(String.valueOf((int) value));
                    } else {
                        editText.setText(String.valueOf(value));
                    }
                    sub = false;
                }
                if (mul == true) {
                    float value = Calculator.mul(ValueOne, ValueTwo);
                    if (value % 1 == 0) {
                        editText.setText(String.valueOf((int) value));
                    } else {
                        editText.setText(String.valueOf(value));
                    }
                    mul = false;
                }
                if (divide == true) {
                    float value = Calculator.divide(ValueOne, ValueTwo);
                    if (value % 1 == 0) {
                        editText.setText(String.valueOf((int) value));
                    } else {
                        editText.setText(String.valueOf(value));
                    }
                    divide = false;
                }
                break;
            }
        }
    }
}