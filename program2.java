package pravin;

public class pravinp {
	public static void main (String[] args) {
		int count=0;
		
		for(int i=2; i<99; i+=1;) {
			
			for(int j=2; j<i/2; j+=1;) {
				
				if(i%j!=0) {
					count=count+1;
					
				}
				
			}
			if(count==0){
				System.out.println(i)
			
		}

		
		
	}
}
