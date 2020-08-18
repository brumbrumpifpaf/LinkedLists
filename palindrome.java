
public class palindrome {

	public static boolean palindrome (LinkedList list) {
		Node current = list.head;
		Node first = current;
		Node last = null;
		int i = 1;
		while (current.next != null) {
			current = current.next;
			last = current;
			i++;
		}
		System.out.println(i);
		
		if (i%2 == 1) {
			for (int k = 0; k < Math.floor(i/2); k++) {
				if (first.data == last.data) {
					first = first.next;
					last = last.prev;
				} else {
					return false;
				}
			}
		} else {
			for (int k = 0; k < i/2; k++) {
				if (first.data == last.data) {
					first = first.next;
					last = last.prev;
				} else {
					return false;
				}
			}
		}
		return true;

	}

}
