
public class Users {
	public String name,lastname;
	public int id;
	public String email;
	public String password;
	
	public String slot1,slot2,	slot3,	l1,	l2,	l3,	status,	parkingid;
	public int stime,	etime;

	
	public Users(String name,String lastname, int id, String email, String password, String slot1, String slot2,String	slot3, int stime,int etime, String l1,String l2,	String l3,	String status,	String parkingid) {
		super();
		this.name = name;
		this.lastname=lastname;
		this.id = id;
		this.email = email;
		this.password = password;
		this.slot1=slot1;
		this.slot2=slot2;
		this.slot3=slot3;
		this.stime=stime;
		this.etime=etime;
		this.l1=l1;
		this.l2=l2;
		this.l3=l3;
		this.status=status;
		this.parkingid=parkingid;
	}
	
	public Users(){
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
	public String getSlot1() {
		return slot1;
	}

	public void setSlot1(String slot1) {
		this.slot1 = slot1;
	}

	public String getSlot2() {
		return slot2;
	}

	public void setSlot2(String slot2) {
		this.slot2 = slot2;
	}

	public String getSlot3() {
		return slot3;
	}

	public void setSlot3(String slot3) {
		this.slot3 = slot3;
	}

	public int getStime() {
		return stime;
	}

	public void setStime(int stime) {
		this.stime = stime;
	}

	public int getEtime() {
		return etime;
	}

	public void setEtime(int etime) {
		this.etime = etime;
	}

	public String getL1() {
		return l1;
	}

	public void setL1(String l1) {
		this.l1 = l1;
	}

	public String getL2() {
		return l2;
	}

	public void setL2(String l2) {
		this.l2 = l2;
	}

	public String getL3() {
		return l3;
	}

	public void setL3(String l3) {
		this.l3 = l3;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getParkingid() {
		return parkingid;
	}

	public void setParkingid(String parkingid) {
		this.parkingid = parkingid;
	}

//	@Override
//	public String toString() {
//		return "User [name=" + name + ", lastname=" + lastname + ",id=" + id + ", email=" + email + ", password=" + password + "]";
//	}

	
	
}
