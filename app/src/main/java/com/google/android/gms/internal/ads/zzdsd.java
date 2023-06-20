package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzdsd implements zzbom {
    final /* synthetic */ zzdse zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbom zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdsd(zzdse zzdseVar, WeakReference weakReference, String str, zzbom zzbomVar, zzdsc zzdscVar) {
        this.zza = zzdseVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzk(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
