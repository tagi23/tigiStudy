package chap_5;

import java.util.ArrayList;

public class _Quiz_09 {

	public static void main(String[] args) {
	ArrayList<student>st = new ArrayList<>();
	
	st.add(new student("유재석","파이썬"));
	st.add(new student("박명수","자바"));
	st.add(new student("김종국","자바"));
	st.add(new student("조세호","C"));
	st.add(new student("서장훈","파이썬"));
	
	System.out.println("자바 자격증을 보유한 학생");
	System.out.println("-------------------------");
	for (student student : st) {
		student.java();
	}
	
	}
}

class student{
	public String name;
	public String certificate;
	
	public student(String name, String certificate) {      //리턴값이없다 
		this.name = name;
		this.certificate = certificate;
	}

	public void java() {
		if(certificate.equals("자바")) {
			System.out.println(this.name);
		}
	}
	
}
