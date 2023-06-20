package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import com.inmobi.sdk.InMobiSdk;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GDPRInfo.java */
/* loaded from: classes3.dex */
public final class ie {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25748a = "ie";

    /* renamed from: b  reason: collision with root package name */
    private static JSONObject f25749b;

    /* renamed from: c  reason: collision with root package name */
    private static JSONObject f25750c;

    /* renamed from: d  reason: collision with root package name */
    private static JSONObject f25751d;

    /* renamed from: e  reason: collision with root package name */
    private static gd f25752e;

    private ie() {
    }

    public static void a() {
        f25752e = (gd) fr.a("root", ho.f());
    }

    public static JSONObject b() {
        Context c10 = ho.c();
        if (c10 != null) {
            SharedPreferences sharedPreferences = c10.getSharedPreferences(c10.getPackageName() + "_preferences", 0);
            if (sharedPreferences != null) {
                JSONObject b10 = b(sharedPreferences);
                if (b10 != null) {
                    return b10;
                }
                JSONObject a10 = a(sharedPreferences);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        return i();
    }

    public static JSONObject c() {
        return f25749b;
    }

    public static byte d() {
        JSONObject b10 = b();
        if (b10 == null) {
            return (byte) -1;
        }
        if (b10.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
            return (byte) 1;
        }
        if (b10.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
            try {
                return b10.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE) ? (byte) 1 : (byte) 0;
            } catch (JSONException unused) {
                return (byte) -1;
            }
        }
        return (byte) -1;
    }

    public static JSONObject e() {
        return f25751d;
    }

    public static boolean f() {
        return a(false);
    }

    public static void g() {
        f25752e = (gd) fs.a("root", ho.f(), null);
    }

    public static boolean h() {
        return f();
    }

    private static JSONObject i() {
        JSONObject jSONObject = f25750c;
        if (jSONObject == null) {
            return f25749b;
        }
        if (f25749b == null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = f25750c.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, f25750c.opt(next));
            } catch (JSONException unused) {
            }
        }
        Iterator<String> keys2 = f25749b.keys();
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            try {
                jSONObject2.put(next2, f25749b.opt(next2));
            } catch (JSONException unused2) {
            }
        }
        return jSONObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONObject a(android.content.SharedPreferences r4) {
        /*
            r0 = 0
            java.lang.String r1 = "IABConsent_ConsentString"
            java.lang.String r1 = r4.getString(r1, r0)     // Catch: java.lang.Exception -> Le
            java.lang.String r2 = "IABConsent_SubjectToGDPR"
            java.lang.String r4 = r4.getString(r2, r0)     // Catch: java.lang.Exception -> Lf
            goto L10
        Le:
            r1 = r0
        Lf:
            r4 = r0
        L10:
            if (r1 == 0) goto L24
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L24
            r2.<init>()     // Catch: org.json.JSONException -> L24
            java.lang.String r3 = "gdpr_consent"
            r2.put(r3, r1)     // Catch: org.json.JSONException -> L24
            if (r4 == 0) goto L23
            java.lang.String r1 = "gdpr"
            r2.put(r1, r4)     // Catch: org.json.JSONException -> L24
        L23:
            return r2
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.ie.a(android.content.SharedPreferences):org.json.JSONObject");
    }

    public static void c(JSONObject jSONObject) {
        f25751d = jSONObject;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        f25749b = jSONObject;
    }

    public static boolean a(boolean z10) {
        if (f25752e == null) {
            g();
        }
        return d() == 1 || f25752e.j() || z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0013 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONObject b(android.content.SharedPreferences r5) {
        /*
            r0 = -1
            r1 = 0
            java.lang.String r2 = "IABTCF_TCString"
            java.lang.String r2 = r5.getString(r2, r1)     // Catch: java.lang.Exception -> Lf
            java.lang.String r3 = "IABTCF_gdprApplies"
            int r5 = r5.getInt(r3, r0)     // Catch: java.lang.Exception -> L10
            goto L11
        Lf:
            r2 = r1
        L10:
            r5 = -1
        L11:
            if (r2 == 0) goto L29
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L29
            r3.<init>()     // Catch: org.json.JSONException -> L29
            java.lang.String r4 = "gdpr_consent"
            r3.put(r4, r2)     // Catch: org.json.JSONException -> L29
            if (r0 == r5) goto L28
            java.lang.String r0 = "gdpr"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: org.json.JSONException -> L29
            r3.put(r0, r5)     // Catch: org.json.JSONException -> L29
        L28:
            return r3
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.ie.b(android.content.SharedPreferences):org.json.JSONObject");
    }

    public static void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        f25750c = jSONObject;
    }
}
