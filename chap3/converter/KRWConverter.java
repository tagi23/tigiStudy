package chap_6.converter;

public class KRWConverter implements Converterble{

	@Override
	public void convert(int USD) {
		System.out.println(USD + " 달러 = " + (USD * 1400) + "원");
	}

}
