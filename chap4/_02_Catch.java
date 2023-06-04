package chap_7;

public class _02_Catch {

	public static void main(String[] args) {
		try {
//			System.out.println(3/0);
//			int[] i = new int[3];
//			i[5] = 100;	
//			Object obj = "test";
//			System.out.println((int)obj);
			String s = null;
			System.out.println(s.toLowerCase());
		}catch (ClassCastException | ArrayIndexOutOfBoundsException e) {    // 예외 문장을 여러개를 적용할 수 있음 
			System.out.println("뭔가 실수 하셨네요");
//		} 
//		catch (ArrayIndexOutOfBoundsException e) {    
//			System.out.println("뭔가 실수 하셨네요");
		} 
		catch (ArithmeticException e) { // 찾으려는 예외 문장 
			System.out.println("잘못 계산 하셨습니다.");
		} 
		catch (Exception e) {    //모든 Exception의 조상
			System.out.println("그 외의 모든 에러는 여기서 처리가 됩니다.");
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");

	}

}
