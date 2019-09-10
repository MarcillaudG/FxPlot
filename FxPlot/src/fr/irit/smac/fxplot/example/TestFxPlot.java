package fr.irit.smac.fxplot.example;

import fr.irit.smac.fxplot.FxPlot;
import fr.irit.smac.fxplot.interfaces.IFxPlotChart;
import fr.irit.smac.fxplot.server.Window;
import javafx.application.Application;
import javafx.stage.Stage;

public class TestFxPlot extends Application{

	public TestFxPlot() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println("start FxPlot test");
		
		FxPlot.setWindow(new Window(arg0));
		FxPlot.getChart("Test").add(0, 0);
		FxPlot.getChart("Test").add(10, 10);
		FxPlot.getChart("Test").add(20, 0);
		
		FxPlot.getChart("Test").add("YO !!!",0, 10);
		FxPlot.getChart("Test").add("YO !!!",10, 0);
		FxPlot.getChart("Test").add("YO !!!",20, 10);
		FxPlot.getChart("Test").add(30, 20);
		
		FxPlot.getChart("Test2").add(0, 0);
		FxPlot.getChart("Test2").add(30, 20);
		
	}
	
	public static void main(String[] args) {
        launch(args);
    }

}
