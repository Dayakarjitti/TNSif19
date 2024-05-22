package arraysconcept;

public class Testarrayconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first approach of declaring the array
		
		int[] numbers= {10,20,30,40,50};
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		// second approach of declaring the array
		
		int[] score=new int[5];
		score[0]=166;
		score[1]=231;
		score[2]=300;
		score[3]=219;
		score[4]=226;
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
	}

}
