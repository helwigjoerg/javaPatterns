package com.joerghelwig.javaPatterns.facadepattern;

public class RunServer {

	public static void main(String[] args) {
		
		/*
		 * To start the server, the client needs to create an object of the ScheduleServer
		 *  class and then need to call the below methods in the sequence to start and initialize the server.
		 */
		ScheduleServer scheduleServer = new ScheduleServer();
		
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();
		
		System.out.println("Start working......");
		System.out.println("After work done.........");
		
		scheduleServer.releaseProcesses();
		scheduleServer.destory();
		scheduleServer.destroySystemObjects();
		scheduleServer.destoryListeners();
		scheduleServer.destoryContext();
		scheduleServer.shutdown();
	}

}
