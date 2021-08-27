// Name: Gaurang Sanyasi
// Batch: B2
// PRN: 2020016400785461
// Date: 27 August, 2021
// Prac-07: Synchronization

import java.util.concurrent.*;
public class P7_Q1_Test_GS
{
public static void main(String args[])
{
ExecutorService application=Executors.newCachedThreadPool();
P7_Q1_CircularBuffer_GS sharedLocation=new P7_Q1_CircularBuffer_GS();
sharedLocation.displayState("Initial State");
application.execute(new P7_Q1_Producer_GS(sharedLocation));
application.execute(new P7_Q1_Consumer_GS(sharedLocation));
application.shutdown();
}
}