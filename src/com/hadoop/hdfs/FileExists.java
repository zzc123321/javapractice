package com.hadoop.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class FileExists {
	 public static void main(String[] args) {
             try {
                     String filename = "test";
                     Configuration conf = new Configuration();
                     conf.set("fs.defaultFS","hdfs://104.194.85.76:9000");
                     conf.set("fs.hdfs.impl","org.apache.hadoop.hdfs.DistributedFileSystem");
                     FileSystem fs = FileSystem.get(conf);
                     if(fs.exists(new Path(filename))){
                             System.out.println("文件存在");
                     }else{
                           System.out.println("文件不存在");
                     }
                     fs.close();
         } catch (Exception e) {
                 e.printStackTrace();
         }
 }

}
