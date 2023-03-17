//Module 8
//Keegan Brennan
//11/1/20
//displays pairs and their hashcodes then checks to see if the they are equal


public class Main{
    Dog dog1= new Dog();
    Cat cat1= new Cat();   
    Fish fish1= new Fish();
    Pair pair0=new Pair(dog1, cat1);
    Pair pair1=new Pair(cat1, fish1);
    Pair pair2=new Pair(dog1, dog1);
    Pair pair3=new Pair(dog1, dog1);
    public static void main (String[] args){
      Main main=new Main();
      System.out.println("pair 0: " + main.pair0.toString());
      System.out.println("pair 0 hashcode: " + main.pair0.hashCode());
      System.out.println("pair 1: " + main.pair1);
      System.out.println("pair 1 hashcode: " + main.pair1.hashCode());
      System.out.println("pair 2: " + main.pair2);
      System.out.println("pair 2 hashcode: " + main.pair2.hashCode());
      System.out.println("pair 3: " + main.pair3);
      System.out.println("pair 3 hashcode: " + main.pair3.hashCode());
      System.out.println(main.pair0.toString() + " equals " + main.pair1.toString() + "?" + main.pair0.equals(main.pair1));
      System.out.println(main.pair1.toString() + " equals " + main.pair2.toString() + "?" + main.pair1.equals(main.pair2));
      System.out.println(main.pair2.toString() + " equals " + main.pair3.toString() + "?" + main.pair2.equals(main.pair3));
    }
   public final class Pair {
       private final Object first, second;
       
       // construct a Pair object
       public Pair(Object one, Object two) {
           first = one;
           second = two;
       }
       
       // return the first constituent object
       public Object getFirst() { return first; }
       
       // return the second constituent object
       public Object getSecond() { return second; }
       
       // return true if the pair of objects are identical
       @Override
       public boolean equals(Object other) {
           boolean result;
           if (this == other)
               result = true;
           else if (! (other instanceof Pair)) 
               result = false;
           else {
               Pair otherPair = (Pair) other;
               result = first.equals(otherPair.first) && second.equals(otherPair.second);
           }
           return result;
       }
       
       // return hash code for the aggregate pair
       @Override
       public int hashCode() {
           // XOR hash codes to create a hashcode for the pair
           // if the objects are equal, use one hashcode, otherwise
           // the XOR result (and subsequent hashCode value) is 0.
           return first.equals(second) ? first.hashCode() : first.hashCode() ^ second.hashCode();
       }
       
       // return textual representation of aggregated object
       @Override
       public String toString() {
           return "[" + first + ", " + second + "]";
       }
   }

   public class Dog{
      @Override
       public String toString() {
           return "Dog";
       }
   }

   public class Cat{
       @Override
       public String toString() {
           return "Cat";
       }

   }

   public class Fish{
       @Override
       public String toString() {
           return "Fish";
       }

   }

}

