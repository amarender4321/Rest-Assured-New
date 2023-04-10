package POJOclassSerializationAndDeseialization;

public class Spouse {
	
	String name;
	String eid;
	public  Spouse(String name,String eid) {
		
		super();
		this.name=name;
		this.eid=eid;	
	}
public Spouse() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
}
