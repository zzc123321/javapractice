package com.hadoop.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HadoopWriteFile {
   //д��һ��helloworld�ļ�����hadoop·����
   public static void main(String[] args) { 
          try {
                    Configuration conf = new Configuration(); 
                    conf.addResource("core-site.xml");
                    conf.addResource("hdfs-site.xml");
//                    conf.set("fs.defaultFS","hdfs://104.194.85.76:9000");
//                    conf.set("fs.hdfs.impl","org.apache.hadoop.hdfs.DistributedFileSystem");
                    FileSystem fs = FileSystem.get(conf);
                    byte[] buff = "Hello world".getBytes(); // Ҫд�������
                    String filename = "test"; //Ҫд����ļ���
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
