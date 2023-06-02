package chap_3;

class Stutent{
	//필드(Field)
    String name; //이름        객체
    int age; //나이
    int grade; //학년
   

    Stutent(String name, int age, int grade){    //생성자(Constructor)
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    
    public void studentInformation() {  //메소드(Method)
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("학년 : "+grade);
    }
}

 public class test {    
    public static void main(String[] args) {
		Stutent student = new Stutent("김철수", 13, 6) ;   //인스턴스 생성
		student.studentInformation();    //인스턴스 메소드 호출 
	}
}


