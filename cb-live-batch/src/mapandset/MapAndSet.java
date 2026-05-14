package mapandset;


import java.util.*;

public class MapAndSet {
    public static void main(String[] args) {
        //sets();
        maps();
    }

    private static void maps(){
        // Map.of(..) => Immutable map
        Map<Integer, String> mapWithDefaultData = Map.of(10, "v1", 11, "v2");
        List<Integer> list = List.of(10,12,13);
        Set<Integer> set = Set.of(10,12, 14);
        //mapWithDefaultData.put(12, "V3");
        // Roll NUmber , Name
        Map<Integer, String> hashMap = new LinkedHashMap<>();
        hashMap.put(11, "Alice");
        hashMap.put(12, "Bob");
        hashMap.put(16, "John");

        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());

        // if any key present or not
        System.out.println(hashMap.containsKey(11));
        System.out.println(hashMap.containsValue("Alice"));

        //get
        System.out.println(hashMap.get(11));
        System.out.println(hashMap.getOrDefault(17, "UNKNOWN"));

        System.out.println(hashMap.put(11, "Raj"));
        System.out.println(hashMap.get(11));

        hashMap.putIfAbsent(11, "value");
        System.out.println("putIfAbsent : " + hashMap.get(11));

        // remove
        System.out.println(hashMap.remove(16));
        System.out.println(hashMap.containsKey(16));

        //
        hashMap.putAll(Map.of(10, "v1", 11, "v2"));
        System.out.println(hashMap.containsKey(11));
        System.out.println(hashMap.get(11));

        //
        //hashMap.clear();

       // to all keys or all the values only
       Set<Integer> keySet =  hashMap.keySet();
       System.out.println(keySet);

       Collection<String> values = hashMap.values();
        System.out.println(values);
//        for(String v : values){
//            System.out.print(v + ", ");
//        }

        // print all the key, value pairs
        for(int key : keySet){
            System.out.println(key + ":" + hashMap.getOrDefault(key, "UNKNOW"));
        }

        Set<Map.Entry<Integer, String >> entrySet = hashMap.entrySet();
        System.out.println(entrySet);
        for(Map.Entry<Integer, String> entry : entrySet){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(101, "Raju");
        treeMap.put(99, "Sachine");
        treeMap.put(7, "thala");
        System.out.println(treeMap.lowerEntry(99));
        System.out.println(treeMap.lowerKey(99));

        System.out.println(treeMap.floorEntry(99));

        System.out.println(treeMap.higherEntry(99));
        System.out.println(treeMap.ceilingEntry(99));

        System.out.println(treeMap.subMap(7,true, 99, true));


    }














    private static void sets(){
        Set<Integer> set = new HashSet<>(100, 0.8f); // default cap = 16
        HashSet<Integer> hashSet = new HashSet<>();

        Set<Integer> set2 = new HashSet<>(List.of(10,20,30));

        // add  {12, 15, 20, 10}
        set.add(12);
        set.add(15);
        set.add(20);
        set.add(10);

        // to check if elemnt is present or not
        System.out.println(set.contains(20)); // true
        System.out.println(set.contains(30));  // false

        //to remove
        System.out.println(set.remove(10));
        System.out.println(set.contains(10));

        for( Integer e : set){
            System.out.print(e + ", ");
        }
        System.out.println();

        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of(10,20,50));
        linkedHashSet.add(100);
        linkedHashSet.remove(20);
        System.out.println(linkedHashSet.contains(20));

        for(int e : linkedHashSet){
            System.out.print(e + ", ");
        }

        //{5, 10, 15, 17}
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(17);
        treeSet.add(15);
        treeSet.add(14);

        System.out.println(treeSet.contains(10));
        //System.out.println(treeSet.remove(10));

        for(int e : treeSet){
            System.out.print(e +", ");
        }
        System.out.println();

        System.out.println("smallest: " + treeSet.first());
        System.out.println("largest: " + treeSet.last());
        System.out.println("largets number strictly less than 15: " + treeSet.lower(15));
        System.out.println("larget number strictly less than or equal to 15: " + treeSet.floor(15));

        System.out.println("first element greater than key - 15 :" + treeSet.higher(15));
        System.out.println("first element greater than or equal to key - 15 :" + treeSet.ceiling(15));

        System.out.println("subset: " + treeSet.subSet(5, true, 15, true));

        treeSet.pollFirst();
        treeSet.pollLast();

        TreeSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.addAll(List.of(10,5, 20));
        System.out.println(treeSet2);
    }
}
