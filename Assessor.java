import java.util.ArrayList;
public class Assessor {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Here are the insurance assessments: ");
	}

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

public String bmiScore(String bmi)
{
	if (bmi.contentEquals("normal"))
	{
		return "normal";
	}
	else if (bmi.contentEquals("overweight"))
	{
		return "overweight";
	}
	else
	{
		return "else";
	}
}

public String bloodPressureScore(String score)
{
	if (score.contentEquals("normal"))
	{
		return "0 points";
	}
	else if (score.contentEquals("elevated"))
	{
		return "15 points";
	}
	else if (score.contentEquals("stage 1"))
	{
		return "30 points";
	}
	else if (score.contentEquals("stage 2"))
	{
		return "75 points";
	}
	else 
	{
		return "100 points";
	}
	
}


	public String familyDiseaseScore(String disease)
	{
		if (disease.contentEquals("diabetes"))
		{
			return "10 points";
		}
		if (disease.contentEquals("cancer"))
		{
			return "10 points";
		}
		else
		{
			return "10 points";
		}
	}
	
public String overallScore(InsuranceScore scores)
{
	String total = "0";
	ArrayList<String> iScore = scores.getScore();
	for (String score:iScore)
	{
		total = total + score;
	}
	return " ";
}

}
/*
Age:
< 30
-
0 points
< 45
-
10 points
< 60
-
20 points
else
-
30 points
BMI:
normal
-
0 points
overweight
-
30 points
else
-
75 points
Blood Pressure:
normal
-
0 points
elevated
-
15 points
stage 1
-
30 points
stage 2
-
75 points
crisis
-
100 points
Family Disease:
diabetes
-
10 points
cancer
-
10 points
alzheimers
-
10 points

<= 20
-
low risk
<= 50
-
moderate risk
<= 75
-
high risk
else
-
uninsurable


*/