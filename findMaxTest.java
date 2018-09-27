/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VŨ ĐỨC
 */
public class findMaxTest {
    @Test
    public void testcase1(){
        assertEquals(findMax.findMax(1, 2),2);
    }
    
    @Test
    public void testcase2(){
        assertEquals(findMax.findMax(-3, 4),4);
    }
    
    @Test
    public void testcase3(){
        assertEquals(findMax.findMax(5, 2),5);
    }
    
    @Test
    public void testcase4(){
        assertEquals(findMax.findMax(4, 2),4);
    }
    
    @Test
    public void testcase5(){
        assertEquals(findMax.findMax(100, 200),200);
    }
}
