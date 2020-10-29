package stringAndExceptions;

import java.util.ArrayList;

public class stringsAndExc {

	public static void main(String[] args) {
		String s1 = new String();
		s1="Jhonny";
		String s2 = "Billy";
		s2.concat(s1);
		String s3 = s1.concat(" is friends with ");
		s3.concat(s2);
		System.out.println(s3);
		char[] letters = {'a','b','c'};
		try {
			for(int i =0;i<4;i++) {
				System.out.println(letters[i]);
			}
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}
}
