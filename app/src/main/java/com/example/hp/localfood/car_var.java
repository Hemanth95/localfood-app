package com.example.hp.localfood;

import android.app.Application;

/**
 * Created by HP on 8/10/2017.
 */


public class car_var extends Application {
    private static String names;

    static {
        names ="nothing";
    }
    public String getvar(){
        return names;
    }
    public void setvar(String str){
        names = str;

    }
}
