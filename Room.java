import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

class Room{
  String name;
  ArrayList<String> students;
  
  public static Room load(String filename) throws FileNotFoundException{
	  Scanner s = new Scanner(new File(filename));
	  String roomname = s.nextLine(); //1409
	  Room r = new Room(roomname);
	  int numline = Integer.parseInt(s.nextLine()); //3
	  for(int i=0; i<numline; i++){
		  r.addStudent(s.nextLine());
	  }
	  s.close();
	  return r;
  }
  
  public String getName(){
	  return name;
  }
  
  public Room(String name){
	  this.name = name;
	  students = new ArrayList<String>();
  }
  
  public Room(String name, ArrayList<String> students){
    this.name = name;
    this.students = new ArrayList<String>();
    for(int i=0; i<students.size(); i++){
      this.students.add(students.get(i));
    }
  }

  public void addStudent(String name){
	  students.add(name);
  }
  
  public String toString(){
    // room name
    // number of students
    // students 1
    // students 2
    StringBuffer sb = new StringBuffer();
    sb.append(this.name+"\n");
    sb.append(Integer.toString(students.size())+"\n");
    for(int i=0; i<students.size(); i++){
        sb.append(students.get(i));
        sb.append("\n");
    }
    return sb.toString();
  }
  
  public void save(String filename) throws FileNotFoundException, UnsupportedEncodingException{
	  PrintWriter pw = new PrintWriter(filename,"UTF-8");
	  pw.println(toString());
	  pw.close();
  }
}