import java.util.ArrayList;

class Team {
	
	//Task 1.c, 1.d & 1.e
	private String teamName;
	private int teamRank;
	private ArrayList<String> teamMembers;

	Team (String teamName){

		this.teamName = teamName;
		teamMembers.add(teamName);

	}

	//1.h
	public void setRank(int teamRank){

		this.teamRank = teamRank;

	}

	public void toString(){

		System.out.println("Hold: "+teamName+" Rang: "+teamRank);

	}

}