package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
final class zzkv extends zzkx {
    private zzkv() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkv(zzku zzkuVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zza(Object obj, long j10) {
        ((zzkj) zzmv.zzf(obj, j10)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zzb(Object obj, Object obj2, long j10) {
        zzkj zzkjVar = (zzkj) zzmv.zzf(obj, j10);
        zzkj zzkjVar2 = (zzkj) zzmv.zzf(obj2, j10);
        int size = zzkjVar.size();
        int size2 = zzkjVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkjVar.zzc()) {
                zzkjVar = zzkjVar.zzd(size2 + size);
            }
            zzkjVar.addAll(zzkjVar2);
        }
        if (size > 0) {
            zzkjVar2 = zzkjVar;
        }
        zzmv.zzs(obj, j10, zzkjVar2);
    }
}
