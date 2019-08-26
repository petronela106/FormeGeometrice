package app;

public class Patrat extends FormaGeometrica {
		double latura;
	Patrat(double latura) throws Exception {
		super("Patrat");
		if(latura >= 0) {
			this.latura = latura;
		}else {
			throw new DimensiuneInvalidaException("Latura este mai mica ca zero");
		}
	}

	public double getLatura() {
		return latura;
	}

	@Override
	protected double getAria() {
		return latura*latura;
	}

}
