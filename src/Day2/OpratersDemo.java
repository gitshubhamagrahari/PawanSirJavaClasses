package Day2;

public class OpratersDemo {
	
	public static void main (String args[]) {
		
		
	//A. post increment 
		//case 1
		int a =10;
//		a++;  //a=a+1
//		System.out.println(a);//11
		
		//case 2
		
	/*	int res=a++;
		System.out.println(res);  //10
		System.out.println(a);//11
*/
		// reason here first assign the value of a to res then increment 
		
	//B. pre increment 
		//case 1
	/*	++a;
		System.out.println(a);//11
		*/
		//case 2
		int res= ++a;
		System.out.println(res);  //11
		System.out.println(a);//11
		
		//note: 
		//== : this oprator is comparing the value and return the true and false & = : this oprater is assign the value 
		//ternory oprator : ?:
		//  var =exp ? result 1: result2
			
		int b=200 , c=100;
		int x = (b>c) ? b : c;
		System.out.println(x);
		
		
		
		
	}

}
