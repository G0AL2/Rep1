package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzboo implements zzbom {
    private final zzbop zza;

    public zzboo(zzbop zzbopVar, byte[] bArr) {
        this.zza = zzbopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcliVar = (zzcli) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            zzcfi.zzh("Fail to parse float", e10);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f10);
        zzcliVar.zzav(equals);
    }
}
