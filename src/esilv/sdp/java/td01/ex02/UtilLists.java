package esilv.sdp.java.td01.ex02;


import java.util.List;

public class UtilLists {

    public static int getmax(List<Integer> list){
        int max = Integer.MIN_VALUE;
        for (int i: list){
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static void sort(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {

            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) > list.get(j)) {

                    int tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }
            }
        }
    }

}
