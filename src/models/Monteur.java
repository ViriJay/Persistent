package models;

import javax.xml.bind.annotation.XmlTransient;

public class Monteur {
	
	private String voornaam;
	private String achternaam;
	private String nickname;
	private String wachtwoord;
	
	public Monteur(String voornaam, String achternaam, String nickname, String wachtwoord) {
		super();
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.nickname = nickname;
		this.wachtwoord = wachtwoord;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@XmlTransient
	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	
}
