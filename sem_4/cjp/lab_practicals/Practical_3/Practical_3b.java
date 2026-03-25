// WAP to sort given Strings into alphabetical order
import java.util.Arrays;

class Practical_3b{
	public static void main(String[] args){
		String org_str = "fdbeca";
		System.out.println("Original String: " + org_str);
		char[] str_arr = org_str.toCharArray();
		Arrays.sort(str_arr);
		String sort_str = new String(str_arr);
		System.out.println("Sorted String: " + sort_str);
	}
}
