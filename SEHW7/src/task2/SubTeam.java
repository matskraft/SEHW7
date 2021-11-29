package task2;

import java.util.ArrayList;
import java.util.List;

public class SubTeam implements Team {
	
	private List<Team> subteams = new ArrayList<>();
	public String name;
	public int athletes;
	public int medals;
	
	public SubTeam(String name, int athletes, int medals) {
		this.name=name;
		this.athletes=athletes;
		this.medals=medals;
	}
	
	public void addTeam(Team team) {
		subteams.add(team);
		athletes=athletes+team.getNumberAthletes();
		medals=medals+team.getNumberMedals();
	}
	
	public void deleteTeam(Team team) {
		subteams.remove(team);
		athletes=athletes-team.getNumberAthletes();
		medals=medals-team.getNumberMedals();
	}
	public List<Team> getSubTeams(){
		return subteams;
	}
	
	public void printNameAthlete() {
		System.out.println(name+":");
		for (int i=0;i<subteams.size();i++) {
			subteams.get(i).printNameAthlete();
		}
		System.out.println();
	}

	@Override
	public void printNameMedals() {
		System.out.println(name+":");
		for (int i=0;i<subteams.size();i++) {
			subteams.get(i).printNameMedals();
		}
		System.out.println();
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
