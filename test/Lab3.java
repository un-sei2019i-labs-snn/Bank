ackage lab3;

import java.util.Scanner;


public class Lab3 {


public static int Fibonacci(int a)
{
	if(a==0)
		return 0;
	else if(a==1)
		return 1;
	else return Fibonacci(a-1) + Fibonacci(a-2);
}

public static int suma(int a,int b,int c ,int d){        
    return a+b+c+d;

public static void par(int a)
{
	if(a%2==0)
		system.out.println("El numero" + a +" no  es par");
	else
		system.out.println("El numero " + a +"  no es par");
}

    public static void main(String[] args) {
 
	int x = 0;
	x = Fibonacci(5);
	system.out.println(x);
	par(2);
        par(3);   
    
	int c = 0;
        c = suma(3,7,6,34);
        
        System.out.println(c);        

        
    }
    
  }   
}
