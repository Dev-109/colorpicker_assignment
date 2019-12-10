# colorpicker
The color picker allows you to choose a wide variety of different colors through the implementation of a wheel palette. The color picker can enable you to pick colors and perform a wide variety of tasks with it such as change the layouts of an app or set colors in both hardware and software applications. The major purpose of the color picker in my project is to use it to customize different colors for the Neopixel ring for the Lumi Project and will be used to light up an infants room at night. At the moment the color wheel can only change the background colors of the app and display the chosen values in both Hexadecimal and RGB values.

## History
Earlier versions of the android studio sdk were shipped with app demos that included the classical color wheel

## Methods and attributes
I have a few methods in the Main Activity that implements a color wheel on a bitmap and whenever i click or swipe on the wheel it returns a pixel value.

A method to implement bitmap on the color wheel
```
     //Implement a bitmap on the image
    color_wheel.setDrawingCacheEnabled(true);
    color_wheel.buildDrawingCache(true);
```
In the following code block, first method is invoked when a user touches on the color wheel and initiates an appropriate response inside the method. The second method(event.getAction()) inside the onTouch method detects a mouse event for the color wheel and returns a pair of x,y value to the event.
```
             public boolean onTouch(View v, MotionEvent event)
            {
                if(event.getAction()==MotionEvent.ACTION_DOWN||event.getAction()==MotionEvent.ACTION_MOVE)
                {
```
This piece of code gets the pixel values based on the mouse events.
```
getPixel((int)event.getX(),(int)event.getY());
```
The methods below retrieve the pixel value and converts it into an RGB value and assigns it to the variables, which we can manipulate to set text.
```
                     Color.red(pixels); //method to collect pixels corresponding to the red color on the wheel
                     Color.green(pixels);//method to collect pixels corresponding to the red color on the wheel
                     Color.blue(pixels);//method to collect pixels corresponding to the blue color on the wheel
 ```
We further use this method to convert the RGB values that we received earlier to convert it into a Hex value and display the equivalent hex value as well on the screen:
 ```
 Integer.toHexString();
 ```
 Finally to display the background color and set the text to the app from the wheel, we use the methods:
 ```
 setBackgroundColor(int color);
 setText(char[], int, int);
 ```
 ## Instructions on component usage
 ![Color Wheel](C:\\wheel.png)
 
Swipe your mouse across the color pick to pick a color and change the background theme of the page, with RGB and Hex values displayed at the bottom. To reset the colors simply click on the centre of the wheel to reset it to its default RGB and Hex values. To display lighter color shades,click on the centre-most edges of the wheel and click on the outer edges to display darker color themes. If you click on the outer edges of the color wheel, then the background theme will become dark.

## References

https://tekeye.uk/android/examples/ui/android-color-picker-tutorial

https://androidexample365.com/pick-a-color-using-color-wheel-and-slider-for-android

https://medium.com/@skydoves/how-to-implement-color-picker-in-android-61d8be348683
