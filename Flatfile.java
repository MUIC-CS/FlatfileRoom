import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Flatfile {
	public static void main(String[] arg) throws FileNotFoundException, UnsupportedEncodingException{
//		Room r = new Room("1409");
//		r.addStudent("Karn");
//		r.addStudent("Sea");
//		r.addStudent("Ice");
//		//System.out.println(r.toString());
//		r.save("hello.txt");
		Room r = Room.load("hello.txt");
		System.out.println(r.getName());
	}
}
