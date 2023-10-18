package entity;

import java.time.LocalDate;

public class P_C_A {
	private int  id ;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationality;
	private String isMale;
	private LocalDate dateOfEntry;
	private LocalDate releaseDate;
	private int cellId;
	private String conviction;
	private String punishment;
	private String religion;
	private String image;
	private int cellNumber;
	private String status;
	private String size;
	private String cellsLocationDescription;
	private int floor_N;
	private int areaId;
	private String areaName;
	private String description;
	private String areasLocationDescription;
	/**
	 * 
	 */
	public P_C_A() {
	}
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param dateOfBirth
	 * @param nationality
	 * @param isMale
	 * @param dateOfEntry
	 * @param releaseDate
	 * @param cellId
	 * @param conviction
	 * @param punishment
	 * @param religion
	 * @param image
	 * @param cellNumber
	 * @param status
	 * @param size
	 * @param cellsLocationDescription
	 * @param floor_N
	 * @param areaId
	 * @param areaName
	 * @param description
	 * @param areasLocationDescription
	 */
	public P_C_A(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationality, String isMale,
			LocalDate dateOfEntry, LocalDate releaseDate, int cellId, String conviction, String punishment,
			String religion, String image, int cellNumber, String status, String size, String cellsLocationDescription,
			int floor_N, int areaId, String areaName, String description, String areasLocationDescription) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		this.isMale = isMale;
		this.dateOfEntry = dateOfEntry;
		this.releaseDate = releaseDate;
		this.cellId = cellId;
		this.conviction = conviction;
		this.punishment = punishment;
		this.religion = religion;
		this.image = image;
		this.cellNumber = cellNumber;
		this.status = status;
		this.size = size;
		this.cellsLocationDescription = cellsLocationDescription;
		this.floor_N = floor_N;
		this.areaId = areaId;
		this.areaName = areaName;
		this.description = description;
		this.areasLocationDescription = areasLocationDescription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getIsMale() {
		return isMale;
	}
	public void setIsMale(String isMale) {
		this.isMale = isMale;
	}
	public LocalDate getDateOfEntry() {
		return dateOfEntry;
	}
	public void setDateOfEntry(LocalDate dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getCellId() {
		return cellId;
	}
	public void setCellId(int cellId) {
		this.cellId = cellId;
	}
	public String getConviction() {
		return conviction;
	}
	public void setConviction(String conviction) {
		this.conviction = conviction;
	}
	public String getPunishment() {
		return punishment;
	}
	public void setPunishment(String punishment) {
		this.punishment = punishment;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getCellNumber() {
		return cellNumber;
	}
	public void setCellNumber(int cellNumber) {
		this.cellNumber = cellNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCellsLocationDescription() {
		return cellsLocationDescription;
	}
	public void setCellsLocationDescription(String cellsLocationDescription) {
		this.cellsLocationDescription = cellsLocationDescription;
	}
	public int getFloor_N() {
		return floor_N;
	}
	public void setFloor_N(int floor_N) {
		this.floor_N = floor_N;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAreasLocationDescription() {
		return areasLocationDescription;
	}
	public void setAreasLocationDescription(String areasLocationDescription) {
		this.areasLocationDescription = areasLocationDescription;
	}
	@Override
	public String toString() {
		return "P_C_A [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", nationality=" + nationality + ", isMale=" + isMale + ", dateOfEntry=" + dateOfEntry
				+ ", releaseDate=" + releaseDate + ", cellId=" + cellId + ", conviction=" + conviction + ", punishment="
				+ punishment + ", religion=" + religion + ", image=" + image + ", cellNumber=" + cellNumber
				+ ", status=" + status + ", size=" + size + ", cellsLocationDescription=" + cellsLocationDescription
				+ ", floor_N=" + floor_N + ", areaId=" + areaId + ", areaName=" + areaName + ", description="
				+ description + ", areasLocationDescription=" + areasLocationDescription + "]";
	}
	
	
	
	
}
