	import java.io.File;
	import java.io.FileWriter;
	import java.util.ArrayList;
	import com.csvreader.CsvReader;
	import com.csvreader.CsvWriter;

	public class UserManagement {
		public ArrayList<Users> users = new ArrayList<Users>();
		public String path="C:\\Users\\Raag\\Downloads\\user.csv";
		
		 public UserManagement(String name,String lastname, int id, String email, String password,String slot1, String slot2,String	slot3, int stime, int etime, String l1,String l2,	String l3,	String status,	String parkingid, ArrayList<Users> users2) throws Exception  {
				this.users=users2;
			 	Users us=new Users (name, lastname, id, email,  password,slot1,slot2,	slot3	,stime,	etime,	l1,	l2,	l3,	status,	parkingid);			
				this.users.add(us);			
				update();
			
			}
		 public UserManagement(ArrayList<Users> users2) {
			 this.users=users2;
			 try {
				update();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated constructor stub
		}
		
		
		public void load() throws Exception{
			CsvReader reader = new CsvReader(path); 
			reader.readHeaders();
			
			while(reader.readRecord()){ 
				Users user = new Users();
				//name,lastname,id,email,password
				user.setName(reader.get("name"));
				user.setlastName(reader.get("lastname"));
				user.setId(Integer.valueOf(reader.get("id")));
				user.setEmail(reader.get("email"));
				user.setPassword(reader.get("password"));
				user.setSlot1(reader.get("slot1"));
				user.setSlot2(reader.get("slot2"));
				user.setSlot3(reader.get("slot3"));
				user.setStime(Integer.valueOf(reader.get("stime")));
				user.setEtime(Integer.valueOf(reader.get("etime")));
				user.setL1(reader.get("l1"));
				user.setL2(reader.get("l2"));
				user.setL3(reader.get("l3"));
				user.setStatus(reader.get("status"));
				user.setParkingid(reader.get("parkingid"));
				users.add(user);
			}
		}
		
		public void update() throws Exception{
			try {		
					CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
					//name,id,email,password
					csvOutput.write("name");
					csvOutput.write("lastname");
					csvOutput.write("id");
			    	csvOutput.write("email");
			    	csvOutput.write("password");
					csvOutput.write("slot1");
					csvOutput.write("slot2");
					csvOutput.write("slot3");
					csvOutput.write("stime");
					csvOutput.write("etime");
					csvOutput.write("l1");
					csvOutput.write("l2");
					csvOutput.write("l3");
					csvOutput.write("status");
					csvOutput.write("parkingid");
					csvOutput.endRecord();

					// else assume that the file already has the correct header line
					// write out a few records
					for(Users u: users){
						csvOutput.write(u.getName());
						csvOutput.write(u.getlastName());
						csvOutput.write(String.valueOf(u.getId()));
						csvOutput.write(u.getEmail());
						csvOutput.write(u.getPassword());
						csvOutput.write(u.getSlot1());
						csvOutput.write(u.getSlot2());
						csvOutput.write(u.getSlot3());
						csvOutput.write(String.valueOf(u.getStime()));
						csvOutput.write(String.valueOf(u.getEtime()));
						csvOutput.write(u.getL1());
						csvOutput.write(u.getL2());
						csvOutput.write(u.getL3());
						csvOutput.write(u.getStatus());
						csvOutput.write(u.getParkingid());
					
						csvOutput.endRecord();
					}
					csvOutput.close();
				
				}catch (Exception e) {
					e.printStackTrace();
				}
		}
		
	}



