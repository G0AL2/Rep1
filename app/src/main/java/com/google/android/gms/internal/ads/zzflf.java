package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzflf {
    private final Context zza;
    private final Looper zzb;

    public zzflf(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzflt zza = zzflv.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzflq zza2 = zzflr.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzflg(this.zza, this.zzb, (zzflv) zza.zzal()).zza();
    }
}
