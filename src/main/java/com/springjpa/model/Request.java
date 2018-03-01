package com.springjpa.model;

import java.io.Serializable;


import com.springjpa.Converter;
import com.springjpa.StringCryptoConverter;


import java.time.LocalDate;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "requests")
public class Request implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	@Converter(converter = StringCryptoConverter.class)
	private String name;

	@Column(name = "type")
	@Converter(converter = StringCryptoConverter.class)
	private String type;
	
	@Column(name = "details")
	@Converter(converter = StringCryptoConverter.class)
	private String details;

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }
    public String getdetails() {
        return details;
    }

    public void setdetails(String details) {
        this.details = details;
    }
	protected Request() {
	}

	public Request(String name, String type, String details) {
		this.name = name;
		this.type = type;
		this.details = details;
	}

	@Override
	public String toString() {
		return String.format("Request[id=%d, name='%s', type='%s', details='%s']", id, name, type, details);
	}
}
