package ejercicio4;
import java.util.Scanner;


public class hadi7kayafihaMaryamMshat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int suma=0;
		int n;
		 
		for(int i=0;i<10;i++) {
			n=sc.nextInt();
		System.out.println("Inserta 10 numeros :");
		try {
			suma=suma+n;
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		}
		System.out.println(suma);
	}/////////

}
