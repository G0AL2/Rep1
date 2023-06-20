package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzebg implements zzdeo {
    private final Context zza;
    private final zzcdn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebg(Context context, zzcdn zzcdnVar) {
        this.zza = context;
        this.zzb = zzcdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbxVar) {
        if (TextUtils.isEmpty(zzfbxVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzp(this.zza, zzfbxVar.zza.zza.zzd);
        this.zzb.zzl(this.zza, zzfbxVar.zzb.zzb.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzvVar) {
    }
}
