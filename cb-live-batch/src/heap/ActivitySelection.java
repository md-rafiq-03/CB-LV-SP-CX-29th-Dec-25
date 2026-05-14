package heap;

import java.util.ArrayList;
import java.util.List;

public class ActivitySelection {

    class Pair{
        public int first;
        public int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public int activitySelection(int[] start, int[] finish) {
        int n= start.length;
        if(n==0)
            return 0;
        List<Pair> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Pair(start[i], finish[i]));
        }

        list.sort((a, b)-> a.second - b.second);
        int cnt = 1;
        int endTime = list.get(0).second;
        for(int i=1;i<n;i++){
            if(list.get(i).first>endTime){
                cnt++;
                endTime = list.get(i).second;
            }
        }

        return cnt;
    }
}
