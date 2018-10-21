package nfl.draft;

/**Program: NFL Draft 
*File: NFLDraft.java
*Summary: NFL Draft Application
*Author: Pearl Jomalon
Date: October 21, 2018
**/

import java.awt.Checkbox;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class NFLDraft extends Application {
    
    Stage window;
    Scene scene1, choiceScene1, choiceScene2, offScene, offRosScene, defScene,
            defRosScene, bradyScene, elliottScene, amendolaScene, kelceScene,
            jonesScene, millerScene, wattScene, petersonScene, mackScene, 
            donaldScene;
    Button begin, offense, defense, roster, back1, back2, back3, offenseRos, 
            defenseRos, bradyButton, elliottButton, amendolaButton, kelceButton, 
            jonesButton, millerButton, wattButton, petersonButton, mackButton, 
            donaldButton, delOffPlayer, delDefPlayer, addOffPlayer, addDefPlayer;
    Label label1, label2, label3, label4, label5, label6, label7, label8, label9;
    Checkbox oBox1;
    TableView<OffensivePlayer> offTable;
    TableView<DefensivePlayer> defTable;
    ObservableList<OffensivePlayer> offensePlayer;
    ObservableList<DefensivePlayer> defensePlayer;

public static void main(String[] args) {
    launch(args);
}

@Override
    public void start(Stage primaryStage) {
        
        //set up starting window
        window = primaryStage;
        window.setTitle("NFL Draft");
        window.getIcons().add(new Image("NFLDraftLogo"));
        
        begin = new Button("Begin");
        begin.setFont(Font.font("Impact", 18));
        begin.setPrefSize(175, 63);
        begin.setOnAction(e -> window.setScene(choiceScene1));
        
        label1 = new Label("NFL Draft 2018");
        label1.setFont(Font.font("Impact", FontWeight.BOLD, 28));
        label1.setTextFill(Color.NAVY);
        
        //layout for starting window
        VBox layout1 = new VBox();
        layout1.setPadding(new Insets(30));
        layout1.setSpacing(20);
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().add(new ImageView("NFLDraftLogo"));
        layout1.getChildren().addAll(label1, begin);
        scene1 = new Scene(layout1, 500, 400);
        window.setScene(scene1);
        window.show();
        
        //Set up choiceScene1
        //Button to see Offensive Players
        offense = new Button("Choose an Offensive Player");
        offense.setFont(Font.font("Impact", 18));
        offense.setPrefSize(175, 63);
        offense.setOnAction(e -> window.setScene(offScene));
        
        //Button to see Defensive Players
        defense = new Button("Choose a Defensive Player");
        defense.setFont(Font.font("Impact", 18));
        defense.setPrefSize(175, 63);
        defense.setOnAction(e -> window.setScene(defScene));
        
        //Button to see roster
        roster = new Button("Go To Current Roster");
        roster.setFont(Font.font("Impact", 18));
        roster.setPrefSize(175, 63);
        roster.setOnAction(e -> window.setScene(choiceScene2));
        
        //layout for choiceScene1
        VBox layout2 = new VBox();
        layout2.setPadding(new Insets(30));
        layout2.setSpacing(20);
        layout2.setAlignment(Pos.CENTER);
        layout2.getChildren().add(new ImageView("NFLDraftLogo"));
        layout2.getChildren().addAll(offense, defense, roster);
        choiceScene1 = new Scene(layout2, 500, 400);
        window.setScene(choiceScene1);
        window.show();
        
        //Set up offScene
        //button to go to Tom Brady stats
        bradyButton = new Button("Tom Brady");
        bradyButton.setFont(Font.font("Impact", 18));
        bradyButton.setPrefSize(175, 63);
        bradyButton.setOnAction(e -> window.setScene(bradyScene));
        
        //button to go to Ezekiel Elliott stats
        elliottButton = new Button("Ezekiel Elliott");
        elliottButton.setFont(Font.font("Impact", 18));
        elliottButton.setPrefSize(175, 63);
        elliottButton.setOnAction(e -> window.setScene(elliottScene));
        
        //button to go to Danny Amendola stats
        amendolaButton = new Button("Danny Amendola");
        amendolaButton.setFont(Font.font("Impact", 18));
        amendolaButton.setPrefSize(175, 63);
        amendolaButton.setOnAction(e -> window.setScene(amendolaScene));
        
        //button to go to Travis Kelce stats
        kelceButton = new Button("Travis Kelce");
        kelceButton.setFont(Font.font("Impact", 18));
        kelceButton.setPrefSize(175, 63);
        kelceButton.setOnAction(e -> window.setScene(kelceScene));
        
        //button to go to Julio Jones stats
        jonesButton = new Button("Julio Jones");
        jonesButton.setFont(Font.font("Impact", 18));
        jonesButton.setPrefSize(175, 63);
        jonesButton.setOnAction(e -> window.setScene(jonesScene));
        
        //Button to return to main menu
        back1 = new Button("Return To Main Menu");
        back1.setFont(Font.font("Impact", 18));
        back1.setPrefSize(175, 63);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        label2 = new Label("Offensive Platers");
        label2.setFont(Font.font("Impact", FontWeight.BOLD, 28));
        label2.setTextFill(Color.NAVY);
        
        label3 = new Label("Click on player to see stats");
        label3.setFont(Font.font("Impact", FontWeight.BOLD, 20));
        label3.setTextFill(Color.NAVY);
        
        //layout for offScene
        VBox layout3 = new VBox();
        layout3.setPadding(new Insets(30));
        layout3.setSpacing(20);
        layout3.setAlignment(Pos.CENTER);
        layout3.getChildren().add(new ImageView("NFLDraftLogo"));
        layout3.getChildren().addAll(label2, label3, bradyButton, elliottButton,
                amendolaButton, kelceButton, jonesButton);
        offScene = new Scene(layout3, 500, 400);
        window.setScene(offScene);
        window.show();
        
        //Set up defScene
        //button to go to Von Miller stats
        millerButton = new Button("Von Miller");
        millerButton.setFont(Font.font("Impact", 18));
        millerButton.setPrefSize(175, 63);
        millerButton.setOnAction(e -> window.setScene(millerScene));
        
        //button to go to JJ Watt stats
        wattButton = new Button("JJ Watt");
        wattButton.setFont(Font.font("Impact", 18));
        wattButton.setPrefSize(175, 63);
        wattButton.setOnAction(e -> window.setScene(wattScene));
        
        //button to go to Patrick Peterson stats
        petersonButton = new Button("Patrick Peterson");
        petersonButton.setFont(Font.font("Impact", 18));
        petersonButton.setPrefSize(175, 63);
        petersonButton.setOnAction(e -> window.setScene(petersonScene));
        
        //button to go to Khalil Mack stats
        mackButton = new Button("Khalil Mack");
        mackButton.setFont(Font.font("Impact", 18));
        mackButton.setPrefSize(175, 63);
        mackButton.setOnAction(e -> window.setScene(mackScene));
        
        //button to go to Aaron Donald stats
        donaldButton = new Button("Aaron Donald");
        donaldButton.setFont(Font.font("Impact", 18));
        donaldButton.setPrefSize(175, 63);
        donaldButton.setOnAction(e -> window.setScene(donaldScene));
        
        //Button to return to main menu
        back2 = new Button("Return To Main Menu");
        back2.setFont(Font.font("Impact", 18));
        back2.setPrefSize(175, 63);
        back2.setOnAction(e -> window.setScene(choiceScene1));
        
        label4 = new Label("Defensive Platers");
        label4.setFont(Font.font("Impact", FontWeight.BOLD, 28));
        label4.setTextFill(Color.NAVY);
        
        label5 = new Label("Click on player to see stats");
        label5.setFont(Font.font("Impact", FontWeight.BOLD, 20));
        label5.setTextFill(Color.NAVY);
        
        //layout for defScene
        VBox layout4 = new VBox();
        layout4.setPadding(new Insets(30));
        layout4.setSpacing(20);
        layout4.setAlignment(Pos.CENTER);
        layout4.getChildren().add(new ImageView("NFLDraftLogo"));
        layout4.getChildren().addAll(label4, label5, millerButton, wattButton,
                petersonButton, mackButton, donaldButton);
        defScene = new Scene(layout4, 500, 400);
        window.setScene(defScene);
        window.show();
        
        //Set up choiceScene2
        //Button to see Offensive Roster
        offenseRos = new Button("Offense");
        offenseRos.setFont(Font.font("Impact", 18));
        offenseRos.setPrefSize(175, 63);
        offenseRos.setOnAction(e -> window.setScene(offRosScene));
        
        //Button to see Defensive Roster
        defenseRos = new Button("Defense");
        defenseRos.setFont(Font.font("Impact", 18));
        defenseRos.setPrefSize(175, 63);
        defenseRos.setOnAction(e -> window.setScene(defRosScene));
        
        //Button to return to main menu
        back3 = new Button("Return To Main Menu");
        back3.setFont(Font.font("Impact", 18));
        back3.setPrefSize(175, 63);
        back3.setOnAction(e -> window.setScene(choiceScene1));
        
        //label for Current Roster
        label6 = new Label("Your Current Roster");
        label6.setFont(Font.font("Impact", FontWeight.BOLD, 20));
        label6.setTextFill(Color.NAVY);
        
        //layout for choiceScene2
        VBox layout5 = new VBox();
        layout5.setPadding(new Insets(30));
        layout5.setSpacing(20);
        layout5.setAlignment(Pos.CENTER);
        layout5.getChildren().add(new ImageView("NFLDraftLogo"));
        layout5.getChildren().addAll(label6, offenseRos, defenseRos, back3);
        choiceScene2 = new Scene(layout5, 500, 400);
        window.setScene(choiceScene2);
        window.show();
        
        //Set up OffRosScene
        //Button to see Offensive Roster
        offenseRos = new Button("Offense");
        offenseRos.setFont(Font.font("Impact", 18));
        offenseRos.setPrefSize(175, 63);
        offenseRos.setOnAction(e -> window.setScene(offRosScene));
        
        //Button to see Defensive Roster
        defenseRos = new Button("Defense");
        defenseRos.setFont(Font.font("Impact", 18));
        defenseRos.setPrefSize(175, 63);
        defenseRos.setOnAction(e -> window.setScene(defRosScene));
        
        //Button to return to main menu
        back3 = new Button("Return To Main Menu");
        back3.setFont(Font.font("Impact", 18));
        back3.setPrefSize(175, 63);
        back3.setOnAction(e -> window.setScene(choiceScene1));
        
        //label for Current Roster
        label6 = new Label("Your Current Roster");
        label6.setFont(Font.font("Impact", FontWeight.BOLD, 20));
        label6.setTextFill(Color.NAVY);
        
        //layout for choiceScene2
        VBox layout6 = new VBox();
        layout6.setPadding(new Insets(30));
        layout6.setSpacing(20);
        layout6.setAlignment(Pos.CENTER);
        layout6.getChildren().add(new ImageView("NFLDraftLogo"));
        layout6.getChildren().addAll(label6, offenseRos, defenseRos, back3);
        choiceScene2 = new Scene(layout6, 500, 400);
        window.setScene(choiceScene2);
        window.show();
        
        //Set up offRosScene
        //Button to see Defensive Roster
        defenseRos = new Button("Defense");
        defenseRos.setOnAction(e -> window.setScene(defRosScene));
        
        delOffPlayer = new Button("Remove Player");
        delOffPlayer.setOnAction(e -> deleteOffense());
        
        back1 = new Button("Return To Main Menu");
        back1.setFont(Font.font("Impact", 18));
        back1.setPrefSize(175, 63);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        //label for Offensive Roster
        label7 = new Label("Offensive Roster");
        label7.setFont(Font.font("Impact", FontWeight.BOLD, 20));
        label7.setTextFill(Color.NAVY);
        
        offTable = new TableView<>();
        offTable.setItems(getOffense());
        
        VBox offRosBox = new VBox();
        offRosBox.setPadding(new Insets(30));
        offRosBox.setSpacing(20);
        offRosBox.setAlignment(Pos.CENTER);
        offRosBox.getChildren().add(new ImageView("NFLDraftLogo"));
        offRosBox.getChildren().addAll(label7, defenseRos);
        offRosBox.getChildren().addAll(offTable, delOffPlayer, back1);
        offRosScene = new Scene(offRosBox, 500, 400);
        window.setScene(offRosScene);
        window.show();
        
        //Set up defRosScene
        //Button to see Offensive Roster
        offenseRos = new Button("Offense");
        offenseRos.setOnAction(e -> window.setScene(offRosScene));
        
        delDefPlayer = new Button("Remove Player");
        delDefPlayer.setOnAction(e -> deleteDefense());
        
        back1 = new Button("Return To Main Menu");
        back1.setFont(Font.font("Impact", 18));
        back1.setPrefSize(175, 63);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        //label for Defensive Roster
        label8 = new Label("Defensive Roster");
        label8.setFont(Font.font("Impact", FontWeight.BOLD, 20));
        label8.setTextFill(Color.NAVY);
        
        defTable = new TableView<>();
        defTable.setItems(getDefense());
        
        VBox defRosBox = new VBox();
        defRosBox.setPadding(new Insets(30));
        defRosBox.setSpacing(20);
        defRosBox.setAlignment(Pos.CENTER);
        defRosBox.getChildren().add(new ImageView("NFLDraftLogo"));
        defRosBox.getChildren().addAll(label8, offenseRos);
        defRosBox.getChildren().addAll(defTable, delDefPlayer, back1);
        defRosScene = new Scene(offRosBox, 500, 400);
        window.setScene(defRosScene);
        window.show();
        
        //Set up Offensive Player Stats
        //set up Tom Brady Scene
        GridPane bradyPane = new GridPane();
        bradyPane.setAlignment(Pos.TOP_LEFT);
        bradyPane.setPadding(new Insets(10,10,10,10));
        bradyPane.setHgap(20);
        bradyPane.setVgap(20);
        
        Label bradyName = new Label(new String(player1.offenseList.get(0).getName()));
        bradyName.setFont(Impact);
        bradyPane.add(bradyName, 0, 0);
        bradyPane.add(new Label(new String("Position: " + player1.offenseList.get(0).getPosition)),0,1);
        bradyPane.add(new Label(new String("Team Name: " + player1.offenseList.get(0).getTeamName)), 1, 1);
        bradyPane.add(new Label(new String("Years Pro: " + player1.offenseList.get(0).getYearsPro)),2,1);
        bradyPane.add(new Label(new String("Age: " + player1.offenseList.get(0).getAge)),0,2);
        bradyPane.add(new Label(new String("Home Town: " + player1.offenseList.get(0).getHomeTowm)),1,2);
        bradyPane.add(new Label(new String("College Team: " + player1.offenseList.get(0).getCollegeTeam)),2,2);
        bradyPane.add(new Label(new String("DOB: " + player1.offenseList.get(0).getDateOfBirth)),0,3);
        bradyPane.add(new Label(new String("Height: " + player1.offenseList.get(0).getHeight)),1,3);
        bradyPane.add(new Label(new String("Weight: " + player1.offenseList.get(0).getWeight)),2,3);
        bradyPane.add(new Label(new String("Touchdowns: " + player1.offenseList.get(0).getTouchdowns)),0,4);
        bradyPane.add(new Label(new String("Receptions: " + player1.offenseList.get(0).getReceptions)),1,4);
        bradyPane.add(new Label(new String("Total Yards: " + player1.offenseList.get(0).getTotalYards)),2,4);
        
        //add player to roster
        Button bradyadd = new Button("Add to Roster");
        bradyPane.add(bradyadd, 0,6);
        back1 = new Button("Return To Main Menu");
        bradyPane.add(back1, 1,6);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        bradyScene = new Scene(bradyPane,500,500);
        
        //set up Ezekiel Elliot Scene
        GridPane elliottPane = new GridPane();
        elliottPane.setAlignment(Pos.TOP_LEFT);
        elliottPane.setPadding(new Insets(10,10,10,10));
        elliottPane.setHgap(20);
        elliottPane.setVgap(20);
        
        Label elliottName = new Label(new String(player2.offenseList.get(0).getName()));
        elliottName.setFont(Impact);
        elliottPane.add(elliottName, 0, 0);
        elliottPane.add(new Label(new String("Position: " + player2.offenseList.get(0).getPosition)),0,1);
        elliottPane.add(new Label(new String("Team Name: " + player2.offenseList.get(0).getTeamName)), 1, 1);
        elliottPane.add(new Label(new String("Years Pro: " + player2.offenseList.get(0).getYearsPro)),2,1);
        elliottPane.add(new Label(new String("Age: " + player2.offenseList.get(0).getAge)),0,2);
        elliottPane.add(new Label(new String("Home Town: " + player2.offenseList.get(0).getHomeTowm)),1,2);
        elliottPane.add(new Label(new String("College Team: " + player2.offenseList.get(0).getCollegeTeam)),2,2);
        elliottPane.add(new Label(new String("DOB: " + player2.offenseList.get(0).getDateOfBirth)),0,3);
        elliottPane.add(new Label(new String("Height: " + player2.offenseList.get(0).getHeight)),1,3);
        elliottPane.add(new Label(new String("Weight: " + player2.offenseList.get(0).getWeight)),2,3);
        elliottPane.add(new Label(new String("Touchdowns: " + plplayer2ayer1.offenseList.get(0).getTouchdowns)),0,4);
        elliottPane.add(new Label(new String("Receptions: " + player2.offenseList.get(0).getReceptions)),1,4);
        elliottPane.add(new Label(new String("Total Yards: " + player2.offenseList.get(0).getTotalYards)),2,4);
        
        //add player to roster
        Button elliottadd = new Button("Add to Roster");
        elliottPane.add(elliottadd, 0,6);
        back1 = new Button("Return To Main Menu");
        elliottPane.add(back1, 1,6);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        elliottScene = new Scene(elliottPane,500,500);
        
        //set up Danny Amendola Scene
        GridPane amendolaPane = new GridPane();
        amendolaPane.setAlignment(Pos.TOP_LEFT);
        amendolaPane.setPadding(new Insets(10,10,10,10));
        amendolaPane.setHgap(20);
        amendolaPane.setVgap(20);
        
        Label amendolaName = new Label(new String(player1.offenseList.get(0).getName()));
        amendolaName.setFont(Impact);
        amendolaPane.add(amendolaName, 0, 0);
        amendolaPane.add(new Label(new String("Position: " + player1.offenseList.get(0).getPosition)),0,1);
        amendolaPane.add(new Label(new String("Team Name: " + player1.offenseList.get(0).getTeamName)), 1, 1);
        amendolaPane.add(new Label(new String("Years Pro: " + player1.offenseList.get(0).getYearsPro)),2,1);
        amendolaPane.add(new Label(new String("Age: " + player1.offenseList.get(0).getAge)),0,2);
        amendolaPane.add(new Label(new String("Home Town: " + player1.offenseList.get(0).getHomeTowm)),1,2);
        amendolaPane.add(new Label(new String("College Team: " + player1.offenseList.get(0).getCollegeTeam)),2,2);
        amendolaPane.add(new Label(new String("DOB: " + player1.offenseList.get(0).getDateOfBirth)),0,3);
        amendolaPane.add(new Label(new String("Height: " + player1.offenseList.get(0).getHeight)),1,3);
        amendolaPane.add(new Label(new String("Weight: " + player1.offenseList.get(0).getWeight)),2,3);
        amendolaPane.add(new Label(new String("Touchdowns: " + player1.offenseList.get(0).getTouchdowns)),0,4);
        amendolaPane.add(new Label(new String("Receptions: " + player1.offenseList.get(0).getReceptions)),1,4);
        amendolaPane.add(new Label(new String("Total Yards: " + player1.offenseList.get(0).getTotalYards)),2,4);
        
        //add player to roster
        Button amendolaadd = new Button("Add to Roster");
        amendolaPane.add(amendolaadd, 0,6);
        back1 = new Button("Return To Main Menu");
        amendolaPane.add(back1, 1,6);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        amendolaScene = new Scene(amendolaPane,500,500);
        
        //set up Travis Kelce Scene
        GridPane kelcePane = new GridPane();
        kelcePane.setAlignment(Pos.TOP_LEFT);
        kelcePane.setPadding(new Insets(10,10,10,10));
        kelcePane.setHgap(20);
        kelcePane.setVgap(20);
        
        Label kelceName = new Label(new String(player1.offenseList.get(0).getName()));
        kelceName.setFont(Impact);
        kelcePane.add(kelceName, 0, 0);
        kelcePane.add(new Label(new String("Position: " + player1.offenseList.get(0).getPosition)),0,1);
        kelcePane.add(new Label(new String("Team Name: " + player1.offenseList.get(0).getTeamName)), 1, 1);
        kelcePane.add(new Label(new String("Years Pro: " + player1.offenseList.get(0).getYearsPro)),2,1);
        kelcePane.add(new Label(new String("Age: " + player1.offenseList.get(0).getAge)),0,2);
        kelcePane.add(new Label(new String("Home Town: " + player1.offenseList.get(0).getHomeTowm)),1,2);
        kelcePane.add(new Label(new String("College Team: " + player1.offenseList.get(0).getCollegeTeam)),2,2);
        kelcePane.add(new Label(new String("DOB: " + player1.offenseList.get(0).getDateOfBirth)),0,3);
        kelcePane.add(new Label(new String("Height: " + player1.offenseList.get(0).getHeight)),1,3);
        kelcePane.add(new Label(new String("Weight: " + player1.offenseList.get(0).getWeight)),2,3);
        kelcePane.add(new Label(new String("Touchdowns: " + player1.offenseList.get(0).getTouchdowns)),0,4);
        kelcePane.add(new Label(new String("Receptions: " + player1.offenseList.get(0).getReceptions)),1,4);
        kelcePane.add(new Label(new String("Total Yards: " + player1.offenseList.get(0).getTotalYards)),2,4);
        
        //add player to roster
        Button kelceadd = new Button("Add to Roster");
        kelcePane.add(kelceadd, 0,6);
        back1 = new Button("Return To Main Menu");
        kelcePane.add(back1, 1,6);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        kelceScene = new Scene(kelcePane,500,500);
        
        //set up Julio Jones Scene
        GridPane jonesPane = new GridPane();
        jonesPane.setAlignment(Pos.TOP_LEFT);
        jonesPane.setPadding(new Insets(10,10,10,10));
        jonesPane.setHgap(20);
        jonesPane.setVgap(20);
        
        Label jonesName = new Label(new String(player1.offenseList.get(0).getName()));
        jonesName.setFont(Impact);
        jonesPane.add(jonesName, 0, 0);
        jonesPane.add(new Label(new String("Position: " + player1.offenseList.get(0).getPosition)),0,1);
        jonesPane.add(new Label(new String("Team Name: " + player1.offenseList.get(0).getTeamName)), 1, 1);
        jonesPane.add(new Label(new String("Years Pro: " + player1.offenseList.get(0).getYearsPro)),2,1);
        jonesPane.add(new Label(new String("Age: " + player1.offenseList.get(0).getAge)),0,2);
        jonesPane.add(new Label(new String("Home Town: " + player1.offenseList.get(0).getHomeTowm)),1,2);
        jonesPane.add(new Label(new String("College Team: " + player1.offenseList.get(0).getCollegeTeam)),2,2);
        jonesPane.add(new Label(new String("DOB: " + player1.offenseList.get(0).getDateOfBirth)),0,3);
        jonesPane.add(new Label(new String("Height: " + player1.offenseList.get(0).getHeight)),1,3);
        jonesPane.add(new Label(new String("Weight: " + player1.offenseList.get(0).getWeight)),2,3);
        jonesPane.add(new Label(new String("Touchdowns: " + player1.offenseList.get(0).getTouchdowns)),0,4);
        jonesPane.add(new Label(new String("Receptions: " + player1.offenseList.get(0).getReceptions)),1,4);
        jonesPane.add(new Label(new String("Total Yards: " + player1.offenseList.get(0).getTotalYards)),2,4);
        
        //add player to roster
        Button jonesadd = new Button("Add to Roster");
        jonesPane.add(jonesadd, 0,6);
        back1 = new Button("Return To Main Menu");
        jonesPane.add(back1, 1,6);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        jonesScene = new Scene(jonesPane,500,500);
        
        //Set up Defensive Player Scenes
        //set up Von Miller Scene
        GridPane millerPane = new GridPane();
        millerPane.setAlignment(Pos.TOP_LEFT);
        millerPane.setPadding(new Insets(10,10,10,10));
        millerPane.setHgap(20);
        millerPane.setVgap(20);
        
        Label millerName = new Label(new String(player1.offenseList.get(0).getName()));
        millerName.setFont(Impact);
        millerPane.add(millersName, 0, 0);
        millerPane.add(new Label(new String("Position: " + player1.offenseList.get(0).getPosition)),0,1);
        millerPane.add(new Label(new String("Team Name: " + player1.offenseList.get(0).getTeamName)), 1, 1);
        millerPane.add(new Label(new String("Years Pro: " + player1.offenseList.get(0).getYearsPro)),2,1);
        millerPane.add(new Label(new String("Age: " + player1.offenseList.get(0).getAge)),0,2);
        millerPane.add(new Label(new String("Home Town: " + player1.offenseList.get(0).getHomeTowm)),1,2);
        millerPane.add(new Label(new String("College Team: " + player1.offenseList.get(0).getCollegeTeam)),2,2);
        millerPane.add(new Label(new String("DOB: " + player1.offenseList.get(0).getDateOfBirth)),0,3);
        millerPane.add(new Label(new String("Height: " + player1.offenseList.get(0).getHeight)),1,3);
        millerPane.add(new Label(new String("Weight: " + player1.offenseList.get(0).getWeight)),2,3);
        millerPane.add(new Label(new String("Touchdowns: " + player1.offenseList.get(0).getTouchdowns)),0,4);
        millerPane.add(new Label(new String("Receptions: " + player1.offenseList.get(0).getReceptions)),1,4);
        millerPane.add(new Label(new String("Total Yards: " + player1.offenseList.get(0).getTotalYards)),2,4);
        
        //add player to roster
        Button milleradd = new Button("Add to Roster");
        millerPane.add(milleradd, 0,6);
        back1 = new Button("Return To Main Menu");
        millerPane.add(back1, 1,6);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        millerScene = new Scene(millerPane,500,500);
        
        //set up JJ Watt Scene
        GridPane wattPane = new GridPane();
        wattPane.setAlignment(Pos.TOP_LEFT);
        wattPane.setPadding(new Insets(10,10,10,10));
        wattPane.setHgap(20);
        wattPane.setVgap(20);
        
        Label wattName = new Label(new String(player1.offenseList.get(0).getName()));
        wattName.setFont(Impact);
        wattPane.add(wattName, 0, 0);
        wattPane.add(new Label(new String("Position: " + player1.offenseList.get(0).getPosition)),0,1);
        wattPane.add(new Label(new String("Team Name: " + player1.offenseList.get(0).getTeamName)), 1, 1);
        wattPane.add(new Label(new String("Years Pro: " + player1.offenseList.get(0).getYearsPro)),2,1);
        wattPane.add(new Label(new String("Age: " + player1.offenseList.get(0).getAge)),0,2);
        wattPane.add(new Label(new String("Home Town: " + player1.offenseList.get(0).getHomeTowm)),1,2);
        wattPane.add(new Label(new String("College Team: " + player1.offenseList.get(0).getCollegeTeam)),2,2);
        wattPane.add(new Label(new String("DOB: " + player1.offenseList.get(0).getDateOfBirth)),0,3);
        wattPane.add(new Label(new String("Height: " + player1.offenseList.get(0).getHeight)),1,3);
        wattPane.add(new Label(new String("Weight: " + player1.offenseList.get(0).getWeight)),2,3);
        wattPane.add(new Label(new String("Touchdowns: " + player1.offenseList.get(0).getTouchdowns)),0,4);
        wattPane.add(new Label(new String("Receptions: " + player1.offenseList.get(0).getReceptions)),1,4);
        wattPane.add(new Label(new String("Total Yards: " + player1.offenseList.get(0).getTotalYards)),2,4);
        
        //add player to roster
        Button wattadd = new Button("Add to Roster");
        wattPane.add(wattadd, 0,6);
        back1 = new Button("Return To Main Menu");
        wattPane.add(back1, 1,6);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        wattScene = new Scene(wattPane,500,500);
        
        //set up Patrick Peterson Scene
        GridPane petersonPane = new GridPane();
        petersonPane.setAlignment(Pos.TOP_LEFT);
        petersonPane.setPadding(new Insets(10,10,10,10));
        petersonPane.setHgap(20);
        petersonPane.setVgap(20);
        
        Label petersonName = new Label(new String(player1.offenseList.get(0).getName()));
        petersonName.setFont(Impact);
        petersonPane.add(petersonName, 0, 0);
        petersonPane.add(new Label(new String("Position: " + player1.offenseList.get(0).getPosition)),0,1);
        petersonPane.add(new Label(new String("Team Name: " + player1.offenseList.get(0).getTeamName)), 1, 1);
        petersonPane.add(new Label(new String("Years Pro: " + player1.offenseList.get(0).getYearsPro)),2,1);
        petersonPane.add(new Label(new String("Age: " + player1.offenseList.get(0).getAge)),0,2);
        petersonPane.add(new Label(new String("Home Town: " + player1.offenseList.get(0).getHomeTowm)),1,2);
        petersonPane.add(new Label(new String("College Team: " + player1.offenseList.get(0).getCollegeTeam)),2,2);
        petersonPane.add(new Label(new String("DOB: " + player1.offenseList.get(0).getDateOfBirth)),0,3);
        petersonPane.add(new Label(new String("Height: " + player1.offenseList.get(0).getHeight)),1,3);
        petersonPane.add(new Label(new String("Weight: " + player1.offenseList.get(0).getWeight)),2,3);
        petersonPane.add(new Label(new String("Touchdowns: " + player1.offenseList.get(0).getTouchdowns)),0,4);
        petersonPane.add(new Label(new String("Receptions: " + player1.offenseList.get(0).getReceptions)),1,4);
        petersonPane.add(new Label(new String("Total Yards: " + player1.offenseList.get(0).getTotalYards)),2,4);
        
        //add player to roster
        Button petersonadd = new Button("Add to Roster");
        petersonPane.add(petersonadd, 0,6);
        back1 = new Button("Return To Main Menu");
        petersonPane.add(back1, 1,6);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        petersonScene = new Scene(petersonPane,500,500);
        
        //set up Khalil Mack Scene
        GridPane mackPane = new GridPane();
        mackPane.setAlignment(Pos.TOP_LEFT);
        mackPane.setPadding(new Insets(10,10,10,10));
        mackPane.setHgap(20);
        mackPane.setVgap(20);
        
        Label mackName = new Label(new String(player1.offenseList.get(0).getName()));
        mackPane.setFont(Impact);
        mackPane.add(mackName, 0, 0);
        mackPane.add(new Label(new String("Position: " + player1.offenseList.get(0).getPosition)),0,1);
        mackPane.add(new Label(new String("Team Name: " + player1.offenseList.get(0).getTeamName)), 1, 1);
        mackPane.add(new Label(new String("Years Pro: " + player1.offenseList.get(0).getYearsPro)),2,1);
        mackPane.add(new Label(new String("Age: " + player1.offenseList.get(0).getAge)),0,2);
        mackPane.add(new Label(new String("Home Town: " + player1.offenseList.get(0).getHomeTowm)),1,2);
        mackPane.add(new Label(new String("College Team: " + player1.offenseList.get(0).getCollegeTeam)),2,2);
        mackPane.add(new Label(new String("DOB: " + player1.offenseList.get(0).getDateOfBirth)),0,3);
        mackPane.add(new Label(new String("Height: " + player1.offenseList.get(0).getHeight)),1,3);
        mackPane.add(new Label(new String("Weight: " + player1.offenseList.get(0).getWeight)),2,3);
        mackPane.add(new Label(new String("Touchdowns: " + player1.offenseList.get(0).getTouchdowns)),0,4);
        mackPane.add(new Label(new String("Receptions: " + player1.offenseList.get(0).getReceptions)),1,4);
        mackPane.add(new Label(new String("Total Yards: " + player1.offenseList.get(0).getTotalYards)),2,4);
        
        //add player to roster
        Button mackadd = new Button("Add to Roster");
        mack.add(mackadd, 0,6);
        back1 = new Button("Return To Main Menu");
        mackPane.add(back1, 1,6);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        mackScene = new Scene(mackPane,500,500);
        
        //set up Aaron Donald Scene
        GridPane donaldPane = new GridPane();
        donaldPane.setAlignment(Pos.TOP_LEFT);
        donaldPane.setPadding(new Insets(10,10,10,10));
        donaldPane.setHgap(20);
        donaldPane.setVgap(20);
        
        Label donaldName = new Label(new String(player1.offenseList.get(0).getName()));
        donaldPane.setFont(Impact);
        donaldPane.add(donaldName, 0, 0);
        donaldPane.add(new Label(new String("Position: " + player1.offenseList.get(0).getPosition)),0,1);
        donaldPane.add(new Label(new String("Team Name: " + player1.offenseList.get(0).getTeamName)), 1, 1);
        donaldPane.add(new Label(new String("Years Pro: " + player1.offenseList.get(0).getYearsPro)),2,1);
        donaldPane.add(new Label(new String("Age: " + player1.offenseList.get(0).getAge)),0,2);
        donaldPane.add(new Label(new String("Home Town: " + player1.offenseList.get(0).getHomeTowm)),1,2);
        donaldPane.add(new Label(new String("College Team: " + player1.offenseList.get(0).getCollegeTeam)),2,2);
        donaldPane.add(new Label(new String("DOB: " + player1.offenseList.get(0).getDateOfBirth)),0,3);
        donaldPane.add(new Label(new String("Height: " + player1.offenseList.get(0).getHeight)),1,3);
        donaldPane.add(new Label(new String("Weight: " + player1.offenseList.get(0).getWeight)),2,3);
        donaldPane.add(new Label(new String("Touchdowns: " + player1.offenseList.get(0).getTouchdowns)),0,4);
        donaldPane.add(new Label(new String("Receptions: " + player1.offenseList.get(0).getReceptions)),1,4);
        donaldPane.add(new Label(new String("Total Yards: " + player1.offenseList.get(0).getTotalYards)),2,4);
        
        //add player to roster
        Button donaldadd = new Button("Add to Roster");
        donaldPane.add(mackadd, 0,6);
        back1 = new Button("Return To Main Menu");
        donaldPane.add(back1, 1,6);
        back1.setOnAction(e -> window.setScene(choiceScene1));
        
        donaldScene = new Scene(donaldPane,500,500);
        
        //Set up columns for tables
        TableColumns selectColumn = new TableColum<>("Select");
        selectColumn.setCellValueFactory(new PropertyValueFactory<>("Select"));
        
        TableColumns pickColumn = new TableColum<>("Select");
        pickColumn.setCellValueFactory(new PropertyValueFactory<>("pick"));
        
        TableColumns nameColumn = new TableColum<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        TableColumns positionColumn = new TableColum<>("Position");
        positionColumn.setCellValueFactory(new PropertyValueFactory<>("position"));
        
        TableColumns teamNameColumn = new TableColum<>("Team");
        teamNameColumn.setCellValueFactory(new PropertyValueFactory<>("teamName"));
        
        offTable.getColumns().addAll(selectColumn, nameColumn, positionColumn,
                teamNameColumn);
        
        defTable.getColumns().addAll(selectColumn, nameColumn, positionColumn,
                teamNameColumn);
        
    public ObservableList<OffensivePlayer> getOffense() {
        
        ObservableList<Object> offensivePlayer = FXCollections.observableArrayList();
        
        offensivePlayer.add(new offensivePlayer ("Tom Brady", "QB", "New England Patriots"));
        offensivePlayer.add(new offensivePlayer ("Ezekiel Elliott", "RB", "Dallas Cowboys"));
        offensivePlayer.add(new offensivePlayer ("Danny Amendola", "WR", "Miami Dolphins"));
        offensivePlayer.add(new offensivePlayer ("Travis Kelce", "TE", "Kansas City Chiefs"));
        offensivePlayer.add(new offensivePlayer ("Julio Jones", "WR", "Atlanta Falcons"));
        
            return offensivePlayer;
    } 
    
    public ObservableList<Object> getDefense() {
        
        ObservableList<Object> defensivePlayer = FXCollections.observableArrayList();
        
        defensivePlayer.add(new defensivePlayer ("Von Miller", "LB", "Denver Broncos"));
        defensivePlayer.add(new defensivePlayer ("JJ Watt", "DE", "Houston Texans"));
        defensivePlayer.add(new defensivePlayer ("Patrick Peterson", "CB", "Arizona Cardinals"));
        defensivePlayer.add(new defensivePlayer ("Khalil Mack", "OLB", "Chicago Bears"));
        defensivePlayer.add(new defensivePlayer ("Aaron Donald", "DT", "Los Angeles Rams"));
        
            return defensivePlayer;
    }
    
    //Remove offensive player from table
    public void deleteOffense() {
        ObservableList<offensivePlayer> offensePlayerRemove = FXCollections.observableArrayList();
        offensivePlayer.stream().filter(bean) -> (bean.getSelect().isSelected())).forEachOrdered(bean) -> {
    }
    offensePlayer.removeAll(offensePlayerRemove);
    
    //Remove defensive player from table
    public void deleteDefense() {
        ObservableList<defensivePlayer> defensePlayerRemove = FXCollections.observableArrayList();
        defensePlayerRemove.add(bean);
    });
    defensePlayer.removeAll(defensePlayerRemove);
    }
}