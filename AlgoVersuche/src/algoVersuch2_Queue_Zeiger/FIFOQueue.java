package algoVersuch2_Queue_Zeiger;

public interface FIFOQueue {
	
	
	FIFOQueue enqueue(char zeichen);
  
	FIFOQueue dequeue();
	 
	char front();

	boolean isEmpty();


}
