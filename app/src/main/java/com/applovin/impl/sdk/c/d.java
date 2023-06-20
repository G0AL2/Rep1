package com.applovin.impl.sdk.c;

import java.util.HashSet;

/* loaded from: classes.dex */
public class d<T> {
    private final String D;
    private final Class<T> E;

    /* renamed from: a  reason: collision with root package name */
    public static final d<String> f8231a = new d<>("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: b  reason: collision with root package name */
    public static final d<Boolean> f8232b = new d<>("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: c  reason: collision with root package name */
    public static final d<String> f8233c = new d<>("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: d  reason: collision with root package name */
    public static final d<Long> f8234d = new d<>("com.applovin.sdk.install_date", Long.class);

    /* renamed from: e  reason: collision with root package name */
    public static final d<String> f8235e = new d<>("com.applovin.sdk.user_id", String.class);

    /* renamed from: f  reason: collision with root package name */
    public static final d<String> f8236f = new d<>("com.applovin.sdk.compass_id", String.class);

    /* renamed from: g  reason: collision with root package name */
    public static final d<String> f8237g = new d<>("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: h  reason: collision with root package name */
    public static final d<String> f8238h = new d<>("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: i  reason: collision with root package name */
    public static final d<String> f8239i = new d<>("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: j  reason: collision with root package name */
    public static final d<String> f8240j = new d<>("com.applovin.sdk.variables", String.class);

    /* renamed from: k  reason: collision with root package name */
    public static final d<Boolean> f8241k = new d<>("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: l  reason: collision with root package name */
    public static final d<Boolean> f8242l = new d<>("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: m  reason: collision with root package name */
    public static final d<Boolean> f8243m = new d<>("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: n  reason: collision with root package name */
    public static final d<String> f8244n = new d<>("IABTCF_TCString", String.class);

    /* renamed from: o  reason: collision with root package name */
    public static final d<?> f8245o = new d<>("IABTCF_gdprApplies", Object.class);

    /* renamed from: p  reason: collision with root package name */
    public static final d<HashSet> f8246p = new d<>("com.applovin.sdk.impl.postbackQueue.key", HashSet.class);

    /* renamed from: q  reason: collision with root package name */
    public static final d<String> f8247q = new d<>("com.applovin.sdk.stats", String.class);

    /* renamed from: r  reason: collision with root package name */
    public static final d<HashSet> f8248r = new d<>("com.applovin.sdk.task.stats", HashSet.class);

    /* renamed from: s  reason: collision with root package name */
    public static final d<String> f8249s = new d<>("com.applovin.sdk.network_response_code_mapping", String.class);

    /* renamed from: t  reason: collision with root package name */
    public static final d<String> f8250t = new d<>("com.applovin.sdk.event_tracking.super_properties", String.class);

    /* renamed from: u  reason: collision with root package name */
    public static final d<HashSet> f8251u = new d<>("com.applovin.sdk.ad.stats", HashSet.class);

    /* renamed from: v  reason: collision with root package name */
    public static final d<Integer> f8252v = new d<>("com.applovin.sdk.last_video_position", Integer.class);

    /* renamed from: w  reason: collision with root package name */
    public static final d<Boolean> f8253w = new d<>("com.applovin.sdk.should_resume_video", Boolean.class);

    /* renamed from: x  reason: collision with root package name */
    public static final d<String> f8254x = new d<>("com.applovin.sdk.mediation.signal_providers", String.class);

    /* renamed from: y  reason: collision with root package name */
    public static final d<String> f8255y = new d<>("com.applovin.sdk.mediation.auto_init_adapters", String.class);

    /* renamed from: z  reason: collision with root package name */
    public static final d<String> f8256z = new d<>("com.applovin.sdk.persisted_data", String.class);
    public static final d<String> A = new d<>("com.applovin.sdk.mediation_provider", String.class);
    public static final d<String> B = new d<>("com.applovin.sdk.mediation.test_mode_network", String.class);
    public static final d<Boolean> C = new d<>("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);

    public d(String str, Class<T> cls) {
        this.D = str;
        this.E = cls;
    }

    public String a() {
        return this.D;
    }

    public Class<T> b() {
        return this.E;
    }

    public String toString() {
        return "Key{name='" + this.D + "', type=" + this.E + '}';
    }
}
