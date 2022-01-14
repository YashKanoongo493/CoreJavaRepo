package dateImport;

	import java.util.Date;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;

	public class DateFormat {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		String dt = sdf.format(d);//----date to string
		System.out.println(dt);
		
		String s ="13/02/2001";
		Date dd = sdf.parse(s);//---- string to date
		System.out.println(dd);
	}
}
