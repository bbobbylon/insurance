import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
	import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
	import java.util.ArrayList;

	import org.json.simple.*;
public class MemberWriter {

	    public static void writeStudentsToScreen(ArrayList<Member> members) {
	        for (Member mem : members) {
	            System.out.println(mem);
	        }
	    }
	     public static boolean writeStudentsToTextFile(String fname, 
	        ArrayList<Member> members) {
	            try {
	                PrintWriter pw = new PrintWriter(new BufferedWriter(
	                    new FileWriter(new File(fname))));
	                for (Member mem: members) {
	                    pw.println(mem);
	                }
	                pw.close();
	                return true;
	            } catch (Exception ex) {
	                return false;
	            }
	        }
	     public boolean writeMembersToJSON(String fname, ArrayList<Member> members) {
	         try {
	             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new
	                         File(fname))));
	             JSONArray array = new JSONArray();
	             JSONObject memObj;
	             for (Member mem : members) {
	                 memObj = new JSONObject();
	                 String name= mem.getFirstname() + " " + mem.getLastname();
	                 memObj.put("Name: ", name);
	                 memObj.put("Score", mem.getScore());
	                 memObj.put("Verdict", mem.getVerdict());
	                 array.add(memObj);
	             }
	             JSONObject allMembers = new JSONObject();
	             allMembers.put("members",array);
	             pw.println(allMembers.toJSONString());
	             pw.close();
	             return true;
	         } catch (Exception ex) {
	             return false;
	         }
	     }
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
