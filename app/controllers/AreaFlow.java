package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class AreaFlow extends Controller {

    @Before
    static void checkAuthentification() {
    	// 判断用户访问权限
    }

    public static void query(Date starttime, Date endtime) {
        render();
    }

}