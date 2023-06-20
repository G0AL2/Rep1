package com.applovin.impl.sdk;

import android.content.Context;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final a f8498a = new a("Age Restricted User", com.applovin.impl.sdk.c.d.f8242l);

    /* renamed from: b  reason: collision with root package name */
    private static final a f8499b = new a("Has User Consent", com.applovin.impl.sdk.c.d.f8241k);

    /* renamed from: c  reason: collision with root package name */
    private static final a f8500c = new a("\"Do Not Sell\"", com.applovin.impl.sdk.c.d.f8243m);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f8501a;

        /* renamed from: b  reason: collision with root package name */
        private final com.applovin.impl.sdk.c.d<Boolean> f8502b;

        a(String str, com.applovin.impl.sdk.c.d<Boolean> dVar) {
            this.f8501a = str;
            this.f8502b = dVar;
        }

        public Boolean a(Context context) {
            if (context == null) {
                if (v.a()) {
                    v.i("AppLovinSdk", "Failed to get value for key: " + this.f8502b);
                }
                return null;
            }
            return (Boolean) com.applovin.impl.sdk.c.e.b(this.f8502b, (Object) null, context);
        }

        public String a() {
            return this.f8501a;
        }

        public String b(Context context) {
            Boolean a10 = a(context);
            return a10 != null ? a10.toString() : "No value set";
        }
    }

    public static a a() {
        return f8498a;
    }

    public static String a(Context context) {
        return a(f8498a, context) + a(f8499b, context) + a(f8500c, context);
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f8501a + " - " + aVar.b(context);
    }

    private static boolean a(com.applovin.impl.sdk.c.d<Boolean> dVar, Boolean bool, Context context) {
        if (context != null) {
            Boolean bool2 = (Boolean) com.applovin.impl.sdk.c.e.b(dVar, (Object) null, context);
            com.applovin.impl.sdk.c.e.a(dVar, bool, context);
            return bool2 == null || bool2 != bool;
        }
        if (v.a()) {
            v.i("AppLovinSdk", "Failed to update compliance value for key: " + dVar);
        }
        return false;
    }

    public static boolean a(boolean z10, Context context) {
        return a(com.applovin.impl.sdk.c.d.f8242l, Boolean.valueOf(z10), context);
    }

    public static a b() {
        return f8499b;
    }

    public static boolean b(boolean z10, Context context) {
        return a(com.applovin.impl.sdk.c.d.f8241k, Boolean.valueOf(z10), context);
    }

    public static a c() {
        return f8500c;
    }

    public static boolean c(boolean z10, Context context) {
        return a(com.applovin.impl.sdk.c.d.f8243m, Boolean.valueOf(z10), context);
    }
}
