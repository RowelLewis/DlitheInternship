package internship.rowel.project1;

public class Bike {
	private String model=""; private Integer year=0, milage=0, cc=0; private Double cost=0.0;
	
	public Bike() {
		
	}
	public Bike(String model, Integer year, Integer milage, Integer cc, Double cost) {
		this.model = model;
		this.year = year;
		this.milage = milage;
		this.cc = cc;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [model=" + model + ", year=" + year + ", milage=" + milage + ", cc=" + cc + ", cost=" + cost + "]";
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMilage() {
		return milage;
	}
	public void setMilage(Integer milage) {
		this.milage = milage;
	}
	public Integer getCc() {
		return cc;
	}
	public void setCc(Integer cc) {
		this.cc = cc;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	
	public void displayAll() {
		System.out.println(this.model+" "+this.year+" "+this.milage+" "+this.cc+" "+this.cost);
	}
	
}
