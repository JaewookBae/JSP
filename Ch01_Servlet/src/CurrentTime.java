import java.text.SimpleDateFormat;
import java.util.Date;
public class CurrentTime {

	public static void main(String[] args) {
		CurrentTime ct = new CurrentTime();
		System.out.println(ct.now());
		
	}
public String now() {
	SimpleDateFormat sdf = new SimpleDateFormat("HH시 MM분 SS초");
	return sdf.format(new Date());
}
}
