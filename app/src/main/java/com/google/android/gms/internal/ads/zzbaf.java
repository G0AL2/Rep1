package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbaf implements Runnable {
    final /* synthetic */ Surface zza;
    final /* synthetic */ zzbah zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbaf(zzbah zzbahVar, Surface surface) {
        this.zzb = zzbahVar;
        this.zza = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbai zzbaiVar;
        zzbaiVar = this.zzb.zzb;
        zzbaiVar.zzm(this.zza);
    }
}
