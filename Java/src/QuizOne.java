import java.util.Scanner;

public class QuizOne {

	public static void main(String[] args) {
		int amt, r2000=0, r500=0, r100=0, r50=0, r20=0, 
				r10=0, r5=0, r2=0, r1=0 ,count=0;
		
		System.out.print("Enter The Amount in Rupees : \n\n");
		Scanner skill = new Scanner(System.in);
		amt = skill.nextInt();
		
		while (amt >= 2000) {
			r20 = amt / 2000 ;
			amt = amt % 2000;
			System.out.print("\nTotal Number of 2000 Peso Notes : "+ r2000);
			break ;
		}
		
		while ( amt >= 500 ) {
			r500 = amt / 500;
			amt = amt % 500;
			System.out.print("\nTotal Number Of 500 Peso Notes : " + r500);
			break;
		}
		
		while (amt >= 100) {
			r100 = amt / 100 ;
			amt = amt % 100;
			System.out.print("\nTotal Number Of 100 Peso Notes : " + r100);
			break ;
		}
		
		while (amt >= 50) {
			r20 = amt / 50 ;
			amt = amt % 50;
			System.out.print("\nTotal Number of 50 Peso Notes : "+ r50);
			break ;
		}
		
		while (amt >= 20) {
			r20 = amt / 20 ;
			amt = amt % 20;
			System.out.print("\nTotal Number of 20 Peso Notes : "+ r20);
			break ;
		}
		
		while (amt >= 10) {
			r10 = amt /10 ;
			amt = amt % 10;
			System.out.print("\nTotal Number Of Peso Notes or Coin : "+ r10);
			break ;
		}
		
		while (amt >= 5) {
			r5 = amt / 5 ;
			amt = amt % 5;
			System.out.print("\nTotal Number Of Peso Notes or Coin : "+ r5);
			break ; 
		}
		
		while ( amt >= 2 ) {
			r2 = amt / 2;
			amt = amt % 2;
			System.out.print("\nTotal Number of Peso Notes Or Coin : "+ r2);
			break ;
		}
		
		while (amt >= 1 ) {
			r1 = amt / 1;
			amt = amt % 1;
			System.out.print("\nTotal Number Of Peso Notes or Coin : "+ r1);
			break ;
		}
		
		count = r2000 + r500 + r100 + r50 + r20 + r10 + r5 + r2 + r1;
		System.out.println("\nTotal Number of Notes and Coins: " + count);
		}

	}