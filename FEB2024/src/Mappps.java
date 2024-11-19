import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//map is part of collection but not part of interface collection
public class Mappps {
    public static void main(String[] args) {
        Map<Integer,String>  mp=new HashMap<Integer,String>();
        mp.put(100,"praha");
        mp.put(101,"akki");
        mp.put(102,"akshaya");
        for(Map.Entry e: mp.entrySet()){
            System.out.println(e.getKey() + " "+e.getValue());
        }

    }
}
//map contains unique keys ,which are useful to search,update or delete elements.
// clear() - to clear all ele
//entryset() - to print all elements of map
//containsKey(obj)
//equals(obj)
//put(value,key) - same as add ,putAll(map)
//size()
//remove(key)
//getorDefault(key,defaultvalue)