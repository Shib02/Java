package corejava;

public class singletone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1;
	      // refers to the only object of Database
	      d1= Data.getInstance();
	      
	      d1.getConnection();
	   }
	}
class Data {
	   private static Data dbObject;
	   private Data() {      
	   }
	   public static Data getInstance() {
	      // create object if it's not already created
	      if(dbObject == null) {
	         dbObject = new Data();
	      }
	       // returns the singleton object
	       return dbObject;
	   }
	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
	}
