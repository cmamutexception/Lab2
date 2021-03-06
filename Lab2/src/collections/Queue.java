package collections;

public class Queue<T> implements IQueue<T> {

	public int SIZE_ASS = 100;
	private Node<T> front;
	private Node<T> back;

	public Queue() {
		front = null;
		back = null;

	}

	@Override
	public void setFront(Node<T> front) {
		this.front = front;
	}
    
	@Override
	public void setBack(Node<T> back) {
		this.back = back;
	}
	
	
	@Override
	public Node<T> getFront() {
		return front;
	}
	@Override
	public Node<T> getBack() {
		
		return back;
	}

	
	@Override
	public void enqueue(T newElem) {

		Node<T> n = new Node<T>(newElem);

		if (front == null) {
			front = n;
			back=n;
		} else {

			Node<T> tem = front;

			while (tem.getPrevious() != null) {
				tem = tem.getPrevious();
			}
			tem.setPrevious(n);
			n.setNext(tem);
			back=n;
		}

	}

	@Override
	public void dequeue() {

		if (front ==null) {
			//excepci�n
		} 
		else {
			front=front.getPrevious();
			front.setNext(null);
		}

			

	}

	@Override
	public void search(T searched) {
		
		
		

	}

	@Override
	public int size() {
		
		int amount=0;
		if(front==null) {
			return 0;
		}
		else {
			 amount=1;
			 Node<T> tem=front;
			 while(tem.getPrevious()!=null) {
				 amount++;
				 tem=tem.getPrevious();
			 }
		}
		
		return amount;
	}

	@Override
	public boolean isEmpty() {
		
		if(front==null) {
		return true;
		}
		else
			return false;
	}





	

}
