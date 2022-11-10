
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    public static void main(String[] args)
    {
         Picture ogconnor = new Picture("images/connorfurby.jpg");
         Color offwhite = new Color(249,229,168);
         Color lightblue = new Color(113,150,159);
         Color red = new Color(216, 25, 33);
         Color darkblue = new Color(0, 53,81);
         /**
          * method 1 change
          */
         Picture me1 = new Picture("images/connorfurby.jpg");
         Pixel[] pixels1;
         pixels1 = me1.getPixels();
         me1.explore();
         int avg, currRed, currGreen, currBlue, bucket1max, bucket2max, bucket3max, bucket4max, currGreyColor;
        for (Pixel spot : pixels1)
        {
            currRed = spot.getRed();
            currGreen = spot.getGreen();
            currBlue = spot.getBlue();
            avg = (currRed + currGreen + currBlue) / 3;
            Color currColor = new Color(avg, avg, avg);
            spot.setColor(currColor);
        }
        bucket2max = (255 / 4) * 3;
        bucket3max = (255 / 4) * 2;
        bucket4max = (255 / 4) * 1;
        for (Pixel spot : pixels1)
        {
            currGreyColor = spot.getBlue();
            if (currGreyColor > bucket2max)
            {
                spot.setColor(offwhite);
            }
            else if (currGreyColor > bucket3max)
            {
                spot.setColor(lightblue);
            }
            else if (currGreyColor > bucket4max)
            {
                spot.setColor(red);
            }
            else
            {
                spot.setColor(darkblue);
            }
        }
        me1.explore();
        me1.write("images/sf1.jpg");
         /**
          * method 2 change 
          */
         Picture me2 = new Picture("images/connorfurby.jpg");
         Pixel[] pixels2;
         pixels2 = me2.getPixels();
         int currIntensity, b = -1, s = 766;
         for (Pixel spot : pixels2)
        {
            currRed = spot.getRed();
            currGreen = spot.getGreen();
            currBlue = spot.getBlue();
            currIntensity = (currRed + currGreen + currBlue);
            if (currIntensity > b)
                b = currIntensity;
            if (currIntensity < s)
                s = currIntensity;
        }
        int totalminmax = b - s;
        bucket2max = ((totalminmax / 4) * 3) + s;
        bucket3max = ((totalminmax / 4) * 2) + s;
        bucket4max = ((totalminmax / 4) * 1) + s;
        for (Pixel spot : pixels2)
        {
            currRed = spot.getRed();
            currGreen = spot.getGreen();
            currBlue = spot.getBlue();
            currIntensity = (currRed + currGreen + currBlue);
            if (currIntensity > bucket2max)
            {
                spot.setColor(offwhite);
            }
            else if (currIntensity > bucket3max)
            {
                spot.setColor(lightblue);
            }
            else if (currIntensity > bucket4max)
            {
                spot.setColor(red);
            }
            else
            {
                spot.setColor(darkblue);
            }
        }
        me2.explore();
        me1.write("images/sf2.jpg");
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
