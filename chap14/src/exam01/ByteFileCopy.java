package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy {

	public static void main(String[] args) {

		try {
			InputStream in = new FileInputStream("Fonts.zip");
			OutputStream out = new FileOutputStream("Copy.zip");
			
			int copyByte = 0;
			while(true) {
				int bData = in.read();
				if(bData == -1) {
					break;
				}
				
				out.write(bData);
				copyByte++;
			}
			
			in.close();
			out.close();
			
			System.out.println("복사된 바이트 크기: "+copyByte);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
