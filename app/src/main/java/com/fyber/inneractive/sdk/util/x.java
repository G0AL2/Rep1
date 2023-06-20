package com.fyber.inneractive.sdk.util;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class x implements LocationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f20354a;

    public x(z zVar) {
        this.f20354a = zVar;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        Runnable runnable;
        if (location == null) {
            return;
        }
        long abs = Math.abs(System.currentTimeMillis() - location.getTime());
        this.f20354a.getClass();
        IAlog.a("%sgps location changed: %s tss = %d tssM = %d", "Location Manager: ", location, Long.valueOf(abs), Long.valueOf(abs / 60000));
        this.f20354a.getClass();
        IAlog.a("%sgps location sampling took: %d msec", "Location Manager: ", Long.valueOf(System.currentTimeMillis() - this.f20354a.f20362g));
        z zVar = this.f20354a;
        zVar.a(zVar.f20361f);
        z zVar2 = this.f20354a;
        zVar2.f20361f = null;
        if (zVar2.f20360e != null || (runnable = zVar2.f20359d) == null) {
            return;
        }
        n.f20310b.removeCallbacks(runnable);
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i10, Bundle bundle) {
        this.f20354a.getClass();
        IAlog.a("%sgps location listener - onStatusChanged: %dextras = %s", "Location Manager: ", Integer.valueOf(i10), bundle);
    }
}
