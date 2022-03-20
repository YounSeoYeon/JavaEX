package sync;

import java.util.ArrayList;
import java.util.List;

public class Storage {
   private List<Integer> list;
   private Object listlock;
   
   public Storage() {   
      list = new ArrayList<>();
      listlock = new Object();
      
      for(int i=0; i<100; i++)
         list.add(i+1);
   }
   
   public void print() {
      Thread currentThread = Thread.currentThread();
      String thName = currentThread.getName();
      
      synchronized (listlock) {
      int size = list.size();
      System.out.printf("%s - size : %d\n", thName, size);
      for(int i=0; i<size; i++) 
         System.out.printf("%s - %d:%d\n", thName,  i+1, list.get(i));   
      }
   }
   public void delete(int index) {
	   synchronized (listlock) {
	   list.remove(index);
	  }
   }
}