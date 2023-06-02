package chap_3;

public class _02_instanceVariables {

	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		b1.res = "FHD";
		b1.price = 200000;
		b1.Corol = "black";
		
		System.out.println(b1.modelName);
		
		//새로운 블랙박스 제품 
		BlackBox b2 = new BlackBox();
		
		b2.modelName = "하양이";
		b2.res = "HD";
		b2.price = 100000;
		b2.Corol = "white";
		System.out.println(b2.modelName);
	}

}
