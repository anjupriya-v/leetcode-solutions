class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int trial=(minutesToTest/minutesToDie)+1;
        int total=1,count=0;
        while(total<buckets){
            total*=trial;
            count++;
        }
        return count;
        }
}
