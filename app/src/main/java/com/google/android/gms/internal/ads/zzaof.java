package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaof extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzaog zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaof(zzaog zzaogVar) {
        this.zza = zzaogVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzaog.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzaog.class) {
            this.zza.zza = null;
        }
    }
}
