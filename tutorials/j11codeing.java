import java.util.*;

public class j11codeing {

    public static void main(String[] args) {

        // all type list
        List list = new ArrayList();
        list.add(10);
        list.add(0, 3);
        list.add("hello");
        System.out.println(list);

        // list
        List<Integer> list1 = new ArrayList<Integer>();
        // alternate to arrqy
        list1.add(3);
        list1.remove(0);
        System.out.println(list1);
        System.out.println(list1.size());

        // linked list
        List<Integer> linkedlist = new LinkedList<Integer>();
        linkedlist.add(13);
        linkedlist.remove(0);

        // vector
        Vector<String> vector = new Vector<String>();
        vector.add("hello");
        vector.add("world");
        System.out.println(vector);
        vector.clear();

        // queue
        Queue<String> queue = new LinkedList<String>();
        queue.add("2");
        queue.add("3");
        queue.add("4");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue.offer("4"));// add last
        System.out.println(queue);
        System.out.println(queue.poll());// remove
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(10);
        System.out.println(stack.peek());
        stack.pop();

        // dqeue
        Queue<Integer> dq = new ArrayDeque<Integer>();
        // offer -> from back
        // offerlast ->from back
        // offerfirszt -> add start
        // poll remove first
        // pollfisrt reove first
        // polllast

        // priority queue //imp learn better
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();// minheap
        PriorityQueue<Integer> revpq = new PriorityQueue<Integer>(Comparator.reverseOrder());// maxheap

        pq.offer(10);
        pq.offer(20);
        pq.add(5);
        pq.add(300);
        pq.add(23);
        System.out.println(pq);

        // set
        Set<Integer> set = new HashSet<Integer>();
        // randome store
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(100);
        set.add(103);
        set.add(105);
        set.add(108);
        // 20 100 103 105 10 108
        System.out.println(set);

        LinkedHashSet<Integer> lllist = new LinkedHashSet<Integer>();
        lllist.add(103);
        lllist.add(3);
        lllist.add(4);
        // same order 103 3 4
        System.out.println(lllist.contains(3));
        System.out.println(lllist);

        TreeSet<Integer> tree = new TreeSet<Integer>();
        // tree bcz sorted set bcs unique
        tree.add(10);
        tree.add(50);
        tree.add(20);
        tree.add(40);
        tree.add(50);
        tree.add(70);
        tree.add(60);
        tree.add(50);
        System.out.println(tree);

        // map/hashmap
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();// sorted by key
        // all function same
        map.put("hello", 1);
        map.put("world", 2);
        map.putIfAbsent("world", 3);
        System.out.println(map);
        System.out.println(map.get("hello"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        // imp
        int arr[] = { 1, 2, 3, 4 };
        ArrayList<Integer> arlist = new ArrayList<Integer>();
        arlist.add(2);
        arlist.add(21);
        arlist.add(32);

        arlist.add(25);
        arlist.add(52);
        arlist.add(267);



        
        System.out.println(arlist);
        Collections.sort(arlist);
        System.out.println(arlist);
        System.out.println(Collections.max(arlist));

        Iterator it = arlist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}