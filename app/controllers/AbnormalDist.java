package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class AbnormalDist extends Controller {

    @Before
    static void checkAuthentification() {
    	// 判断用户访问权限
    }

    public static void index() {
        render();
    }
    
    public static void getAbnormalPos(int abnormalType, Date startDate, Date endDate) {
        render();
    }

}