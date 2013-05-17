package aula20;

import java.awt.BufferCapabilities;
import java.util.LinkedList;
import java.util.List;

public class Produto {
	private List<String> msgs= new LinkedList<String>();
	public void addMsg(String msg){
		msgs.add(msg);
	}
	
	public String processarMsg(){
		if (msgs.size()>0){
			return msgs.remove(0);
		}
		return null;
	}
	
}
