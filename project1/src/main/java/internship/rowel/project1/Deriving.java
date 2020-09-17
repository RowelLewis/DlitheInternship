package internship.rowel.project1;

public class Deriving {

	public static void main(String[] args) {
		
		Factorial f1 = new Factorial();
		f1.price = new Integer[] {12,20,10,11,14,15,19,45};
		f1.findMax();
		f1.fact();

	}

}

class Sum {
	
	Integer price[], sum=0;
	
	public void findMax() {
		
		Integer max=price[0];
		
		for(Integer temp:price) {
			
			sum+=temp;
			if(max<temp) {
				max=temp;
			}
		}
		System.out.println("max value:"+max);
		System.out.println("Sum:"+sum);
	}
}
class Factorial extends Sum {
	
	public void fact() {
		
		for(Integer temp:price) {
			//fact
			long f=1;
			for(long num=temp;num>0;num--) {
				f*=num;
			}
			System.out.println(temp+" factorial:"+f);
		}
	}
}