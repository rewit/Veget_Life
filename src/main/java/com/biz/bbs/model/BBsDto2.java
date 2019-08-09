package com.biz.bbs.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BBsDto2 {

	 	private long bbs_seq;			//	NUMBER	PRIMARY KEY,
	 	private long bbs_main_seq;		//	NUMBER	,
	    private int bbs_layer;			//	NUMBER	,
	    private String bbs_date;		//	VARCHAR2(10)	,
	    private String bbs_time;		//	VARCHAR2(20)	,
	    private String bbs_auth;		//	nVARCHAR2(50)	,
	    private String bbs_title;		//	nVARCHAR2(255)	,
	    private String bbs_content;		//	nVARCHAR2(1000)	
	    
	 
	    private List<BBsVO> bbs_rep_list;
}
