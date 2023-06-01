package chap_3;

public class BlackBoxRefurbish {
	public String modelName; //모델명
	String res; //성능
	private int price; //가격
	protected String Corol; //색상
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getRes() {
		if(res == null || res.isEmpty()) {    //res가 만약에 널이거나 res가 빈문자열("")일 경우 문의를 리턴하는 조건 생성 
			return "판매자에게 문의하세요.";
		}
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	private int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 100000) {
			this.price = 100000; 
		}else {
			this.price = price; 
		}
	}
	public String getCorol() {
		return Corol;
	}
	public void setCorol(String corol) {
		Corol = corol;
	}
	
	
	
}
