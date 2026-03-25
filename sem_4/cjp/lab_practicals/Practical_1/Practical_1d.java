public class Practical1d{
	public static void main(String[] args){
		int a = 0; 
		int b = 1; 
		int c = 0;	
		System.out.print(a + " " + b + " "); 
		for(int i = 0; i < 11; i++){
			c = a + b;
			System.out.print(c + " ");	
		a = b;
		b = c;
		}
		System.out.println(" ");
	}
}
