public class Librarian extends Person {
    private double empFrac;        
    private String position;
    
    public Librarian(String name, Cprno cpr, String address, double time, String job) {
        super(name, cpr, address);
        this.empFrac = time;
        this.position = job;
    }

    public boolean isFullTime(){
    	if(this.empFrac >= 1){
    		return true;
    	}
    	return false;
    }
    
    public String getPosition(){
    	return this.position;
    }
    
    public String toString() {
        String s = String.format("%.2f - %s - Er fuldtidsansat: %s", this.empFrac, this.getPosition(), this.isFullTime());
        return s;
    }
    
    public static void main(String[] args) {
        Cprno c = new Cprno(2511450007L);
        Person l1 = new Librarian("Poul", c, "Vejen 12", 1.2, "IT Specialist");
        System.out.println(l1);
    }

}
