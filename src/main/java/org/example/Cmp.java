package org.example;

import java.util.Comparator;

public class Cmp implements Comparator<Interval> {

        @Override
        public int compare(Interval i1, Interval i2) {
            if(i1.b == i2.b)
                return i1.a - i2.b;
            return i1.a - i2.a;
        }
    }
