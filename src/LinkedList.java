
public class LinkedList implements LinkedListInterface {

	Node start = null;

	Node end = null;

	int size = 0;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void addFirst(Object data) {
		// TODO Auto-generated method stub
		Node node = new Node();
		node.setData(data);
		node.setNext(start);
		size++;
	}

	@Override
	public void addLast(Object data) {
		// TODO Auto-generated method stub
		Node temp = start;
		if (temp == null) {
			start = new Node(data, null);
		} else {
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(new Node(data, null));
		}
		
		size++;
	}

	@Override
	public void add(Object data, int index) {
		// TODO Auto-generated method stub
		Node temp = start;
		if (temp == null) {
			start = new Node(data, null);
		} else {
			for (int i = 0; i < index - 1; i++) {
				temp = temp.getNext();
			}

			temp.setNext(new Node(data, temp.getNext()));
		}
		size++;

	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		Node temp = start;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
		size++;

	}

	@Override
	public String toString() {
		Node temp = start;
		String nodeString = "";
		if (start == null) {
			nodeString = null;
		} else {
			while (temp != null) {
				nodeString = nodeString + (String) temp.getData();
				temp = temp.getNext(); 
			} 
		}
//		System.out.println(nodeString);
		return nodeString;
	}

}
