
public class Borrower extends Person{

	/**
	 * @param args
	 */
	private String interests;//???????? array?
	private boolean newsletter;
	private String email;
	
	public Borrower(String name, Cprno cpr, String address, String interests, boolean newsletter, String email){
		super(name, cpr, address);
		this.interests = interests;
		this.newsletter = newsletter;
		this.email = email;
	}
	
	public boolean hasInterest(){
		if(this.interests == ""){
			return false;
		}
		return true;
	}
	
	public String showInterest(){
		//?????
		return "";
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public boolean wantsNewsletter(){
		if(!newsletter){
			return false;
		}
		return true;
	}
	
	public String toString(){
		String s = String.format("%s - %5s - %s", this.interests, this.wantsNewsletter(), this.getEmail());
		return s;
	}
	
	public static void main(String[] args) {
		Cprno c = new Cprno(1222121212L);
		Borrower b1 = new Borrower("Jimmi",c , "vejen 12", "football", false, "abc@email.dk");
		System.out.println(b1);
		
	}
	

}
