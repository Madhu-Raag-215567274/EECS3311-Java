	import java.io.File;
	import java.io.FileWriter;
	import java.util.ArrayList;
	import com.csvreader.CsvReader;
	import com.csvreader.CsvWriter;

	public class UserManagement {
		public ArrayList<Users> users = new ArrayList<Users>();
		public String path="C:\\Users\\Raag\\Downloads\\user.csv";
		
		 public UserManagement(String name,String lastname, int id, String email, String password, ArrayList<Users> users2) throws Exception  {
				this.users=users2;
			 	Users us=new Users (name, lastname, id, email,  password);			
				this.users.add(us);			
				update();
			
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
					csvOutput.endRecord();

					// else assume that the file already has the correct header line
					// write out a few records
					for(Users u: users){
						csvOutput.write(u.getName());
						csvOutput.write(u.getlastName());
						csvOutput.write(String.valueOf(u.getId()));
						csvOutput.write(u.getEmail());
						csvOutput.write(u.getPassword());
						csvOutput.endRecord();
					}
					csvOutput.close();
				
				}catch (Exception e) {
					e.printStackTrace();
				}
		}
		
	}



