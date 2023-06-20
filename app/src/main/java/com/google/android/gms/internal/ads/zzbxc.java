package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbxc extends zzbme {
    final /* synthetic */ zzbxf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbxc(zzbxf zzbxfVar, zzbxb zzbxbVar) {
        this.zza = zzbxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zze(zzblv zzblvVar, String str) {
        zzbxf zzbxfVar = this.zza;
        if (zzbxf.zzc(zzbxfVar) == null) {
            return;
        }
        zzbxf.zzc(zzbxfVar).onCustomClick(zzbxf.zze(zzbxfVar, zzblvVar), str);
    }
}
