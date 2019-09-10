package fr.irit.smac.fxplot;

import java.util.HashMap;
import java.util.Map;

import fr.irit.smac.fxplot.interfaces.IFxPlotChart;
import fr.irit.smac.fxplot.server.FxPlotChart;
import fr.irit.smac.fxplot.server.Window;

public class FxPlot {


	private static Map<String, IFxPlotChart> charts=new HashMap<>();
	
	private static Window window;
	
	public static void setWindow(Window window) {
		FxPlot.window = window;
	}
	
	public static void updateWindow() {
		FxPlotChart plot =(FxPlotChart)charts.get("Test");
		window.addChart(plot);
	}
	
	
	public static IFxPlotChart getChart(String name) {
		if(!charts.containsKey(name)) {
			charts.put(name,  new FxPlotChart());
			FxPlot.updateWindow();
		}
		
		return charts.get(name);
		
	}

}
