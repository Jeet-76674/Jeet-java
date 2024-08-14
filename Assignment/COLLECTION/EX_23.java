package COLLECTION;

import java.util.HashMap;
import java.util.Map;

/*Write a Java program to check whether a map contains key-value mappings (empty) 
or not.*/
public class EX_23 
{
    public static void main(String[] args)
    {


        Map map = new HashMap();

        
        map.put("Apple", "Fruit");
        map.put("Carrot", "Vegetable");
        map.put("Banana", "Fruit");

        
        if (map.isEmpty()) 
        {
            System.out.println("The map is empty.");
        } else 
        {
            System.out.println("The map is not empty.");
        }

        // Clearing the map to test the empty condition
        map.clear();

       
        if (map.isEmpty()) {
            System.out.println("The map is empty after clearing.");
        } else {
            System.out.println("The map is not empty after clearing.");
        }
    }
}