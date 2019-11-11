
/**
 * This class creates a Member object that has characteristics read from the text file.
 * There are also numerous classes that will help exchange these information between
 * classes by using these characteristics.
 * @author sk8er
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
		setLastName(lastname);
		setAge(age);
		setHeight(height);
		setWeight(weight);
		setBPSyst(BPSyst);
		setBPDias(BPDias);
		setCancer(cancer);
		setDiabetes(diabetes);
		setAlzheimers(alzheimers);
	}
}
