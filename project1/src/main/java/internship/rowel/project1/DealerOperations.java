package internship.rowel.project1;

public interface DealerOperations {
	
	public void addToStock(Bike obj);
	public void listAll();
	public void update(Integer cc,Integer newone);
	public Bike[] shortlist(Short cc);
	public Bike[] shortlist(Integer year);
	public Bike[] shortlist(Double price);
	public void sort();
	public Bike remove(Integer index);
}
