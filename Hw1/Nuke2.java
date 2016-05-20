import java.io.*;
import java.util.Arrays;

class Nuke2 {
    public static void main(String[] arg) throws Exception {	
	BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
	String input = new String(kb.readLine());
	System.out.println(input.substring(0,1) + input.substring(2));
    }
}
