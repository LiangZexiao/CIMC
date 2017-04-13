package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class DirectionRecommend extends Controller {

    @Before
    static void checkAuthentification() {
    	// 判断用户访问权限
    }

    public static void getAdvanceDir(ArrayList<Map> start, ArrayList<Map> end) {
        render();
    }

}