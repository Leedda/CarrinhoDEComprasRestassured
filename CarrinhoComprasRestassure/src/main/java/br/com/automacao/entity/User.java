package br.com.automacao.entity;

public class User {
	private String name;
	private String email;
    private String license;
    private String city;
    private String state;
    private String status;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
    public String toString() {
        return "User{" +
                ", name ='" + name + '\'' +
                ", email ='" + email + '\'' +
                ", city='" + city + '\'' +
                 ", state='" + state +
                 ", status='" + status +
                '}';
    }
	
}
