package entity;

import java.util.Objects;

public class RelativesByPrisoner {
	private int relativeId; //entity
	private int id;
	private String relativeName;
	private String contactInfo;
	private String relationship;

	public RelativesByPrisoner(int relativeId, int id, String relativeName, String contactInfo, String relationship) {
		this.relativeId = relativeId;
		this.id = id;
		this.relativeName = relativeName;
		this.contactInfo = contactInfo;
		this.relationship = relationship;
	}

	public RelativesByPrisoner() {
	}

	public int getRelativeId() {
		return relativeId;
	}

	public void setRelativeId(int relativeId) {
		this.relativeId = relativeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRelativeName() {
		return relativeName;
	}

	public void setRelativeName(String relativeName) {
		this.relativeName = relativeName;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactInfo, id, relationship, relativeId, relativeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RelativesByPrisoner other = (RelativesByPrisoner) obj;
		return Objects.equals(contactInfo, other.contactInfo) && Objects.equals(id, other.id)
				&& Objects.equals(relationship, other.relationship) && relativeId == other.relativeId
				&& Objects.equals(relativeName, other.relativeName);
	}

	
	
	
	
}
