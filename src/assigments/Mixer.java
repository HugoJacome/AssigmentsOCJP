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
public class Mixer {
	 Mixer() { 
		 
	 }
	 Mixer(Mixer m) { 
		 m1 = m; 
	 }
	 Mixer m1;
	 public static void main(String[] args) {
		 Mixer m2 = new Mixer();
		 Mixer m3 = new Mixer(m2); 
		 m3.go();
		 Mixer m4 = m3.m1; 
		 m4.go();
		 Mixer m5 = m2.m1; 
		 m5.go();
	 }
	 void go() { 
		 System.out.print("hi "); 
	 }
}
