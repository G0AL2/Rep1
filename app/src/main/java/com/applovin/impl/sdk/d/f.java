package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class f {

    /* renamed from: t  reason: collision with root package name */
    private final String f8338t;

    /* renamed from: s  reason: collision with root package name */
    private static final Set<String> f8336s = new HashSet(32);

    /* renamed from: u  reason: collision with root package name */
    private static final Set<f> f8337u = new HashSet(16);

    /* renamed from: a  reason: collision with root package name */
    public static final f f8318a = a("ad_req");

    /* renamed from: b  reason: collision with root package name */
    public static final f f8319b = a("ad_imp");

    /* renamed from: c  reason: collision with root package name */
    public static final f f8320c = a("ad_session_start");

    /* renamed from: d  reason: collision with root package name */
    public static final f f8321d = a("ad_imp_session");

    /* renamed from: e  reason: collision with root package name */
    public static final f f8322e = a("cached_files_expired");

    /* renamed from: f  reason: collision with root package name */
    public static final f f8323f = a("cache_drop_count");

    /* renamed from: g  reason: collision with root package name */
    public static final f f8324g = a("sdk_reset_state_count", true);

    /* renamed from: h  reason: collision with root package name */
    public static final f f8325h = a("ad_response_process_failures", true);

    /* renamed from: i  reason: collision with root package name */
    public static final f f8326i = a("response_process_failures", true);

    /* renamed from: j  reason: collision with root package name */
    public static final f f8327j = a("incent_failed_to_display_count", true);

    /* renamed from: k  reason: collision with root package name */
    public static final f f8328k = a("app_paused_and_resumed");

    /* renamed from: l  reason: collision with root package name */
    public static final f f8329l = a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: m  reason: collision with root package name */
    public static final f f8330m = a("ad_shown_outside_app_count");

    /* renamed from: n  reason: collision with root package name */
    public static final f f8331n = a("med_ad_req");

    /* renamed from: o  reason: collision with root package name */
    public static final f f8332o = a("med_ad_response_process_failures", true);

    /* renamed from: p  reason: collision with root package name */
    public static final f f8333p = a("med_waterfall_ad_no_fill", true);

    /* renamed from: q  reason: collision with root package name */
    public static final f f8334q = a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: r  reason: collision with root package name */
    public static final f f8335r = a("med_waterfall_ad_invalid_response", true);

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private f(String str) {
        this.f8338t = str;
    }

    private static f a(String str) {
        return a(str, false);
    }

    private static f a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        }
        Set<String> set = f8336s;
        if (set.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
        set.add(str);
        f fVar = new f(str);
        if (z10) {
            f8337u.add(fVar);
        }
        return fVar;
    }
}
