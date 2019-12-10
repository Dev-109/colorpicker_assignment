# colorpicker
The color picker allows you to choose a wide variety of different colors through the implementation of a wheel palette. The color picker can enable you to pick colors and perform a wide variety of tasks with it such as change the layouts of an app or set colors in both hardware and software applications. The major purpose of the color picker in my project is to use it to customize different colors for the Neopixel ring for the Lumi Project and will be used to light up an infants room at night. At the moment the color wheel can only change the background colors of the app and display the chosen values in both Hexadecimal and RGB values.

## History
Earlier versions of the android studio sdk were shipped with app demos that included the classical color wheel

## Methods and attributes
I have a few methods in the Main Activity that implements a color wheel on a bitmap and whenever i click or swipe on the wheel it returns a pixel value.

A method to implement the color wheel image on the bitmap
```
     //Implement a bitmap on the image
    color_wheel.setDrawingCacheEnabled(true);
    color_wheel.buildDrawingCache(true);
```
The method to respond to touch events on the color wheel
```
            public boolean onTouch(View v, MotionEvent event)
```
