package com.spring.cafemoa.noticeboard;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NoticeBoardVO {
	
	private int notice_board_seq;
	private String notice_borad_member_id;
	private String notice_borad_title;
	private String notice_borad_content;
	private Date notice_borad_regdate;
	
}
