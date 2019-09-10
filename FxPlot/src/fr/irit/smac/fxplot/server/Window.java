package fr.irit.smac.fxplot.server;

import fr.irit.smac.fxplot.interfaces.IFxPlotChart;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Window {

	private Stage stage;
	private HBox  hBox  = new HBox ();
	
	public Window(Stage stage) {
		this.stage=stage;
		stage.setTitle("Test");
		stage.show();
		Scene scene  = new Scene(hBox,800,600);
	       
        stage.setScene(scene);
	}
	
	public void addChart(FxPlotChart chart) {
		LineChart<Number,Number> lineChart = chart.getLineChart();
		hBox.getChildren().add(lineChart);
	}

}
