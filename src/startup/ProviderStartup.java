package startup;


import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderStartup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        byte[] b;
        while(true) {
        	b= new byte[6];
        	System.in.read(b,0,6);
        	String s = new String(b).trim();
        	if("quit".equals(s)) {
        		break;
        	}
        }
        context.close();
	}

}
