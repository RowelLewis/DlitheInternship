package internship.rowel.project1;

import java.util.Arrays;
import java.util.Scanner;

public class Candidate {
	
	private Scanner scan = new Scanner(System.in);
	private Double[] yet;Double sum;
	
	public Double[] getYet() {
		return yet;
	}

	public void setYet(Double[] yet) {
		this.yet = yet;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Candidate() {
		
		System.out.println("Default Constructor");
		System.out.println("Please set the size of array");
		Integer size = scan.nextInt();
		this.yet = new Double[size];
		this.sum = 0.0;
		System.out.println("Initialization Done");
	}
	
	public Candidate(Double[] temp) {
		System.out.println("Parameter Constructor with Double array received");
		this.yet = temp;
		System.out.println("Copied double array");
	}
	
	public Candidate(Integer[] temp) {
		System.out.println("Parameter Constructor with Integer array received");
		this.yet = new Double[temp.length];
		for(int i=0; i < yet.length; i++) {
			yet[i] = (double) (temp[i]);
		}
	}
	
	public void findingSum() {
		this.sum = 0.0;
		for(Double temp:this.yet) {
			
			this.sum+=temp;
		}
	}
	
	@Override
	public String toString() {
		return "Candidate [yet=" + Arrays.toString(yet) + ", sum=" + sum + "]";
	}

	public static void main(String[] args) {
		
		Candidate can1 = new Candidate();
		Double[] local = {12.7,15.1,12.1,20.0,30.8,7.9};
		can1.setYet(local);
		can1.findingSum();
		System.out.println(can1);
		
		Candidate can2 = new Candidate(new Double[] {12.1,56.2,74.0,20.0,1.0});
		can2.findingSum();System.out.println(can2);
		
		Candidate can3 = new Candidate(new Integer[] {12,56,74,20,1});
		can3.findingSum();System.out.println(can3);
	}

}
