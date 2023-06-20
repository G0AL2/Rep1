package com.inmobi.media;

import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NativeTracker.java */
/* loaded from: classes3.dex */
public class cf {

    /* renamed from: g  reason: collision with root package name */
    private static final String f24918g = "cf";

    /* renamed from: a  reason: collision with root package name */
    protected String f24919a;

    /* renamed from: b  reason: collision with root package name */
    public String f24920b;

    /* renamed from: c  reason: collision with root package name */
    protected int f24921c;

    /* renamed from: d  reason: collision with root package name */
    public String f24922d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f24923e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, Object> f24924f;

    public cf(String str, int i10, String str2, Map<String, String> map) {
        this("url_ping", str, i10, str2, map);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(String str) {
        Object obj;
        String str2;
        Object obj2;
        String str3;
        Object obj3;
        String str4;
        Object obj4;
        String str5;
        String str6;
        char c10;
        if (str == null || str.length() == 0) {
            return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
        int hashCode = str.hashCode();
        String str7 = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        String str8 = "load";
        String str9 = "client_fill";
        switch (hashCode) {
            case -1638835128:
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                if (str.equals("midpoint")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case -1337830390:
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                if (str.equals(str6)) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -934426579:
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                if (str.equals(obj4)) {
                    c10 = 19;
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case -840405966:
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                if (str.equals(obj3)) {
                    c10 = 17;
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case -667101923:
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                if (str.equals(obj2)) {
                    c10 = 22;
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case -599445191:
                obj = "complete";
                if (str.equals(obj)) {
                    c10 = '\f';
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case -284840886:
                if (!str.equals(str7)) {
                    str7 = str7;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    c10 = 65535;
                    break;
                } else {
                    c10 = 1;
                    str7 = str7;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
            case -174104201:
                if (!str.equals(str9)) {
                    str9 = str9;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    c10 = 65535;
                    break;
                } else {
                    c10 = 3;
                    str9 = str9;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
            case 3327206:
                if (!str.equals(str8)) {
                    str8 = str8;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    c10 = 65535;
                    break;
                } else {
                    c10 = 2;
                    str8 = str8;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
            case 3363353:
                if (str.equals("mute")) {
                    c10 = 16;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 94750088:
                if (str.equals(au.CLICK_BEACON)) {
                    c10 = 7;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c10 = 20;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 106440182:
                if (str.equals("pause")) {
                    c10 = 18;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = '\b';
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 110066619:
                if (str.equals("fullscreen")) {
                    c10 = 14;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 113951609:
                if (str.equals("exitFullscreen")) {
                    c10 = 15;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 354294980:
                if (str.equals("VideoImpression")) {
                    c10 = 5;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 368426751:
                if (str.equals("OMID_VIEWABILITY")) {
                    c10 = 21;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 560220243:
                if (str.equals("firstQuartile")) {
                    c10 = '\t';
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 883937877:
                if (str.equals("page_view")) {
                    c10 = 6;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 1342121331:
                if (str.equals("closeEndCard")) {
                    c10 = 23;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 1778167540:
                if (str.equals("creativeView")) {
                    c10 = '\r';
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            case 2114088489:
                if (str.equals("Impression")) {
                    c10 = 4;
                    obj = "complete";
                    str2 = "VideoImpression";
                    obj2 = "zMoatVASTIDs";
                    str3 = "page_view";
                    obj3 = "unmute";
                    str4 = au.CLICK_BEACON;
                    obj4 = "resume";
                    str5 = "start";
                    str6 = "thirdQuartile";
                    break;
                }
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
            default:
                obj = "complete";
                str2 = "VideoImpression";
                obj2 = "zMoatVASTIDs";
                str3 = "page_view";
                obj3 = "unmute";
                str4 = au.CLICK_BEACON;
                obj4 = "resume";
                str5 = "start";
                str6 = "thirdQuartile";
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 2:
                return str8;
            case 3:
                return str9;
            case 4:
                return "Impression";
            case 5:
                return str2;
            case 6:
                return str3;
            case 7:
                return str4;
            case '\b':
                return str5;
            case '\t':
                return "firstQuartile";
            case '\n':
                return "midpoint";
            case 11:
                return str6;
            case '\f':
                return obj;
            case '\r':
                return "creativeView";
            case 14:
                return "fullscreen";
            case 15:
                return "exitFullscreen";
            case 16:
                return "mute";
            case 17:
                return obj3;
            case 18:
                return "pause";
            case 19:
                return obj4;
            case 20:
                return "error";
            case 21:
                return "OMID_VIEWABILITY";
            case 22:
                return obj2;
            case 23:
                return "closeEndCard";
            default:
                return str7;
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f24919a);
            jSONObject.put(ImagesContract.URL, this.f24920b);
            jSONObject.put("eventType", this.f24922d);
            jSONObject.put("eventId", this.f24921c);
            Map map = this.f24923e;
            if (map == null) {
                map = new HashMap();
            }
            jSONObject.put("extras", hv.a(map, ","));
            return jSONObject.toString();
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return "";
        }
    }

    private cf(String str, String str2, int i10, String str3, Map<String, String> map) {
        this.f24923e = new HashMap();
        this.f24919a = str;
        this.f24920b = str2.trim();
        this.f24921c = i10;
        this.f24922d = str3;
        this.f24923e = map;
    }
}
