package com.uitox.http;

/**
 * Created by babyandy on 2015/8/4.
 */
public class NetParams {
    public static final String BASE_URL = "http://www.weather.com.cn";
    public static final String AUTH_URL = BASE_URL + "/auth?source=BGMbyYumeProject";
    public static final String CALENDAR_URL = BASE_URL + "/calendar";
    public static final String USER_URL = BASE_URL + "/user";

    //detail的值
    public static final String DETAIL_SIMPLE = "simple";
    public static final String DETAIL_LARGE = "large";

    //status的值 set collection
    public static final String STATUS_WISH = "wish";
    public static final String STATUS_DONE = "collect";
    public static final String STATUS_DO = "do";
    public static final String STATUS_HOLD = "on_hold";
    public static final String STATUS_DROP = "dropped";

    //ep设置里的status set progress
    public static final String STATUS_URL_WISH = "queue";
    public static final String STATUS_URL_DONE = "watched";
    public static final String STATUS_URL_DROP = "drop";

    //netaba.re的URL
    public static final String NETABARE_AUTH = "http://netaba.re/api/login";

    public static String getWatchingUrl(int uid) {
        return USER_URL + "/" + uid + "/collection?cat=watching";
    }

    public static String getNotifyUrl(String auth) {
        return BASE_URL + "/notify/count?source=BGMbyYumeProject&auth=" + auth;
    }

    public static String getTestUrl(String test) {
        return BASE_URL + "/adat/sk/101010100.html" + test;
    }

    public static String getSubjectUrl(String subjectID, String detail) {
        return BASE_URL + "/subject/" + subjectID + "?source=BGMbyYumeProject&responseGroup=" + detail;
    }

    public static String getCollectionUrl(String subjectID, String auth) {
        return BASE_URL + "/collection/" + subjectID + "?source=BGMbyYumeProject&auth=" + auth;
    }

    public static String getSearchUrl(String query, String detail, int first, int max) {
        return BASE_URL + "/search/subject/" + query + "?responseGroup=" + detail
                + "&max_results=" + max + "&start=" + first;
    }

    public static String getProgressUrl(String uid, String auth) {
        return USER_URL + "/" + uid + "/progress?source=BGMbyYumeProject&auth=" + auth;
    }

    public static String getProgressUrl(String uid, String auth, String subjectID) {
        return getProgressUrl(uid, auth) + "&subject_id=" + subjectID;
    }

    public static String getColSetUrl(String subjectID, String auth) {
        return BASE_URL + "/collection/" + subjectID
                + "/create?source=BGMbyYumeProject&auth=" + auth;
    }

    public static String getProgressSetUrl(String epId, String status, String auth) {
        return BASE_URL + "/ep/" + epId + "/status/" + status + "?source=BGMbyYumeProject&auth=" + auth;
    }
}
