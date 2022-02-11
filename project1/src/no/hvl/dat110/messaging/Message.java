package no.hvl.dat110.messaging;

public class Message {

	private byte[] data;

	public Message(byte[] data) {
		
		// TODO - START
//		boolean containsNull = false;
//		for(byte b:data) {
//			if(b==null) {
//				containsNull = true;
//			}
//		}
		if(data == null||data.length>127) {
			
		}else {
			this.data = data;
		}
		
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
