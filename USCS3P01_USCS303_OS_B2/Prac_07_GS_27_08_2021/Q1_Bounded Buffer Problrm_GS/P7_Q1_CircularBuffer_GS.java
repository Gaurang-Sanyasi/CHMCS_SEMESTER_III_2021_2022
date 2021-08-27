// Name: Gaurang Sanyasi
// Batch: B2
// PRN: 2020016400785461
// Date: 27 August, 2021
// Prac-07: Synchronization

public class P7_Q1_CircularBuffer_GS implements P7_Q1_Buffer_GS
{
private final int[] buffer={-1,-1,-1}; //shared buffer
private int occupiedCells=0; //count number of buffer used
private int writeIndex=0; //Index of next element to write to
private int readIndex=0; //Index of next element to read
public synchronized void set(int value) throws InterruptedException
{
while(occupiedCells==buffer.length)
{
System.out.println("Buffer is full.Producer waits.");
wait();
}
buffer[writeIndex]=value;
writeIndex=(writeIndex + 1) % buffer.length;
++occupiedCells;
displayState("Producer write "+value);
notifyAll();
}//set() ends
public synchronized int get() throws InterruptedException
{
while(occupiedCells==0)
{
System.out.println("Buffer is empty.Consumer waits.");
wait();
}
int readvalue=buffer[readIndex];
readIndex=(readIndex + 1) % buffer.length;
--occupiedCells;
displayState("Consumer reads "+readvalue);
notifyAll();
return readvalue;
} //get() ends
public void displayState(String operation)
{
System.out.printf("%s%s%d)\n%s",operation," (buffer Cells occupied: ",occupiedCells,
"buffer Cells: ");
for(int value:buffer)
System.out.printf(" %2d ",value);
System.out.print("\n ");
for(int i=0;i<buffer.length;i++)
System.out.print(" .... ");
System.out.print("\n ");
for (int i=0;i<buffer.length;i++)
{
if(i==writeIndex && i==readIndex)
System.out.print(" WR");
else if(i==writeIndex)
System.out.print(" W ");
else if(i==readIndex)
System.out.print(" R ");
else
System.out.print(" ");
}
System.out.println("\n");
}//displayState() ends
}//CircularBuffer class ends