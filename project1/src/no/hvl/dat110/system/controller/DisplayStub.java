package no.hvl.dat110.system.controller;

import no.hvl.dat110.rpc.*;

public class DisplayStub extends RPCLocalStub {
		
	private byte RPCIDDISPLAY = 2;
	
	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void write (String message) {
		
		// TODO - START
		
		rpcclient.call(RPCIDDISPLAY,RPCUtils.marshallString(message));
		// implement marshalling, call and unmarshalling for write RPC method
		
		
		// TODO - END
		
	}
}
