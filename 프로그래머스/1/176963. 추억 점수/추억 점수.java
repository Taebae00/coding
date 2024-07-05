import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        var nameMap = new HashMap<String, Integer>();
        for(int i=0; i<name.length; i++){
            nameMap.put(name[i], yearning[i]);
        }
        //sadsad
        int i = 0;
        for(String[] strArr : photo){
            int total = 0;
            for(String str : strArr){
                if(nameMap.containsKey(str)){
                    total += nameMap.get(str);
                }
            }
            answer[i] = total;
            i++;
        }
        
        return answer;
    }
}