package com.example.android.practiseset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

      /*  int raspberryPrice = 5;
        display1("1 box : $" + raspberryPrice);
        raspberryPrice = 10;
        display2("2 boxes : $" + (raspberryPrice));
        display3("3 boxes: $" + (raspberryPrice *3));
*/

       /* StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1 box : $").append(raspberryPrice);
        stringBuilder.append("\n 2 boxes: $").append((raspberryPrice *2));
        stringBuilder.append("\n 3 boxes: $" ).append((raspberryPrice *3));
        display(stringBuilder.toString());*/

/*
        int dollars = 40;
        int dollarstoYen = 119;
        int yen = dollarstoYen * dollars;
        display (yen);
*/
        String firstName = "Lyla";
        String lastName = "Fujiwara";
        String contactInfo = firstName + " " + lastName;
        contactInfo = contactInfo + "<" + lastName + "." + firstName + "@justjava.com>";
        display(contactInfo);
    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

  /*public void display(int i) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText("" + i);
    }*/

    public void display(String message) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(" " + message);
    }

/*    public void display1(String text) {
        TextView t = (TextView) findViewById(R.id.display1_text_view);
        t.setText(text);
    }

    public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.display2_text_view);
        t.setText(text);
    }

    public void display3(String text) {
        TextView t = (TextView) findViewById(R.id.display3_text_view);
        t.setText(text);
    }*/
}