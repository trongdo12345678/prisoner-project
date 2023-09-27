package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Wardens {
	private int wardenId ;
	private String firstName;
	private String lastLame;
	private LocalDate dateOfBirth;
	private String isMale;
	private String phoneNumber;
	private String email;
	private String address;
	private String position;
	private LocalDate startDate;
	private int salary;

	public Wardens() {
		super();
	}
	
	public Wardens(int wardenId, String firstName, String lastLame, LocalDate dateOfBirth, String isMale,
			String phoneNumber, String email, String address, String position, LocalDate startDate, int salary) {
		this.wardenId = wardenId;
		this.firstName = firstName;
		this.lastLame = lastLame;
		this.dateOfBirth = dateOfBirth;
		this.isMale = isMale;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.position = position;
		this.startDate = startDate;
		this.salary = salary;
		
	}

	public int getWardenId() {
		return wardenId;
	}

	public void setWardenId(int wardenId) {
		this.wardenId = wardenId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastLame() {
		return lastLame;
	}

	public void setLastLame(String lastLame) {
		this.lastLame = lastLame;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getIsMale() {
		return isMale;
	}

	public void setIsMale(String isMale) {
		this.isMale = isMale;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, dateOfBirth, email, firstName, isMale, lastLame, phoneNumber, position,
				salary, startDate,  wardenId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wardens other = (Wardens) obj;
		return Objects.equals(address, other.address) && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(isMale, other.isMale) && Objects.equals(lastLame, other.lastLame)
				&& Objects.equals(position, other.position) && salary == other.salary
				&& Objects.equals(startDate, other.startDate)&& wardenId == other.wardenId;
	}
	
	
	
}
