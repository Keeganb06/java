//Astronaut
//Keegan Brennan
//9/27/20
//astronaut class with name, height, and weight


package gov.nasa.spacevehicles;
import gov.nasa.personnel.*;

import java.time.LocalDate; //new
import java.time.LocalDateTime; //new
import java.time.Period; //new
import java.util.ArrayList; //new
import java.util.List; //new

public class SpaceStation 
{

   private String name;
   private double weight;
   private double altitude;
   
   private int currentNumberOfAstronauts;
   List<Astronaut> astronauts = new ArrayList<>(); //new
      
   public SpaceStation(String name, double weight) 
   {
      this.name = name;
      this.weight = weight;
      this.altitude = 0;
      this.currentNumberOfAstronauts = 0;
   }
   
   public void addAstronaut(String name, double height, double weight, LocalDateTime timeOfTravel, Period stay, LocalDate estDeparture) //new
   {
      this.weight += weight;
      astronauts.add(new Astronaut(name, height, weight, timeOfTravel, stay, estDeparture)); //new
      currentNumberOfAstronauts++; //new
   }
   
   public void setAltitude(double altitude) 
   {
      this.altitude = altitude;
   }
   
   public String toString()
   {
      String str = "SpaceStation: " + name;
      str = str + "\nWeight (kg): " + String.format("%.2f", weight);
      str = str + "\nAltitude (km): " + String.format("%.2f", altitude);
      str = str + "\nAstronauts: " + Integer.toString(currentNumberOfAstronauts) + "\n";
      return str;
   }
   
   public static void main(String[] args)
   {
      SpaceStation ss = new SpaceStation("ISS", 419700.0);
      System.out.println(ss);
      LocalDateTime timeOfTravel = LocalDateTime.now();
      Period p1 = Period.ofDays(30);
      Period p2 = Period.ofDays(60);
      Period p3 = Period.ofDays(90);
      
      LocalDate estDep1 = LocalDate.now().plusDays(p1.getDays());
      LocalDate estDep2 = LocalDate.now().plusDays(p2.getDays());
      LocalDate estDep3 = LocalDate.now().plusDays(p3.getDays());
      System.out.println("Adding astronauts!");
      System.out.println();
      ss.addAstronaut("Smith", 167.64, 81.65, timeOfTravel, p1, estDep1);
      ss.addAstronaut("Bob", 162.58, 77.34, timeOfTravel, p2, estDep2);
      ss.addAstronaut("Mikal", 165.42, 80.52, timeOfTravel, p3, estDep3);
      ss.setAltitude(400.0);
      System.out.println(ss);
      System.out.println("Astronauts details:");
      ss.astronauts.forEach(a -> System.out.println(a + "\n"));
   }
}