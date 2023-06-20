package com.applovin.impl.sdk.c;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a<T> extends b<T> {
    public static final b<Boolean> A;
    public static final b<Boolean> B;
    public static final b<Boolean> C;
    public static final b<Long> D;
    public static final b<Boolean> E;
    public static final b<Long> F;
    public static final b<Long> G;
    public static final b<Boolean> H;
    public static final b<Long> I;
    public static final b<Boolean> J;
    public static final b<Integer> K;
    public static final b<String> L;
    public static final b<String> M;
    public static final b<Integer> N;
    public static final b<String> O;
    public static final b<Boolean> P;
    public static final b<Boolean> Q;
    public static final b<Boolean> R;
    public static final b<Boolean> S;
    public static final b<Boolean> T;
    public static final b<Boolean> U;
    public static final b<Boolean> V;

    /* renamed from: a  reason: collision with root package name */
    public static final b<String> f8165a = b.a("afi", "");

    /* renamed from: b  reason: collision with root package name */
    public static final b<Long> f8166b;

    /* renamed from: c  reason: collision with root package name */
    public static final b<String> f8167c;

    /* renamed from: d  reason: collision with root package name */
    public static final b<String> f8168d;

    /* renamed from: e  reason: collision with root package name */
    public static final b<Long> f8169e;

    /* renamed from: f  reason: collision with root package name */
    public static final b<Long> f8170f;

    /* renamed from: g  reason: collision with root package name */
    public static final b<Long> f8171g;

    /* renamed from: h  reason: collision with root package name */
    public static final b<Boolean> f8172h;

    /* renamed from: i  reason: collision with root package name */
    public static final b<String> f8173i;

    /* renamed from: j  reason: collision with root package name */
    public static final b<Boolean> f8174j;

    /* renamed from: k  reason: collision with root package name */
    public static final b<Long> f8175k;

    /* renamed from: l  reason: collision with root package name */
    public static final b<Long> f8176l;

    /* renamed from: m  reason: collision with root package name */
    public static final b<Long> f8177m;

    /* renamed from: n  reason: collision with root package name */
    public static final b<Long> f8178n;

    /* renamed from: o  reason: collision with root package name */
    public static final b<String> f8179o;

    /* renamed from: p  reason: collision with root package name */
    public static final b<Long> f8180p;

    /* renamed from: q  reason: collision with root package name */
    public static final b<Boolean> f8181q;

    /* renamed from: r  reason: collision with root package name */
    public static final b<Boolean> f8182r;

    /* renamed from: s  reason: collision with root package name */
    public static final b<Boolean> f8183s;

    /* renamed from: t  reason: collision with root package name */
    public static final b<Boolean> f8184t;

    /* renamed from: u  reason: collision with root package name */
    public static final b<Boolean> f8185u;

    /* renamed from: v  reason: collision with root package name */
    public static final b<Long> f8186v;

    /* renamed from: w  reason: collision with root package name */
    public static final b<Boolean> f8187w;

    /* renamed from: x  reason: collision with root package name */
    public static final b<Long> f8188x;

    /* renamed from: y  reason: collision with root package name */
    public static final b<Long> f8189y;

    /* renamed from: z  reason: collision with root package name */
    public static final b<Boolean> f8190z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f8166b = b.a("afi_ms", Long.valueOf(timeUnit.toMillis(5L)));
        f8167c = b.a("mediation_endpoint", "https://ms.applovin.com/");
        f8168d = b.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        f8169e = b.a("fetch_next_ad_retry_delay_ms", Long.valueOf(timeUnit.toMillis(2L)));
        f8170f = b.a("fetch_next_ad_timeout_ms", Long.valueOf(timeUnit.toMillis(5L)));
        f8171g = b.a("fetch_mediation_debugger_info_timeout_ms", Long.valueOf(timeUnit.toMillis(7L)));
        Boolean bool = Boolean.TRUE;
        f8172h = b.a("auto_init_mediation_debugger", bool);
        f8173i = b.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        Boolean bool2 = Boolean.FALSE;
        f8174j = b.a("persistent_mediated_postbacks", bool2);
        f8175k = b.a("max_signal_provider_latency_ms", Long.valueOf(timeUnit.toMillis(30L)));
        f8176l = b.a("default_adapter_timeout_ms", Long.valueOf(timeUnit.toMillis(10L)));
        f8177m = b.a("ad_refresh_ms", Long.valueOf(timeUnit.toMillis(30L)));
        f8178n = b.a("ad_load_failure_refresh_ms", Long.valueOf(timeUnit.toMillis(30L)));
        f8179o = b.a("ad_load_failure_refresh_ignore_error_codes", "204");
        f8180p = b.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        f8181q = b.a("refresh_ad_view_timer_responds_to_background", bool);
        f8182r = b.a("refresh_ad_view_timer_responds_to_store_kit", bool);
        f8183s = b.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool2);
        f8184t = b.a("avrsponse", bool2);
        f8185u = b.a("allow_pause_auto_refresh_immediately", bool2);
        f8186v = b.a("fullscreen_display_delay_ms", 600L);
        f8187w = b.a("susaode", bool2);
        f8188x = b.a("ahdm", 500L);
        f8189y = b.a("ad_view_refresh_precache_request_viewability_undesired_flags", 502L);
        f8190z = b.a("ad_view_refresh_precache_request_enabled", bool);
        A = b.a("fullscreen_ads_block_publisher_load_if_another_showing", bool);
        B = b.a("fabsina", bool2);
        C = b.a("fabsiaif", bool2);
        D = b.a("ad_expiration_ms", Long.valueOf(TimeUnit.HOURS.toMillis(4L)));
        E = b.a("saewib", bool2);
        F = b.a("fullscreen_ad_displayed_timeout_ms", -1L);
        G = b.a("ad_hidden_timeout_ms", -1L);
        H = b.a("schedule_ad_hidden_on_ad_dismiss", bool2);
        I = b.a("ad_hidden_on_ad_dismiss_callback_delay_ms", Long.valueOf(timeUnit.toMillis(1L)));
        J = b.a("proe", bool2);
        K = b.a("mute_state", 2);
        L = b.a("saf", "");
        M = b.a("saui", "");
        N = b.a("mra", -1);
        O = b.a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");
        P = b.a("pmp", bool2);
        Q = b.a("sai", bool2);
        R = b.a("init_adapter_for_sc", bool);
        S = b.a("init_adapter_for_al", bool);
        T = b.a("fadiafase", bool);
        U = b.a("fetch_mediated_ad_gzip", bool2);
        V = b.a("max_postback_gzip", bool2);
    }
}
