package com.xworkz.athlectics.runner;

import java.time.LocalTime;

import com.xworkz.Athletics.dto.RelayDTO;

public class AthleticsRunner {

	public static void main(String[] args) {

		RelayDTO relay4 = new RelayDTO();

		relay4.setSportName("400-meters-Relay");
		relay4.setMeters(400);
		relay4.setNoOfPerson(4);
		relay4.setRelayType("Baton");
		relay4.setRelaySlot(3);
		relay4.setNoOfTeamsAtOnce(8);
		relay4.setPriceMoney(500000.00D);
		relay4.setLastYearChampions("India");
		relay4.setTimeRecord(LocalTime.of(0, 0, 35, 79));

		Integer rely4 = relay4.hashCode();
		System.out.println(rely4);

		System.out.println("Second Relay Race");

		RelayDTO relay8 = new RelayDTO();

		relay8.setSportName("400-meters-Relay");
		relay8.setMeters(800);
		relay8.setNoOfPerson(4);
		relay8.setRelayType("Ice-Skating");
		relay8.setRelaySlot(6);
		relay8.setNoOfTeamsAtOnce(10);
		relay8.setPriceMoney(700000.00D);
		relay8.setLastYearChampions("Japan");
		relay8.setTimeRecord(LocalTime.of(0, 0, 57, 79));

		Integer rely8 = relay4.hashCode();
		System.out.println(rely8);

		System.out.println("Third Relay Race");

		RelayDTO relay = new RelayDTO();

		relay.setSportName("1000-meters-Relay");
		relay.setMeters(1000);
		relay.setNoOfPerson(5);
		relay8.setRelayType("Swimming");
		relay8.setRelaySlot(5);
		relay8.setNoOfTeamsAtOnce(5);
		relay8.setPriceMoney(900000.00D);
		relay8.setLastYearChampions("Australia");
		relay8.setTimeRecord(LocalTime.of(0, 0, 47, 99));

		Integer rely = relay.hashCode();
		System.out.println(rely);

		Boolean obj = relay4.getNoOfPerson().equals(relay8.getNoOfPerson());
		System.out.println(obj);
		if (obj != null) {
			if (relay4.getNoOfPerson().equals(relay8.getNoOfPerson()) && relay4.getMeters().equals(relay8.getMeters() )) {
				System.out.println("Both Are Same");
			}
			else {
				System.out.println("Both Are Not Same");
			}

		}

	}

}
