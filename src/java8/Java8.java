/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

import java.awt.BorderLayout;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author PC
 */
public class Java8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        List<String> lst= new Vector();
        lst.add("esprit"); 
        lst.add("mohamed"); 
        lst.add("kaies"); 
        
        Collections.sort(lst, (String o1, String o2) -> o1.compareTo(o2));
        System.out.println(lst);
        
        afficher (()-> System.out.println("Bonjour"));
        calculer((int x , int y) -> x+y);
        afficheCalc((x , y)->x+y ,System.out::println);
        
    }
    static void afficher (InterfaceDisplay i)
    {
        i.afficher();
    }
    static int calculer(InterfaceAdd i){
        
        return i.add(3,4);
    }
    static void afficheCalc(InterfaceAdd ia,InterfaceDisplay id)
    {
        ia.add(6,8) ;
        id.afficher();
    }
    
}
