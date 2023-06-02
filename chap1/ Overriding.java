package chap_3;

class parents {
	void overriding() {
		System.out.println("parents");
	}
}
class descendent extends parents{
	@Override
	void overriding() {
		super.overriding();
		System.out.println("descendent");
	}
}
class descendent2 extends parents{
	@Override
	void overriding() {
		System.out.println("descendent2");
	}
}


public class Overriding {
	public static void main(String[] args) {
		parents parents = new parents();
		descendent descendents = new descendent();
		descendent2 descendents2 = new descendent2();
		
		parents.overriding();
		System.out.println("-----------------------");
		descendents.overriding();
		System.out.println("-----------------------");
		descendents2.overriding();
	}
}
