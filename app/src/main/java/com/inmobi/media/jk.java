package com.inmobi.media;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InMobiUnifiedIdKeyStoreInterface.java */
/* loaded from: classes3.dex */
public final class jk {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f25868a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f25869b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f25870c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f25871d = false;

    /* renamed from: e  reason: collision with root package name */
    private static JSONObject f25872e;

    /* renamed from: f  reason: collision with root package name */
    private static JSONObject f25873f;

    public static JSONObject a() {
        synchronized (f25868a) {
            if (f25870c) {
                return f25872e;
            }
            f25870c = true;
            String b10 = hf.a(ho.c(), "unified_id_info_store").b("ufids");
            if (b10 == null) {
                return null;
            }
            try {
                f25872e = new JSONObject(b10);
            } catch (JSONException unused) {
            }
            return f25872e;
        }
    }

    public static synchronized void b(JSONObject jSONObject) {
        synchronized (jk.class) {
            synchronized (f25869b) {
                f25873f = jSONObject;
                f25871d = true;
                Context c10 = ho.c();
                if (c10 != null) {
                    if (f25873f == null) {
                        hf.a(c10, "unified_id_info_store").e("publisher_provided_unified_id");
                    } else {
                        hf.a(c10, "unified_id_info_store").a("publisher_provided_unified_id", f25873f.toString());
                    }
                }
            }
        }
    }

    public static void c() {
        a();
        b();
    }

    public static void d() {
        f25871d = false;
        f25870c = false;
        a(null);
        b(null);
    }

    public static JSONObject b() {
        synchronized (f25869b) {
            if (f25871d) {
                return f25873f;
            }
            f25871d = true;
            String b10 = hf.a(ho.c(), "unified_id_info_store").b("publisher_provided_unified_id");
            if (b10 == null) {
                return null;
            }
            try {
                f25873f = new JSONObject(b10);
            } catch (JSONException unused) {
            }
            return f25873f;
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f25868a) {
            f25872e = jSONObject;
            f25870c = true;
            Context c10 = ho.c();
            if (c10 != null) {
                if (f25872e == null) {
                    hf.a(c10, "unified_id_info_store").e("ufids");
                } else {
                    hf.a(c10, "unified_id_info_store").a("ufids", f25872e.toString());
                }
            }
        }
    }
}
