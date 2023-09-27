package entity;

import java.util.Objects;

public class Areas {
	private int areaId;
	private String areaName;
	private String description;
	private String areasLocationDescription;
	private Wardens wardenId;

	public Areas() {
		super();
	}

	public Areas(int areaId, String areaName, String description, String areasLocationDescription, Wardens wardenId) {
		this.areaId = areaId;
		this.areaName = areaName;
		this.description = description;
		this.areasLocationDescription = areasLocationDescription;
		this.wardenId = wardenId;
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

	public Wardens getWardenId() {
		return wardenId;
	}

	public void setWardenId(Wardens wardenId) {
		this.wardenId = wardenId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(areaId, areaName, areasLocationDescription, description, wardenId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Areas other = (Areas) obj;
		return areaId == other.areaId && Objects.equals(areaName, other.areaName)
				&& Objects.equals(areasLocationDescription, other.areasLocationDescription)
				&& Objects.equals(description, other.description) && Objects.equals(wardenId, other.wardenId);
	}

	
	
}
