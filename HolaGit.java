public class HolaGit {

	public static void main (String args[]) {
		Helper helper = new Helper();		
		System.out.println("Hola Git");
		helper.llamar();
		System.out.println("Soy parte del segundo commit");
		helper.llamar();
		System.out.println("Soy parte del tercer commit");
		helper.llamar();
		System.out.println("Total Llamados " + helper.getLlamados() );
	}
}
