package assignment;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Source {

	public Map<Character, Integer> countChars(char[] charArray)
    {
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();
        for(char character : charArray)
        {
            if(countMap.containsKey(character))
            {
                countMap.put(character,countMap.get(character)+1);
            }
            else
            {
                countMap.put(character, 1);
            }
        }
        return countMap;
    }
    public static void main(String args[])
    {
        Source source = new Source();
        char[] charArray = {'a','f','c','d','a','c'};
     
        Iterator<Character> charIterator = source.countChars(charArray).keySet().iterator();
        while(charIterator.hasNext()){
           char charIt = charIterator.next();
           System.out.print(charIt + "=" + source.countChars(charArray).get(charIt) + " ");
       }
    }
}

	