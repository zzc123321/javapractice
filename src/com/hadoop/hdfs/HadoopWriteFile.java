package com.hadoop.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HadoopWriteFile {
   //写入一个helloworld文件放入hadoop路径下
   public static void main(String[] args) { 
          try {
                    Configuration conf = new Configuration(); 
                    conf.addResource("core-site.xml");
                    conf.addResource("hdfs-site.xml");
//                    conf.set("fs.defaultFS","hdfs://104.194.85.76:9000");
//                    conf.set("fs.hdfs.impl","org.apache.hadoop.hdfs.DistributedFileSystem");
                    FileSystem fs = FileSystem.get(conf);
                    byte[] buff = "Hello world".getBytes(); // 要写入的内容
                    String filename = "test"; //要写入的文件名
                    FSDataOutputStream os = fs.create(new Path(filename));
                    os.write(buff,0,buff.length);
                    System.out.println("Create:"+ filename);
                    os.close();
                    fs.close();
            } catch (Exception e) {  
                    e.printStackTrace();  
            }  
    }  
		

}
