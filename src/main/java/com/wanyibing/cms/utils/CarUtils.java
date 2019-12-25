package com.wanyibing.cms.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CarUtils {

	/**
	 * 
	 * @param positionx
	 * @param positiony
	 * @param posix
	 * @param posiy
	 */
	public static int setcar(int positionx,int positiony) {
		
		System.out.println("-----经纬度");
		 return  setCarPosit(positionx,positiony);
		
	}

	private static int setCarPosit(int positionx, int positiony) {

		int s;
		s= (int) Math.round( Math.sqrt( Math.pow(positionx - 39 ,2  ) +  Math.pow(positiony - 116 ,2  ) ));
		
		return s;
	}

	
	/**
	 * 根据传递车牌号码，传递的日期 判断是否符合单双号限行规则
	 * @throws ParseException 
	 */
	public static Date setdate(String date) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		Date parse =  format.parse(date);
		
		return parse;
	}
	 /**
	  * 判断摩托车ABC
	  * @param typeid
	  * @return
	  */
	public static String typeid(String typeid) {
		String type=null;
		if(typeid.equals("A")) {
			type="摩托车A";
		} 
		if(typeid.equals("B")) {
			type="摩托车B";
		} 
		if(typeid.equals("C")) {
			type="汽车c";
		} 
		return type;
	}
	
	/**
	 * 判断是否符合单双号限行规则
	 * @param carid
	 * @return
	 */
	public static String carid(String carid) {
		String car=null;
		System.out.println(carid.substring(0,1));
		if(carid.substring(0,1).equals("京")) {
			carid.substring(5,6).equals(6);
			if(carid.substring(6).equals(1) || carid.substring(6).equals(3) 
					|| carid.substring(6).equals(5) || carid.substring(6).equals(7)) {
				
				car="星期2，4，6";
			}else {
				car="星期1，3，5";
			}
		} 
		
		
		return car;
	}
	
	/**
	 * 传递参数为机动车类型，以及提供的距离天安门距离计算公式按给定的伪代码判断得到违反交规类型
	 * @param juli
	 * @param positiony
	 * @return 60
	 */
	public static String passyn(int juli,String carid,String typeid) {
		String passyn=null;
		
		if(typeid.equals("A")) {
			if(juli<15) {
				passyn="是";
			} else {
				passyn="否";
			}
		} 
		if(typeid.equals("B")) {
			if(juli<40) {
				passyn="是";
			}else {
				passyn="否";
			}
		} 
		if(typeid.equals("C") && carid.substring(0,1)=="京") {
			if(carid.substring(5,6).equals("1") || carid.substring(5,6).equals("3") 
					|| carid.substring(5,6).equals("5") || carid.substring(5,6).equals("7")) {
				passyn="是";
			}else {
				passyn="否";
			} 
	}
		if(typeid.equals("C") && carid.substring(0,1)!="京") {
			if(juli<=60) {
				passyn ="是";
				
			}else {
				passyn="否";
			}
			
		}
		

		return passyn;
	}
	
	
	public static int looplevel(int juli,String carid,String typeid) {
		int cid=0;
		if(typeid.equals("A")) {
			cid=2;
		} 
		if(typeid.equals("B")) {
			cid=4;
		} 
		if(typeid.equals("C") && carid.substring(0,1)!="京") {
			cid=6;
		}
		if(typeid.equals("C") && carid.substring(0,1)=="京") {
				/*carid.substring(5,6).equals(6);
				if(carid.substring(5,6).equals(1) || carid.substring(5,6).equals(3) 
						|| carid.substring(5,6).equals(5) || carid.substring(5,6).equals(7)) {
					cid=6;
				}else {
					cid=1;
				}*/
			cid= 1;
		}
		
		return cid;
	}
	
}
