package tartalyos;

public class Tartaly extends Tarolo {
	
	private double nyomas;

	public Tartaly(int terfogat) {
		super(terfogat);
		
	}

	@Override
	public boolean VeszelyesE() {
		if (terfogat * nyomas > 100 ) System.out.println("Vesz�lyes");
		return "Nem vesz�lyes";
	}
	
	@Override
	String toString(){
		return "Tart�ly t�rfogyata: "+this.getTerfogat()+", Nyoms�sa: "+
	}
	
	public int NagyobbTartaly(int tartaly1, int tartaly2){
		
	}

}
