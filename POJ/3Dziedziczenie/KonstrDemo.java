// Demonstracja kolejnosci wywolania konstruktorow
class AK {
    AK(int i) {
    	//super();
    	i=5;
    	//super();
    	System.out.println("Konstruktor z A");
    }
    AK(){
    	//super();
    	System.out.println("Konstruktor z A()");
    }
}
class BK extends AK {
    BK(int i) {
    	super(i+1);
    	System.out.println("Konstruktor z B");
    }
    BK(){//super();
    	}
    }
class CK extends BK {
    CK() {
    	//super();
    	super(1);	
    	System.out.println("Konstruktor z C");
    }
}
// klasa testujaca
class KonstrDemo {
    public static void main (String args[]) {
    	new CK();
    }
}
