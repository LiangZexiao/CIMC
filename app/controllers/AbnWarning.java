package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class AbnWarning extends Controller {

    @Before
    static void checkAuthentification() {
    	// 判断用户访问权限
    }

    public static void index() {
        render();
    }
    
    public static void warningWebsocket() {
        render();
    }
    
    public static void getAbnWarningInfo() {
        render();
    }

}