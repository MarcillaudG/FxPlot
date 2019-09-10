package fr.irit.smac.fxplot.server;

import java.util.HashMap;
import java.util.Map;

import fr.irit.smac.fxplot.FxPlot;
import fr.irit.smac.fxplot.interfaces.IFxPlotChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class FxPlotChart implements IFxPlotChart {

	private final LineChart<Number,Number> lineChart;
	private Map<String,XYChart.Series<Number, Number>> series=new HashMap<>();
	
	
	
	/**
	 * Default constructor
	 */
	
	public FxPlotChart() {
		final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        lineChart = new LineChart<Number,Number>(xAxis,yAxis);
        lineChart.setTitle("Default");
	}
	
	public FxPlotChart(String name) {
		final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        lineChart = new LineChart<Number,Number>(xAxis,yAxis);
        lineChart.setTitle(name);
	}

	
	/**
	 * Add the point (_x,_y) to the "Default" serie of the chart.
	 * 
	 * @param _x
	 * @param _y
	 */
	@Override
	public void add(double _x, double _y) {
		add("Default", _x, _y);
	}

	
	/**
	 * Add the point (_x,_y) to the serieName serie of the chart.
	 * @param serieName
	 * @param _x
	 * @param _y
	 */
	@Override
	public void add(String serieName, double _x, double _y) {
		if(!series.containsKey(serieName)) {
			
			series.put(serieName, new XYChart.Series<>());
			series.get(serieName).setName(serieName);
			lineChart.getData().add(series.get(serieName));
		}
		series.get(serieName).getData().add(new XYChart.Data<Number, Number>(_x, _y));
		
	}
	
	public LineChart<Number, Number> getLineChart() {
		return lineChart;
	}

	@Override
	public void close() {

	}

	
	

}
