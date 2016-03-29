public class Helper {

	/* Variable Privada */
	private int llamados;
	
	public Helper() {
		llamados = 0;
	}

	public void llamar() {
		llamados++;
		
	}

	public int getLlamados(){
		return llamados;
	}
	
}
