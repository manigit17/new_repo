import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class array {

   public static void main(String args[]) throws ParseException {
	   Date dt=new Date();
	   SimpleDateFormat sf= new SimpleDateFormat("dd/mm/YYYY");
	   System.out.println(sf.format(dt));
	   Date t = new Date();
	   t=sf.parse("18/06/2017");
	   System.out.println("date" +t);
	   System.currentTimeMillis();
   }
}