package chap_3;

public class _04_Method {

	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		
		b1.autoReport(); // 지원 안됨
		BlackBox.AutoReport = true;
		b1.autoReport(); //지원 됨 
		
		b1.insertMemory(10);
		
		//일반 영상 : 1 
		//이벤트 영상 (충돌 감지) : 2 
		int  fileCount = b1.getvideoFileCount(1); // 일반 영상
		System.out.println("일반 영상 파일 수 : "+fileCount + "개");
		
		int  fileCount2 = b1.getvideoFileCount(2); // 이벤트 영상
		System.out.println("일반 영상 파일 수 : "+fileCount2 + "개");
		
		int  fileCount3 = b1.getvideoFileCount(3); 
		System.out.println("일반 영상 파일 수 : "+fileCount3 + "개");
	}
	

}
