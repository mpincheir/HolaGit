public class Helper {

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
