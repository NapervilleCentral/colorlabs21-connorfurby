
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
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
         Picture ogconnor = new Picture("images/connorfurby.jpg");
         /**
          * method 1 change
          */
         Picture me1 = new Picture("images/connorfurby.jpg");
         Pixel[] pixels1;
         pixels1 = me1.getPixels();
         int avg, currRed, currGreen, currBlue, bucket1, bucket2, bucket3, bucket4, currGreyColor;
        for (Pixel spot : pixels1)
        {
            currRed = spot.getRed();
            currGreen = spot.getGreen();
            currBlue = spot.getBlue();
            avg = (currRed + currGreen + currBlue) / 3;
            Color currColor = new Color(avg, avg, avg);
            spot.setColor(currColor);
        }
        bucket1 = (255 / 4) * 4;
        bucket2 = (255 / 4) * 3;
        bucket3 = (255 / 4) * 2;
        bucket4 = (255 / 4) * 1;
        for (Pixel spot : pixels1)
        {
            currGreyColor = spot.getBlue();
            if (currGreyColor < bucket4)
            {
                
            }
                
        }
         /**
          * method 2 change 
          */
         
         
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
