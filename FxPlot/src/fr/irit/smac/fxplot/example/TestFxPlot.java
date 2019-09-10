package fr.irit.smac.fxplot.example;

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
		new Window(arg0);
	}
	
	public static void main(String[] args) {
        launch(args);
    }

}
