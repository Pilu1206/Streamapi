package emailAap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	swapping two number without using a third variable in java
        int a=10;
       int b=20;
       System.out.println("a:"+a+"b:"+b);
        a= a+b;
        b= a-b;
        a=a-b;
      System.out.println(" After Swapping:a:"+a+" b:"+b);
      
  ////reverse string 
		String str="swaranjali";
		StringBuilder sb= new StringBuilder(str);
		String reverse=sb.reverse().toString();
		System.out.println(reverse);
		
// //reverse integer value
//		int num=12345;
//		int reversed=0;
//		
//	while (num !=0) {
//	int digit= num%10;
//	reversed=reversed*10+digit;
//			num/=10;
//	}
//	System.out.println("reversed number:"+reversed);
//			
//		
//		int num=1234567;
//		int reversed=0;
//		
//		while (num!=0) {
//	    int digit=num%10;
//	    reversed=reversed*10+digit;
//	    num/=10;
//		}
//		System.out.println("Reversed number:"+reversed);
	   int num=1234567890;
	   int reversed=0;
	   
	   while (num!=0) {
		   int digit=num%10;
		   reversed=reversed*10+digit;
		   num/=10;
		   
	   }System.out.println(reversed);
	
	
	}		
}