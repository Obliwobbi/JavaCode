import java.util.Scanner;

class Main{
	
	public static void main (String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please type your name: ");
		String name = scanner.nextLine();

		System.out.print("Hello "+name+"!\nPlease type your age: ");
		int age = scanner.nextInt();

		System.out.println("You are "+age+" years old.");

		int retirement;
		String hurray = "error";

		if (age < 67){
			retirement = 67 - age;
			hurray = "You have "+retirement+" years left, until you can retire!";
		} else if (age > 67){
			hurray = "You already are retired!";
		}
		System.out.println(hurray);

	}

}