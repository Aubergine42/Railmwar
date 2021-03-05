package esilv.sdp.java.td01.ex02;

import java.util.List;

public class Element implements Comparable<Element> {
    private String name;

    public Element(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public static void sort(List<Element> list){
        for (int i = 0; i < list.size(); i++) {

            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i).compareTo(list.get(j)) > 0) {

                    Element tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }
            }
        }
    }

    @Override
    public int compareTo(Element element) {
        int result = this.name.compareToIgnoreCase(element.name);
        if(result != 0)
            return result;
        return 1;
    }
}