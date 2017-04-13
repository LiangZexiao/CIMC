package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class RegionTrajectory extends Controller {

    @Before
    static void checkAuthentification() {
    	// 判断用户访问权限
    }

    public static void index() {
        render();
    }
    
    public static void query(int province, int city, Date starttime, Date endtime, int device_type){
    	
    }

}