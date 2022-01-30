package nLayeredApp.core.arrayLists;


import java.util.Arrays;



public class MyArrayList<T> {
	
	
	private static final int INITIAL_CAPACITY = 1;
	private int size = 0;
	private Object elementData[] = {} ;
	
	
	public MyArrayList() {
		elementData = new Object[INITIAL_CAPACITY];
	}

	public void add(T t) {
		if (size == elementData.length) {
			int newIncreasedCapacity = elementData.length + 1;
			elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
		}
		elementData[size++] = t;
	}
	
	public int size() {
		return size ;
	}
	
	 
 
	public Object remove (int index) {
		if (index <0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: "+ index+" , Size "+index  ); // hata
		}
		Object removedElement = elementData[index];
		for (int i = index ; i < size -1 ; i++) {
			elementData[i] = elementData[i+1];			
		}
		size = size -1 ;
		return removedElement;
	}
	
	
    public void get(int index) {        
        if (index < 0 || index >= size) {
               throw new IndexOutOfBoundsException("Index: " + index + ", Size "+ index);
        }
        System.out.println(elementData[index]);
        
 }
	
	public void set(int index , T element)	{
		elementData[index] = element;		
	}
	
	
	public void getArrayAll() {
		
		for (int i = 0; i< size;i++) {
			System.out.println(elementData[i]+ " ");
		}		
	}
	
	
	
}
