package exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataFilterStram {

	public static void main(String[] args) {

		try {
			OutputStream out = new FileOutputStream("data.bin");
			DataOutputStream filterOut = new DataOutputStream(out);
			
			// out.write(365);
			// out.close();
			
			filterOut.writeInt(365);
			filterOut.close();
			
			InputStream in = new FileInputStream("data.bin");
			DataInputStream filterIn = new DataInputStream(in);
			
			System.out.println(in.read());
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
