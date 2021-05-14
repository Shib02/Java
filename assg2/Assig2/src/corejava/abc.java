package corejava;

abstract class Persistence {
	
	abstract void persist();
}

class FilePersistence extends Persistence{

	
	void persist() {
		
		System.out.println("FilePersistence");
		
	}
}

class DataPersistence extends Persistence{

	
	void persist() {
		
		System.out.println("DataPersistence");
	}
	
}

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence p=new FilePersistence();
		p.persist();
		
		Persistence p1=new DataPersistence();
		p.persist();
		
	}
	
	
	}
