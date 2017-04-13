package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class LineStatistic extends Controller {

    @Before
    static void checkAuthentification() {
    	// 判断用户访问权限
    }

    public static void all(int device_type, Date starttime, Date endtime) {
        render();
    }
    
    public static void searchAll(int device_type, int city, Date starttime, Date endtime) {
        render();
    }
    
    public static void searchSingle(int device_type, int city, int judgement, Date starttime, Date endtime) {
        render();
    }

}