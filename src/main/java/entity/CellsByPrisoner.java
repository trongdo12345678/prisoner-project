package entity;

import java.util.Objects;

public class CellsByPrisoner {
	private int cellId;
	private int cellNumber;
	private String status;
	private String size;
	private String cellsLocationDescription;
	private Areas areaId;

	public CellsByPrisoner(int cellId, int cellNumber, String status, String size, String cellsLocationDescription,
			Areas areaId) {

		this.cellId = cellId;
		this.cellNumber = cellNumber;
		this.status = status;
		this.size = size;
		this.cellsLocationDescription = cellsLocationDescription;
		this.areaId = areaId;
	}

	public CellsByPrisoner() {

	}

	public int getCellId() {
		return cellId;
	}

	public void setCellId(int cellId) {
		this.cellId = cellId;
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

	public Areas getAreaId() {
		return areaId;
	}

	public void setAreaId(Areas areaId) {
		this.areaId = areaId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(areaId, cellId, cellNumber, cellsLocationDescription, size, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellsByPrisoner other = (CellsByPrisoner) obj;
		return Objects.equals(areaId, other.areaId) && cellId == other.cellId && cellNumber == other.cellNumber
				&& Objects.equals(cellsLocationDescription, other.cellsLocationDescription)
				&& Objects.equals(size, other.size) && Objects.equals(status, other.status);
	}

	
	
	
	
}
