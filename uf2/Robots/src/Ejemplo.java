public class Ejemplo {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Robots program");
		System.out.println("-------------------------");
		
		Robot robotA = new Robot();
		robotA.name = "Husnain";
		robotA.color= "green";
		robotA.weight= 65.0f;
		
		System.out.println("El Robot <A> se llama "+ robotA.name);
		System.out.println("El Robot <A> es de color "+ robotA.color);
		System.out.println("El Robot <A> pesa "+ robotA.weight);

		robotA.sayHello();
		
		System.out.println("-------------------------");

		Robot robotB = new Robot();
		robotB.name = "Usman";
		robotB.color= "purple";
		robotB.weight= 67.0f;
		
		System.out.println("El Robot <B> se llama "+ robotB.name);
		System.out.println("El Robot <B> es de color "+ robotB.color);
		System.out.println("El Robot <B> pesa "+ robotB.weight);
		
		robotB.sayHello();

	}
}
