import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new ArrayDeque();

		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.offer(6);

		System.out.println(queue);
		System.out.println(queue.isEmpty());
		// System.out.println(queue.size());
		// int a = queue.size();
		Integer[] arr = new Integer[queue.size()];
		System.out.println(arr.length);
		Integer[] arr1 = queue.toArray(arr);

		for (int i = 0; i < arr1.length; i++) {
			// System.out.println(arr1[i]);
			if (arr1[i] % 2 == 0) {
				System.out.println("\n even is " + arr1[i]);
			} else {
				System.out.println("\n odd is " + arr1[i]);
			}
		}
		// iterating over the queue

		for (Integer i : queue) {
			System.out.println(i.toString());
		}

		System.out.println("removes the fisrt elements from the queueu");
		System.out.println(queue.remove());
		System.out.println("gives the fisrt elements from the queueu");
		System.out.println(queue.peek());
		System.out.println(" removes/retrievesthe fisrt elements from the queueu");
		System.out.println(queue.poll());

		System.out.println("\n operations using queue using string in");
		Queue<String> qst = new ArrayDeque();

		qst.add("gaurav");
		qst.add("deepa");
		qst.add("omkar");
		qst.offer("surya");
		qst.add("d1");

		String[] st = new String[qst.size()];
		String[] st1 = qst.toArray(st);
		System.out.println("\n queue traversing thorugh string");
		for (int i = 0; i < st1.length; i++) {
			System.out.println(st[i]);
		}
		System.out.println("\n first elemenst in the queue " + qst.peek());
		System.out.println("\n remove elemenst in the queue " + qst.remove());
		System.out.println("\n after removing the first elemnet of the queue " + " and its size is " + qst.size()
				+ " the elements are");
		qst.forEach(e -> System.out.println(e));
		// System.out.println("\n after removing the first element the size of queue is
		// " + qst.size());

		System.out.println("\n retrives/remove elemenst in the queue " + qst.poll());
		System.out.println("\n after retrives/remove the size of queue is " + qst.size());
		System.out.println("\n after retrives/remove the size of queue is");
		qst.forEach(e -> System.out.println(e));

		System.out.println("\n operations using queue using character in");
		Queue<Character> qchar = new ArrayDeque();

		qchar.add('a');
		qchar.add('b');
		qchar.add('c');
		qchar.offer('d');
		qchar.add('e');

		Character[] qc = new Character[qst.size()];
		Character[] qc1 = qchar.toArray(qc);
		System.out.println("\n queue traversing thorugh string");
		for (int i = 0; i < qc1.length; i++) {
			System.out.println(qc1[i]);
		}
		System.out.println("\n first elemenst in the queue " + qchar.peek());
		System.out.println("\n remove elemenst in the queue " + qchar.remove());
		System.out.println("\n after removing the first elemnet of the queue " + " and its size is " + qchar.size()
				+ " the elements are");
		qchar.forEach(e -> System.out.println(e));
		// System.out.println("\n after removing the first element the size of queue is
		// " + qst.size());

		System.out.println("\n retrives/remove elemenst in the queue " + qchar.poll());
		System.out.println("\n after retrives/remove the size of queue is " + qchar.size());
		System.out.println("\n after retrives/remove the size of queue is");
		qchar.forEach(e -> System.out.println(e));

		System.out.println("\n operations using queue using double in");
		Queue<Double> qd = new ArrayDeque();

		qd.add(12.00);
		qd.add(13.00);
		qd.add(14.00);
		qd.offer(15.00);
		qd.add(16.00);

		Double[] qd1 = new Double[qd.size()];
		Double[] qd2 = qd.toArray(qd1);
		System.out.println("\n queue traversing thorugh string");
		for (int i = 0; i < qd2.length; i++) {
			System.out.println(qd2[i]);
		}
		System.out.println("\n first elemenst in the queue " + qd.peek());
		System.out.println("\n remove elemenst in the queue " + qd.remove());
		System.out.println("\n after removing the first elemnet of the queue " + " and its size is " + qd.size()
				+ " the elements are");
		qd.forEach(e -> System.out.println(e));
		// System.out.println("\n after removing the first element the size of queue is
		// " + qst.size());

		System.out.println("\n retrives/remove elemenst in the queue " + qd.poll());
		System.out.println("\n after retrives/remove the size of queue is " + qd.size());
		System.out.println("\n after retrives/remove the size of queue is");
		qd.forEach(e -> System.out.println(e));

	}

}
