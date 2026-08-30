class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat=0;
        Arrays.sort(people);
        int lp=0, rp=people.length-1;
        while(lp<=rp){
            if(people[lp]+people[rp]<=limit){
                boat++;
                lp++;
                rp--;
            }else{
                boat++;
                rp--;
            }
        }
        return boat;
    }
}