package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzeyk implements zzfuy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeyk(zzeym zzeymVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* synthetic */ void zzb(Object obj) {
        Void r12 = (Void) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit successful.");
    }
}
