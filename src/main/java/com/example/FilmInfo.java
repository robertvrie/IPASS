package com.example;

public class FilmInfo {
	private int id;
	private String naam;
	private String beschrijving;
	private int lengte;
	
	public FilmInfo() {}
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getNaam() {return naam;}
	public void setNaam(String naam) {this.naam = naam;}
	public String getBeschrijving() {return beschrijving;}
	public void setBeschrijving(String beschrijving) {this.beschrijving = beschrijving;}
	public int getLengte() {return lengte;}
	public void setLengte(int lengte) {this.lengte = lengte;}
}