public abstract class Personne{

	protected String fullname;
	
	
	public String getFullName(){
	    return this.fullname;
	}
	public void setFullName(String fullname){
	    this.fullname=fullname;
	}
	public void affiche(){
	System.out.println("Le nom complet est :"+getFullName());
	}
}