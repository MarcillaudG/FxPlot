package fr.irit.smac.fxplot.server;

import fr.irit.smac.fxplot.interfaces.IFxPlotChart;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.stage.Stage;

public class Window {

	private Stage stage;
	
	public Window(Stage stage) {
		this.stage=stage;
		stage.setTitle("Test");
		stage.show();
	}
	
	public void addChart(FxPlotChart chart) {
		LineChart<Number,Number> lineChart = chart.getLineChart();
		Scene scene  = new Scene(lineChart,800,600);
       
        stage.setScene(scene);
	}

}
