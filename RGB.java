//RGB
//Keegan Brennan
//9/20/2020
//randomly generates RGB values and displays their color, integer, and double values

import java.util.Random;

public class RGB{
   //maximum integer values
   static final int MAX_RGB_INT=255;
   
   //defines the color names
   enum COLOR {RED, GREEN, BLUE}; 
    
   //converts RGB integers and returns them as double values
   public double[] GetDouble(int[] ptValues){
      double returnVals[] = new double[3];
      for(int i = 0; i < ptValues.length; i++){
            returnVals[i] = ptValues[i] / (double)MAX_RGB_INT;
      }
      return returnVals;
    }
    
    public void DispColorElmts(int[] intVals, double[] dblVals){
      //displays each color's names, integer, and double values
      for(int i = 0; i < intVals.length; i++){
         System.out.println(COLOR.values()[i] + " " + intVals[i] + " " + dblVals[i]);
      }
    }
    
    
    public static void main(String[] args){
      //creates instance of RGB class
      RGB myRGB = new RGB();
      
      //creates instance arrays
      int intVals[] = new int[3];
      double dblVals[] = new double[3];
      
      //generates random numbers for the integer arrays
      Random r = new Random();
      for(int i = 0; i < intVals.length; i++){
         intVals[i] = r.nextInt(MAX_RGB_INT);
      }
      
      //generate double array from the integer array
      dblVals = myRGB.GetDouble(intVals); 
      myRGB.DispColorElmts(intVals, dblVals);
    }
      

}