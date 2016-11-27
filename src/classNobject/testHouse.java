package classNobject;

public class testHouse {

	public static void main(String[] args) {
		House myHouse = new House("whitehouse");
		System.out.println(myHouse.houseName);
		myHouse.watchTVShows();
		int total = myHouse.addHouseSize(10, 15);
		System.out.println(total);
	}
}
