import java.util.Arrays;
import java.util.Stack;
import java.lang.Integer;

public class Qusingstack {

	private Stack<Integer> oldStack;
	private Stack<Integer> newStack;
	private int siz;
	private int topElement;
	
	Qusingstack(){
		oldStack = new Stack<Integer>();
		newStack = new Stack<Integer>();
		topElement = -1;
		siz = -1;
		
	}
	public boolean Enque(int element){
		boolean ret = true;
		try {
			System.out.println("EnQueed : "+ element);
			newStack.push(new Integer(element));
			
		}
		catch(Exception e){
			
			System.out.println("Error "+ e);
			ret = false;
			
		}
		return ret;
	}
	
	public int Deque(){
		
		topElement = -1;
		if(oldStack.isEmpty()){
			while(!newStack.isEmpty()){
				topElement = newStack.peek();
				oldStack.push(topElement);
				newStack.pop();
			}
		}
		if(!oldStack.isEmpty()){
			
			Integer i  = oldStack.peek();
			topElement = i.intValue();
			System.out.println("\n Dequed : "+ topElement);
			oldStack.pop();
	    }				
		
		return topElement;
		
	}
	public boolean IsEmpty(){
		
		if(oldStack.isEmpty() && newStack.isEmpty()){
			return true;
		}
		else 
		return false;
	}
	
	public int Size(){
		
		siz = oldStack.size()+newStack.size();
		return siz;	
	}
	public void pp(){
		System.out.println(Arrays.toString(oldStack.toArray()));
		System.out.println(Arrays.toString(newStack.toArray()));
	}
	
	public static void main(String[] args) {
		
		
		Qusingstack q = new Qusingstack();
		for(int i = 1; i< 6;i++){
			q.Enque(i*10);
		}
		System.out.print("Size is :"+ q.Size());
		System.out.print("\n Is my Quese empty :"+ q.IsEmpty());
		q.Deque();
		q.Deque();
		//q.Enque(55);
		q.pp();
		q.Deque();
		

	}

}
