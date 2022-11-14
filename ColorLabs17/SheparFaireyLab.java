
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
         /*
         Color color1 = new Color(207, 245, 231);
         Color color2 = new Color(160, 228, 203);
         Color color3 = new Color(89, 193, 189);
         Color color4 = new Color(13, 76, 146);
         */
        int add = 0;
        /*
         Color color1 = new Color(0 + add, 150 + add, 98 + add);
         Color color2 = new Color(0 + add, 136 + add, 113 + add);
         Color color3 = new Color(0 + add, 120 + add, 120 + add);
         Color color4 = new Color(0 + add, 104 + add, 117 + add);
         Color color5 = new Color(25 + add, 88 + add, 106 + add);
         Color color6 = new Color(47 + add, 72 + add, 88 + add);
         */
         
         // Color color1 = new Color(82 + add, 255 + add, 127 + add); // light green
         Color color2 = new Color(0 + add, 226 + add, 255 + add);  // light blue
         Color color3 = new Color(0 + add, 255 + add, 50 + add); // green
         Color color1 = new Color(255 + add, 182 + add, 193 + add); // light pink
         Color color4 = new Color(0 + add, 170 + add, 255 + add); // blue
         Color color5 = new Color(74 + add, 93 + add, 142 + add); // navy blue
         Color color6 = new Color(61 + add, 74 + add, 62 + add); // dark green
         /**
          * method 1 change
          */
         Picture me1 = new Picture("images/connorfurby.jpg");
         Pixel[] pixels1;
         pixels1 = me1.getPixels();
         me1.explore();
         int avg, currRed, currGreen, currBlue, bucket1max, bucket2max, bucket3max, bucket4max, bucket5max, bucket6max, currGreyColor;
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
         Picture me3 = new Picture("images/connorfurby.jpg");
         Pixel[] pixels3;
         pixels3 = me3.getPixels();
          for (Pixel spot : pixels3)
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
        totalminmax = b - s;
        bucket2max = ((totalminmax / 6) * 5) + s - 55;
        bucket3max = ((totalminmax / 6) * 4) + s;
        bucket4max = ((totalminmax / 6) * 3) + s - 20;
        bucket5max = ((totalminmax / 6) * 2) + s + 20;
        bucket6max = ((totalminmax / 6) * 1) + s;
        for (Pixel spot : pixels3)
        {
            currRed = spot.getRed();
            currGreen = spot.getGreen();
            currBlue = spot.getBlue();
            currIntensity = (currRed + currGreen + currBlue);
            if (currIntensity > bucket2max)
            {
                spot.setColor(color1);
            }
            else if (currIntensity > bucket3max)
            {
                spot.setColor(color2);
            }
            else if (currIntensity > bucket4max)
            {
                spot.setColor(color3);
            }
            else if (currIntensity > bucket5max)
            {
                spot.setColor(color4);
            }
            else if (currIntensity > bucket6max)
            {
                spot.setColor(color5);
            }
            else
            {
                spot.setColor(color6);
            }
        }
        me3.explore();
        //me3.write("images/sfTry3.jpg");
    }//main       
}//class
