package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class AvoidAreaConfig extends Controller {

    @Before
    static void checkAuthentification() {
    	// 判断用户访问权限
    }

    public static void index() {
        render();
    }
    
    public static void save(int id, String leftUpper, String leftLower, String rightUpper, String rightLower, String area, String avoid_reason) {
        render();
    }
    
}