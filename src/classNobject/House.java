package classNobject;

public class House {
  //variables
  public int address;
  public String houseName;
  
  //constructor 1
  public House(){
  }
  //constructor 2
  public House(String houseName){
	  this.houseName = houseName;
  }
  //methods
  public void watchTVShows(){
	 System.out.println("Watching Game of Throns");
  }
  public void sleep(){
	  System.out.println("people sleeps at bed room");
  }
  public int addHouseSize(int length, int height){
	  int total = length + height;
	  
	  return total;
  }
}
