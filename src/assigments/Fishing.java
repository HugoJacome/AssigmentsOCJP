/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigments;

/**
 *
 * @author hjacome
 */
public class Fishing {
 byte b1 = 4;
 int i1 = 123456;
 long L1 = (long)i1; // line A
 short s2 = (short)i1; // line B
 byte b2 = (byte)i1; // line C
 int i2 = (int)123.456; // line D
 byte b3 = b1 + 7; // line E 
}

//compilation of line E fails. 
//When a mathematical operation is performed on any primitives smaller than ints, 
//the result is automatically cast to an integer.
