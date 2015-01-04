package enums;
enum Season4{
	SPRING(10), SUMMER(20.0f), FALL("Keerthana"), WINTER;
	
	Season4(int i){
		System.out.println("value of i =" +i);
	}
	Season4(float f){
		this("Pallavi");
		System.out.println("value of f = " +f);
	}
	Season4(String s){
		this();
		System.out.println("value of s = " +s);
	}
	Season4(){
		this(20);
		System.out.println("default constructor");
	}
}
public class EnumUsingThis {
	public static void main(String[] args) {
		System.out.println("main begin");
		Season4 s1 = Season4.FALL;
		System.out.println("------");
		Season4 s2 = Season4.SPRING;
		System.out.println("----------");
		Season4 s3 = Season4.SUMMER;
		System.out.println("----------");
		Season4 s4 = Season4.WINTER;
	}
}

/*OUTPUT - 
 main begin
value of i =10
value of i =20
default constructor
value of s = Pallavi
value of f = 20.0
value of i =20
default constructor
value of s = Keerthana
value of i =20
default constructor
------
----------
----------
 */