package PojoClass;

public class CreateProject {
	
	//Step 1:the keys  as global variables
	
	String createdBy;
	String projectName;
	String staus;
	int teamSize;
	
	// step 2:create a constructor to initilze the variables
	public CreateProject(String createdBy,String projectName,String staus,int teamSize) {
		super();
		this.createdBy =createdBy;
		this.projectName=projectName;
		this.staus=staus;
	    this.teamSize=teamSize;
	}
	// step 3:Provide getters and setters to access the variables
	
	
	//public CreateProject() {
	//	super();
	//}

	


	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStaus() {
		return staus;
	}

	public void setStaus(String staus) {
		this.staus = staus;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	

}
