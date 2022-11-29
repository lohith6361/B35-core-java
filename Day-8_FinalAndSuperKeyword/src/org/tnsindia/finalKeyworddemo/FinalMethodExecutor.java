package org.tnsindia.finalKeyworddemo;

public class FinalMethodExecutor {

	public static void main(String[] args) {
		FinalMethodWithChildClass f=new FinalMethodWithChildClass ();
		f.aadhar_no=3216549870L;
		f.PAN_no="kld636195";
		//f.print();
		f.print(f.PAN_no);
		


	}

}
