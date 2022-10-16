import java.util.*;
class Solution {
    public double average(int[] salary) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (int i = 0; i <salary.length; i++) 
            list.add(salary[i]);
        double avg=0;
        double sum=0;
        Collections.sort(list);
        for(int i=1;i<list.size()-1;i++)
        {
                sum+=list.get(i);
        }
        avg=sum/(list.size()-2);
        return avg;
        }
}
