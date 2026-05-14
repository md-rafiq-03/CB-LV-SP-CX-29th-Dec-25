package heap;

import java.util.*;

public class MeetingRoom3 {
    class Pair{
        public long endTime; // endtime
        public int roomNo; // room number
        public Pair(long first, int second){
            this.endTime = first;
            this.roomNo = second;
        }
    }

    public int mostBooked(int n, int[][] meetings) {
        // primitive type arrays => Arrays.sort(..)
        // Non primitve => Collections.sort(...)

        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        Arrays.sort(meetings, (a, b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        int[] cnt = new int[n];
        PriorityQueue<Integer> available = new PriorityQueue<>();
        PriorityQueue<Pair> allocated = new PriorityQueue<>((a,b) ->{
            return a.endTime > b.endTime ? 1 : ((a.endTime==b.endTime)? a.roomNo-b.roomNo: -1);
        });

        for(int i=0;i<n;i++){
            available.add(i);
        }

        allocated.add(new Pair(meetings[0][1], available.poll()));
        cnt[0]+=1;
        for(int i=1;i<meetings.length;i++){
            while(!allocated.isEmpty() && allocated.peek().endTime <= meetings[i][0]){
                Pair toFree = allocated.poll();
                available.add(toFree.roomNo);
            }

            if(!available.isEmpty()){
                System.out.println("Room is ");
                int roomNo = available.poll();
                allocated.add(new Pair(meetings[i][1], roomNo));
                cnt[roomNo]++;
            }else{
                Pair next =  allocated.poll();
                long endTime = next.endTime +  (meetings[i][1]-meetings[i][0]);
                int roomNo = next.roomNo;
                cnt[roomNo]++;
                allocated.add(new Pair(endTime, roomNo));
            }
        }


        int room = 0;
        int maxi = 0;
        for(int i=0;i<n;i++){
            System.out.print(cnt[i] + ", ");
            if(cnt[i]>maxi){
                maxi = cnt[i];
                room = i;
            }
        }
        return room;

    }
}
