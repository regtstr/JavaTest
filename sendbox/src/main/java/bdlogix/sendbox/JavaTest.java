package bdlogix.sendbox;

public class JavaTest {
	
	public static void main(String[] args) {
		hello("world!");

		double l = 8;
		System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

		double a =6;
		double b = 8;
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
;		}

		public static void hello(String w) {
					System.out.println("Hellow, " + w);
		}
		public static double area (double l) {
		return l * l;
		}
		public static  double area(double a, double b) {
		return a * b;
		}
}
