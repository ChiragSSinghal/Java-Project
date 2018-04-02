public class EMP_C {
	private int empid;
	private String empfn, empln;
	private String addr1, addr2, city, state, country, phone;
	private int empsal;
	private static int count;
	
	public EMP_C(int id, String fn, String ln, String addr1, String addr2, String city, String state, String country,int sal, String ph) {
		setid(id);
		setfn(fn);
		setln(ln);
		setaddr1(addr1);
		setaddr2(addr2);
		setcity(city);
		setstate(state);
		setcountry(country);
		setsal(sal);
		setph(ph);
	}
	
	public static int getctr() {
		return count;
	}
	public int getid() {
		return empid;
	}
	public String getfn() {
		return empfn;
	}
	public String getln() {
		return empln;
	}
	public String getaddr1() {
		return addr1;
	}
	public String getaddr2() {
		return addr2;
	}
	public String getcity() {
		return city;
	}
	public String getstate() {
		return state;
	}
	public String getcountry() {
		return country;
	}
	public int getsal() {
		return empsal;
	}
	public String getph() {
		return phone;
	}
	
	public static void setctr(int newctr) {
		count = newctr;
	}
	public void setid(int newid) {
		empid = newid;
	}
	public void setfn(String newfn) {
		empfn = newfn;
	}
	public void setln(String newln) {
		empln = newln;
	}
	public void setaddr1(String newaddr1) {
		addr1 = newaddr1;
	}
	public void setaddr2(String newaddr2) {
		addr2 = newaddr2;
	}
	public void setcity(String newcity) {
		city = newcity;
	}
	public void setstate(String newstate) {
		state = newstate;
	}
	public void setcountry(String newcountry) {
		country = newcountry;
	}
	public void setsal(int newsal) {
		empsal = newsal;
	}
	public void setph(String newphone) {
		phone = newphone;
	}
	public void disp() {
		System.out.println("The employee id is " + getid());
		System.out.println("The employee name is " + getfn() + " " + getln());
		System.out.println("The employee address is " + getaddr1() + ", Apt - " + getaddr2() + ", " + getcity()
		+ ", " + getstate() + ", " + getcountry());
		System.out.println("The employee phone is " + getph());
		System.out.println("The employee salary is $" + getsal());
	}
}
