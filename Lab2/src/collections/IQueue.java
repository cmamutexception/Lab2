package collections;

import mundo.Player;

public interface IQueue<T> {
	
	public void enqueue(T newElem);
	public void dequeue(T deleted);
	

}
