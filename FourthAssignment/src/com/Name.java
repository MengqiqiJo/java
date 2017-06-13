package com;

import java.util.StringTokenizer;

public class Name {
	private String firstName;
	private String middlerName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddlerName() {
		return middlerName;
	}

	public void setMiddlerName(String middlerName) {
		this.middlerName = middlerName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Name(String aname) {
		getName(aname.toString());

	}

	public Name(Name name) {
		this(name.toString());
	}

	public void setName(Name name1) {
		getName(name1.toString());

	}

	public String toString() {
		if (this.middlerName == null) {
			return this.lastName + "," + " " + this.firstName + " ";
		} else {
			return this.lastName + "," + " " + this.firstName + " "
					+ Character.toUpperCase(this.middlerName.charAt(0)) + ". ";
		}
	}

	public void getName(String name) {
		StringTokenizer getToken = new StringTokenizer(name);
		if (getToken.countTokens() == 2) {
			this.firstName = getToken.nextToken();
			this.middlerName = null;
			this.lastName = getToken.nextToken();
		} else if (getToken.countTokens() == 3) {
			this.firstName = getToken.nextToken();
			this.middlerName = getToken.nextToken();
			this.lastName = getToken.nextToken();
		}
	}
}
