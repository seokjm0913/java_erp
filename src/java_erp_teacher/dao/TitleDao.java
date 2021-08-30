package java_erp_teacher.dao;

import java.util.ArrayList;

import java_erp_teacher.dto.Title;

public interface TitleDao {
	ArrayList<Title> selectTitleByAll();
	Title selectTitleByNo(Title title);
	
	int insertTitle(Title title);
	int updateTitle(Title title);
	int deleteTitle(Title title);
}
