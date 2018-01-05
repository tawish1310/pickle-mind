package com.prep.interview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/**
 * Asked in Expedia 
 */
import java.util.Set;

public class GroupStringAnagrams {
    
    public static void main(String[] args){
        GroupStringAnagrams ga= new GroupStringAnagrams();
        String[] str={"rat","tar","abc","art"};
        //ga.getAnagarams(str);
        ga.getAnagramsList(Arrays.asList(str));
       
    }
    /**
     * adds all the elements since the comparison of the string with itself will cause the if() to be true
     * @param args
     * @return
     */
   public Set<String> getAnagarams(String[]args){
         Set<String> result= new LinkedHashSet<String>();// LinkedHashSet: preserves the insertion order 
         
         for(int i=0;i<args.length;i++){
             char tempArray1[]=args[i].toCharArray();
             Arrays.sort(tempArray1);
             result.add(args[i]);
         for(int j=1;j<args.length;j++){
          {
             char tempArray2[] = args[j].toCharArray();
             Arrays.sort(tempArray2);
             String s1=new String(tempArray1);
             String s2=new String(tempArray2);

             if(s1.equals(s2) && args[i]==args[j]){
                 System.out.println("equals");
                 result.add(args[j]); 
                
             }
             
          }
        

}
         }
         System.out.println(result.size());
         return result;
   }
   /**n->length of the Strlist
    * k->length of each string in the list
    * use a hashMap: 0(nklog(k))
    * @param strList
    * @return
    */
  
   
   public ArrayList<String> getAnagramsList(List<String> strList){
     
       HashMap<String,List<String>> map= new HashMap<String,List<String>>();
       for(String s:strList){
           char[] charArr= s.toCharArray();
           //hint here : sort the string and kkeep it a key
           Arrays.sort(charArr);
          String sortedString = new String(charArr);
          if(!map.containsKey(sortedString))
              map.put(sortedString, new ArrayList()); //Initialize the list if the sortedString (Key) is not present
               map.get(sortedString).add(s);//otherwise get the key and add the value in the list
           }
       
       for(Map.Entry<String, List<String>> entry:map.entrySet())
       System.out.println(entry.getValue());
       return new ArrayList(map.values());
   }

   
}