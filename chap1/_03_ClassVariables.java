package chap_3;

public class _03_ClassVariables {

	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		System.out.println(b1.modelName);
		
		BlackBox b2 = new BlackBox();
		b2.modelName = "하양이";
		System.out.println(b2.modelName);
		
		// 특정 범위 초과시 자동신고 기능
		System.out.println(" - 개발 전 -");
		System.out.println(b1.modelName +  " 자동 신고 기능" + b1.AutoReport);
		System.out.println(b2.modelName +  " 자동 신고 기능" + b1.AutoReport);
		System.out.println("모든 블랙박스 제품 자동 신고 기능 : "+ BlackBox.AutoReport);
		
		// 기능 개발 
		BlackBox.AutoReport = true;
		System.out.println(" - 개발 후 -");
		System.out.println(b1.modelName +  " 자동 신고 기능" + b1.AutoReport);
		System.out.println(b2.modelName +  " 자동 신고 기능" + b1.AutoReport);
		System.out.println("모든 블랙박스 제품 자동 신고 기능 : "+ BlackBox.AutoReport); // 클래스 변수로 접근하는걸 권장
	}

}
