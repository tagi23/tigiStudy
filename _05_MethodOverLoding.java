package chap_3;

public class _05_MethodOverLoding {

	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		
		b1.record(false, false , 10);
		System.out.println("______________");
		b1.record(true, true, 3);
		System.out.println("______________");
		b1.record();
		
		String s ="black" ; 
		
		s.indexOf("c");
	}

}
