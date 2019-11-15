import java.util.ArrayList;



/**

 * @author bobby

 *This class is used for the calculations behind assessing a member(new or old)

 *It has a class for each parameter that is considered when scoring a member:

 *age, BMI, blood pressure, and family disease. There are also two classes that

 *calculate BMI and blood pressure using a simple conversion formula (since we are

 *converting from LBS to KGS and height in FT to height in M.

 */



public class Assessor

{

	

/**

 * @name ageScore

 * This method simply returns an INT depending on the member's age

 * @param age is an INT that compared to 30, 45, or 60, and they 

 * respectfully return a score to be added with all the other scores to find

 * an insurance rate.

 * @return 0, 10, 20, or 30. These are points that will be added to the total score,

 * which determines a member's insurance rate plan.

 */

	

public static int ageScore(int age)

	{

	if (age<30)

	{

		return 0;

	}

	else if (age<45)

	{

		return 10;

	}

	else if (age<60)

	{

		return 20;

	}

	else

	{

		return 30;

	}

	}



/**

 * @name calcBmiScore

 * This method does the actual calculations and conversions from LB to KG and FT to M.

 * @param height is an integer that is divided by 39.37 to convert to meters.

 * @param weight is an integer that is divided by 2.205 to convert to KGS.

 * @return BMI, which is weight divided by height squared. This determines a score

 * range for a member and is added to the total score, which gives a member an

 * insurance rate based on their total score.

 */



public static double calcBmiScore(int height, int weight)

{

	//one lb = 0.453592 kilos

	//one ounce = 0.0283495 kilos

	//one foot = 0.3048 meters

	//one inch = 0.0254 meters

	//weight in kilos / height in meters squared = bmi

	

	double bmi = (weight/2.205) / Math.pow(height/39.37, 2) ;

	return bmi;

}



/**

 * @name bmiScore

 * This method takes in a string called BMI and returns an INT.

 * @param bmi this parameter is used as a double because of the given text file

 * @return 0, 30 or 75. These points will be added to the total score, which 

 * gives a member a proposed insurance rate.

 */



public static int bmiScore(double bmi)

{

	if (bmi>=18.5 && bmi <=24.9)

	{

		return 0;

	}

	else if (bmi >=25.0 && bmi <= 29.9)

	{

		return 30;

	}

	else if (bmi>= 30.0 &&bmi <= 34.9)

	{

		return 75;

	}

	else 

		return 0;

}



/**

 * @name calcBloodPressure

 * This method is for calculating Blood pressure

 * @param BPSys is an INT and it represents a members systolic Blood Pressure

 * @param BPDias is an INT and it represents a members diastolic Blood Pressure

 * @return normal, elevated, stage1, stage2, crisis. These strings are going to be

 * input into the bloodPressure method, which returns a score to be added to the total score,

 * which is used in finding a member's proposed insurance rate.

 */



public static String calcBloodPressure(int BPSys, int BPDias)

{

	if (BPSys < 120 && BPDias < 80)

	{

		return "normal";

	}

	else if (120<=BPSys&& BPSys<=129 && BPDias < 80)

	{

		return "elevated";

	}

	else if ((130<=BPSys&& BPSys<=139) || (80<= BPDias && BPDias<=89))

	{

		return "stage 1";

	}

	else if (BPSys>=140 || BPDias>=90)

	{

		return "stage 2";

	}

	else if (BPSys>=180 || BPDias>=120)

	{

		return "crisis";

	}

	else

		return " ";

}



/**

 * @name bloodPressureScore

 * This method gives points to be added to a total score.

 * @param BPSys is an INT and it is used in the calcBloodPressure to find the range of a member's

 * systolic blood pressure

 * @param BPDias is and INT and functions just like BPSys, instead for diastolic blood pressure.

 * @return 0, 15, 30, 75, and 100. These INTS will be added to a total score, which gives

 * a member their proposed insurance rate.

 */



public static int bloodPressureScore(int BPSys, int BPDias)

{

	if (calcBloodPressure(BPSys, BPDias).equals("normal"))

	{

		return 0;

	}

	else if (calcBloodPressure(BPSys, BPDias).equals("elevated"))

	{

		return 15;

	}

	else if (calcBloodPressure(BPSys, BPDias).equals("stage 1"))

	{

		return 30;

	}

	else if (calcBloodPressure(BPSys, BPDias).equals("stage 2"))

	{

		return 75;

	}

	else if (calcBloodPressure(BPSys, BPDias).equals("crisis"))

	{

		return 100;

	}

	else 

		return 0;

	

}



/** 

 * @name familyDiseaseScore

 * This method gives points based on family history.

 * @param disease is a string and a score is returned based on the type of disease.

 * @return an INT, (all 10 points) which adds to a total score, that will later calculate 

 * a member's proposed insurance rate.

 */



	public static int familyDiseaseScore(String disease)

	{

		if (disease.contentEquals("y"))

		{

			return 10;

		}

		else

		{

			return 0;

		}

	}

	

	/**

	 * @name calcRiskLevel

	 * This method is the overall scores that can be achieved when adding all other parameters

	 * (blood pressure, family disease, BMI, and age.

	 * @param points is an INT that represents the points of all other parameters

	 * @return low risk, moderate risk, high risk, or uninsurable. These strings 

	 * represent if you can get insured or not!

	 */

	

	public static String calcRiskLevel(int points)

	{

		if (points <= 20)

		{

			return "low risk";

		}

		else if (points <=50)

		{

			return "moderate risk";

		}

		else if (points <= 75)

		{

			return "high risk";

		}

		else

			return "uninsurable";

	}



/**

 * @name assessMember

 * This method will tally all of the parameters in calculating a risk level. Then, a new InsuranceScore will be 

 * output to an ArrayList called allScores, which will be called when the program assesses a member.

 * @param members is an ArrayList of the object Member (from our Member class). This is needed for outputting

 * a new assesMember object with their calculated risk level.

 * @return ArrayList<InsuranceScore> this object returns a new insurance score 

 */

	

public static ArrayList<InsuranceScore> assessMember(ArrayList<Member> members)

	{

	ArrayList<InsuranceScore> allScores = new ArrayList<InsuranceScore>();

	

	for (Member mem:members)

	{

	String name= mem.getLastname() +", " + mem.getFirstname();

	int total = 0;

	int age = mem.getAge();

	int weight = mem.getWeight();

	int height = mem.getHeight();

	int BPSyst = mem.getBPSyst();

	int BPDias = mem.getBPDias();

	String cancer = mem.getCancer();

	String alzheimers = mem.getAlzheimers();

	String diabetes = mem.getDiabetes();
	
	total = ageScore(age) + bmiScore(calcBmiScore(height, weight)) + bloodPressureScore(BPSyst, BPDias) + familyDiseaseScore(cancer) 

	+ familyDiseaseScore(diabetes) + familyDiseaseScore(alzheimers);
	
	String riskLevel = calcRiskLevel(total);

	InsuranceScore memberScore = new InsuranceScore(name, total, riskLevel);

	allScores.add(memberScore);

	}

	return allScores;

	}



}