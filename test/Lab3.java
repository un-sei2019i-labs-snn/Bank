
package lab3;

import java.util.Scanner;

public static int Fibonacci(int a)
{
	if(a==0)
		return 0;
	else if(a==1)
		return 1;
	else return Fibonacci(a-1) + Fibonacci(a-2);
}

public class Lab3 {

 public static void main(String[] args) {
        int x = 0;
	x = Fibonacci(5);
	system.out.println(x);
 }
}

