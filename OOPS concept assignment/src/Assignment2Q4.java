public class Assignment2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question4 s1 = new question41();
		question4 s2 = new question42();
		
		s1.answer();
		s2.answer();
	}

}
abstract class question4{
	abstract void answer();
}

class question41 extends question4{
	@Override
	public void answer() {
		System.out.println("its and publicc clas overrid by my abstact clas");
	}
}
class question42 extends question4{
	@Override
	public void answer() {
		System.out.println("its and another publicc clas overrid by my abstact clas");
	}
}