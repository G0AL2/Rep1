package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbdc extends zzcga {
    final /* synthetic */ zzbdi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdc(zzbdi zzbdiVar) {
        this.zza = zzbdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        zzbdi.zze(this.zza);
        return super.cancel(z10);
    }
}
