public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {

        conta c = new conta();
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
}

	private static void metodo1() {
		// TODO Auto-generated method stub
		
	}
}