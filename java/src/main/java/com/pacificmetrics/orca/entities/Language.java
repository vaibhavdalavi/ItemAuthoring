package com.pacificmetrics.orca.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.apache.openjpa.persistence.DataCache;

@Entity
@Table(name="languages")
@Cacheable(true)
@DataCache(timeout=3600000) //TODO Cache is not working currently. Need to research. When query cache is enabled, JPA caches the data that is not supposed to be cached...
@NamedQueries({
	@NamedQuery(name="allLanguages", 
		    query="select l from Language l")
})
public class Language implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="l_code")
	private String code;
	
	@Basic
	@Column(name="l_name")
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
