// Name: Gaurang Sanyasi
// Batch: B2
// PRN: 2020016400785461
// Date: 06 August,2021
// Prac-04: Process Communication

import java.util.Vector;
public class P4_PC_MP_MessageQueue_GS<E> implements P4_PC_MP_Channel_GS<E>
{
	private Vector<E> queue;
	public P4_PC_MP_MessageQueue_GS(){
	queue = new Vector<E>();
}
// This implements a nonblocking send
public void send(E item)
{
	queue.addElement(item);
} // send() ends

// This implements a nonblocking receive 
public E receive()
{
	if(queue.size() == 0)
		return null;
	else
		return queue.remove(0);
	
} // receive() ends

} // class ends