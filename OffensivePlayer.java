/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfl.draft;

/**
 * Program: NFL Draft
 * File: OffensivePlayer.java
 * Summary: Offensive Player extension of Player class
 * Author: Pearl Jomalon
 * Date: October 14, 2018
 */


public class OffensivePlayer extends Player {  //Begin OffensivePlayer subclass
	
	public OffensivePlayer() {  //Declare offensive variables	
	}
        
	//constructor with variables
	OffensivePlayer(String nameIn, String homeTownIn, String teamNameIn, 
                String positionIn, String collegeTeamIn, String dateOfBirthIn, 
                int ageIn, int heightIn, int weightIn, int yearsProIn, 
                int touchdownsIn, int receptionsIn, int totalYardsIn) {
		
		//abstract class variables
		super ();
	}
        
        @Override
        
        public String toString() {
            
            double feet = getHeight()/12;
            double inches = getHeight()%12;
            
            return "\n" + "\nOffensive Player: \n" + getName()
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
