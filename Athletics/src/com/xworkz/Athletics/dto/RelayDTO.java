package com.xworkz.Athletics.dto;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

public class RelayDTO implements Serializable {

	private String sportName;
	private Integer meters;
	private Integer noOfPerson;
	private String relayType;
	private Integer relaySlot;
	private Integer noOfTeamsAtOnce;
	private Double priceMoney;
	private String lastYearChampions;
	private LocalTime timeRecord;

	public RelayDTO() {

		System.out.println("Default Constructor Called");
	}

	@Override
	public int hashCode() {
		return 777;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RelayDTO other = (RelayDTO) obj;
		return Objects.equals(lastYearChampions, other.lastYearChampions) && Objects.equals(meters, other.meters)
				&& Objects.equals(noOfPerson, other.noOfPerson)
				&& Objects.equals(noOfTeamsAtOnce, other.noOfTeamsAtOnce)
				&& Objects.equals(priceMoney, other.priceMoney) && Objects.equals(relaySlot, other.relaySlot)
				&& Objects.equals(relayType, other.relayType) && Objects.equals(sportName, other.sportName)
				&& Objects.equals(timeRecord, other.timeRecord);
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public Integer getMeters() {
		return meters;
	}

	public void setMeters(Integer meters) {
		this.meters = meters;
	}

	public Integer getNoOfPerson() {
		return noOfPerson;
	}

	public void setNoOfPerson(Integer noOfPerson) {
		this.noOfPerson = noOfPerson;
	}

	public String getRelayType() {
		return relayType;
	}

	public void setRelayType(String relayType) {
		this.relayType = relayType;
	}

	public Integer getRelaySlot() {
		return relaySlot;
	}

	public void setRelaySlot(Integer relaySlot) {
		this.relaySlot = relaySlot;
	}

	public Integer getNoOfTeamsAtOnce() {
		return noOfTeamsAtOnce;
	}

	public void setNoOfTeamsAtOnce(Integer noOfTeamsAtOnce) {
		this.noOfTeamsAtOnce = noOfTeamsAtOnce;
	}

	public Double getPriceMoney() {
		return priceMoney;
	}

	public void setPriceMoney(Double priceMoney) {
		this.priceMoney = priceMoney;
	}

	public String getLastYearChampions() {
		return lastYearChampions;
	}

	public void setLastYearChampions(String lastYearChampions) {
		this.lastYearChampions = lastYearChampions;
	}

	public LocalTime getTimeRecord() {
		return timeRecord;
	}

	public void setTimeRecord(LocalTime timeRecord) {
		this.timeRecord = timeRecord;
	}

}
