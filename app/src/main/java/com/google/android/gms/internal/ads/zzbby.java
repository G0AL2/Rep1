package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbby implements Comparator {
    public zzbby(zzbbz zzbbzVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbn zzbbnVar = (zzbbn) obj;
        zzbbn zzbbnVar2 = (zzbbn) obj2;
        if (zzbbnVar.zzd() >= zzbbnVar2.zzd()) {
            if (zzbbnVar.zzd() > zzbbnVar2.zzd()) {
                return 1;
            }
            if (zzbbnVar.zzb() >= zzbbnVar2.zzb()) {
                if (zzbbnVar.zzb() > zzbbnVar2.zzb()) {
                    return 1;
                }
                float zza = (zzbbnVar.zza() - zzbbnVar.zzd()) * (zzbbnVar.zzc() - zzbbnVar.zzb());
                float zza2 = (zzbbnVar2.zza() - zzbbnVar2.zzd()) * (zzbbnVar2.zzc() - zzbbnVar2.zzb());
                if (zza <= zza2) {
                    return zza < zza2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
