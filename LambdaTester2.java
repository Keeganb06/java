//LambdaTester2
//Keegan Brennan
//11/22/20
//multiplies pairs in an array using a lambda expression

interface Multiplier{
      int multiply(int num1, int num2);
} 
      
class Pair {
    private int num1, num2;

    public Pair() {}
    public Pair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getNum1() { return num1; }
    public int getNum2() { return num2; }
}

public class LambdaTester2{
      public static void main(String[] args){
         Pair[] pArray = { new Pair(2, 4), new Pair(3, 6), new Pair(4, 7) };  
      
        Multiplier lambda=(a, b)->{return a * b;};
        
         for (int i = 0; i < pArray.length; i++){        
            System.out.println("Multiply " + pArray[i].getNum1() + " * " + pArray[i].getNum2() + " = " + lambda.multiply(pArray[i].getNum1(), pArray[i].getNum2()));
          } 
      }          
}

