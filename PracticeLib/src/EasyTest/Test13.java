package EasyTest;

import java.util.ArrayList;
import java.util.Iterator;

public class Test13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
           int next = iterator.next();
           if (next==30){
               iterator.remove();
           }
        }

        for(int num:list){
            System.out.println(num);
        }

    }
}
