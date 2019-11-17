import java.util.ArrayList;
/**
 * This class creates a Member object that has characteristics read from the text file.
 * There are also numerous classes that will help exchange these information between
 * classes by using these characteristics.
 * @author Colin
 *
 */

public class Member {
	private String firstname;
	private String lastname;
	private int age;
	private int height;
	private int weight;
	private int BPSyst;
	private int BPDias;
	private String cancer;
	private String diabetes;
	private String alzheimers;
	
	/**
	 * These are the get and set functions
	 * @author Colin
	 */
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getBPSyst() {
		return BPSyst;
	}
	
	public int getBPDias() {
		return BPDias;
	}
	
	public String getCancer() {
		return cancer;
	}
	
	public String getDiabetes() {
		return diabetes;
	}
	
	public String getAlzheimers() {
		return alzheimers;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setBPSyst(int BPSyst) {
		this.BPSyst = BPSyst;
	}
	
	public void setBPDias(int BPDias) {
		this.BPDias = BPDias;
	}
	
	public void setCancer(String cancer) {
		this.cancer = cancer;
	}
	
	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
	}
	
	public void setAlzheimers(String alzheimers) {
		this.alzheimers = alzheimers;
	}
	
	/**
	 * This function is the Member constructor class with no input variables
	 * @author Colin
	 */
	public Member() {
		firstname = "";
		lastname = "";
		age = 0;
		height = 0;
		weight = 0;
		BPSyst = 0;
		BPDias = 0;
		cancer = "";
		diabetes = "";
		alzheimers = "";
	}
	
	/**
	 * This class creates a Member object with inputs for each characteristic
	 * @author Colin
	 * @param firstname Member's first name
	 * @param lastname Member's last name
	 * @param age Member's age
	 * @param height Member's height
	 * @param weight Member's weight
	 * @param BPSyst Member's systolic BP
	 * @param BPDias Member's diastolic BP
	 * @param cancer Does member have history of cancer in their family?
	 * @param diabetes Does member have history of diabetes in their family?
	 * @param alzheimers Does member have history of alzheimers in their family?
	 */
	public Member(String firstname, String lastname, int age, int height, int weight, int BPSyst, int BPDias, String cancer, String diabetes, String alzheimers) {
		setFirstname(firstname);
		setLastname(lastname);
		setAge(age);
		setHeight(height);
		setWeight(weight);
		setBPSyst(BPSyst);
		setBPDias(BPDias);
		setCancer(cancer);
		setDiabetes(diabetes);
		setAlzheimers(alzheimers);
	}
	
	/**
	 * This overrides the toString function to print out the members in a certain format.
	 * @author Colin
	 */
@Override
public String toString() {
	return String.format("%s %s %d %d %d %d %d %s %s %s", firstname, lastname, age, height, weight, BPSyst, BPDias, cancer, diabetes, alzheimers);
}
}
