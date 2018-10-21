/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfl.draft;

//**update** change class to abstract class
public abstract class Player {  //begin player class
	
	//declare global instance variables
	//**update** changed instance variables
	private String name;
	private String homeTown;
	private String teamName;
	private String position;
	private String collegeTeam;
	private String dateOfBirth;
	private int age;
	private int height;
	private int weight;
	private int yearsPro;
        private int touchdowns;
        private int receptions;
        private int totalYards;
        private int tackles;
        private int forcedFumbles;
        private int interceptions;
	
	
	public Player () { } //empty constructor
	
	//player constructor that accepts all parameters
	public Player(String nameIn, String homeTownIn, String teamNameIn, 
                String positionIn, String collegeTeamIn, String dateOfBirthIn, 
                int ageIn, int heightIn, int weightIn, int yearsProIn, 
                int touchdownsIn, int receptionsIn, int totalYardsIn, 
                int tacklesIn, int forcedFumblesIn, int interceptionsIn) {
            
		this.name = nameIn;
		this.homeTown = homeTownIn;
		this.teamName = teamNameIn;
		this.position = positionIn;
		this.collegeTeam = collegeTeamIn;
		this.dateOfBirth = dateOfBirthIn;
		this.age = ageIn;
		this.height = heightIn;
		this.weight = weightIn;
		this.yearsPro = yearsProIn;
                this.touchdowns = touchdownsIn;
                this.receptions = receptionsIn;
                this.totalYards = totalYardsIn;
                this.tackles = tacklesIn;
                this.forcedFumbles = forcedFumblesIn;
                this.interceptions = interceptionsIn;

	}
	
	//getters and setters for all parameters
	public void setName(String nameIn) {
		this.name = nameIn;
	}
	public String getName() {
		return this.name;
	}
		
	public void setHomeTown(String homeTownIn) {
		this.homeTown = homeTownIn;
	}
	public String getHomeTown() {
		return this.homeTown;
	}
		
	public void setTeamName (String teamNameIn) {
		this.teamName = teamNameIn;
	}
	public String getTeamName() {
		return this.teamName;
	}
		
	public void setPosition(String positionIn) {
		this.position = positionIn;
	}
	public String getPosition() {
		return this.position;
	}
		
	public void setCollegeTeam(String collegeTeamIn) {
		this.collegeTeam = collegeTeamIn;
	}
		
	public String getCollegeTeam() {
		return this.collegeTeam;
	}
		
	public void setDateOfBirth(String dateOfBirthIn) {
		this.dateOfBirth = dateOfBirthIn;
	}
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
		
	public void setAge(int ageIn) {
		this.age = ageIn;
	}
	public int getAge() {
		return this.age;
	}
	public void setHeight(int heightIn) {
		this.height = heightIn;
	}
	public int getHeight() {
		return this.height;
	}
	public void setWeight(int weightIn) {
		this.weight = weightIn;
	}
	public int getWeight() {
		return this.weight;
	}
	public void setYearsPro(int yearsProIn) {
		this.yearsPro = yearsProIn;
	}
	public int getYearsPro() {
		return this.yearsPro;
	}
        public void setTouchdowns(int touchdownsIn) {
		this.touchdowns = touchdownsIn;
	}
	public int getTouchdowns() {
		return this.touchdowns;
        }
         public void setReceptions(int receptionsIn) {
		this.receptions = receptionsIn;
	}
	public int getReceptions() {
		return this.receptions;
        }
         public void setTotalYards(int totalYardsIn) {
		this.totalYards = totalYardsIn;
	}
	public int getTotalYards() {
		return this.totalYards;
        }
         public void setTackles(int tacklesIn) {
		this.tackles = tacklesIn;
	}
	public int getTackles() {
		return this.tackles;
        }
         public void setForcedFumbles(int forcedFumblesIn) {
		this.forcedFumbles = forcedFumblesIn;
	}
	public int getForcedFumbles() {
		return this.forcedFumbles;
        }
         public void setInterceptions(int interceptionsIn) {
		this.interceptions = interceptionsIn;
	}
	public int getInterceptions() {
		return this.interceptions;
        }
        
        public static void add(OffensivePlayer offensivePlayer) {
        }
        
        public static void add(DefensivePlayer defensivePlayer) {
        }
        
        //display player info
        public String toString() {
            int getHeight = 0;
            double feet = getHeight/12;
            double inches = getHeight()%12;
            
            return "\n"
                    +getName()
                    +"\nHome Town: " + getHomeTown()
                    +"\nTeam Name: " + getTeamName()
                    +"\nPosition: " + getPosition()
                    +"\nCollege Team: " + getCollegeTeam()
                    +"\nDate Of Birth: " + getDateOfBirth()
                    +"\nAge: " + getAge()
                    +"\nHeight: " + feet + "ft" + " " + inches + "in"
                    +"\nWeight: " + getWeight()
                    +"\nYears Pro: " + getYearsPro()
                    +"\nTouchdowns: " + getTouchdowns()
                    +"\nReceptions: " + getReceptions()
                    +"\nTotal Yards: " + getTotalYards()
                    +"\nTackles: " + getTackles()
                    +"\nForced Fumbles: " + getForcedFumbles()
                    +"\nInterceptions: " + getInterceptions();
        }

}
