package com.wangkaili;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class learing {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("hello");
        collection.add("java");
        collection.add("wkl");
        collection.add("lss");
        collection.add("wjy");
        collection.add("zzy");
//        System.out.println(collection);

//        collection.clear();

//        System.out.println(collection);

        // 迭代器
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("--------------");

        // 增强for循环
        for (String col: collection){
            System.out.println(col);
        }


    }
}
