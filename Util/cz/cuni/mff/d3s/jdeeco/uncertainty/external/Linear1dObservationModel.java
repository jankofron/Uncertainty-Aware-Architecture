package cz.cuni.mff.d3s.jdeeco.uncertainty.external;

public class Linear1dObservationModel extends ObservationModel {

	private double mx;

	public void setPosition(double x) {
		this.mx = x;
	}

	@Override
	public int observationDimension() {
		return 1;
	}

	@Override
	public int stateDimension() {
		return 2;
	}

	@Override
	public void observationMeasurement(double[][] y) {
		y[0][0] = mx;
	}

	@Override
	public void observationModel(double[][] x, double[][] h) {
		h[0][0] = x[0][0];
	}

	@Override
	public void observationModelJacobian(double[][] x, double[][] j) {
		j[0][0] = 1;
		j[0][1] = 0;
	}

	@Override
	public void observationNoiseCovariance(double[][] cov) {
		cov[0][0] = 1;
	}
}
