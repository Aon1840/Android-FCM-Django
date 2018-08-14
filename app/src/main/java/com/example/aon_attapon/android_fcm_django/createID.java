package com.example.aon_attapon.android_fcm_django;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class createID {

    Date now = new Date();
    int id = Integer.parseInt(new SimpleDateFormat("ddHHmmss", Locale.US).format(now));


}
