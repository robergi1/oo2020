import java.util.*;

public class kodune { 
    public static void main(String[] args) 
    {         
        //List näide
        List<Integer> l = new ArrayList<Integer>(); 
        l.add(0, 1); 
        l.add(1, 2);
        //System.out.println(l);
        l.remove(1);
        //System.out.println(l);
        System.out.println(l.get(0)); 
        
        //Set näide
        Set<String> l1 = new HashSet<String>(); 
        l1.add("kell"); 
        l1.add("uks"); 
        l1.add("sein"); 
        l1.add("uks"); 
        l1.add("sein"); 
        System.out.println(l1);

        //Map näide
        HashMap<String, String> carMarks = new HashMap<String, String>();
        carMarks.put("z3", "Bmw");
        carMarks.put("a5", "Audi");
        carMarks.put("v60", "Volvo");
        carMarks.put("c4", "Citroen");
        //System.out.println(carMarks);
        System.out.println(carMarks.get("v60"));
    } 
} 