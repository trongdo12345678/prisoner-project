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
	private int day_off;
	private Boolean is_Working;
	private int salary;
	private int areas_id;

	public Wardens() {
	}
	
	

	/**
	 * @param wardenId
	 * @param firstName
	 * @param lastLame
	 * @param dateOfBirth
	 * @param isMale
	 * @param phoneNumber
	 * @param email
	 * @param address
	 * @param position
	 * @param startDate
	 * @param day_off
	 * @param is_Working
	 * @param salary
	 * @param areas_id
	 */
	public Wardens(int wardenId, String firstName, String lastLame, LocalDate dateOfBirth, String isMale,
			String phoneNumber, String email, String address, String position, LocalDate startDate, int day_off,
			Boolean is_Working, int salary, int areas_id) {
		super();
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
		this.day_off = day_off;
		this.is_Working = is_Working;
		this.salary = salary;
		this.areas_id = areas_id;
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
	

	public int getDay_off() {
		return day_off;
	}



	public void setDay_off(int day_off) {
		this.day_off = day_off;
	}



	public Boolean getIs_Working() {
		return is_Working;
	}



	public void setIs_Working(Boolean is_Working) {
		this.is_Working = is_Working;
	}



	public int getAreas_id() {
		return areas_id;
	}



	public void setAreas_id(int areas_id) {
		this.areas_id = areas_id;
	}



	@Override
	public int hashCode() {
		return Objects.hash(address, areas_id, dateOfBirth, day_off, email, firstName, isMale, is_Working, lastLame,
				phoneNumber, position, salary, startDate, wardenId);
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
		return Objects.equals(address, other.address) && areas_id == other.areas_id
				&& Objects.equals(dateOfBirth, other.dateOfBirth) && day_off == other.day_off
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(isMale, other.isMale) && Objects.equals(is_Working, other.is_Working)
				&& Objects.equals(lastLame, other.lastLame) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(position, other.position) && salary == other.salary
				&& Objects.equals(startDate, other.startDate) && wardenId == other.wardenId;
	}



	
	
	
	
}
