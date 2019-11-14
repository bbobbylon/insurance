import java.util.ArrayList;

/**
 * @author bobby
 *This class is used for the calculations behind assessing a member(new or old)
 *It has a class for each parameter that is considered when scoring a member:
 *age, bmi, blood pressure, and family disease. There are also two classes that
 *calculate bmi and blood pressure using a simple conversion formula (since we are
 *converting from lbs to kgs and height in ft to height in m.
 */

public class Assessor
{
	
/**
 * This method simply returns an int depending on the member's age
 * @param age is an int that compared to 30, 45, or 60, and they 
 * respectfully return a score to be added with all the other scores to find
 * an insurance rate.
 * @return 0, 10, 20, or 30. These are points that will be added to the total score,
 * which determines a member's insurance rate plan.
 */
	
public int ageScore(int age)
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
 * This method does the actual calculations and conversions from lb to kg and ft to m.
 * @param height is an integer that is divided by 39.37 to convert to meters.
 * @param weight is an integer that is divided by 2.205 to convert to kgs.
 * @return bmi, which is weight divided by height squared. This determines a score
 * range for a member and is added to the total score, which gives a member an
 * insurance rate based on their total score.
 */

public double calcBmiScore(int height, int weight)
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
 * This method takes in a string called bmi and returs an int.
 * @param bmi this parameter is used as a string because of the given text file
 * @return
 */

public int bmiScore(String bmi)
{
	if (bmi.contentEquals("normal"))
	{
		return 0;
	}
	else if (bmi.contentEquals("overweight"))
	{
		return 30;
	}
	else
	{
		return 75;
	}
}

/**
 * 
 * @param BPSys
 * @param BPDias
 * @return
 */
public String calcBloodPressure(int BPSys, int BPDias)
{
	if (120<=BPSys && 80<= BPDias)
	{
		return "normal";
	}
	else if (120<=BPSys&& BPSys<=129 && 80<= BPDias)
	{
		return "elevated";
	}
	else if (130<=BPSys&& BPSys<=139 && 80<= BPDias && BPDias<=89)
	{
		return "stage 1";
	}
	else if (BPSys>=140 &&BPDias>=90)
	{
		return "stage 2";
	}
	else if (BPSys>=180 && BPDias>=120)
	{
		return "crisis";
	}
	else
		return null;
}
public int bloodPressureScore(String score, int BPSys, int BPDias)
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
	else 
	{
		return 100;
	}
	
}

/**
 * 
 * @param disease
 * @return
 */

	public int familyDiseaseScore(String disease)
	{
		if (disease.contentEquals("diabetes"))
		{
			return 10;
		}
		if (disease.contentEquals("cancer"))
		{
			return 10;
		}
		else
		{
			return 10;
		}
	}

/**
 * 	
 * @param mem
 * @return
 */
	
//public ArrayList<InsuranceScore> assessMember(Member mem)
public int assessMember(Member mem)
{
	String total = "0";
	int age = mem.getAge();
	int weight = mem.getWeight();
	int height = mem.getHeight();
	int BPSyst = mem.getBPSyst();
	int BPDias = mem.getBPDias();
	String cancer = mem.getCancer();
	String alzheimers = mem.getAlzheimers();
	String diabetes = mem.getDiabetes();
	ArrayList<InsuranceScore> allScores = new ArrayList<InsuranceScore>();
	
	//int  average = (int)total / iScore.size();
	//String letter = familyDiseaseScore(average) + bloodPressureScore(average);
	return age;
}

}
