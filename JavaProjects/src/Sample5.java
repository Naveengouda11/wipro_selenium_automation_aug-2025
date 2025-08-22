
public class Sample5 {
public static void main(String[] args) {
	String s1 = "Hello";
	String s2 = "World";
	System.out.println(s1.concat(s2));
	System.out.println(s1); // Strings are immutable in java
	 s1 = s1.concat(s2);
	System.out.println(s1);
	
	
}
}
