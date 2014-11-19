import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.lang.Integer;

public class Stackusingq {

	private Queue<Integer> q1;
	private Queue<Integer> q2;
	
	//private int topElement;
	
	public Stackusingq(){
		//topElement = -1;
		//siz = -1;
	  q1 = new Queue<Integer>() {
		
		@Override
		public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Iterator<Integer> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean addAll(Collection<? extends Integer> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Integer remove() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Integer poll() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Integer peek() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean offer(Integer e) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Integer element() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean add(Integer e) {
			// TODO Auto-generated method stub
			return false;
		}
	};
	
	q2 = new Queue<Integer>() {

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
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator<Integer> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addAll(Collection<? extends Integer> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean add(Integer e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean offer(Integer e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Integer remove() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Integer poll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Integer element() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Integer peek() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	}
	public boolean push(int element){
		boolean ret = true;
		//Integer i = new Integer(element);
		
		try{
		
		q1.add(element);
		System.out.println("Added item : "+ element);
		}
		catch (Exception e){
			System.out.println("Error : " + e);
			ret = false;
		}
		return ret;
	}
	
	public int pop(){
		if(q1.isEmpty()){
			System.out.println("Hey Am in Pop if condition");
			return -1;
		}
		else{
			System.out.println("Hey Am in Pop else condition");
		while(q1.size()!= 1){
			q2.add(q1.poll());
		}
		Integer ele = q1.remove();
		System.out.println("After Remove");
		System.out.println("Popped Item : "+ ele);
		q1.poll();
		
		while(!q2.isEmpty()){
			
			q1.add(q2.poll());
		}
		
		return ele;
		}
	}
	
	public static void main(String[] args) {
	
		Stackusingq s = new Stackusingq();
		for (int i = 1; i<6;i++){
			Integer j = new Integer(i*10);
			
			s.push(j);
			
		}
        s.pop();
	}

}
