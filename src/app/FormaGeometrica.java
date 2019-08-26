package app;

public abstract class FormaGeometrica implements Comparable{
		String nume;
		FormaGeometrica(String nume){
			this.nume = nume;
		}
		protected abstract double  getAria();
		
		@Override
		public int compareTo(Object o2) {
			FormaGeometrica forma = (FormaGeometrica) o2;
			double forma1 = this.getAria();
			double forma2 = forma.getAria();
			return (int)(forma1 -forma2);

		}
		@Override
		public String toString() {
			return nume + " " + this.getAria();
		}
		
}
