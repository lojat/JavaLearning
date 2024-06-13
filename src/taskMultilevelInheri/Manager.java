package taskMultilevelInheri;

public class Manager extends Employee{

	private int teamSize;

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public void display() {
		System.out.println(" Id= "+super.getEmpId()+" Department= "+super.getDep()+" Name= "+super.getName()+" Age="+super.getAge()+" TeamSize= "+teamSize);
	}
	 

}
