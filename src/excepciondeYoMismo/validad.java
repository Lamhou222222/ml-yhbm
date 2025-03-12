package excepciondeYoMismo;
import java.util.Scanner;

public class validad {

	public static void main(String[] args) {
		System.out.println("inserta un numero");
		Scanner sc=new Scanner(System.in);
		String numeroo=sc.nextLine();
		try {
			int n=Integer.parseInt(numeroo);
			System.out.println("inserta los numeros");
			if(n>10 || n<0) {
				throw new myExcepcion("no ");
			}
			System.out.println("okey");
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
		catch(myExcepcion n) {
			System.out.println(n.getMessage());
		}finally{
			sc.close();
		}
		

	}

}
