package collections;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class HashTable<K,V> implements IHashTable<K,V>{
	
	
    public static final int AMOUNT= 1000;
	private HashNode<K,V>[] hashTable;
	
	
	public HashTable(int size){
		hashTable = new HashNode[size];
		
    }
	public HashNode<K,V>[] getHashTable() {
		return hashTable;
	}

	public void setHashTable(HashNode<K,V>[] hashTable) {
		this.hashTable = hashTable;
	}
	
	
	@Override
	public void add(V newElement, K key) {
		int hash = getSlot(key, 1,1);
		HashNode<K, V> node = new HashNode<K, V>(key, newElement,hash);
		
		hashTable[hash] = node;
	}
	
	@Override
	public void remove(K key) {
		
	
	}
	@Override
	public HashNode<K,V> search(K key) {
		
		int slot=getSlot(key, 1, 1);
		System.out.println(slot);
		
		return hashTable[slot];
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getSlot(K key, int c1, int c2) {
		int hashFunction = key.hashCode() % hashTable.length;
		int slot=0;
		int i=0;
		int quadratic=0;
		int hash=hashFunction;
		    
			if(hashTable[hashFunction]==null) {
				slot=hashFunction;
			}else {
				boolean esta= false;
				while(hashTable[hash]!=null&&!esta&&hash<hashTable.length) {
					if(hashTable[hash].getKey().hashCode()==key.hashCode()) {
						esta=true;
					}
					else {
				i++;
				quadratic=(int) ((hashFunction+ (c1*i)+(c2*(Math.pow(i, 2))))%hashTable.length);
				hash =quadratic;
					}
				}
				slot= hash;
			}
		return slot;
	}
	
	
	
	public static void main(String[] args) {
		HashTable<Integer, String> n= new HashTable<Integer, String>(7);
		

		n.add("David", 36648);
		n.add("Laura", 34745);
		n.add("Douglas", 13359);
		n.add("Huertas", 3);
		n.add("kaka", 7);
		
		
		for(int i=0; i<n.getHashTable().length;i++) {
			if(n.getHashTable()[i]!=null){
			System.out.println(n.getHashTable()[i].getValue()+" "+i);
			
			}
		
			
		}
		
		System.out.println("buscado  "+n.search(7).getValue());
		
		}
		
		
	}
	

	
	
	
	

