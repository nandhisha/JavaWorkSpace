import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		StudentBeans s = new StudentBeans();
		s.setEmail("TestName");
		s.setName("TestEmail");
		
		File f = new File("/home/raja/beantest");
		
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(f));
		obj.writeObject(s);
		System.out.println("Object Wirte Done");
		ObjectInputStream objin = new ObjectInputStream(new FileInputStream(f));
		
		StudentBeans ll = (StudentBeans) objin.readObject();
		System.out.println("Object Read Done");
		System.out.println(ll.email);
		System.out.println(ll.name);
	}

}
