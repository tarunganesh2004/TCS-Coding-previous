import java.util.*;

class test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1 };
        // arr is primitive type
        // to convert arr as list we should convert it to Integer[]
        // Integer[] arr1 = { 1, 2, 3, 4, 5 };
        // List<Integer> list = Arrays.asList(arr1);
        // System.out.println(list);
        // list.add(6); // this will give error.because list is fixed size

        // Map usage
        // Map<Integer, Integer> m = new HashMap<>();
        // for (int num : arr) {
        // if (m.containsKey(num)) {
        // m.put(num, m.get(num) + 1);
        // } else {
        // m.put(num, 1);
        // }
        // }
        // System.out.println(m);
        // iterating
        // for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
        // System.out.println(entry.getKey()+" "+entry.getValue());
        // }
        // Arraylist usage
        // ArrayList<Integer> l = new ArrayList<>();
        // for (int num : arr) {
        //     l.add(num);
        // }
        // System.out.println(l);
        // l.add(6);
        // l.add(2, 7); // .add(index,element) is used to add element at index
        // System.out.println(l);
        // l.remove(l.size() - 1);
        // l.set(0, 0); // .set(index,element) is used to set element at index
        // System.out.println(l.contains(1)); // .contains(element) is used to check if element is present in list
        // for (int i = 0; i < l.size(); i++) {
        //     System.out.println(l.get(i)); // .get is used to get the element at index i
        // }
        // System.out.println(l.indexOf(l.size() - 1)); // .indexOf(element) is used to get the index of element
        // set usage
        // Set<Integer> s = new HashSet<>();
        // for (int num : arr) {
        //     if (s.contains(num)) {
        //         System.out.println("Duplicate element is " + num);
        //     } else {
        //         s.add(num);
        //     }
        // }
        // System.out.println(s);
        // s.remove(3);
        // System.out.println(s);

        // Queue
        Queue<Integer> q = new LinkedList<>();
        for (int num : arr) {
            q.offer(num); // .offer is used to add element in queue or q.add(num)

        }
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

        // Stack
        Stack<Integer> st = new Stack<>();
        for (int num : arr) {
            st.push(num); // .push is used to add element in stack
        }
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());

        // Priority queue
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        for (int num : arr) {
            maxHeap.offer(num);
        }
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.peek());
        System.out.println(maxHeap.isEmpty());
    }
}

// comparator, sort students by marks
class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return this.name + " " + this.marks;
    }
    

}
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks;
    }
}

class Main {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());
        pq.offer(new Student("A", 90));
        pq.offer(new Student("B", 80));
        pq.offer(new Student("C", 70));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}