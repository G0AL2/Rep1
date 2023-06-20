package com.fyber.inneractive.sdk.util;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class w implements LocationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f20346a;

    public w(z zVar) {
        this.f20346a = zVar;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        Runnable runnable;
        if (location == null) {
            return;
        }
        long abs = Math.abs(System.currentTimeMillis() - location.getTime());
        this.f20346a.getClass();
        IAlog.a("%snetwork location changed: %s tss = %d tssM = %d", "Location Manager: ", location, Long.valueOf(abs), Long.valueOf(abs / 60000));
        this.f20346a.getClass();
        IAlog.a("%snetwork location sampling took: %d msec", "Location Manager: ", Long.valueOf(System.currentTimeMillis() - this.f20346a.f20362g));
        z zVar = this.f20346a;
        zVar.a(zVar.f20360e);
        z zVar2 = this.f20346a;
        zVar2.f20360e = null;
        if (zVar2.f20361f != null || (runnable = zVar2.f20359d) == null) {
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
        this.f20346a.getClass();
        IAlog.a("%snetwork location listener - onStatusChanged: %dextras = %s", "Location Manager: ", Integer.valueOf(i10), bundle);
    }
}
