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
public class BMITest {
    
    
    @Test
    public void TestCase1(){
        assertEquals(BMI.getBMI(1.65, 50),"Thieu Can");
    }
    
    @Test
    public void TestCase2(){
        assertEquals(BMI.getBMI(1.70, 41),"Thieu Can");
    }
    
    @Test
    public void TestCase3(){
        assertEquals(BMI.getBMI(1.65, 90),"Beo Phi");
    }
    
    @Test
    public void TestCase4(){
        assertEquals(BMI.getBMI(1.65, 70),"Beo Phi");
    }
    @Test
    public void TestCase5(){
        assertEquals(BMI.getBMI(1.65, 65),"Thua Can");
    }
}
