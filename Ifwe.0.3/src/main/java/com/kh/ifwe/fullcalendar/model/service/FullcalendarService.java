package com.kh.ifwe.fullcalendar.model.service;

import java.util.List;
import java.util.Map;

import com.kh.ifwe.club.model.vo.Club;
import com.kh.ifwe.fullcalendar.model.vo.Fullcalendar;

public interface FullcalendarService {

	void addFullcalendar(Fullcalendar fullcalendar);

	List<Fullcalendar> selectList(String clubCode);

	int updateFC(Fullcalendar fc);

	int deleteFC(Fullcalendar fc);

	Club checkMaster(String clubCode);

	int selectClubMember(Map<String, String> ClubMemberCheck);

	
}
