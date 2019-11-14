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
	private static String lastname;
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
	 * This class takes in each member and prints it out in a neat format
	 * @author Colin
	 * @param mem The member that is being printed
	 */
	
	public static void getMembersAsString(Member mem) {
		System.out.println(mem.getLastname() + ", " + mem.getFirstname());
		System.out.println("Age            " + mem.getAge());
		System.out.println("Height         " + mem.getHeight());
		System.out.println("Weight        " + mem.getWeight());
		System.out.println("BP Syst       " + mem.getBPSyst());
		System.out.println("BP Dias        " + mem.getBPDias());
		System.out.println("Cancer          " + mem.getCancer());
		System.out.println("Diabetes        " + mem.getDiabetes());
		System.out.println("Alzheimers      " + mem.getAlzheimers());
		System.out.println("-----------------------");
	}
}
