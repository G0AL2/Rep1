package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfh {
    final /* synthetic */ zzfn zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzfh(zzfn zzfnVar, String str, boolean z10) {
        this.zza = zzfnVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z10;
    }

    public final void zza(boolean z10) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putBoolean(this.zzb, z10);
        edit.apply();
        this.zze = z10;
    }

    public final boolean zzb() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }
}
