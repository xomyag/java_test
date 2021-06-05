package mani.test.qa;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("123");
		hello("456");

		Square s = new Square(5);
		System.out.println("здесь происходит вывод функции КЕК (кек в квадрате, кек равен " + s.l + ") ,а расчёт функции равен " + s.area());

		Rectangle r = new Rectangle(4, 5);
		System.out.println("а здесь мы закидываем умножение двух интов. А равен \"" + r.a + "\", а B равен \"" + r.b + "\". и само умножение равно " + r.area());
	}

	public static void hello(String lol) {
		System.out.println("Hello, "+ lol +"!");
	}




}