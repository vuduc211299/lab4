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
public class findMinInArrayTest {
    
   @Test
   public void TestCase1(){
       int arr [] = {1,32,5,5,-1,-9,0};
       assertEquals(findMinInArray.findMin(arr),-9);
   }
   
   @Test
   public void TestCase2(){
       int arr [] = {1,32,5,5,-1,-10,0};
       assertEquals(findMinInArray.findMin(arr),-10);
   }
   
   @Test
   public void TestCase3(){
       int arr [] = {1,32,5,5,-1,7,0};
       assertEquals(findMinInArray.findMin(arr),-1);
   }
   
   @Test
   public void TestCase4(){
       int arr [] = {1,32,5,5,-1,0,0};
       assertEquals(findMinInArray.findMin(arr),-1);
   }
   
   @Test
   public void TestCase5(){
       int arr [] = {1,32,5,5,-78,-9,0};
       assertEquals(findMinInArray.findMin(arr),-78);
   }
   
}
