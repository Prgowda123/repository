package pojo;

public class UserData {
private String PhoneNo;
private String o1;
private String o2;
private String o3;
private String o4;

public UserData(String PhoneNo, String o1, String o2, String o3,String o4)
{
	this.PhoneNo=PhoneNo;
	this.o1=o1;
	this.o2=o2;
	this.o3=o3;
	this.o4=o4;
}



public String getPhoneNo() {
	return PhoneNo;
}

public String getO1() {
	return o1;
}

public String getO2() {
	return o2;
}

public String getO3() {
	return o3;
}

public String getO4() {
	return o4;
}


}
