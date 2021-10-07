package EasyTest;

import java.util.*;

public class Test14 {
    public static void main(String[] args) {
        HashMap<String, List<String>> provinceMap = new HashMap<>();
        provinceMap.put("浙江省", Arrays.asList("绍兴市","温州市","湖川市","嘉兴市","台州市","金华市","舟山市","衡州市","丽水市"));
        ArrayList<String> list = new ArrayList<String>();
        list.add("海口市");
        list.add("三亚市");
        provinceMap.put("海南省",list);
        provinceMap.put("北京市",Arrays.asList("北京市"));

        Set<String> keySet = provinceMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String nowKey = iterator.next();
            System.out.print(nowKey+"包括:");
            List<String> nowList = provinceMap.get(nowKey);
            for(String str:nowList){
                System.out.print(str+" ");
            }
            System.out.println();
        }
    }
}
