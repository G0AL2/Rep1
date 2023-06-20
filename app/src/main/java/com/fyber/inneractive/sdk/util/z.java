package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.i;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public Context f20356a;

    /* renamed from: b  reason: collision with root package name */
    public Location f20357b = null;

    /* renamed from: c  reason: collision with root package name */
    public i.a f20358c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f20359d;

    /* renamed from: e  reason: collision with root package name */
    public LocationListener f20360e;

    /* renamed from: f  reason: collision with root package name */
    public LocationListener f20361f;

    /* renamed from: g  reason: collision with root package name */
    public long f20362g;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static z f20363a = new z();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:6|(1:8)(2:73|(1:75)(2:76|77))|9|(3:65|66|(5:68|(1:70)|12|13|(9:15|(1:17)|18|19|20|21|(1:25)|(2:30|(1:32)(7:33|(2:35|(5:58|40|(2:42|(2:46|(4:48|(1:50)|51|(1:53))))(1:55)|54|(0)))(1:59)|39|40|(0)(0)|54|(0)))|29)(11:62|63|18|19|20|21|(2:23|25)|(1:27)|30|(0)(0)|29))(1:71))|11|12|13|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[Catch: all -> 0x00be, TryCatch #2 {all -> 0x00be, blocks: (B:21:0x0086, B:23:0x008c, B:25:0x009d, B:26:0x00b5), top: B:77:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #2 {all -> 0x00be, blocks: (B:21:0x0086, B:23:0x008c, B:25:0x009d, B:26:0x00b5), top: B:77:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.location.Location a() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.z.a():android.location.Location");
    }

    public final boolean a(Location location) {
        int i10 = IAConfigManager.J.f16873i.f17015h;
        IAlog.a("%sisLastKnownLocationGoodEnough: maxTimeAccInMin = %d", "Location Manager: ", Integer.valueOf(i10));
        long j10 = i10 * 60 * 1000;
        IAlog.a("%sisLastKnownLocationGoodEnough: max time accuracy in msec = %d", "Location Manager: ", Long.valueOf(j10));
        long abs = Math.abs(System.currentTimeMillis() - location.getTime());
        IAlog.a("%sisLastKnownLocationGoodEnough: location: = %s tss = %d tssM = %d", "Location Manager: ", location, Long.valueOf(abs), Long.valueOf(abs / 60000));
        boolean z10 = abs <= j10;
        IAlog.a("%sisLastKnownLocationGoodEnough: returns - %s", "Location Manager: ", Boolean.valueOf(z10));
        return z10;
    }

    public final void a(LocationListener locationListener) {
        if (locationListener != null) {
            IAlog.a("%sunregistering location listener: %s", "Location Manager: ", locationListener);
            Context context = this.f20356a;
            if (context == null) {
                IAlog.a("%sunregisterFromLocationUpdates called, but context is null!", "Location Manager: ");
                return;
            }
            try {
                ((LocationManager) context.getSystemService("location")).removeUpdates(locationListener);
            } catch (Exception unused) {
                IAlog.a("%sError retrieved when trying to stop location updates - updates were already paused.", "Location Manager: ");
            }
        }
    }

    public final void a(String str, LocationListener locationListener) {
        Context context = this.f20356a;
        if (context == null) {
            IAlog.a("%sregisterForASingleLocationUpdate called, but context is null!", "Location Manager: ");
            return;
        }
        try {
            ((LocationManager) context.getSystemService("location")).requestLocationUpdates(str, 0L, 0.0f, locationListener, this.f20356a.getMainLooper());
            IAlog.a("%sSuccessfully registered for %s location update", "Location Manager: ", str);
        } catch (IllegalArgumentException unused) {
            IAlog.a("%sError retrieved when trying to get the network location - device has no network provider.", "Location Manager: ");
        } catch (NullPointerException unused2) {
            IAlog.a("%sError retrieved when trying to get the network location - NPE.", "Location Manager: ");
        } catch (SecurityException unused3) {
            IAlog.a("%sError retrieved when trying to get the network location - access appears to be disabled.", "Location Manager: ");
        }
    }

    public final Location a(Location location, Location location2) {
        if (location == null && location2 == null) {
            return null;
        }
        return (location == null || location2 == null) ? location != null ? location : location2 : location.getTime() > location2.getTime() ? location : location2;
    }
}
