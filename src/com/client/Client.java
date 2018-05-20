//CLASS: DATA STRUCTURE AND ALGORITHMS
//FINAL PROJECT
//AUTHOR: GROUP 3: KUMAR, PARUL, ADITHYA, PREETRAJ
//DATE: 05/06/2018

package com.client;

public class Client {

	public static void main(String args[]){
		// initialize the clients to connect to server
		Thread client = new Thread(new ClientThread());
		client.start();
	}
}
