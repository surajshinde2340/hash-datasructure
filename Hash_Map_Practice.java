import java.util.*;
public class Hash_Map_Practice{

    public static void main(String[] args) {

HashSet<Integer> hs = new HashSet<>(); 
for(int i= 1; i<=10; i++){
    hs.add(i*10); 
}
System.out.println(hs.contains(20));
hs.remove(20);
System.out.println(hs.contains(20));



Iterator sp = hs.iterator();
while (sp.hasNext()) {
    System.out.println(sp.next()+"  " +sp.hasNext()+" " +sp.hashCode());
}







       HashMap<Integer, Character> hm = new HashMap<>();
int i = 0;
       while(i<26){
        hm.put(1+i,(char)(i+97));
        i++;
       }
       hm.put(33, 'y');
       hm.put(36, 'h');

Set<Integer> spp = hm.keySet();
for(Integer s : spp){
    System.out.println("\t" +hm.get(s));
}
// System.out.println(hm.keySet());
System.out.println(hm.entrySet());



    }
}