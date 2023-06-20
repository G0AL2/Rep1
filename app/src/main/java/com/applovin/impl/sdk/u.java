package com.applovin.impl.sdk;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private final m f8800a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f8801b;

    /* renamed from: c  reason: collision with root package name */
    private t f8802c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(m mVar) {
        this.f8800a = mVar;
        this.f8801b = (LocationManager) mVar.L().getSystemService("location");
    }

    @SuppressLint({"MissingPermission"})
    private Location a(String str, String str2) {
        v A;
        StringBuilder sb2;
        String str3;
        if (com.applovin.impl.sdk.utils.g.a(str2, this.f8800a.L())) {
            try {
                return this.f8801b.getLastKnownLocation(str);
            } catch (IllegalArgumentException e10) {
                e = e10;
                if (v.a()) {
                    A = this.f8800a.A();
                    sb2 = new StringBuilder();
                    sb2.append("Failed to retrieve location from ");
                    sb2.append(str);
                    str3 = ": device does not support this location provider.";
                    sb2.append(str3);
                    A.b("LocationManager", sb2.toString(), e);
                }
                return null;
            } catch (NullPointerException e11) {
                e = e11;
                if (v.a()) {
                    A = this.f8800a.A();
                    sb2 = new StringBuilder();
                    sb2.append("Failed to retrieve location from ");
                    sb2.append(str);
                    str3 = ": location provider is not available.";
                    sb2.append(str3);
                    A.b("LocationManager", sb2.toString(), e);
                }
                return null;
            } catch (SecurityException e12) {
                e = e12;
                if (v.a()) {
                    A = this.f8800a.A();
                    sb2 = new StringBuilder();
                    sb2.append("Failed to retrieve location from ");
                    sb2.append(str);
                    str3 = ": access denied.";
                    sb2.append(str3);
                    A.b("LocationManager", sb2.toString(), e);
                }
                return null;
            } catch (Throwable th) {
                e = th;
                if (v.a()) {
                    A = this.f8800a.A();
                    sb2 = new StringBuilder();
                    sb2.append("Failed to retrieve location from ");
                    sb2.append(str);
                    str3 = ".";
                    sb2.append(str3);
                    A.b("LocationManager", sb2.toString(), e);
                }
                return null;
            }
        }
        return null;
    }

    public boolean a() {
        return com.applovin.impl.sdk.utils.g.a("android.permission.ACCESS_COARSE_LOCATION", this.f8800a.L());
    }

    public boolean b() {
        return com.applovin.impl.sdk.utils.g.h() ? this.f8801b.isLocationEnabled() : (com.applovin.impl.sdk.utils.g.c() && Settings.Secure.getInt(this.f8800a.L().getContentResolver(), "location_mode", 0) == 0) ? false : true;
    }

    public t c() {
        if (this.f8800a.p().isLocationCollectionEnabled() && ((Boolean) this.f8800a.a(com.applovin.impl.sdk.c.b.dW)).booleanValue()) {
            long millis = TimeUnit.MINUTES.toMillis(((Long) this.f8800a.a(com.applovin.impl.sdk.c.b.dX)).longValue());
            if (this.f8802c == null || System.currentTimeMillis() - this.f8802c.c() >= millis) {
                Location a10 = a("gps", "android.permission.ACCESS_FINE_LOCATION");
                if (a10 == null) {
                    a10 = a("network", "android.permission.ACCESS_COARSE_LOCATION");
                }
                if (a10 != null) {
                    this.f8802c = new t(a10.getLatitude(), a10.getLongitude(), System.currentTimeMillis());
                }
                return this.f8802c;
            }
            return this.f8802c;
        }
        return null;
    }
}
