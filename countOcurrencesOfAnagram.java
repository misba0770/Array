
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class countOcurrencesOfAnagram {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String pat=s.next();
        System.out.print(findOcuurencesOfAnagram(str,pat));
    }

    private static int findOcuurencesOfAnagram(String str, String pat) {
        if(str==null||str.length()==0||pat.length()>str.length())return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<pat.length();i++){
            char ch=pat.charAt(i);
            if(!map.containsKey(ch))map.put(ch,0);
            map.put(ch,map.get(ch)+1);
        }
        int i=0;int j=0; int occurences=0;int k=pat.length();int res=0;
        while(j<str.length()){
            char current=str.charAt(j);
            if(map.containsKey(current)){
                map.put(current, map.get(current)-1);
                if(map.get(current)==0)occurences++;
            }
            if(j-i+1<k)j++;
            else if(j-i+1==k){
                if(occurences==map.size())res++;
                char ch=str.charAt(i);
                if(map.containsKey(ch)){
                    if(map.get(ch)==0)occurences--;
                    map.put(ch,map.get(ch)+1);
                }
                i++;j++;
            }
        }
        return (res);
    }
    
}
