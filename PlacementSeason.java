package solutions;

public class PlacementSeason {
	public static void main(String[] args) {
	    int [] students = {4,9,5,3,2,10};
	    int counter;
	    for(int i=0; i<6; i++){
	        counter = 0;
	        for(int j=0; j<i; j++){
	            if (students[j] > students[i]){
	                counter += 1;
	            }
	            
	        }
	        	System.out.print(counter+" ");
	    }
	
	}

	}
	

