package mundo;

import collections.IHashTable;
import collections.IQueue;
import collections.Node;
import collections.Queue;

public class Fornite {

	private Player player;
	private IQueue<Player> myQueue;
	private IHashTable<Integer, Player> consoleTable;
	private IHashTable<Integer, Player> phoneTable;
	private IHashTable<Integer, Player> pcTable;

	public Fornite() {
		myQueue = new Queue<Player>(0,100);
	}

	public IQueue<Player> getMyQueue() {
		return myQueue;
	}

	public IHashTable<Integer, Player> getXboxTable() {
		return consoleTable;
	}

	public void setXboxTable(IHashTable<Integer, Player> xboxTable) {
		this.consoleTable = xboxTable;
	}

	public IHashTable<Integer, Player> getPhoneTable() {
		return phoneTable;
	}

	public void setPhoneTable(IHashTable<Integer, Player> phoneTable) {
		this.phoneTable = phoneTable;
	}

	public IHashTable<Integer, Player> getPcTable() {
		return pcTable;
	}

	public void setPcTable(IHashTable<Integer, Player> pcTable) {
		this.pcTable = pcTable;
	}

	public void setMyQueue(IQueue<Player> myQueue) {
		this.myQueue = myQueue;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setMyQueue(Queue<Player> miQueue) {
		this.myQueue = miQueue;
	}

	public void dequeue() {
		// TODO Auto-generated method stub

	}

	public void search(Player searched) {
		// TODO Auto-generated method stub

	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public void enqueue(Player newElem) {
		myQueue.enqueue(newElem);

	}

	public int size() {
		return myQueue.size();
	}

	public void add(Player newElement, Integer key) {

		if (newElement.getPlatform().equals(Player.CONSOLE)) {

			consoleTable.add(newElement, key);

		} else if (newElement.getPlatform().equals(Player.PC)) {
			pcTable.add(newElement, key);
		} else {
			phoneTable.add(newElement, key);
		}

	}
	
	public void skillRanking(String platform) {
		int key=generateRandom();
		if(platform.equals(Player.CONSOLE)) {
			consoleTable.search(key);
		}	else if(platform.equals(Player.PC)) {
			pcTable.search(key);
		}else {
			phoneTable.search(key);
		}
		for(int i=0;i<1000000;i+=100) {
			for(int j=0;j<200;j++) {
			IQueue<Player> queue = new Queue<Player>(j,j+=30);
		}
		}
		
		
		
		
	
		
		
	}
	public int generateRandom() {
		
		return (int)( Math.random()*1000000 )+1;
		
		
		
	}

	public static void main(String[] args) {
		Fornite f = new Fornite();

		Player uno = new Player("Huertas", 80, "Sur", 50, 3107, "cp");

		f.enqueue(uno);
		System.out.println(f.size());
		System.out.println(f.getMyQueue().getFront().getValue().getName());

	}

}
