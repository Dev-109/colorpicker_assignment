# colorpicker
The color picker allows you to choose a wide variety of different colors through the implementation of a color wheel palette. The color picker can enable you to pick colors and perform a wide variety of tasks with it such as change the layouts of an app or set colors in both hardware and software applications. The major purpose of the color picker in my project is to use it to customize different colors for the Neopixel ring for the Lumi Project and it will be used to light up an infants room at night based upon the readings from the TSL2591 sensor. At the moment the color wheel can only change the background colors of the app and display the chosen values in both Hexadecimal and RGB values at the bottom of the screen.

## History
The color palette Api was implemented in Android Nougat starting from API level 24. The Api is included in the Android support library. The package is: android.support.* To be able to implement this component in Android Studio you need Android 7.0 or higher.
## Methods and attributes
I have a few methods in the Main Activity that implements a color wheel on a bitmap and whenever i click or swipe on the wheel it returns an RGB value and a hex value at the bottom of the screen.

Below are some of the important methods that I used to implement the color wheel: 

The first method that I used is to implement the bitmap on the color wheel:
```
     //Implement a bitmap on the image
  public void setDrawingCacheEnabled (boolean enabled)
```
In the following code block below, an interface named View.OnTouchListener is invoked when a touch event is dispatched to the color wheel. The first method is called when a user touches on the color wheel and initiates an appropriate response inside the method. The second method inside the onTouch method detects a mouse event on the color wheel and returns a pair of x,y values to the event.
```
             public boolean onTouch(View v, MotionEvent event)
             public int getAction ()               
                
```
This piece of code gets the pixel values based on the x and y coordinates it receives from the bitmap graph representation.
```
public int getPixel (int x, int y)
```
The methods below use the pixel values and convert it into an RGB value and we can assign it to variables, which we can manipulate to set text to get the RGB values to display at the bottom. The first method checks if the user has clicked a particular area on the color graph that represents the red area, if so then it assigns the pixel values to a variable. The same applies for the other two methods:
```
                     Color.red() //method to collect pixels corresponding to the red color on the wheel
                     Color.green()//method to collect pixels corresponding to the red color on the wheel
                     Color.blue()//method to collect pixels corresponding to the blue color on the wheel
 ```
We further use the method below to convert the RGB values that we received earlier into a Hex value and display the equivalent hex value as well on the screen:
 ```
public static String toHexString (int i)
```
 Finally to display the background color and set the text on the app from the wheel, we use the methods:
 ```
 setBackgroundColor(int color)
 setText(char[], int, int)
 ```
The XML attributes that I used for this project were the general ones for the file such as: 
1. ImageView for the color wheel.
2. A textview for the RGB and Hex values as well as for the extra headings and words.

## Instructions on component usage and setup
 
![wheel](https://user-images.githubusercontent.com/55503392/70555168-87523e80-1b4c-11ea-95c3-8f27e851a9a7.png)
 
To get started with the color wheel, swipe your mouse across the color wheel to pick a variety of colors and change the background theme of the page, with RGB and Hex values displayed at the bottom. To reset the colors simply click on the centre of the wheel to reset it to its default RGB and Hex values. To display lighter color shades,click on the centre-most edges of the wheel and click on the outer edges of the wheel to display darker color themes. If you click on the outside of the color wheel, then the background theme will become dark. 
 
#### Implementing the color wheel on your device:

In short, the main steps to implement the following component into your device are as follows:  
 1. Pick a color wheel image from the internet and implement that into your XML file as an imageview.
 2. Create a bitmap for the image by using the Bitmap class and use the DrawingCacheenabled and setDrawingCacheEnabled methods.
 3. Implement the setOnTouchListener interface along with the OnTouch method inside it for the bitmap, to be able to detect the mouse touch events and get the values.
 4. Get the pixel values through the method getPixel() and assign them to RGB variables.
 5. Convert the RGB variable values to hexadecimal using the toHexString() method.
 6. Set the text for the RGB and Hex values using the setText() method.

## References

https://tekeye.uk/android/examples/ui/android-color-picker-tutorial

https://androidexample365.com/pick-a-color-using-color-wheel-and-slider-for-android

https://medium.com/@skydoves/how-to-implement-color-picker-in-android-61d8be348683

https://developer.android.com/training/material/palette-colors
