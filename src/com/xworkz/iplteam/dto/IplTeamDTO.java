package com.xworkz.iplteam.dto;

public class IplTeamDTO {
	private int id;
	private String name;
	private String sponser;
	private String captain;
	private int noOfWins;
	private int noOfLostMatch;
	
	
	public IplTeamDTO() {

		System.out.println("Created default dto");
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSponser() {
		return sponser;
	}


	public void setSponser(String sponser) {
		this.sponser = sponser;
	}


	public String getCaptain() {
		return captain;
	}


	public void setCaptain(String captain) {
		this.captain = captain;
	}


	public int getNoOfWins() {
		return noOfWins;
	}


	public void setNoOfWins(int noOfWins) {
		this.noOfWins = noOfWins;
	}


	public int getNoOfLostMatch() {
		return noOfLostMatch;
	}


	public void setNoOfLostMatch(int noOfLostMatch) {
		this.noOfLostMatch = noOfLostMatch;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((captain == null) ? 0 : captain.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

}
