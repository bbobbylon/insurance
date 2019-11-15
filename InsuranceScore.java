import java.io.PrintStream;
import java.util.ArrayList;



/**

 * @author Robert

 * This class is used for 

 * creating an InsuraceScore object

 * and setting its values as 0 or null to start.

 * The object will later be called in the 

 * Assessor class's overallScore method, 

 * which adds up all of the needed scores:

 * bmiScore, bloodPressureScore, ageScore, and familyDiseaseScore, 

 * which then finds an appropriate insurance plan for the entered user.

*takes in 0 parameters

*@return  iScore, which is a variable for the overallScore method

*

*

*/

		

public class InsuranceScore {

	private static int score;

	private static String name;

	private static String riskLevel;

	



	public String getName()

	{

		return name;

	}

	public void setName(String sName)

	{

		this.name= sName;

	}

	public String getRiskLevel()

	{

		return riskLevel;

	}

	public void setRiskLevel(String sRiskLevel)

	{

		this.riskLevel= sRiskLevel;

	}

	public int getTotalScore()

	{

		return score;

	}

	public void setTotalScore(int sTotalScore)

	{

		this.score = sTotalScore;

	}

	

/**

 * @author Robert

 * This constructor method named InsuranceScore

 * creates a new InsuranceScore object that will be

 * implemented for calculating total scores for the 

 * Assessor class.

 * @param takes in 0 parameters.

 * @return  nothing

 * 

 * 

 */

InsuranceScore()

{

	name = " ";

	score = 0;

	riskLevel =" ";

	

}

InsuranceScore(String name, int score, String riskLevel)

{

	setName(name);

	setTotalScore(score);

	setRiskLevel(riskLevel);

}

public void printScores() {
	System.out.printf("Name: %15s %n Score: %15s %n Verdict: %15s %n", name, score, riskLevel);
}
}