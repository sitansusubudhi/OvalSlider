/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class JavaApplication1 {
    public static void main (String args[]) {
        String[] words = {"abc","abcdefa","lol"};
        String[] words2 = {"lola"};
        int[] nos = {1,2,3,45};
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        int i = 0;
        for(String w : words) {
            if (i++ > 0) {
                sb.append(", ");
            }
            sb.append(w);
        }
        
        for(String w : words) {
            list.add(w);
        }
        for(String w : words2) {
            list2.add(w);
        }
        list.addAll(list2);
        list2 = null;
        System.out.println(list);
        removeItems(list,1,3);
        System.out.println(list);
        words = list.toArray(new String[list.size()]);
        System.out.println(String.join(" ", words));
        Queue<String> q = new PriorityQueue<String>();
        q.offer("1st");
        q.offer("2nd");
        q.offer("3rd");
        q.poll();
        System.out.println(q.peek());
    }

    private static void removeItems(List<String> list, int from, int to) {
        list.subList(from, to).clear();
        
    }
    
    

    
}  
 
    

