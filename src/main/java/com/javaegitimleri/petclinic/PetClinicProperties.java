package com.javaegitimleri.petclinic;

import org.springframework.boot.context.properties.ConfigurationProperties;

//petclinic prefix i app prop dosyasındaki property lerden bu prefix e sahip olanların bu sınıfla eşleşeceğini   belirtiyor.
@ConfigurationProperties(prefix="petclinic")
public class PetClinicProperties {
	private boolean displayOwnersWithPets =false;
	
	public boolean isDipslayOwnersWithPets() {
		
		return displayOwnersWithPets;
		
	}
		
		public void setDisplayOwnersWithPets(boolean displayOwnersWithPets) {
			this.displayOwnersWithPets=displayOwnersWithPets;
			
		}
	}


