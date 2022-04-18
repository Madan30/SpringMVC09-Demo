package come.NepalCode.api;

import javax.validation.constraints.NotEmpty;

import com.Nepal.Code.CustomValidator.Age;

public class UserRegisterInfoDTO {
	
	@NotEmpty(message = "* first name cannot be empty")
	private String firstName;
	private String lastName;
	
	
	private String userName;
	private char [] passWord;
	private String countryName;
	private String [] hobbies;
	private String gender;
	
	@Age
	private Integer age;
	
	private CommunicationDTO communicationDTO;
	
	
	// getter and setter
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassWord() {
		return passWord;
	}
	public void setPassWord(char[] passWord) {
		this.passWord = passWord;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
	
	

}
