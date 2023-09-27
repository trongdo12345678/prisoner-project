package entity;

import java.time.LocalDate;
import java.util.Objects;

public class WorkShiftsByWarden {
	private int shiftId;
	private Wardens wardenId;
	private LocalDate shiftDate;
	private LocalDate startTime;
	private LocalDate endTime;
	private Areas areaId;
	
	public WorkShiftsByWarden() {
	}

	public WorkShiftsByWarden(int shiftId, Wardens wardenId, LocalDate shiftDate, LocalDate startTime, LocalDate endTime,
			Areas areaId) {
		this.shiftId = shiftId;
		this.wardenId = wardenId;
		this.shiftDate = shiftDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.areaId = areaId;
	}

	public int getShiftId() {
		return shiftId;
	}

	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}

	public Wardens getWardenId() {
		return wardenId;
	}

	public void setWardenId(Wardens wardenId) {
		this.wardenId = wardenId;
	}

	public LocalDate getShiftDate() {
		return shiftDate;
	}

	public void setShiftDate(LocalDate shiftDate) {
		this.shiftDate = shiftDate;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}

	public Areas getAreaId() {
		return areaId;
	}

	public void setAreaId(Areas areaId) {
		this.areaId = areaId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(areaId, endTime, shiftDate, shiftId, startTime, wardenId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorkShiftsByWarden other = (WorkShiftsByWarden) obj;
		return Objects.equals(areaId, other.areaId) && Objects.equals(endTime, other.endTime)
				&& Objects.equals(shiftDate, other.shiftDate) && shiftId == other.shiftId
				&& Objects.equals(startTime, other.startTime) && Objects.equals(wardenId, other.wardenId);
	}

	
	
	
}
