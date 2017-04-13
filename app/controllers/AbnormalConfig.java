package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class AbnormalConfig extends Controller {

    @Before
    static void checkAuthentification() {
    	// 判断用户访问权限
    }

    public static void query() {
        render();
    }
    
    public static void save(int id, Long abnConfigValue, String remark) {
		
	}

}