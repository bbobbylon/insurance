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
	private ArrayList<String> iScore;
	private static int ageScore;
	private static String bmiScore;
	private static String bloodPressureScore;
	private static String familyDiseaseScore;
	public ArrayList<String> getScore() {
		return iScore;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	 ageScore = 0;
	 bmiScore = " ";
	 bloodPressureScore = " ";
	 familyDiseaseScore = " ";

}
}