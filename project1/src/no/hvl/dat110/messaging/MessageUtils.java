package no.hvl.dat110.messaging;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static final int MESSAGINGPORT = 8080;
	public static final String MESSAGINGHOST = "localhost";
	
	public static byte[] encapsulate(Message message) {
		
		byte[] segment = null;
		byte[] data;
		
		// TODO - START
		segment = new byte[128];
		data = message.getData();
		segment[0]=Integer.valueOf(data.length).byteValue();
		for(int i=0;i<data.length;i++) {
			segment[i+1]=data[i];
		}
		// TODO - END
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		
		// TODO - START
		int dataLength = segment[0];
		byte[] data = new byte[dataLength];
		for(int i=0;i<dataLength;i++) {
			data[i] = segment[i+1];
		}
		message = new Message(data);
		
		// TODO - END
		
		return message;
		
	}
	
}
