import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter 0,1 or 2 (0 for user and 1 for parking officer and 2 for system administrator) : ");

        int num = scan.nextInt();

        scan.close();
        if(num==0) {
        	GUICustomer customer =new GUICustomer();
        }
        else if(num ==1) {
        	
        	GUIParkingofficer jur = new GUIParkingofficer();

        	
        }
        else if(num ==2) {
        	GUIAdmin ql =new GUIAdmin();
        }
 

	}

}
