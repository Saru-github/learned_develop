package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {

	public static void main(String[] args) {

		try {
			
			byte[] buf = new byte[1024];
			
			int readLen = 0;
			int copyByte = 0;
			
			InputStream in = new FileInputStream("Fonts.zip");
			OutputStream out = new FileOutputStream("CopyBuffer.zip");
			
			
			while(true) {
				readLen = in.read(buf);
				if(readLen == -1) {
					break;
				}
				
				out.write(buf, 0, readLen);
				copyByte += readLen;
				
			}
			
			in.close();
			out.close();
			
			System.out.println("복사된 바이트 크기(버퍼): "+copyByte);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}


