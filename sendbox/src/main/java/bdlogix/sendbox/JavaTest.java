package bdlogix.sendbox;

public class JavaTest {
	
	public static void main(String[] args) {
		hello("world!");

		Square s = new Square(6);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(6, 8);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
;		}

		public static void hello(String w) {
					System.out.println("Hellow, " + w);
		}


}
