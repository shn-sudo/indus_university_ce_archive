public class Practical_1c2{
	public static void main(String[] args){
		int no_1 = -9;
		int no_2 = -231;
		int no_3 = 399;
		int max_no = 0;
		if(no_1 > no_2){
			max_no = no_1;
			if (no_3 > max_no){
				max_no = no_3;
			}
		}
		if(no_2 > no_1){
			max_no = no_2;
			if (no_3 > max_no){
				max_no = no_3;
			}
		}
	System.out.println("The greatest number is: " + max_no);
	}
}
