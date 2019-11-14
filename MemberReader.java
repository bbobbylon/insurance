import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.beans.XMLDecoder;

/**
 * This class will eventually read the members from a text file, a binary file, and an xml file.
 * Each class takes in the filename and creates an arraylist of members.
 * @author Colin
 *
 */

public class MemberReader {
	
	/**
	 * This function takes in the filename and splits it into each part of the Member object.
	 * Then those pieces are used to create a new member and add it to the list of members.
	 * @author Colin
	 * @param fname Name of the file
	 * @return ArrayList of members
	 */
	public static ArrayList<Member> readMembersFromTextFile(String fname){ 
        ArrayList<Member> result = new ArrayList<Member>();
        try {
            Scanner fsc = new Scanner(new File(fname));
            String line, firstname, lastname, cancer, diabetes, alzheimers;
            int age, height, weight, BPSyst, BPDias;
            Member mem;
            while (fsc.hasNextLine()) {
            	line = fsc.nextLine();
                String parts[] = line.split("\\t");
                firstname = parts[0];
                lastname = parts[1];
                age = Integer.parseInt(parts[2]);
                height = Integer.parseInt(parts[3]);
                weight = Integer.parseInt(parts[4]);
                BPSyst = Integer.parseInt(parts[5]);
                BPDias = Integer.parseInt(parts[6]);
                cancer = parts[7];
                diabetes = parts[8];
                alzheimers = parts[9];
                mem = new Member(firstname, lastname, age, height, weight, BPSyst, BPDias, cancer, diabetes, alzheimers);
                result.add(mem);
            }
            fsc.close();
            return result;
        } catch (Exception ex) {
            return null;
        }
    }
	
	/**
	 * This function takes in the file name and reads the members from a binary file
	 * @author Colin
	 * @param fname
	 * @return result An array list of the members
	 */
	public static ArrayList<Member> readMembersFromBinary(String fname) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname));
			ArrayList<Member> result = (ArrayList<Member>)ois.readObject();
			ois.close();
			return result;
		} catch (Exception ex) {
			return null;
		}
	}
	
	/**
	 * This function takes in the file name and reads the members from an XML file
	 * @author Colin
	 * @param fname
	 * @return readMembers An array list of the members
	 */
	public static ArrayList<Member> readMembersfromXML(String fname) {
		try {
			ArrayList<Member> readMembers = new ArrayList<Member>();
			XMLDecoder xmlDec = new XMLDecoder(new BufferedInputStream(new FileInputStream("students.xml")));
			readMembers = (ArrayList<Member>)xmlDec.readObject();
			xmlDec.close();
			return readMembers;
		}
		catch (Exception ex) {
			return null;
		}
	}
}
