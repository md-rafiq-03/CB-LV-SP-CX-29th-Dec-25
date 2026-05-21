package mapandset;

import java.util.*;

public class GroupAnagrams {
    class Solution {

        private String getSortedString(String input){
            char[] charArray = input.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }

        String getKey(String input){
            int[] freq = new int[26];
            for(int i=0;i<input.length();i++){
                freq[input.charAt(i)-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(freq[i]).append('#');
            }

            return sb.toString();
        }

        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for(String e : strs){
                map.computeIfAbsent(getKey(e), x -> new ArrayList<>()).add(e);
//                String temp = getSortedString(e);
                //
//                if(!map.containsKey(key)){
//                    map.put(key , new ArrayList<>());
//                }
//
//                map.get(key).add(e);



                // compute
//                map.compute(temp, (key, value) ->{
//                    System.out.println(key);
//                    // key==temp
//                    if(value==null){
//                        value = new ArrayList<>();
//                    }
//                    value.add(e);
//                    return value;
//                });
                // computeIfAbsent

               // map.computeIfAbsent(temp, x -> new ArrayList<>()).add(e);

            }
            List<List<String>> result = new ArrayList<>();
            for(Map.Entry<String, List<String>> entry : map.entrySet()){
                result.add(entry.getValue());
            }

            return  result;
        }
    }
}
