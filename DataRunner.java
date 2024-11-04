import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

  //Instantiates new userStory object with the data from the .txt files
  UserStory userStory = new UserStory("Fortnite.txt", "CounterStrike2.txt", "LeagueofLegends.txt", "GenshinImpact.txt", "Roblox.txt");


    //Prints data needed for story
    userStory.printAll();
    System.out.println(userStory + "\n");  
  }
}