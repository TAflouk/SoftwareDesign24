// --- IMPORTS ---
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

// ___ CLASSSES ___
public class collection

{

	public static void main(String[] args)
	{
		System.out.println(hashMap_());
		}
	public static List lnklist()
	{
		// --- LINKEDLISTS ---
		List lnklist = new LinkedList();
		lnklist.add("taha");
		lnklist.add("wqewe");
		lnklist.add("wqeweq");
		lnklist.add("sdwq");
		//displayAll(lnklist);
		//displayAll(lnkLst);
		return lnklist;
		}
	public static List ArrayList_1 ()
	{
		ArrayList arrayName = new ArrayList();
		arrayName.add("hey");
		arrayName.add("y");
		arrayName.add("h");
		arrayName.add("ey");
		arrayName.add("hsadey");
		return arrayName;
		}
	public static Set hashset_2()
	{
		Set hashset_ = new HashSet();
		  hashset_.add("set1");
		  hashset_.add("set2");
		  hashset_.add("set3");
		  hashset_.add("set4");
		  return hashset_ ;
		}
	public static Set sortedSet_()
	{
		SortedSet treeSet = new TreeSet();
		treeSet.add("d");
		treeSet.add("f");
		treeSet.add("w");
		treeSet.add("a");
		treeSet.add("n");
		return treeSet;
		}
	public static LinkedHashSet linkedhash_set()
	{
		LinkedHashSet lnkHashSt = new LinkedHashSet();
		lnkHashSt.add("two");
		lnkHashSt.add("one");
		lnkHashSt.add("er");
		lnkHashSt.add("fik");
		lnkHashSt.add("four");
		return lnkHashSt;
		}
	public static HashMap hashMap_()
	{
		HashMap<String, Integer> hashMapEmp = new HashMap<>();
		hashMapEmp.put("jhon",909);
		hashMapEmp.put("jerry",76);
		hashMapEmp.put("nathan",124);
		hashMapEmp.put("peter",23);
		System.out.println(hashMapEmp.get("jerry"));
		System.out.println(hashMapEmp.containsKey("jerry"));
		System.out.println(hashMapEmp.containsValue("23"));
		return hashMapEmp;


	}
}