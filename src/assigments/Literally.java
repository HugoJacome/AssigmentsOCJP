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
public class Literally {
 public static void main(String[] args) {
 int i1 = 1_000; // line A
 int i2 = 10_00; // line B
 int i3 = _10_000; // line C				
 int i4 = 0b101010; // line D
 int i5 = 0B10_1010; // line E
 int i6 = 0x2_a; // line F
 }
}

//line C will NOT compile. As of Java 7, 
//underscores can be included in numeric literals, 
//but not at the beginning or the end.
