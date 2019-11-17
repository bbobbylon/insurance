/**
 * This class contains the methods on how the members are writtens in different forms of files. 
 * Like text, xml, json and binary.
 */
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import org.json.simple.*;

public class MemberWriter {


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
	    /**
	     * @author Nicolas Gomez
	     * @param fname its basically the file we are trying to get to
	     * @param members are basically the objects we are trying to write in fname.
	     * @return string in text style form
	     */
	     public static boolean writeMembersToTextFile(String fname, ArrayList<Member> members) {
	    	 try {
	                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fname))));
	                for (Member mem: members) {
	                    pw.println(mem);
	                }
	                pw.close();
	                return true;
	            } catch (Exception ex) {
	                return false;
	            }
	        }
	     /**
	      * @author Nicolas Gomez
	      * @param fname is a string that contains our file
	      * @param members are the people in our file
	      * @return a string in JSON form
	      */
	     public static boolean writeScoresToJSON(String fname, ArrayList<InsuranceScore> scores) {
	         try {
	             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fname))));
	             JSONArray array = new JSONArray();
	             JSONObject scoreObj;
	             for (InsuranceScore score : scores) {
	                 scoreObj = new JSONObject();
	                 scoreObj.put("Name: ", score.getName());
	                 scoreObj.put("Score", score.getTotalScore());
	                 scoreObj.put("Verdict", score.getRiskLevel());
	                 array.add(scoreObj);
	             }
	             JSONObject allScores = new JSONObject();
	             allScores.put("members",array);
	             pw.println(allScores.toJSONString());
	             pw.close();
	             return true;
	         } catch (Exception ex) {
	             return false;
	         }
	     }
	     /**
	      * @author nicolas gomez
	      * @param fname String that contains our file info
	      * @param members the people
	      * @return a new file in binary form
	      */
	     public static boolean writeMembersToBinary(String fname, ArrayList<Member> members) {
	    	 try {
	    		 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
	    		 oos.writeObject(members);
	    		 oos.close();
	    		 return true;
	    	 }catch (Exception ex) {
	    		 return false;
	    	 }
	    }
	     /**
	      * @author nicolas gomez
	      * @param fname String that contains our file info
	      * @param members the people
	      * @return a new file in XML form
	      */
	     public static boolean writeMembersToXML(String fname, ArrayList<Member> members) {
		    	try {
		    		XMLEncoder enc = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(fname)));
		    		enc.writeObject(members);
		    		enc.close();
		    		return true;
		    	}catch(Exception ex) {
		    		return false;
		    	}
	     }
	    }
