import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(hm.get(i)==null){
                hm.put(i,1);
            }
            else{
                hm.put(i,hm.get(i)+1);
            }
        }
        for(Map.Entry<Integer, Integer> i: hm.entrySet()){
            if(i.getValue()>1){
                list.add(i.getKey());
            }
        }
        return list;
    }
}
