import java.util.Scanner;

public class UserStory {
  //variables to store the data
  private int[] fortniteData;
  private int[] cs2Data;
  private int[] lolData;
  private int[] genshinData;
  private int[] robloxData;

  /*
  no argument contructor to set default values
  */
  public UserStory () {
    fortniteData = FileReader.toIntArray("Fortnite.txt");
    cs2Data = FileReader.toIntArray("CounterStike2.txt");
    lolData = FileReader.toIntArray("LeageofLegends.txt");
    genshinData = FileReader.toIntArray("GenshiImpact.txt");
    robloxData = FileReader.toIntArray("Roblox.txt");
  }
  
  /*
  parameterized costructor method to give the variables data
  */
  public UserStory (String fortniteFile, String cs2File, String lolFile, String genshinFile, String robloxFile) {
    fortniteData = FileReader.toIntArray(fortniteFile);
    cs2Data = FileReader.toIntArray(cs2File);
    lolData = FileReader.toIntArray(lolFile);
    genshinData = FileReader.toIntArray(genshinFile);
    robloxData = FileReader.toIntArray(robloxFile);
  }

  /*
  method tp print important information on the data
  */
  public String toString(){
    String result = "";
    result += "Fortnite Average: " + String.format("%.6f", getAverage(fortniteData)) + " Million\n";
    result += "Counter Strike 2 Average: " + String.format("%.6f", getAverage(cs2Data)) + " Million\n";
    result += "League of Legends Average: " + String.format("%.6f", getAverage(lolData)) + " Million\n";
    result += "Genshin Impact Average: " + String.format("%.6f", getAverage(genshinData)) + " Million\n";
    result += "Roblox Average: " + String.format("%.6f", getAverage(robloxData)) + " Million\n\n";
    result += "The largest peak daily players is " + getLargest();
    return result;
  }

  /*
  gets the average of an int array
  */
  public double getAverage(int[] file){
    double average = 0;
    for (int i = 0; i < file.length; i++){
      average += file[i];
    }
    average /= file.length;
    average /= 1000000;
    return average;
  }

  /*
  gets the largest value of all of the data sets
  */
  public String getLargest(){
    int max = Integer.MIN_VALUE;
    String result = "";
    for (int i = 0; i < fortniteData.length; i++){
      if (fortniteData[i] > max){
        max = fortniteData[i];
        result = "Fornite: " + max;
      }
    }
    for (int i = 0; i < cs2Data.length; i++){
      if (cs2Data[i] > max){
        max = cs2Data[i];
        result = "Counter Strike 2: " + max;
      }
    }
    for (int i = 0; i < lolData.length; i++){
      if (lolData[i] > max){
        max = lolData[i];
        result = "League of Legends: " + max;
      }
    }
    for (int i = 0; i < genshinData.length; i++){
      if (genshinData[i] > max){
        max = genshinData[i];
        result = "Genshin Impact: " + max;
      }
    }
    for (int i = 0; i < robloxData.length; i++){
      if (robloxData[i] > max){
        max = robloxData[i];
        result = "Roblox: " + max;
      }
    }
    
    return result;
  }

  /*
  to string method 
  prints all of the raw datasets data
  */
  public void printAll (){
    String result = "Raw Data of Peak Daily Players: \n";
    for (int i = 0; i < fortniteData.length; i++){
      result += "Fortnite: " + fortniteData[i] + "\n";
    }
    for (int i = 0; i < cs2Data.length; i++){
      result += "Counter Strike 2: " + cs2Data[i] + "\n";
    }
    for (int i = 0; i < lolData.length; i++){
      result += "League of Legends: " + lolData[i] + "\n";
    }
    for (int i = 0; i < genshinData.length; i++){
      result += "Genshin Impact: " + genshinData[i] + "\n";
    }
    for (int i = 0; i < robloxData.length; i++){
      result += "Roblox: " + robloxData[i] + "\n";
    }
    System.out.println(result);
  }
}