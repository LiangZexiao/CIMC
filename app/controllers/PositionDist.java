package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class PositionDist extends Controller {

    @Before
    static void checkAuthentification() {
    	// 判断用户访问权限
    }

    public static void index() {

		// 页面渲染参数测试（后端写完请删除）
    	ArrayList<Map> first_menu = new ArrayList<Map>();
    	Map first_menu1 = new HashMap();
    	first_menu1.put("menu_name", "实时监控");
    	first_menu1.put("is_click", 0);
    	first_menu1.put("rel_url","#");
    	Map first_menu2 = new HashMap();
    	first_menu2.put("menu_name", "数据统计");
    	first_menu2.put("is_click", 1);
    	first_menu2.put("rel_url","#");
    	first_menu.add(first_menu1);
    	first_menu.add(first_menu2);

    	ArrayList<Map> second_menu = new ArrayList<Map>();
    	Map second_menu1 = new HashMap();
    	second_menu1.put("menu_name", "历史数据查询");
    	second_menu1.put("is_click", 0);
    	second_menu1.put("rel_url","#");
    	Map second_menu2 = new HashMap();
    	second_menu2.put("menu_name", "车辆轨迹查询");
    	second_menu2.put("is_click", 1);
    	second_menu2.put("alias", "trajectory");
    	second_menu2.put("rel_url","#");
    	Map second_menu3 = new HashMap();
    	second_menu3.put("menu_name", "车辆轨迹查询");
    	second_menu3.put("is_click", 0);
    	second_menu3.put("alias", "trajectory");
    	second_menu3.put("rel_url","#");

    	ArrayList<Map> third_menu = new ArrayList<Map>();
    	Map third_menu1 = new HashMap();
    	third_menu1.put("menu_name", "实时监控");
    	third_menu1.put("is_click", 0);
    	third_menu1.put("rel_url","#");
    	Map third_menu2 = new HashMap();
    	third_menu2.put("menu_name", "数据统计");
    	third_menu2.put("is_click", 1);
    	third_menu2.put("rel_url","#");
    	third_menu.add(third_menu1);
    	third_menu.add(third_menu2);
    	second_menu2.put("child_menu", third_menu);

    	ArrayList<Map> third_menu_1 = new ArrayList<Map>();
    	Map third_menu_11 = new HashMap();
    	third_menu_11.put("menu_name", "实时监控");
    	third_menu_11.put("is_click", 0);
    	third_menu_11.put("rel_url","#");
    	Map third_menu_12 = new HashMap();
    	third_menu_12.put("menu_name", "数据统计");
    	third_menu_12.put("is_click", 0);
    	third_menu_12.put("rel_url","#");
    	third_menu_1.add(third_menu_11);
    	third_menu_1.add(third_menu_12);
    	second_menu3.put("child_menu", third_menu_1);

    	second_menu.add(second_menu1);
    	second_menu.add(second_menu2);
    	second_menu.add(second_menu3);

    	int is_login = 1;
        int abnormal_num = 0;

        render(first_menu, second_menu, abnormal_num, is_login);
        
    }

}