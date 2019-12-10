# colorpicker
The color picker allows you to choose a wide variety of different colors through the implementation of a color wheel palette. The color picker can enable you to pick colors and perform a wide variety of tasks with it such as change the layouts of an app or set colors in both hardware and software applications. The major purpose of the color picker in my project is to use it to customize different colors for the Neopixel ring for the Lumi Project and will be used to light up an infants room at night. At the moment the color wheel can only change the background colors of the app and display the chosen values in both Hexadecimal and RGB values at the bottom of the screen.

## History
The color palette Api was implemented in Android Nougat starting from API level 24. The Api is included in the Android support library. The package is: android.support.* To be able to implement this component in Android Studio you need Android 7.0 or higher.
## Methods and attributes
I have a few methods in the Main Activity that implements a color wheel on a bitmap and whenever i click or swipe on the wheel it returns a pixel value and a hex value at the bottom of the screen.

The methods to implement bitmap on the color wheel
```
     //Implement a bitmap on the image
    setDrawingCacheEnabled(true);
    buildDrawingCache(true);
```
In the following code block, an interface named View.OnTouchListener is invoked when a touch event is dispatched to the color wheel. The first method is called when a user touches on the color wheel and initiates an appropriate response inside the method. The second method(event.getAction()) inside the onTouch method detects a mouse event on the color wheel and returns a pair of x,y values to the event, in the form of pixels.
```
             public boolean onTouch(View v, MotionEvent event)
             getAction()
               
                
```
This piece of code gets the pixel values based on the mouse events.
```
getPixel();
```
The methods below retrieve the pixel value and converts it into an RGB value and assigns it to the variables, which we can manipulate to set text.
```
                     Color.red() //method to collect pixels corresponding to the red color on the wheel
                     Color.green()//method to collect pixels corresponding to the red color on the wheel
                     Color.blue()//method to collect pixels corresponding to the blue color on the wheel
 ```
We further use this method below to convert the RGB values that we received earlier into a Hex value and display the equivalent hex value as well on the screen:
 ```
 Integer.toHexString();
 ```
 Finally to display the background color and set the text to the app from the wheel, we use the methods:
 ```
 setBackgroundColor(int color);
 setText(char[], int, int);
 ```
 ## Instructions on component usage
 
 ![Color wheel in android studio](/downloads/colorwheel.png)
 
Swipe your mouse across the color wheel to pick a color and change the background theme of the page, with RGB and Hex values displayed at the bottom. To reset the colors simply click on the centre of the wheel to reset it to its default RGB and Hex values. To display lighter color shades,click on the centre-most edges of the wheel and click on the outer edges of the wheel to display darker color themes. If you click on the outside of the color wheel, then the background theme will become dark.

## References

https://tekeye.uk/android/examples/ui/android-color-picker-tutorial

https://androidexample365.com/pick-a-color-using-color-wheel-and-slider-for-android

https://medium.com/@skydoves/how-to-implement-color-picker-in-android-61d8be348683

https://developer.android.com/training/material/palette-colors
