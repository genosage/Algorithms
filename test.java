test.java
import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    while (scan.hasNext()) {
      int i = scan.nextInt();
      if (map.containsKey(i)) {
        int j = map.get(i);
        map.put(i, j+1);
      } else {
        map.put(i, 1);
      }
    }
    
    for (obj in map) {
      System.out.println("%d(%d)", obj.key, obj.value);
    }
  }
}

import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Set<String> set = new HashSet<String>();
    
    for (int i = scan.nextInt(); i > 0; i--) {
      String str = scan.next();
      set.put(str);
    }
    
    for (int i = scan.nextInt(); i > 0; i--) {
      String command = scan.next();
      String str = scan.next();
      
      if (command.equals("query")) {
        int j = 0;
        for (String s in set) {
          if (s.hasPrefix(str)) j++;
        }
        System.out.println(j);
      } else if (command.equals("insert")) {
        if (set.contains(str)) {
          System.out.println("0");
        } else {
          set.put(str);
          System.out.println("1");
        }
      }
    }
    
  }
}