/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfl.draft;

 /**Program: NFL Player Manager Class 
*File: Manager.java
*Summary: Design, implement and test the NFL Manager Player Class
*Author: Pearl Jomalon
Date: October 15, 2018
**/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager { //Begin Manager Class
    ArrayList<OffensivePlayer>offenseList = new ArrayList<OffensivePlayer>();
    ArrayList<DefensivePlayer>defenseList = new ArrayList<DefensivePlayer>();
	
	public Manager() {   //Create Manager method
		createOffensePlayer();
                createDefensePlayer();
	}
	
	
	private ArrayList<OffensivePlayer> createOffensePlayer() {
            
            OffensivePlayer player1 = new OffensivePlayer();
            player1.setName("Tom Brady");
            player1.setHomeTown("San Mateo, CA");
            player1.setTeamName("New England Patriots");
            player1.setPosition("QB");
            player1.setCollegeTeam("Michigan");
            player1.setDateOfBirth("August 3rd");
            player1.setAge(41);
            player1.setHeight(76);
            player1.setWeight(225);
            player1.setYearsPro(19);
            player1.setTouchdowns(501);
            player1.setReceptions(0);
            player1.setTotalYards(2847);
            offenseList.add(player1);
            
            OffensivePlayer player2 = new OffensivePlayer();
            player2.setName("Ezekiel Elliott");
            player2.setHomeTown("Alton, IL");
            player2.setTeamName("Dallas Cowboys");
            player2.setPosition("RB");
            player2.setCollegeTeam("Ohio State");
            player2.setDateOfBirth("July 22n");
            player2.setAge(23);
            player2.setHeight(72);
            player2.setWeight(228);
            player2.setYearsPro(3);
            player2.setTouchdowns(29);
            player2.setReceptions(81);
            player2.setTotalYards(762);
            offenseList.add(player2);
		
            OffensivePlayer player3 = new OffensivePlayer();
            player3.setName("Danny Amendola");
            player3.setHomeTown("The Woodlands, TX");
            player3.setTeamName("Miami Dolphins");
            player3.setPosition("WR");
            player3.setCollegeTeam("Texas Tech");
            player3.setDateOfBirth("November 2nd");
            player3.setAge(32);
            player3.setHeight(71);
            player3.setWeight(190);
            player3.setYearsPro(10);
            player3.setTouchdowns(19);
            player3.setReceptions(450);
            player3.setTotalYards(465);
            offenseList.add(player3);
            
            OffensivePlayer player4 = new OffensivePlayer();
            player4.setName("Travis Kelce");
            player4.setHomeTown("Westlake, OH");
            player4.setTeamName("Kansas City Chiefs");
            player4.setPosition("TE");
            player4.setCollegeTeam("Cincinnati");
            player4.setDateOfBirth("October 5th");
            player4.setAge(29);
            player4.setHeight(77);
            player4.setWeight(260);
            player4.setYearsPro(6);
            player4.setTouchdowns(25);
            player4.setReceptions(340);
            player4.setTotalYards(343);
            offenseList.add(player4);
            
            OffensivePlayer player5 = new OffensivePlayer();
            player5.setName("Julio Jones");
            player5.setHomeTown("Foley, AL");
            player5.setTeamName("Atlanta Falcons");
            player5.setPosition("WR");
            player5.setCollegeTeam("Alabama");
            player5.setDateOfBirth("February 3rd");
            player5.setAge(29);
            player5.setHeight(75);
            player5.setWeight(220);
            player5.setYearsPro(8);
            player5.setTouchdowns(43);
            player5.setReceptions(629);
            player5.setTotalYards(645);
            offenseList.add(player5);
        
        return offenseList;
	}
        
        private ArrayList<DefensivePlayer> createDefensePlayer() {
            
            DefensivePlayer player6 = new DefensivePlayer();
            player6.setName("Von Miller");
            player6.setHomeTown("Desoto, TX");
            player6.setTeamName("Denver Broncos");
            player6.setPosition("LB");
            player6.setCollegeTeam("Texas A&M");
            player6.setDateOfBirth("March 26th");
            player6.setAge(29);
            player6.setHeight(75);
            player6.setWeight(250);
            player6.setYearsPro(8);
            player6.setTackles(450);
            player6.setForcedFumbles(24);
            player6.setInterceptions(1);
            defenseList.add(player6);
            
            DefensivePlayer player7 = new DefensivePlayer();
            player7.setName("JJ Watt");
            player7.setHomeTown("Pewaukee, WI");
            player7.setTeamName("Houston Texans");
            player7.setPosition("DE");
            player7.setCollegeTeam("Central Michigan");
            player7.setDateOfBirth("March 22nd");
            player7.setAge(29);
            player7.setHeight(77);
            player7.setWeight(288);
            player7.setYearsPro(8);
            player7.setTackles(329);
            player7.setForcedFumbles(19);
            player7.setInterceptions(1);
            defenseList.add(player7);
            
            DefensivePlayer player8 = new DefensivePlayer();
            player8.setName("Patrick Peterson");
            player8.setHomeTown("Fort Lauderdale, FL");
            player8.setTeamName("Arizona Cardinals");
            player8.setPosition("CB");
            player8.setCollegeTeam("LSU");
            player8.setDateOfBirth("July 11th");
            player8.setAge(28);
            player8.setHeight(73);
            player8.setWeight(203);
            player8.setYearsPro(8);
            player8.setTackles(353);
            player8.setForcedFumbles(1);
            player8.setInterceptions(23);
            defenseList.add(player8);
            
            DefensivePlayer player9 = new DefensivePlayer();
            player9.setName("Khalil Mack");
            player9.setHomeTown("Fort Pierce, FL");
            player9.setTeamName("Chicago Bears");
            player9.setPosition("OLB");
            player9.setCollegeTeam("Buffalo");
            player9.setDateOfBirth("Febraury 22nd");
            player9.setAge(27);
            player9.setHeight(75);
            player9.setWeight(252);
            player9.setYearsPro(5);
            player9.setTackles(246);
            player9.setForcedFumbles(0);
            player9.setInterceptions(2);
            defenseList.add(player9);
            
            DefensivePlayer player10 = new DefensivePlayer();
            player10.setName("Aaron Donald");
            player10.setHomeTown("Pittsburgh, PA");
            player10.setTeamName("Los Angeles Rams");
            player10.setPosition("DT");
            player10.setCollegeTeam("Pittsburgh");
            player10.setDateOfBirth("May 23rd");
            player10.setAge(27);
            player10.setHeight(73);
            player10.setWeight(280);
            player10.setYearsPro(5);
            player10.setTackles(157);
            player10.setForcedFumbles(9);
            player10.setInterceptions(0);
            defenseList.add(player10);
        
        return defenseList;
        }
}
