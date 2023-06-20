package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.NetworkInfo;
import com.chartboost.sdk.Libraries.CBLogging;

/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a  reason: collision with root package name */
    private Context f14281a;

    /* renamed from: b  reason: collision with root package name */
    private final f1 f14282b = new f1();

    public r0(Context context) {
        this.f14281a = context;
    }

    public String a() {
        f1 f1Var = this.f14282b;
        if (f1Var != null) {
            switch (f1Var.d(this.f14281a)) {
                case 1:
                    return "Ethernet";
                case 2:
                    return "WIFI";
                case 3:
                    return "Cellular_Unknown";
                case 4:
                    return "Cellular_2G";
                case 5:
                    return "Cellular_3G";
                case 6:
                    return "Cellular_4G";
                default:
                    return "Unknown";
            }
        }
        return "Unknown";
    }

    public int b() {
        Context context = this.f14281a;
        if (context == null) {
            return 0;
        }
        if (this.f14282b.c(context) == null) {
            CBLogging.a("CBReachability", "NETWORK TYPE: unknown");
            return -1;
        }
        NetworkInfo a10 = this.f14282b.a(this.f14281a);
        if (a10 != null && a10.isConnected()) {
            if (a10.getType() == 1) {
                CBLogging.a("CBReachability", "NETWORK TYPE: TYPE_WIFI");
                return 1;
            }
            CBLogging.a("CBReachability", "NETWORK TYPE: TYPE_MOBILE");
            return 2;
        }
        CBLogging.a("CBReachability", "NETWORK TYPE: NO Network");
        return 0;
    }

    public int c() {
        f1 f1Var = this.f14282b;
        if (f1Var != null) {
            return f1Var.d(this.f14281a);
        }
        return 0;
    }

    public boolean d() {
        return e() && b() == 2;
    }

    public boolean e() {
        return this.f14282b.e(this.f14281a);
    }

    public int a(Context context) {
        f1 f1Var = this.f14282b;
        if (f1Var != null) {
            return f1Var.b(context);
        }
        return 0;
    }
}
