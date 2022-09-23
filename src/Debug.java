import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Pattern;

public class Debug {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        int val = 0;
        for(String o: operations){
            if(o == "X++"){
                val += 1;
            }
            if(o == "++X"){
                val += 1;
            }
            if(o == "--X"){
                val -= 1;
            }
            if(o == "X--"){
                val -= 1;
            }
        }
        for(int i = 3; i < 6; ++i){
            System.out.println(i);
        }

        for(int i = 3; i < 6; i++){
            System.out.println(i);
        }
        System.out.println(val);
        // System.out.println(subArrayList());
        StringBuffer v = new StringBuffer("http://short.url/");
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Random random = new Random();
        int lengthAfterProcessing = v.length() + 9;
        while(v.length()<lengthAfterProcessing){
            int ascii = random.nextInt(122);
            if((ascii >= 48 && ascii <= 57) || (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
                v.append((char)ascii);
            }
        }
        System.out.println(v);
    }

    public static ArrayList subArrayList(){
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int s = 12;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(map.containsKey(sum - s)){
                list.add(map.get(sum - s) + 1);
                list.add(i + 1);
                return list;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        list.add(-1);
        return list;
    }


}
