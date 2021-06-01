package mani.test.qa;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("123");
		hello("456");

		Square s = new Square(5);
		System.out.println("здесь происходит вывод функции КЕК (кек в квадрате, кек равен " + s.l + ") ,а расчёт функции равен " + area(s));

		Rectangle r = new Rectangle(4, 5);
		System.out.println("а здесь мы закидываем умножение двух интов. А равен \"" + r.a + "\", а B равен \"" + r.b + "\". и само умножение равно " +area(r));
	}

	public static void hello(String lol) {
		System.out.println("Hello, "+ lol +"!");
	}

	public static double area(Square s){
		return s.l * s.l;
	}
	public static double area(Rectangle r){
		return r.a * r.b;
	}

}