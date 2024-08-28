package JavaPrograms;

public class RemoveJunkCharacters {

	public static void main(String[] args) {

   /*String s="&*$#adsGHJ1234";
     s=s.replaceAll("[^a-z,A-Z,0-9]", "");
       System.out.println(s);

		int num=12345;
		int rev=0;
		
    	while(num!=0) {
    		rev=rev*10+num%10;
    		num =num/10;
    		
    		
    		
    	}
    	System.out.println(rev);
 
		
	long num = 12345;
	long reverse=0;
	
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	 */	
  
		int a[]= {1,2,3,5};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		
		System.out.println(sum);
		
		int a1[]= {1,2,3,4,5};
		int sum1=0;
		
		for(int j=1;j<=5;j++) {
			sum1=sum1+j;
		}

		System.out.println(sum1);
		System.out.println("Missing number is:"+(sum1-sum));	
	}
	
}
