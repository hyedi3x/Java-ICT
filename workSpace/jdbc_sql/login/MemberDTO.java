package login;

// 데이터 전송 객체
public class MemberDTO {
	// [멤버 변수, 회원 정보 저장] 
    private String id;
    private String password;
    private String gender;
    private String email;
    private String address;

    public MemberDTO() {
    	
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
    	this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
