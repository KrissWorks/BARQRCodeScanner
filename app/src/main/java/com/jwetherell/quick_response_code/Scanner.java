package com.jwetherell.quick_response_code;

import android.content.Intent;

import java.util.ArrayList;

/**
 * Created by KrissRaj on 10-11-2015.
 */
public interface Scanner {

    public ArrayList<String> getContents();
    public String ScannerType();
    public boolean scanFilter();

}
