package app;

import java.util.Scanner;

public class DoIt{
    
    public static void main(String[] args) {
	
	String b = null;
	    int a = 0,c = 0;
	
    try(Scanner s=new Scanner(System.in)){
  
    System.out.println("Vvedite dannie v odnu stroku cherez probel:");
    if(s.hasNextInt())a=s.nextInt();
    else System.out.println("Necorectnie dannie");
    if(s.hasNext())b=s.next();
    else System.out.println("Necorectnie dannie");
    if(s.hasNextInt())c=s.nextInt();
    else System.out.println("Necorectnie dannie");
    }catch(Exception e) {
	System.out.println(e);
    }
    
    try {
    SimpleCalculator sim=new SimpleCalculator(a,c);
  if(b.equals("+"))System.out.println("Summa: "+sim.getSum());
  if(b.equals("-"))System.out.println("Subtraction: "+sim.getSubtraction());
  if(b.equals("*"))System.out.println("Multipl: "+sim.getMultiplication());
  if(b.equals("/"))System.out.println("Divide: "+sim.getDivision());
    }catch(ArithmeticException e) {
    System.out.println(e);
    }
    }

}
