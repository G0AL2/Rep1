package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfe extends zzkw {
    public zzfe(zzli zzliVar) {
        super(zzliVar);
    }

    public final boolean zza() {
        zzW();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.zzs.zzav().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    protected final boolean zzb() {
        return false;
    }
}
