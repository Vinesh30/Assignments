import java.util.Scanner;

public class Assignment2Q1 {
	public static void main(String [] args) {
	}
}

class SingletoninheritCheck{
	
	private static SingletoninheritCheck single;
	private SingletoninheritCheck() {
		
	}
	
	public static SingletoninheritCheck getInstance() {
		System.out.println("This is singleton class");
		return single;
	}
	
}

/*class check extends SingletoninheritCheck{
	
}*/