package com.xworkz.iplteam.dao;

import com.xworkz.iplteam.dto.IplTeamDTO;

public class IplTeamDAOImplementation extends IplTeamDAO{
	
	


	@Override
	public void save(IplTeamDTO dto) 
	{

		System.out.println("Created save dto");
		
		if(dto!=null && super.index<this.ipldto.length)
		{
			this.ipldto[super.index]=dto;
			super.index++;
			
			System.out.println("IplImplementationTeamDTO created sucessfully @"+super.index);
			
			
		}
		
		
	}
	public IplTeamDTO IplTeamDTOfindByName(String name)
	{
		IplTeamDTO[] arrayFromDTOParent=super.getIpldto();
		
		for(int count=0;count<arrayFromDTOParent.length;count++)
		{
			//IplTeamDTO tempDTO=arrayFromDTOParent[count];
			if(arrayFromDTOParent[count]!=null && arrayFromDTOParent[count].getCaptain()==(name))
			{
				System.out.println("Name is founded from dto @"+index);
				return ipldto[super.index];
			}
			else
			{
				System.out.println("Name is not found @"+index);
				return null;
			}
		}
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
	
	
	
	
	
	

	
