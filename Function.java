//ApplyFunction
//Keegan Brennan
//10/25/2020
//prints an int number using Print class and halves the values in the array


public class Function {
    public static int[] applyFunction(Function func, int...arrln){
        int length = arrIn.length;
        int[] arrOut = new int[length];
        // call evaluate for all elements of arrIn
        for (int i = 0; i < length; i++) {
            arrOut[i] = func.evaluate(arrIn[i]);
        }
        return arrOut;
    }
   interface Function {
    int evaluate(int arg);
    class Print{
      
    }
   }
}