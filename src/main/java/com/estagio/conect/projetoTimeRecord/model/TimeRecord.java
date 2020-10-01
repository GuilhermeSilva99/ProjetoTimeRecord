package com.estagio.conect.projetoTimeRecord.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Document(collection = "records")
@Getter @Setter
public class TimeRecord {
	
	@Id
	private String id;
	
	@Indexed
	private Long business;
	
	@Indexed
    private Long account;
    
	private LocalDateTime datetime;
	 
	@DBRef
    private Location location;
    
    private RecordType status;
    
    private boolean accepted;
    
    private String hash;
    
    @CreatedDate
    private LocalDateTime createdAt;
    
    @LastModifiedDate
    private LocalDateTime updatedAt;
    
    public void setLocation(String latitude, String longitude) {
    	//setLocation(new Location(latitude, longitude));
    	//Tive que alterar um pouco esse metodo pára ele poder funcionar
    	location = new Location();
    	location.setLocation(latitude, longitude);
    }
    
    public enum RecordType {
    	ONLINE,
    	OFFLINE,
    	MANUAL
    }    
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getBusiness() {
		return business;
	}

	public void setBusiness(Long business) {
		this.business = business;
	}

	public Long getAccount() {
		return account;
	}

	public void setAccount(Long account) {
		this.account = account;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public RecordType getStatus() {
		return status;
	}

	public void setStatus(RecordType status) {
		this.status = status;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}