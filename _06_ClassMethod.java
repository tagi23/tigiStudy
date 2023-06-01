package chap_3;

public class _06_ClassMethod {

	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.callService();
		
		BlackBox b2 = new BlackBox();
		b2.callService();
		
		BlackBox.callService();
	}

}
