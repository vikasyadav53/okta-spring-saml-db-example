package com.okta.developer.auth;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

/**
 * @author jcavazos
 */
@Entity
@Table(name = "USER")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class StoredUser implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id = UUID.randomUUID().toString();

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String passwordHash;

	public StoredUser() {
	}

	public StoredUser(String id, String username, String passwordHash) {
		super();
		this.id = id;
		this.username = username;
		this.passwordHash = passwordHash;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	
	
    
    
}
