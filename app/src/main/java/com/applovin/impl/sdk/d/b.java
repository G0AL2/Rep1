package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class b {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    private static final Set<String> G = new HashSet(32);

    /* renamed from: a  reason: collision with root package name */
    public static final b f8273a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f8274b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f8275c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f8276d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f8277e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f8278f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f8279g;

    /* renamed from: h  reason: collision with root package name */
    public static final b f8280h;

    /* renamed from: i  reason: collision with root package name */
    public static final b f8281i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f8282j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f8283k;

    /* renamed from: l  reason: collision with root package name */
    public static final b f8284l;

    /* renamed from: m  reason: collision with root package name */
    public static final b f8285m;

    /* renamed from: n  reason: collision with root package name */
    public static final b f8286n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f8287o;

    /* renamed from: p  reason: collision with root package name */
    public static final b f8288p;

    /* renamed from: q  reason: collision with root package name */
    public static final b f8289q;

    /* renamed from: r  reason: collision with root package name */
    public static final b f8290r;

    /* renamed from: s  reason: collision with root package name */
    public static final b f8291s;

    /* renamed from: t  reason: collision with root package name */
    public static final b f8292t;

    /* renamed from: u  reason: collision with root package name */
    public static final b f8293u;

    /* renamed from: v  reason: collision with root package name */
    public static final b f8294v;

    /* renamed from: w  reason: collision with root package name */
    public static final b f8295w;

    /* renamed from: x  reason: collision with root package name */
    public static final b f8296x;

    /* renamed from: y  reason: collision with root package name */
    public static final b f8297y;

    /* renamed from: z  reason: collision with root package name */
    public static final b f8298z;
    private final String E;
    private final String F;

    static {
        a("sisw", "IS_STREAMING_WEBKIT");
        a("surw", "UNABLE_TO_RETRIEVE_WEBKIT_HTML_STRING");
        a("surp", "UNABLE_TO_PERSIST_WEBKIT_HTML_PLACEMENT_REPLACED_STRING");
        a("swhp", "SUCCESSFULLY_PERSISTED_WEBKIT_HTML_STRING");
        a("skr", "STOREKIT_REDIRECTED");
        a("sklf", "STOREKIT_LOAD_FAILURE");
        a("skps", "STOREKIT_PRELOAD_SKIPPED");
        f8273a = a("sas", "AD_SOURCE");
        f8274b = a("srt", "AD_RENDER_TIME");
        f8275c = a("sft", "AD_FETCH_TIME");
        f8276d = a("sfs", "AD_FETCH_SIZE");
        f8277e = a("sadb", "AD_DOWNLOADED_BYTES");
        f8278f = a("sacb", "AD_CACHED_BYTES");
        f8279g = a("stdl", "TIME_TO_DISPLAY_FROM_LOAD");
        f8280h = a("stdi", "TIME_TO_DISPLAY_FROM_INIT");
        f8281i = a("snas", "AD_NUMBER_IN_SESSION");
        f8282j = a("snat", "AD_NUMBER_TOTAL");
        f8283k = a("stah", "TIME_AD_HIDDEN_FROM_SHOW");
        f8284l = a("stas", "TIME_TO_SKIP_FROM_SHOW");
        f8285m = a("stac", "TIME_TO_CLICK_FROM_SHOW");
        f8286n = a("stbe", "TIME_TO_EXPAND_FROM_SHOW");
        f8287o = a("stbc", "TIME_TO_CONTRACT_FROM_SHOW");
        f8288p = a("saan", "AD_SHOWN_WITH_ACTIVE_NETWORK");
        f8289q = a("suvs", "INTERSTITIAL_USED_VIDEO_STREAM");
        f8290r = a("sugs", "AD_USED_GRAPHIC_STREAM");
        f8291s = a("svpv", "INTERSTITIAL_VIDEO_PERCENT_VIEWED");
        f8292t = a("stpd", "INTERSTITIAL_PAUSED_DURATION");
        f8293u = a("shsc", "HTML_RESOURCE_CACHE_SUCCESS_COUNT");
        f8294v = a("shfc", "HTML_RESOURCE_CACHE_FAILURE_COUNT");
        f8295w = a("schc", "AD_CANCELLED_HTML_CACHING");
        f8296x = a("smwm", "AD_SHOWN_IN_MULTIWINDOW_MODE");
        f8297y = a("vssc", "VIDEO_STREAM_STALLED_COUNT");
        f8298z = a("wvem", "WEB_VIEW_ERROR_MESSAGES");
        A = a("wvhec", "WEB_VIEW_HTTP_ERROR_COUNT");
        B = a("wvrec", "WEB_VIEW_RENDER_ERROR_COUNT");
        C = a("wvsem", "WEB_VIEW_SSL_ERROR_MESSAGES");
        D = a("wvruc", "WEB_VIEW_RENDERER_UNRESPONSIVE_COUNT");
    }

    private b(String str, String str2) {
        this.E = str;
        this.F = str2;
    }

    private static b a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        }
        Set<String> set = G;
        if (set.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        } else if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("No debug name specified");
        } else {
            set.add(str);
            return new b(str, str2);
        }
    }
}
