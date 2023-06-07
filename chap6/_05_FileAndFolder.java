package chap_9;

import java.io.File;

public class _05_FileAndFolder {
	public static void main(String[] args) {
		// String folder = "D:\\성진\\workspace\\study_1\\src\\chap_9";
		String folder = "src/chap_9";
		File filesAndFolders = new File(folder);
		System.out.println("현재 폴더 경로 : "+ filesAndFolders.getAbsolutePath());   
		for (File file  : filesAndFolders.listFiles()) {     // 모든 폴더와 파일 정보를 가져옴
			if(file.isFile()) {     //파일이면 true
				System.out.println("(파일) " + file.getName()); //파일 또는 폴더의 이름을 가져옴
			}else if (file.isDirectory()) {   // 폴더면 true
				System.out.println("(폴더) " + file.getName()); //파일 또는 폴더의 이름을 가져옴
			}
		}
		
	}
}
