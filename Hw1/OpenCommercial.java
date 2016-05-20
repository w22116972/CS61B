/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    String addr = "http://www." + inputLine + ".com/";
    System.out.println(addr);
    URL url = new URL(addr);
    BufferedReader urlContent = new BufferedReader(new InputStreamReader(url.openStream()));
    String[] fiveLine = new String[5];
    String line;
    int i = 0;
    while((line = urlContent.readLine()) != null && i < fiveLine.length) {
	fiveLine[i] = line;
	i ++;
    }
    for(int j = fiveLine.length - 1; j >= 0; j --) {
	System.out.println(fiveLine[j]);
    }
}
}
