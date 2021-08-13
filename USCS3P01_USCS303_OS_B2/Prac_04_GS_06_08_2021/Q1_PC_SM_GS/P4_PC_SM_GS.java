// Name: Gaurang Sanyasi
// Batch: B2
// PRN: 2020016400785461
// Date: 06 August,2021
// Prac-04: Producer-Consumer Problem,RMI

public class P4_PC_SM_GS
{
	 public static void main(String[] args) {
	P4_PC_SM_BufferImpl_GS bufobj = new P4_PC_SM_BufferImpl_GS();

	System.out.println("\n==========PRODUCER producing the ITEMS==========\n");
	 bufobj.insert("Name: Gaurang Sanyasi");
	 bufobj.insert("CHMCS: Batch - B2");
	bufobj.insert("PRN:2020016400785461 "); 
	bufobj.insert("USCSP301 - USCS303: OS Practical - P4");
	System.out.println("\n==========CONSUMER consuming the ITEMS==========\n");
	String element = bufobj.remove();
	System.out.println(element); System.out.println(bufobj.remove());
	System.out.println(bufobj.remove());
	System.out.println(bufobj.remove());
	}// main ends
}// class ends