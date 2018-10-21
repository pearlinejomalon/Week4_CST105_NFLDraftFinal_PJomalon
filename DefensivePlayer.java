/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfl.draft;

/**
 * Program: NFL Draft
 * File: DefensivePlayer.java
 * Summary: Defensive Player extension of Player class
 * Author: Pearl Jomalon
 * Date: October 21, 2018 (revised)
 */

public class DefensivePlayer extends Player {  //Begin DefensivePlayer subclass
	
	public DefensivePlayer() {  //Declare defensive variables
		
	}
	
	//constructor with variables
	DefensivePlayer(String nameIn, String homeTownIn, String teamNameIn, 
                String positionIn, String collegeTeamIn, String dateOfBirthIn, 
                int ageIn, int heightIn, int weightIn, int yearsProIn, int tacklesIn, 
                int forcedFumblesIn, int interceptionsIn) {
		
		//abstract class variables
		super();
	}

        @Override
        
        public String toString() {
            int getHeight = 0;
            double feet = getHeight()/12;
            double inches = getHeight()%12;
            
            return"\n" + "\nDefensive Player: \n" + getName()
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
