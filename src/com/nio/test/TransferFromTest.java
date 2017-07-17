package com.nio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TransferFromTest {
	public static void transferFrom() throws FileNotFoundException{
		try {
			RandomAccessFile fromFile=new RandomAccessFile("data/nio-data.txt", "rw");
			
			RandomAccessFile toFile=new RandomAccessFile("data/to-data.txt", "rw");
			File file=new File("data/to-data.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			FileChannel fromChannel=fromFile.getChannel();
			FileChannel toChannel=toFile.getChannel();
			long position=0;
			long count=fromChannel.size();
			toChannel.transferFrom(fromChannel, position, count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void channelWrite(){
		try {
			RandomAccessFile fromFile1=new RandomAccessFile("data/nio-data.txt", "rw");
			RandomAccessFile fromFile2=new RandomAccessFile("data/to-data.txt", "rw");
			FileChannel fromChannel=fromFile1.getChannel();
			FileChannel fromChannel2=fromFile2.getChannel();
			ByteBuffer buf1 = ByteBuffer.allocate(48);
			ByteBuffer buf2 = ByteBuffer.allocate(48);
			ByteBuffer[] bufferArray = { buf1, buf2 };  
			fromChannel.read(buf1);
			fromChannel2.read(buf2);
			FileChannel toChannel=null;
			toChannel.write(bufferArray);
			ByteBuffer finalBuffer = ByteBuffer.allocate(48);

			toChannel.read(finalBuffer);
			File file=new File("data/fix-data.txt");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			transferFrom();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
