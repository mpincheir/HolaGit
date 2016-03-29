public class Helper {

	/* Variable Privada */
	/* Un poco mas de comentarios*/
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
