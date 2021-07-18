import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.csvreader.CsvReader;
public class UserManagementTest {
 String path ="user.csv";
 int flag=0;
 ArrayList<Users> users = new ArrayList<Users>();
 
	
		// TODO Auto-generated constructor stub
		 
	 @Test
	    public void checkEmail() {
		
			
			 Users use= new Users();
			 use.setEmail("test@g.com");
			 users.add(use);
			 UserManagement manage = new UserManagement(users);
			 for(Users aa :users) {
				 if(aa.getEmail().equals("test@g.com")) {
					flag =1;
				 }
			 }
			 if(flag==1) {
				 assertTrue(true);
			 }
			 else {
				 assertFalse(true);
			 }
					 
		
	 }  
	 
	 
	 @Test
	    public void checkName() {
			 ArrayList<Users> users = new ArrayList<Users>();
			 try {
					CsvReader reader = new CsvReader(path); 
					reader.readHeaders();

					while(reader.readRecord()){ 
						Users user1 = new Users();
						//name,lastname,id,email,password
						user1.setName(reader.get("name"));
						user1.setlastName(reader.get("lastname"));
						user1.setId(Integer.valueOf(reader.get("id")));
						user1.setEmail(reader.get("email"));
						user1.setPassword(reader.get("password"));
						user1.setSlot1(reader.get("slot1"));
						user1.setSlot2(reader.get("slot2"));
						user1.setSlot3(reader.get("slot3"));
						user1.setStime(Integer.valueOf(reader.get("stime")));
						user1.setEtime(Integer.valueOf(reader.get("etime")));
						user1.setL1(reader.get("l1"));
						user1.setL2(reader.get("l2"));
						user1.setL3(reader.get("l3"));
						user1.setStatus(reader.get("status"));
						user1.setParkingid(reader.get("parkingid"));
						users.add(user1);
					}
					
					
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			 Users use= new Users();
			 use.setName("John");
			 use.setlastName("Lim");
			 users.add(use);
			 UserManagement manage = new UserManagement(users);
			 for(Users aa :users) {
				 if(aa.getName().equals("John") && aa.getlastName().equals("Lim")) {
					flag =1;
				 }
			 }
			 if(flag==1) {
				 assertTrue(true);
			 }
			 else {
				 assertFalse(true);
			 }
					 
		
	 }  
	 
	 
	 @Test
	    public void CheckLicenseNumber() {
			 ArrayList<Users> users = new ArrayList<Users>();
			 try {
					CsvReader reader = new CsvReader(path); 
					reader.readHeaders();

					while(reader.readRecord()){ 
						Users user1 = new Users();
						//name,lastname,id,email,password
						user1.setName(reader.get("name"));
						user1.setlastName(reader.get("lastname"));
						user1.setId(Integer.valueOf(reader.get("id")));
						user1.setEmail(reader.get("email"));
						user1.setPassword(reader.get("password"));
						user1.setSlot1(reader.get("slot1"));
						user1.setSlot2(reader.get("slot2"));
						user1.setSlot3(reader.get("slot3"));
						user1.setStime(Integer.valueOf(reader.get("stime")));
						user1.setEtime(Integer.valueOf(reader.get("etime")));
						user1.setL1(reader.get("l1"));
						user1.setL2(reader.get("l2"));
						user1.setL3(reader.get("l3"));
						user1.setStatus(reader.get("status"));
						user1.setParkingid(reader.get("parkingid"));
						users.add(user1);
					}
					
					
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			 Users use= new Users();
			 use.setL1("ABFY3456");
			 use.setL2("QWTY9875");
			 users.add(use);
			 UserManagement manage = new UserManagement(users);
			 for(Users aa :users) {
				 if(aa.getL1().equals("ABFY3456") && aa.getL2().equals("QWTY9875")) {
					flag =1;
				 }
			 }
			 if(flag==1) {
				 assertTrue(true);
			 }
			 else {
				 assertFalse(true);
			 }
					 
		
	 }
	 @Test
	    public void checkEmail2() {
			 ArrayList<Users> users = new ArrayList<Users>();
			 try {
					CsvReader reader = new CsvReader(path); 
					reader.readHeaders();

					while(reader.readRecord()){ 
						Users user1 = new Users();
						//name,lastname,id,email,password
						user1.setName(reader.get("name"));
						user1.setlastName(reader.get("lastname"));
						user1.setId(Integer.valueOf(reader.get("id")));
						user1.setEmail(reader.get("email"));
						user1.setPassword(reader.get("password"));
						user1.setSlot1(reader.get("slot1"));
						user1.setSlot2(reader.get("slot2"));
						user1.setSlot3(reader.get("slot3"));
						user1.setStime(Integer.valueOf(reader.get("stime")));
						user1.setEtime(Integer.valueOf(reader.get("etime")));
						user1.setL1(reader.get("l1"));
						user1.setL2(reader.get("l2"));
						user1.setL3(reader.get("l3"));
						user1.setStatus(reader.get("status"));
						user1.setParkingid(reader.get("parkingid"));
						users.add(user1);
					}
					
					
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			 Users use= new Users();
			 use.setEmail("test2@g.com");
			 users.add(use);
			 UserManagement manage = new UserManagement(users);
			 for(Users aa :users) {
				 if(aa.getEmail().equals("test2@g.com")) {
					flag =1;
				 }
			 }
			 if(flag==1) {
				 assertTrue(true);
			 }
			 else {
				 assertFalse(true);
			 }
					 
		
	 }  
	 @Test
	    public void checkEmail3() {
			 ArrayList<Users> users = new ArrayList<Users>();
			 try {
					CsvReader reader = new CsvReader(path); 
					reader.readHeaders();

					while(reader.readRecord()){ 
						Users user1 = new Users();
						//name,lastname,id,email,password
						user1.setName(reader.get("name"));
						user1.setlastName(reader.get("lastname"));
						user1.setId(Integer.valueOf(reader.get("id")));
						user1.setEmail(reader.get("email"));
						user1.setPassword(reader.get("password"));
						user1.setSlot1(reader.get("slot1"));
						user1.setSlot2(reader.get("slot2"));
						user1.setSlot3(reader.get("slot3"));
						user1.setStime(Integer.valueOf(reader.get("stime")));
						user1.setEtime(Integer.valueOf(reader.get("etime")));
						user1.setL1(reader.get("l1"));
						user1.setL2(reader.get("l2"));
						user1.setL3(reader.get("l3"));
						user1.setStatus(reader.get("status"));
						user1.setParkingid(reader.get("parkingid"));
						users.add(user1);
					}
					
					
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			 Users use= new Users();
			 use.setEmail("test3@g.com");
			 users.add(use);
			 UserManagement manage = new UserManagement(users);
			 for(Users aa :users) {
				 if(aa.getEmail().equals("test3@g.com")) {
					flag =1;
				 }
			 }
			 if(flag==1) {
				 assertTrue(true);
			 }
			 else {
				 assertFalse(true);
			 }
					 
		
	 }  
	 
	 
	
}
