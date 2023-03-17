package javaCollections;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(12);
		pq.add(98);
		pq.add(21);
		pq.add(11);
		pq.add(21);
        
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.poll();
		pq.poll();
		pq.poll();
		pq.poll();
		pq.poll();
		pq.poll();
		System.out.println(pq.poll());
        // pq.remove() ;
        /*	pq.peek();
		System.out.println(pq);*/

	}

}
