package ConstructorOOP_1;

public class main {

	public static void main(String[] args) {
		
		human h1 = new human("Louwis",21,79.30);
		human h2 = new human("Elon musk",21,79.30);
		
		System.out.println(h1.name);
		System.out.println(h2.name);
		h2.eat();
		h1.drink();

	}

}
