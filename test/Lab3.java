package lab3;

import java.util.Scanner;


public class Lab3 {

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
        par(2);
        par(3);   
    
	int c = 0;
        c = suma(3,7,6,34);
        
        System.out.println(c);        

        
    }
    
  }   
}
