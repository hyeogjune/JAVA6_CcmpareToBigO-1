
public class SortExample {

	public static void main(String[] args) {
		int [] arr = new int[100000];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*arr.length)+1;			
		}
		//시작 시간 저장
		long start = System.currentTimeMillis();
		
		//select sort
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;					
				}
			}			
		}
		
		//Buble sort
		for(int i=0; i<arr.length; i++) { 
			for(int j = 1; j<arr.length; j++) {
				if(arr[j-1]>arr[j]) {
					int temp = 0;
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}				
			}
		}
		
		
		
		
		
		//끝나는 시간 저장
		long end = System.currentTimeMillis();
		
		//출력
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%5d", arr[i]);
			if(i%20 == 19)
				{System.out.println();}
		}
		
		//초단위 환산
		System.out.println("\n실행 시간 : " + (end-start)/1000.0);

	}

}
