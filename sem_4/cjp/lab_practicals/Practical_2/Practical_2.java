class Practical_2{
	public static void main(String[] args){
		int[] num = {1, 2, 3, 4, 5, 6};
		float sum = 0; 
		float avg = 0;
		for(int i = 0; i < num.length; i++){
			sum = sum + num[i];
		}
		avg = sum / num.length;
		System.out.println("The avg of the numbers in the array is: " + avg);
	}
}
