import java.util.Scanner;

public class Input_Output {

	public static void main(String[] args) {
		String str1 = " Hello Trello! ";
		String str2 = "My name is Bauyrzhan";
		System.out.println(String.join("-", "Hello", "John"));
		System.out.println(str1.substring(0, 3));
		System.out.println(str1.replace("ell", "ar"));
		System.out.println(str1.split("e")[0] + " " + str1.split("e")[1]);
		System.out.println(str1.indexOf("e", 3));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.trim());
		
	}

}
