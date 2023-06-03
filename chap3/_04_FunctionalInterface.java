package chap_6;

import javax.crypto.CipherInputStream;

import chap_6.converter.Converterble;
import chap_6.converter.ConverterbleWithNoParams;
import chap_6.converter.Converterblewitetwoparams;
import chap_6.converter.Converterblewithreturn;
import chap_6.converter.KRWConverter;

public class _04_FunctionalInterface {

	public static void main(String[] args) {
		// 함수형 인터페이스 (람다)
		KRWConverter converter = new KRWConverter();
		converter.convert(2);
		
		convertUSD( (USD)-> System.out.println(USD + " 달러 = " + (USD * 1400) + "원"), 5);
		Converterble converterble = (USD)-> System.out.println(USD + " 달러 = " + (USD * 1400) + "원");
		convertUSD(converterble, 15);
		
		//전달 값이 하나도 없다면? 
		ConverterbleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
		c1.converter();
		
		//두 줄 이상의 코드가 있다면?
		c1 = () -> {
			int Usd = 5;
			int Krw = 1400;
			System.out.println("4 달러 = 5600 원");
		};
		c1.converter();
		
		//전달값이 2개인 경우?
		Converterblewitetwoparams  c3 = (D , W) ->  System.out.println(D + "달러 ="+(W*D)+" 원");
		c3.converter(5, 1400);
		
		//반환값이 있는 경우?
		Converterblewithreturn c4 = (D,W) ->   D*W;   // {return D*W;};
		int result = c4.converter(10, 1400);
		System.out.println(result);
		
		
		
		
	}
	public static void convertUSD(Converterble converterble , int USD) {
		converterble.convert(USD);
	}
	
}
