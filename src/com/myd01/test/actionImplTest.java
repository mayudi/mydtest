package com.myd01.test;

import com.myd01.actionImpl;
import junit.framework.TestCase;

public class actionImplTest {
    @org.junit.Test
    public void add() {
        TestCase.assertEquals(new actionImpl().add(1,1),2);
    }
}
