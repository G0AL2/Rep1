package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfj {
    final /* synthetic */ zzfn zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzfj(zzfn zzfnVar, String str, long j10) {
        this.zza = zzfnVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j10;
    }

    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long j10) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putLong(this.zzb, j10);
        edit.apply();
        this.zze = j10;
    }
}
