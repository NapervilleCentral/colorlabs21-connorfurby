
/**
 * Connor Furby
 * 11/4/22
 * Color Lab
 */
import java.awt.*;
import java.util.*;
import java.util.List;
public class colorLab
{
    public static void main(String[] args)
    {
        Picture bluemark1 = new Picture("images/blue-mark.jpg");
        Pixel[] pixels1;
        pixels1 = bluemark1.getPixels();
        
        //original
        bluemark1.explore();
        
        //getblue()
        for (Pixel spot : pixels1)
        {
            spot.setBlue(255);
        }
        bluemark1.explore();
        
        //negate()
        Picture bluemark2 = new Picture("images/blue-mark.jpg");
        Pixel[] pixels2;
        pixels2 = bluemark2.getPixels();
        int currRed, currGreen, currBlue;
        for (Pixel spot : pixels2)
        {
            currRed = spot.getRed();
            currGreen = spot.getGreen();
            currBlue = spot.getBlue();
            Color currColor = new Color(255 - currRed, 255 - currGreen, 255 - currBlue);
            spot.setColor(currColor);
        }
        bluemark2.explore();
        
        // adjustRed()
        Picture bluemark3 = new Picture("images/blue-mark.jpg");
        Pixel[] pixels3;
        pixels3 = bluemark3.getPixels();
        for (Pixel spot : pixels3)
        {
            currRed = spot.getRed();
            spot.setRed((int)(currRed * 0.5));
        }
        bluemark3.explore();
        
        // greyscale()
        Picture bluemark4 = new Picture("images/blue-mark.jpg");
        Pixel[] pixels4;
        pixels4 = bluemark4.getPixels();
        int avg;
        for (Pixel spot : pixels4)
        {
            currRed = spot.getRed();
            currGreen = spot.getGreen();
            currBlue = spot.getBlue();
            avg = (currRed + currGreen + currBlue) / 3;
            Color currColor = new Color(avg, avg, avg);
            spot.setColor(currColor);
        }
        bluemark4.explore();
        
        // lighten()
        Picture bluemark5 = new Picture("images/blue-mark.jpg");
        Pixel[] pixels5;
        pixels5 = bluemark5.getPixels();
        for (Pixel spot : pixels5)
        {
            currRed = spot.getRed() + 30;
            currGreen = spot.getGreen() + 30;
            currBlue = spot.getBlue() + 30;
            if (currRed > 255)
                currRed = 255;
            if (currBlue > 255)
                currBlue = 255;
            if (currGreen > 255)
                currGreen = 255;
            Color currColor = new Color(currRed, currGreen, currBlue);
            spot.setColor(currColor);
        }
        bluemark5.explore();
        
        // colorify()
        Picture bluemark6 = new Picture("images/blue-mark.jpg");
        Pixel[] pixels6;
        pixels6 = bluemark6.getPixels();
        for (Pixel spot : pixels6)
        {
            currRed = spot.getRed();
            currGreen = spot.getGreen();
            currBlue = spot.getBlue();
            if (currRed >= 160 && currRed <= 240 && currGreen >= 160 && currGreen <= 240 && currBlue >= 150 && currBlue <= 230)
                spot.setColor(Color.yellow);
        }
        bluemark6.explore();
        
        //swap2()
        Picture bluemark7 = new Picture("images/blue-mark.jpg");
        Pixel[] pixels7;
        pixels7 = bluemark7.getPixels();
        int newGreen, newRed, newBlue;
        for (Pixel spot : pixels7)
        {
            currRed = spot.getRed();
            currGreen = spot.getGreen();
            currBlue = spot.getBlue();
            newGreen = currRed;
            newRed = currGreen;
            Color currColor = new Color(newRed, newGreen, currBlue);
            spot.setColor(currColor);
        }
        bluemark7.explore();
        
        //swap3()
        Picture bluemark8 = new Picture("images/blue-mark.jpg");
        Pixel[] pixels8;
        pixels8 = bluemark8.getPixels();
        for (Pixel spot : pixels8)
        {
            currRed = spot.getRed();
            currGreen = spot.getGreen();
            currBlue = spot.getBlue();
            newRed = currGreen;
            newGreen = currBlue;
            newBlue = currRed;
            Color currColor = new Color(newRed, newGreen, newBlue);
            spot.setColor(currColor);
        }
        bluemark8.explore();
        
    }
}
