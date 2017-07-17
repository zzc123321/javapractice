package com.hadoop.hdfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HadoopReadFile {
	 public static void main(String[] args) {
         try {
                 Configuration conf = new Configuration();
                 conf.set("fs.defaultFS","hdfs://104.194.85.76:9000");
                 conf.set("fs.hdfs.impl","org.apache.hadoop.hdfs.DistributedFileSystem");
                 FileSystem fs = FileSystem.get(conf);
                 Path file = new Path("test"); 
                 FSDataInputStream getIt = fs.open(file);
                 BufferedReader d = new BufferedReader(new InputStreamReader(getIt));
                 String content = d.readLine(); //��ȡ�ļ�һ��
                 System.out.println(content);
                 d.close(); //�ر��ļ�
                 fs.close(); //�ر�hdfs
         } catch (Exception e) {
                 e.printStackTrace();
         }
 }

}
