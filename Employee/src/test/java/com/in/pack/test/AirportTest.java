package com.in.pack.test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.in.pack.Flight;
import com.in.pack.Passenger;

public class AirportTest {
		 
	    @DisplayName("Given there is an economy flight")
	    @Nested
	    class EconomyFlightTest {
	 
	        private Flight economyFlight;
	 
	        @BeforeEach
	        void setUp() {
	            economyFlight = new Flight("1", "Economy");
	        }
	 
	        @Test
	        public void testEconomyFlightRegularPassenger() {
	            Passenger mike = new Passenger("Mike", false);
	 
	            assertEquals("1", economyFlight.getId());
	            assertEquals(true, economyFlight.addPassenger(mike));
	            assertEquals(1, economyFlight.getPassengersList().size());
	            assertEquals("Mike",
	                    economyFlight.getPassengersList().get(0).getName());
	 
	            assertEquals(true, economyFlight.removePassenger(mike));
	            assertEquals(0, economyFlight.getPassengersList().size());
	        }
	 
	        @Test
	        public void testEconomyFlightVipPassenger() {
	            Passenger james = new Passenger("James", true);
	 
	            assertEquals("1", economyFlight.getId());
	            assertEquals(true, economyFlight.addPassenger(james));
	            assertEquals(1, economyFlight.getPassengersList().size());
	            assertEquals("James",
	                    economyFlight.getPassengersList().get(0).getName());
	 
	            assertEquals(false, economyFlight.removePassenger(james));
	            assertEquals(1, economyFlight.getPassengersList().size());
	        }
	    }
	}



