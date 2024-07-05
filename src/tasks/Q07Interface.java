package tasks;
 
//Define the Printable interface with a print() method.
//Define the Document and Image classes that implement the Printable interface.
//Implement the print() method in Document and Image to provide specific printing behavior.

interface Printable{
	 void print();
}


class Documents implements Printable{
	@Override
	public void print() { 
		System.out.println("Print in Document");
	}

}

class Images implements Printable{
	@Override
	public void print() {		 
		System.out.println("Print in Image");
	}

}


public class Q07Interface {

	public static void main(String[] args) {
		
		 
		Documents d = new Documents();
		Images i = new Images();
		
		d.print();
		i.print();

	}

}
