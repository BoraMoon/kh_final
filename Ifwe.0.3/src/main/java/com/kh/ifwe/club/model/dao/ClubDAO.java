package com.kh.ifwe.club.model.dao;

import java.util.List;
import java.util.Map;

import com.kh.ifwe.board.model.vo.Board;
import com.kh.ifwe.club.model.vo.Club;
import com.kh.ifwe.club.model.vo.ClubLoggedIn;
import com.kh.ifwe.club.model.vo.ClubMaster;
import com.kh.ifwe.club.model.vo.ClubMember;
import com.kh.ifwe.club.model.vo.Count;
import com.kh.ifwe.club.model.vo.Heart;
import com.kh.ifwe.clubBoard.model.vo.BoardImg;
import com.kh.ifwe.clubBoard.model.vo.ClubBoard;
import com.kh.ifwe.clubBoard.model.vo.ClubBoardProfile;
import com.kh.ifwe.member.model.vo.Member;
import com.kh.ifwe.member.model.vo.Message;
import com.kh.ifwe.member.model.vo.MsgPro;
import com.kh.ifwe.mian.model.vo.SearchKeyword;

public interface ClubDAO {

	int create(Club club);

	int selectSeq();

	String selectCate(String hashtag);

	int insertContent(String hashtag);

	int insertCategory(Map<String, Object> map);

	List<ClubMaster> clubSearch();

	Club selectOne(int clubCode);

	Member selectClubMaster(int clubMaster);

	List<ClubMaster> searchClubByHashtag(Map<String, Object> param);

	List<ClubMaster> selectListByName(Map<String, Object> param);

	List<Member> selectMemberCode(int clubCode);

	List<ClubMember> selectClubMember(Map<String, Object> param2);

	ClubMember selectClubMaster2(Map<String, Object> param2);

	int insertMsgEnroll(Map<String, Object> param);

	List<Message> selectMsgList(int clubCode);

	MsgPro selectMsgOne(int msgCode);

	int insertClubMembers(Map<String, Object> param);

	int updateMembersGrade(Map<String, Integer> param);

	int deleteMembers(Map<String, Integer> param);

	int updateMsgView(int msgCode);


	int updateClub(Club newClub);

	ClubLoggedIn selectClubLoggedIn(Map<String, Object> param);

	int deleteClubMember(Map<String, Object> param);

	List<ClubBoard> selectBoardList(int clubCode);

	List<ClubBoardProfile> selectclubBoardProfileList(int clubCode);

	int deleteMsg(Map<String, Object> param);

	int insertSearchKeyword(Map<String, Object> param);

	List<Integer> selectMaleCount(List<Integer> clubCode);

	List<Count> selectAge(List<Integer> clubCode);

	List<Club> selectClubCateList(String clubCatecode);

	List<SearchKeyword> selectSearchKeywordList();

	List<ClubBoardProfile> selectclubBoardSearch(Map<String, Object> param);

	List<ClubBoard> selectReportBoardList(int clubCode);

	int blindBoard(int boardNo);

	List<ClubMaster> clubSearch(int cPage, int numPerPage);

	List<ClubMaster> searchClubByHashtag(Map<String, Object> param, int numPerPage, int cPage);

	List<ClubMaster> selectListByName(Map<String, Object> param, int numPerPage, int cPage);

	Integer selectAgeAvg(int clubCode);

	List<Heart> selectHeartMember();


}
