package enums;

public class InterfaceInsideEnum {
	public enum Season{
		SPRING, SUMMER, FALL, WINTER;
		
		interface A2{
			void print();
			void print1();
		}
	}
	public static void main(String[] args) {
		Season s1 = Season. FALL;
		Season s2 = Season. SPRING;
		Season s3 = Season. FALL;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		A3 a3 = new A3();
		a3.print();
		a3.print1();
	}
}

class A3 implements InterfaceInsideEnum.Season.A2 {
	@Override
	public void print(){
		System.out.println("print");
	}
	@Override
	public void print1() {
		System.out.println("print1");
	}
}

/* OUTPUT - 
 FALL
SPRING
FALL
print
print1
 */