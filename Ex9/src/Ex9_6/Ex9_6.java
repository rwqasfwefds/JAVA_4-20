package Ex9_6;

public class Ex9_6 {

	public static void main(String[] args) {
//		주소와 값이 같음 : 얇은 복사
		String str1 = "abc";
		String str2 = "abc";
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		
//		주소 값 비교 : ==
		System.out.println("str1 == str2 ? " + (str1 == str2));
//		값 비교 : equals
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();
		
//		값은 같으나 주소가 다름 : 깊은 복사
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
//		주소 값 비교 : ==
		System.out.println("str3 == str4 ? " + (str3 == str4));
//		값 비교 : equals
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
	}

}
