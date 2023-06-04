package chap_7;

public class _05_TryWithResources {

	public static void main(String[] args) {
		MyFileWriter writer1 = null;
		try {
			writer1 = new MyFileWriter();
			writer1.write("아이스크림이 먹고 싶다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer1.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("----------------------");
		// 자동으로 trycatch 문을 빠져나올때 close를 빠져나옴    조건 : AutoCloseable 인터페이스여야함 
		try (MyFileWriter writer2 = new MyFileWriter()){      
			writer2.write("빵이 먹고싶어요");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

class MyFileWriter implements AutoCloseable{   //클래스와 AutoCloseable 인터페이스 호출
	@Override
	public void close() throws Exception {   // AutoCloseable 인터페이스 내의 메소드
		System.out.println("파일을 정상적으로 닫습니다."); 
	}
	public void write(String  line) {
		System.out.println("파일에 내용을 입력합니다");
		System.out.println("파일의 내용은 : " + line);
	}
	
}