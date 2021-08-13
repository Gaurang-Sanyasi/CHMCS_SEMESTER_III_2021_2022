// Name: Gaurang Sanyasi
// Batch: B2
// PRN: 2020016400785461
// Date: 06 August,2021
// Prac-04: Process Communication

public interface P4_PC_MP_Channel_GS<E>
{
	// Send a message to the channel 
	public void send(E item);
	// Receive a message from the channel
	 public E receive();
}//interface ends