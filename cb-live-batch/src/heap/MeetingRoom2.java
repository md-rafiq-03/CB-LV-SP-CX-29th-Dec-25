package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MeetingRoom2 {
    class Pair{
        public int first;
        public int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public int minMeetingRooms(int[] start, int[] end) {
        int n= start.length;
        List<Pair> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Pair(start[i], end[i]));
        }

        Collections.sort(list,(a, b) ->{
            if(a.first==b.first){
                return a.second - b.second;
            }
            return a.first-b.first;
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int cnt = 1;
        pq.add(list.get(0).second);
        for(int i=1;i<n;i++){
            while(!pq.isEmpty() && pq.peek() <= list.get(i).first){
                pq.poll();
            }
            pq.add(list.get(i).second);
            cnt = Math.max(cnt, pq.size());
        }
        return cnt;
    }
}
