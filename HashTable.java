import java.util.ArrayList;
import java.util.HashMap;

import java.util.Iterator;


class HashTableSet implements WordSet
{
	
	private HashMap<String,Word> base;
	
	public HashTableSet()
	{
		base = new HashMap<String,Word>();
	}
	
	public Word get(Word word){
	
		boolean esta = base.containsKey(word.getWord());
		if(!esta) return null;
		return base.get(word.getWord());
		
	}
	
	public void add(Word wordObject)
	{
		base.putIfAbsent(wordObject.getWord(), wordObject);
		
	}
}

