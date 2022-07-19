package org.zcloud.jcase.algorithm.calendar;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarTwo {

    private List calendar = new ArrayList<int[]>();

    public MyCalendarTwo() {

    }

    public boolean book(int start, int end) {
        int[] ints = new int[2];
        ints[0]=start;
        calendar.add(new int[2]{start, end});
    }

    public static void main(String[] args) {
        MyCalendarTwo obj = new MyCalendarTwo();
        obj.book(10, 20);
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */