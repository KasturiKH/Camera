package com.xworkz.iplteam;

import com.xworkz.iplteam.dao.IplTeamDAOImplementation;
import com.xworkz.iplteam.dto.IplTeamDTO;

public class iplTeamRunner {

	public static void main(String[] args) {
		IplTeamDTO ipldto1=new IplTeamDTO();
		ipldto1.setName("BANGALORE");
		ipldto1.setId(70);
		ipldto1.setCaptain("VIRAT");
		ipldto1.setSponser("MUTHOOT");
		ipldto1.setNoOfLostMatch(4);
		ipldto1.setNoOfWins(8);
		
		IplTeamDTO ipldto2=new IplTeamDTO();
		ipldto2.setName("CHENNI");
		ipldto2.setId(71);
		ipldto2.setCaptain("DONNE");
		ipldto2.setSponser("TVS");
		ipldto2.setNoOfLostMatch(3);
		ipldto2.setNoOfWins(9);
		
		
		IplTeamDTO ipldto3=new IplTeamDTO();
		ipldto3.setName("DELHI");
		ipldto3.setId(72);
		ipldto3.setCaptain("ROHIT");
		ipldto3.setSponser("BOLT");
		ipldto3.setNoOfLostMatch(5);
		ipldto3.setNoOfWins(10);
		
		IplTeamDTO ipldto4=new IplTeamDTO();
		ipldto4.setName("Mumbai");
		ipldto4.setId(73);
		ipldto4.setCaptain("ROHIT");
		ipldto4.setSponser("LOTUS");
		ipldto4.setNoOfLostMatch(6);
		ipldto4.setNoOfWins(11);
		
		IplTeamDTO ipldto5=new IplTeamDTO();
		ipldto5.setName("Panjab");
		ipldto5.setId(73);
		ipldto5.setCaptain("Rahul");
		ipldto5.setSponser("HINDWARE");
		ipldto5.setNoOfLostMatch(6);
		ipldto5.setNoOfWins(11);
		
		IplTeamDTO ipldto6=new IplTeamDTO();
		ipldto6.setName("Kolkata");
		ipldto6.setId(73);
		ipldto6.setCaptain("shreyas");
		ipldto6.setSponser("winzo");
		ipldto6.setNoOfLostMatch(6);
		ipldto6.setNoOfWins(11);
		
		IplTeamDTO ipldto7=new IplTeamDTO();
		ipldto7.setName("Rajasthan");
		ipldto7.setId(73);
		ipldto7.setCaptain("Sanju");
		ipldto7.setSponser("Happilo");
		ipldto7.setNoOfLostMatch(6);
		ipldto7.setNoOfWins(11);
		
		IplTeamDTO ipldto8=new IplTeamDTO();
		ipldto8.setName("Mumbai");
		ipldto8.setId(73);
		ipldto8.setCaptain("Rahul");
		ipldto8.setSponser("LOTUS");
		ipldto8.setNoOfLostMatch(6);
		ipldto8.setNoOfWins(11);
		
		IplTeamDTO ipldto9=new IplTeamDTO();
		ipldto9.setName("Hyderabad");
		ipldto9.setId(73);
		ipldto9.setCaptain("David");
		ipldto9.setSponser("cars");
		ipldto9.setNoOfLostMatch(6);
		ipldto9.setNoOfWins(11);
		
		IplTeamDTO ipldto10=new IplTeamDTO();
		ipldto10.setName("Gujarat");
		ipldto10.setId(73);
		ipldto10.setCaptain("Suresh");
		ipldto10.setSponser("Boat");
		ipldto10.setNoOfLostMatch(6);
		ipldto4.setNoOfWins(11);
		
		IplTeamDTO ipldto11=new IplTeamDTO();
		ipldto11.setName("Mumbai indian");
		ipldto11.setId(73);
		ipldto11.setCaptain("ravindar");
		ipldto11.setSponser("e-commers");
		ipldto11.setNoOfLostMatch(6);
		ipldto11.setNoOfWins(11);
		
		IplTeamDTO ipldto12=new IplTeamDTO();
		ipldto12.setName("Rajasthan royals");
		ipldto12.setId(73);
		ipldto12.setCaptain("shikhar");
		ipldto12.setSponser("Kotak card");
		ipldto12.setNoOfLostMatch(6);
		ipldto12.setNoOfWins(11);
		
		IplTeamDTO ipldto13=new IplTeamDTO();
		ipldto13.setName("sunrise hyderabad");
		ipldto13.setId(73);
		ipldto13.setCaptain("Dinesh");
		ipldto13.setSponser("Unacademy");
		ipldto13.setNoOfLostMatch(6);
		ipldto13.setNoOfWins(11);
		
		
		IplTeamDTO ipldto14=new IplTeamDTO();
		ipldto14.setName("Delhi capital");
		ipldto14.setId(73);
		ipldto14.setCaptain("jasprit");
		ipldto14.setSponser("Upstox");
		ipldto14.setNoOfLostMatch(6);
		ipldto14.setNoOfWins(11);
		
		
		
		
		IplTeamDAOImplementation dao=new IplTeamDAOImplementation();
		
		IplTeamDAOImplementation castedDAO=(IplTeamDAOImplementation)dao;
		
		
		
		castedDAO.IplTeamDTOfindByName("DELHI");
		castedDAO.save(ipldto1);
		castedDAO.save(ipldto2);
		castedDAO.save(ipldto3);
		castedDAO.save(ipldto4);
		castedDAO.save(ipldto5);
		castedDAO.save(ipldto6);
		castedDAO.save(ipldto7);
		castedDAO.save(ipldto8);
		castedDAO.save(ipldto9);
		castedDAO.save(ipldto10);
		castedDAO.save(ipldto11);
		castedDAO.save(ipldto12);
		castedDAO.save(ipldto13);
		castedDAO.save(ipldto14);
		
		
		castedDAO.findByNameAndSponser("Kolkata","winzo");
		castedDAO.findByNameAndSponserAndCaptain("sunrise hyderabad","Unacademy","Dinesh");
		
		castedDAO.totalTeams();
		
		System.out.println("total number of teams" + castedDAO.totalTeams());
				
		castedDAO.updateSponserByName("Rajasthan royals", "winzo");
		
		castedDAO.updateCaptainByName("sunrise hyderabad", "Rahul");
		
		
	}





	}


