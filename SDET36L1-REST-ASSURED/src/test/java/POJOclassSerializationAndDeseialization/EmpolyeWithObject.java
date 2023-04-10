package POJOclassSerializationAndDeseialization;

public class EmpolyeWithObject {

	
	String ename ;
	String eid;
	int[]phno;
	Object spouse;
	
	public EmpolyeWithObject(String ename, String eid, int[] phno, Object spouse) {
		this.ename = ename;
		this.eid = eid;
		this.phno = phno;
		this.spouse = spouse;

	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public int[] getPhno() {
		return phno;
	}

	public void setPhno(int[] phno) {
		this.phno = phno;
	}

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	
}
