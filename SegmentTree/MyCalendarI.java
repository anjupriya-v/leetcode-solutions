import java.util.*;
class MyCalendar {
TreeMap<Integer,Integer> tmp=null;
    public MyCalendar() {
       tmp =new TreeMap<Integer,Integer>();
    }
    
    public boolean book(int start, int end) {
        if(tmp.floorEntry(start)!= null && start<tmp.floorEntry(start).getValue() )           {
            return false;
        }
        if(tmp.ceilingEntry(start)!= null && end>tmp.ceilingEntry(start).getKey()){
            return false;
        }
        tmp.put(start,end);
        return true;
    }
    
}
