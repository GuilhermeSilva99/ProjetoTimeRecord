package com.estagio.conect.projetoTimeRecord.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Data
@Document(collection = "locations")
public class Location {
	@Id
	private String id;
	private String latitude;
    private String longitude;
    
    public void setLocation(String latitude, String longitude) {
    	this.latitude = latitude;
    	this.longitude = longitude;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
    
}