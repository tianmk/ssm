package demo.web.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class MyDateFomatter implements Formatter<Date> {
	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	@Override
	public String print(Date object, Locale locale) {
		// TODO Auto-generated method stub
		return sdf.format(object);
	}

	@Override
	public Date parse(String text, Locale locale) throws ParseException {
		Date r=null;
		try {
			r=sdf.parse(text);
		}catch(Exception e) {}
		return r;
	}

}
