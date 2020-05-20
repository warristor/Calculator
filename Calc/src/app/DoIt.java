package app;

import java.util.Scanner;

public class DoIt{
    
    public static void main(String[] args) {
	
	String b = null;
	double a = 0,c = 0;
	
    try(Scanner s=new Scanner(System.in)){
  
    System.out.println("Vvedite dannie v odnu stroku cherez probel:");
   if(s.hasNextDouble()){ 
     a=s.nextDouble();
     if(s.hasNext()) {
	b=s.next();
	if(b.equals("+")||b.equals("-")||b.equals("/")||b.equals("*")) {
	if(s.hasNextDouble())c=s.nextDouble();
	else System.out.println("Necorectnoe 2chislo");
	}else System.out.println("Necorectni znak");
        }    
        
   }
   else System.out.println("Necorectnoe 1chislo");      
   }catch(Exception e) {
	System.out.println(e);
    }
    
    try {
    SimpleCalculator sim=new SimpleCalculator(a,c);
  if(b.equals("+"))System.out.println("Summa result:  "+sim.getSum());
  if(b.equals("-"))System.out.println("Subtraction result:  "+sim.getSubtraction());
  if(b.equals("*"))System.out.println("Multiplication result:  "+sim.getMultiplication());
  if(b.equals("/"))System.out.println("Divide result:  "+sim.getDivision());
    }catch(ArithmeticException e) {
    System.out.println(e);
    }
    }

}
