// Name: Gaurang sanyasi
// Batch: B2
// PRN: 2020016400785461
// Date: 06 August,2021
// Prac-04: Producer-Consumer Problem,RMI


public interface P4_PC_SM_Buffer_GS
{

	// Producers call this method
	 public void insert(String item);

	// Consumers call this method

	public String remove(); 
} // interface ends