package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Index extends Controller {
	// 存放首页及公共部分接口

    public static void index() {
    	ArrayList<Map> first_menu = new ArrayList<Map>();
    	Map menu1 = new HashMap();
    	menu1.put("menu_name", "实时监控");
    	menu1.put("is_click", false);
    	menu1.put("rel_url","#");

    	Map menu2 = new HashMap();
    	menu2.put("menu_name", "数据统计");
    	menu2.put("is_click", false);
    	menu2.put("rel_url","#");

    	first_menu.add(menu1);
    	first_menu.add(menu2);

    	boolean is_login = false;

        renderTemplate("PositionDist/index.html", first_menu, is_login);
    }
    
    public static void getAreaList(int requestType, int provinceCode) {
    	
    }
    
    public static void getSimilarVidList(int vid) {
    	
    }
    
    public static void abnNoticeWebsocket() {
    	
    }
    
}
