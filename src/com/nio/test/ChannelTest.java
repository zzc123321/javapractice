package com.nio.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelTest {
	public static void bufferRead() throws FileNotFoundException {
		RandomAccessFile aFile = new RandomAccessFile("data/nio-data.txt", "rw");
		FileChannel inChannel = aFile.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(48);

		int bytesRead = 0;
		try {
			bytesRead = inChannel.read(buf);

			while (bytesRead != -1) {

				System.out.println("Read " + bytesRead);
				
				buf.flip();
//				buf.mark();//标记点
				while (buf.hasRemaining()) {
					System.out.print((char) buf.get());
					//返回标记点测试
//					if(buf.hasRemaining()==false){
//						buf.rewind();
//					}
					
				}

				buf.clear();
				bytesRead = inChannel.read(buf);
			}
			aFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			bufferRead();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
