//Create a String Buffer with some default string. Append any
//string to ith position of original string and display the modified
//string. Also display the reverse of modified string.

class Practical_3c{
	public static void main(String[] args){
		StringBuffer str_buff = new StringBuffer("practical3");
		System.out.println("String Buffer: " + str_buff);
		str_buff.append(" modified");
		System.out.println("After Appending: " + str_buff);
		str_buff.reverse();
		System.out.println("Reversed string Buffer: " + str_buff);
	}
}
