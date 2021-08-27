// Name: Gaurang Sanyasi
// Batch: B2
// PRN: 2020016400785461
// Date: 27 August, 2021
// Prac-07: Synchronization

import java.util.Random;
public class P7_Q1_Producer_GS implements Runnable
{
private final static Random generator=new Random();
private final P7_Q1_Buffer_GS sharedLocation;
public P7_Q1_Producer_GS(P7_Q1_Buffer_GS shared)
{
sharedLocation=shared;
}
public void run()
{
for(int count=1;count<=10;count++)
{
try{
Thread.sleep(generator.nextInt(3000));
sharedLocation.set(count);
}catch(InterruptedException e){
e.printStackTrace();
}
}
System.out.println("Producer done producing. Terminating Producer");
}//run() ends
}//Producer class ends
