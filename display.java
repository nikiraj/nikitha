package guvi;
import java.util.*;
public class display {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the String");
			int n=s.nextInt();
			String m=String.valueOf(n);
			switch(m){
			case "1":
				System.out.println("1");
				break;
			case "2":
				System.out.println("ABC");
				break;
			case "3":
				System.out.println("DEF");
				break;
			case "4":
				System.out.println("GHI");
				break;
			case "5":
				System.out.println("JKL");
				break;
			case "6":
				System.out.println("MNO");
				break;
			case "7":
				System.out.println("PQRS");
				break;
			case "8":
				System.out.println("TUV");
				break;
			case "9":
				System.out.println("WXYZ");
				break;
			case "0":
				System.out.println("0");
				break;
			case "*":
				System.out.println("*");
				break;
			case "#":
				System.out.println("#");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			s.close();

		}

	}


