package tartalyos;

public class Tartaly extends Tarolo {
	
	private double nyomas;

	public Tartaly(int terfogat) {
		super(terfogat);
		
	}

	@Override
	public boolean VeszelyesE() {
		if (terfogat * nyomas > 100 ) System.out.println("Veszélyes");
		return "Nem veszélyes";
	}
	
	@Override
	String toString(){
		return "Tartály térfogyata: "+this.getTerfogat()+", Nyomsása: "+
	}
	
	public int NagyobbTartaly(int tartaly1, int tartaly2){
		
	}

}
