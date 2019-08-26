package app;

public class Cerc extends FormaGeometrica{
		double raza;
		 
		Cerc(double raza) throws Exception {
		super("Cerc");
		if(raza >= 0) {
			this.raza = raza;
		}else {
			throw new DimensiuneInvalidaException("Raza este mai mica ca zero");
		}
	}
	
	public double getRaza() {
			return raza;
		}
	
	@Override
	protected double getAria() {
		return raza * Math.PI;
	}		
		
}
