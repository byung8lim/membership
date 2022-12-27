package com.byung8.common.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member {

/*
		SELECT
		  a.MBR_ID as memberId
		 ,a.MBR_EMLADDR as email
		 ,a.MBR_NM as name
		 ,a.MBR_GNDR_ID as genderId
		 , (SELECT b.CMM_CD_NM FROM TB_CMM_CD b WHERE a.MBR_GNDR_ID=b.CMM_CD_ID AND b.GRP_CD='06') as genderNm
		 ,a.BRTH_DAY as birthday
		 ,a.HEIGHT as height
		 ,a.PASSWORD as password
		 ,a.USE_YN as useYn
		 ,a.REG_DT as regDt
		 ,a.UDP_DT as udpDt
		FROM TB_FS_MEMBER a;
*/
	private String memberId;
	private String email;
	private String name;
	private String genderId;
	private String genderNm;
	private String birthday;
	private float height;
	private String password;
	private String useYn;
	private Date regDt;
	private Date udpDt;
}
