package com.nio.test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelectorTest {
	public static void selectorTest(){
		SocketChannel channel;
		try {
			channel = SocketChannel.open();
		
		channel.connect(new InetSocketAddress("192.168.1.1", 80));
		channel.configureBlocking(false);

		Selector selector = Selector.open();  
		SelectionKey key = channel.register(selector, SelectionKey.OP_READ);  
		while(true) {  
		  int readyChannels = selector.select();  
		  if(readyChannels == 0) continue;  
		  Set<SelectionKey> selectedKeys = selector.selectedKeys();  
		  Iterator<SelectionKey> keyIterator = selectedKeys.iterator();  
		  while(keyIterator.hasNext()) {  
		     key = (SelectionKey) keyIterator.next();  
		    if(key.isAcceptable()) {  
		        // a connection was accepted by a ServerSocketChannel.  
		    } else if (key.isConnectable()) {  
		        // a connection was established with a remote server.  
		    } else if (key.isReadable()) {  
		        // a channel is ready for reading  
		    } else if (key.isWritable()) {  
		        // a channel is ready for writing  
		    }  
//		    keyIterator.<tuihighlight class="tuihighlight"><a href="javascript:;" style="display:inline;float:none;position:inherit;cursor:pointer;color:#7962D5;text-decoration:underline;" onclick="return false;">remove</a></tuihighlight>();  
		  }  
		}  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectorTest();
	}

}
