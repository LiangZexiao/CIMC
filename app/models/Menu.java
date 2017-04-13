package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;

import org.apache.commons.collections.map.HashedMap;

import play.db.jpa.Model;

@Entity(name = "menu")
public class Menu extends Model {
	
	// public int id;
	
	public String menu_name;
	
	public int grade;
	
	public String rel_menu_name;
	
	public String rel_url;
	
	public Menu(String menu_name, int grade, String rel_menu_name, String rel_url){
		
		// this.id = id;
		this.grade = grade;
		this.menu_name = menu_name;
		this.rel_menu_name = rel_menu_name;
		this.rel_url = rel_url;
		
	}


	public ArrayList<Map> getFirstMenuList(String firstMenuName){
		
		ArrayList<Map> firstMenu = new ArrayList<Map>();
		List<Menu> menuList = Menu.find("grade = ?", 0).fetch();
		
		for(Menu menu : menuList){
			
			Map menuMap = new HashedMap();
			menuMap.put("menu_name", menu.menu_name);
			menuMap.put("rel_url", menu.rel_url);
			
			if(firstMenuName.equals(menu.menu_name)){
				
				menuMap.put("is_click", true);
				
			}else{
				
				menuMap.put("is_click", false);
				
			}
			
			firstMenu.add(menuMap);
			
		}
		
		return firstMenu;
	}
	
	public ArrayList<Map> getMenuTree(String firstMenuName, String secondMenuName, String thirdMenuName, List<Integer> ids){
		
		ArrayList<Map> menuTree = new ArrayList<Map>();
		
		return menuTree;
		
	}
	
}
