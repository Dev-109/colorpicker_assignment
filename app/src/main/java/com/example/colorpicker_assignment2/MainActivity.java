package com.example.colorpicker_assignment2;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Color;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


public class MainActivity extends AppCompatActivity  {


        Bitmap map; //represent the color wheel on a circular grid composed of individual dots corresponding to our pixels
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  final ImageView color_wheel = findViewById(R.id.color_wheel); //find the color wheel
        final TextView color_results = findViewById(R.id.color_results); //find the text to print the color
   
    color_wheel.setDrawingCacheEnabled(true);
    color_wheel.buildDrawingCache(true);


        final ConstraintLayout layout = findViewById(R.id.constlayout); //define a contraint layout object to set the background color
//An interface to handle a touch event
        color_wheel.setOnTouchListener(new View.OnTouchListener(){
            @Override

            public boolean onTouch(View v, MotionEvent event)
            {
                if(event.getAction()==MotionEvent.ACTION_DOWN||event.getAction()==MotionEvent.ACTION_MOVE)
                {
                    map = color_wheel.getDrawingCache();
                    if (event.getX() >= map.getWidth() || event.getY() >= map.getHeight())
                        return true;
                    int pixels = map.getPixel((int)event.getX(),(int)event.getY());
                   //get the RGB values
                    int Red = Color.red(pixels); //assign the red pixel values collected to variable R
                    int Green = Color.green(pixels);//assign the green pixels collected to va
                    int Blue = Color.blue(pixels);

                    //get the hex values
                    String hexadecimal = "#"+Integer.toHexString(pixels);

                    //set background color
                    layout.setBackgroundColor(Color.rgb(Red,Green,Blue));

                    color_results.setText("RGB value: "+Red+" ,"+Green+" ,"+Blue+"\nHex value: "+hexadecimal);

                }
                return true;
            }

        });
    }
}


