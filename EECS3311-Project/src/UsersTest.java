import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class UsersTest {
	
	
	
		 @Test
		    public void checkEmail() {
			 Users use= new Users();
			 use.setEmail("test@outlook.com");
			 assertEquals(use.getEmail(), "test@outlook.com");				 
			
		 } 
		 @Test
	
		    public void checkPassword() {
			 Users use= new Users();
			 use.setPassword("ASQW12344");
			 assertEquals(use.getPassword(), "ASQW12344");	 
			
		 } 
		 @Test
			
		    public void checkParkingId() {
			 Users use= new Users();
			 use.setParkingid("#12343");
			 assertEquals(use.getParkingid(), "#12343");	 
			
		 } 
		 @Test
			
		    public void checkLastName() {
			 Users use= new Users();
			 use.setlastName("Park");
			 assertEquals(use.getlastName(), "Park");	 
			
		 } 
		 @Test
		    public void checkName() {
			 Users use= new Users();
			 use.setName("Mike");
			 assertEquals(use.getName(), "Mike");	 
			
		 } 
		 @Test
		    public void checkl1() {
			 Users use= new Users();
			 use.setL1("ASD12");
			 assertEquals(use.getL1(), "ASD12");	 
			
		 } 
		 @Test
		    public void checkl2() {
			 Users use= new Users();
			 use.setL2("ASD12");
			 assertEquals(use.getL2(), "ASD12");	 
			
		 } 
		 @Test
		    public void checkl3() {
			 Users use= new Users();
			 use.setL3("ASD12");
			 assertEquals(use.getL3(), "ASD12");	 
			
		 } 
	
	
	
	

}
