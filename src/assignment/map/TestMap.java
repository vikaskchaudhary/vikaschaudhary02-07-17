package assignment.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap extends Thread{
	
	public void run()
	{
		CustomMapImpl<String, Integer> map = new CustomMapImpl<String, Integer>();
       /* map.put("Lars", 1);
        map.put("Lars", 2);
        map.put("Lars", 1);*/
        //assertEquals(map.get("Lars"), 1);

        for (int i = 0; i < 20; i++) {
            map.put(String.valueOf(i), i);
        }
        
        //System.out.println(map.get("Lars"));
        for(int i=0;i<map.size();i++)
        {
        	System.out.println(map.get(""+i));
        }
	}
	
	public static void testStandardMap() {
        // Standard Map
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Lars", 1);
        map.put("Lars", 2);
        map.put("Lars", 1);
        //assertEquals(map.get("Lars"), 1);

        for (int i = 0; i < 100; i++) {
            map.put(String.valueOf(i), i);
        }
        //assertEquals(map.size(), 101);

        //assertEquals(map.get("51"), 51);
        map.keySet();
    }

    
    public void testMapMap() {

        // MyMap
        CustomMapImpl<String, Integer> map = new CustomMapImpl<String, Integer>();
        map.put("Lars", 1);
        map.put("Lars", 2);
        map.put("Lars", 1);
       // assertEquals(map.get("Lars"), 1);
        for (int i = 0; i < 100; i++) {
            map.put(String.valueOf(i), i);
        }
       // assertEquals(map.size(), 101);
        //assertEquals(map.get("51"), 51);

    }


	public static void main(String[] args) {
		// TODO Auto-generated method
		TestMap tm= new TestMap();
		Thread tp= new Thread(new TestMap());
		tm.start();
		tp.start();
	}

}
