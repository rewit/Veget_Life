package com.biz.bbs.mapper;

import org.apache.ibatis.jdbc.SQL;

public class BBsSQL2 {

	public String bbs_insert_sql() {
		SQL sql =new SQL() {{
			INSERT_INTO("tbl_bbs1");
			INTO_COLUMNS("bbs_seq").INTO_VALUES("#{bbs_seq}");
			INTO_COLUMNS("bbs_main_seq").INTO_VALUES("#{bbs_main_seq}");
			INTO_COLUMNS("bbs_layer").INTO_VALUES("#{bbs_layer}");
			INTO_COLUMNS("bbs_date").INTO_VALUES("#{bbs_date}");
			INTO_COLUMNS("bbs_time").INTO_VALUES("#{bbs_time}");
			INTO_COLUMNS("bbs_auth").INTO_VALUES("#{bbs_auth}");
			INTO_COLUMNS("bbs_title").INTO_VALUES("#{bbs_title}");
			INTO_COLUMNS("bbs_content").INTO_VALUES("#{bbs_content}");
			
		}};
		return sql.toString();
	}
	
	public String bbs_update_sql() {
		SQL sql = new SQL() {{ 
				UPDATE("tbl_bbs1");
				SET("bbs_date = #{bbs_date}");
				SET("bbs_time = #{bbs_time}");
				SET("bbs_auth = #{bbs_auth}");
				SET("bbs_title = #{bbs_title}");
				SET("bbs_content = #{bbs_content}");
				WHERE("bbs_seq = #{bbs_seq}");
		}};	
				return sql.toString();
	}
	
	
}
