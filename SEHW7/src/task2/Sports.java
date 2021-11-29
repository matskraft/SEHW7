package task2;

public class Sports implements Team {
	public String name;
	public int athletes;
	public int medals;
	
	public Sports(String name, int athletes, int medals) {
		this.name=name;
		this.athletes=athletes;
		this.medals=medals;
	}

	@Override
	public void printNameAthlete() {
		System.out.println("Team: "+name+", Number of Athletes: "+athletes);
	}

	@Override
	public void printNameMedals() {
		System.out.println("Team: "+name+", Number of Medals: "+medals);
		
	}

	@Override
	public int getNumberAthletes() {
		return athletes;
	}

	@Override
	public int getNumberMedals() {
		return medals;
	}
}
