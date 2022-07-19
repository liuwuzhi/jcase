package com.zcloud.jcase.patterns.behavioral.Iterator;

public class IteratorPatternDemo {

    public static void run() {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}