package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class HistoryList extends Controller {

    @Before
    static void checkAuthentification() {
    	// 判断用户访问权限
    }

    public static void index() {
        render();
    }
    
    public static void query(int vid, int city_code, int device_type, int unusual_state, Date starttime, Date endtime){
    	
    }

}