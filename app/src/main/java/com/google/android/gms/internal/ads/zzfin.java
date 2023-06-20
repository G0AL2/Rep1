package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfin {
    public static zzfin zza(zzfio zzfioVar, zzfip zzfipVar) {
        if (zzfil.zzb()) {
            return new zzfir(zzfioVar, zzfipVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void zzb(View view, zzfit zzfitVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
