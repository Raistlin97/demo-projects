/**
 * 
 */
package com.gs.rm.model.contact;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author Sabuj Das
 * 
 */
@Embeddable
public class Address implements Serializable, Comparable<Address> {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1454589998493964440L;
	
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	private Long zipCode;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public int compareTo(Address o) {
		return this.zipCode.compareTo(o.zipCode);
	}
}
