package com.limosys.ws.obj.geo;

import java.util.ArrayList;
import java.util.List;

import com.limosys.ws.obj.Ws_LatLng;

public class Ws_GoogleDirResponse {

	private List<Ws_GoogleDirs> routes = new ArrayList<Ws_GoogleDirs>();
	private String overviewPolyline;
	private List<Ws_LatLng> bounds = new ArrayList<Ws_LatLng>();
	
	
	public Ws_GoogleDirResponse() {
	}


	/**
	 * @return the routes
	 */
	public List<Ws_GoogleDirs> getRoutes() {
		return routes;
	}


	/**
	 * @param routes the routes to set
	 */
	public void setRoutes(List<Ws_GoogleDirs> routes) {
		this.routes = routes;
	}


	/**
	 * @return the overviewPolyline
	 */
	public String getOverviewPolyline() {
		return overviewPolyline;
	}


	/**
	 * @param overviewPolyline the overviewPolyline to set
	 */
	public void setOverviewPolyline(String overviewPolyline) {
		this.overviewPolyline = overviewPolyline;
	}


	/**
	 * @return the bounds
	 */
	public List<Ws_LatLng> getBounds() {
		return bounds;
	}


	/**
	 * @param bounds the bounds to set
	 */
	public void setBounds(List<Ws_LatLng> bounds) {
		this.bounds = bounds;
	}
	
	
	
}
