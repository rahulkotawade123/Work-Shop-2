package review2;

public class GenericConcept {
	
	static <T> void generateDisplay(T element) {

		System.out.println(element.getClass().getName()+ " " +element);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		generateDisplay(11);
		generateDisplay("Generic");
			
		}
			
		
	}


