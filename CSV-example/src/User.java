
public class User {
	public String name,lastname;
	public int id;
	public String email;
	public String password;
	
	public User(String name,String lastname, int id, String email, String password) {
		super();
		this.name = name;
		this.lastname=lastname;
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	public User(){
		super();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getlastName() {
		
		return lastname;
	}
	public void setlastName(String lastname) {
		
		this.lastname=lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", lastname=" + lastname + ",id=" + id + ", email=" + email + ", password=" + password + "]";
	}

	
	
}
