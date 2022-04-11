package com.xworkz.iplteam.dao;

import com.xworkz.iplteam.dto.IplTeamDTO;

public abstract class IplTeamDAO {
	
	private  int iplTeamCount;
	protected IplTeamDTO[] ipldto=new IplTeamDTO[14];
	protected int index=0;
	
	public  void save(IplTeamDTO dto)
	{

		System.out.println("Created save dto");
		
		if(dto!=null  && index<this.ipldto.length) 
		{
			this.ipldto[index]=dto;
			index++;
			System.out.println("IplTeamDTO created "+dto);
			
			
		}
		
		
	}

	public IplTeamDTO[] getIpldto() {
		return ipldto;
	
	}


	public IplTeamDTO findByNameAndSponser(String Name, String Sponser) {
		if (Name==null  || Sponser==null) {
			System.err.println("ipl league passed");
			return null;
		}
		for (int index = 0; index < this.ipldto.length; index++) {
			if (this.ipldto[index] != null && this.ipldto[index].getName().equals(Name)  && this.ipldto[index].getSponser().equals(Sponser)) {
				System.out.println("The ipl team found  " + index);
				return this.ipldto[index];
			}
		}
		System.err.println("The ipl team formed");
		return null;
	}



	public IplTeamDTO findByNameAndSponserAndCaptain(String Name,String Sponser,String captain) {
		
		if (Name==null  || Sponser==null || captain==null) {
			System.err.println("null");
			return null;
			}
		for(int index=0;index<this.ipldto.length;index++) {
			if(this.ipldto[index]!=null && this.ipldto[index].getName().equals(Name) && this.ipldto[index].getSponser().equals(Sponser) && this.ipldto[index].getCaptain().equals(captain)) {
				System.out.println("found "+index);
				return this.ipldto[index];		
				}
		}
		System.err.println("the ipl info");
		
		
		return null;
	}
	
	public void updateSponserByName(String Name,String Sponser)
	{
		if(Name==null && Sponser==null) {
			System.out.println("not update sponser by name ");
			return;
			
		}
		IplTeamDTO[] arrayOfDAO=this.getIpldto();
		for(int i=0; i<arrayOfDAO.length;i++);
		System.out.println("update Sponser by name");
				
	}
	
	public void updateCaptainByName(String Name,String Captain)
	{
		if(Name==null && Captain==null) {
			System.out.println("not update Captain by name ");
			return;
			
		}
		IplTeamDTO[] arrayOfDAO=this.getIpldto();
		for(int i=0; i<arrayOfDAO.length;i++);
		System.out.println("update Captain by name");
	
	}





public int totalTeams() {
	int iplTeamCount=0;
	for(int index=0;index<this.ipldto.length;index++) {
		if(this.ipldto[index]!=null) {
			iplTeamCount++;
		}
	}

return iplTeamCount;
}

}

