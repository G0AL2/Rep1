package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfl {
    @VisibleForTesting
    final String zza;
    final /* synthetic */ zzfn zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfl(zzfn zzfnVar, String str, long j10, zzfk zzfkVar) {
        this.zzb = zzfnVar;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j10 > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j10;
    }

    private final long zzc() {
        return this.zzb.zza().getLong(this.zza, 0L);
    }

    private final void zzd() {
        this.zzb.zzg();
        long currentTimeMillis = this.zzb.zzs.zzaw().currentTimeMillis();
        SharedPreferences.Editor edit = this.zzb.zza().edit();
        edit.remove(this.zzc);
        edit.remove(this.zzd);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    public final Pair zza() {
        long abs;
        this.zzb.zzg();
        this.zzb.zzg();
        long zzc = zzc();
        if (zzc == 0) {
            zzd();
            abs = 0;
        } else {
            abs = Math.abs(zzc - this.zzb.zzs.zzaw().currentTimeMillis());
        }
        long j10 = this.zze;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            zzd();
            return null;
        }
        String string = this.zzb.zza().getString(this.zzd, null);
        long j11 = this.zzb.zza().getLong(this.zzc, 0L);
        zzd();
        if (string != null && j11 > 0) {
            return new Pair(string, Long.valueOf(j11));
        }
        return zzfn.zza;
    }

    public final void zzb(String str, long j10) {
        this.zzb.zzg();
        if (zzc() == 0) {
            zzd();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.zzb.zza().getLong(this.zzc, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.zzb.zza().edit();
            edit.putString(this.zzd, str);
            edit.putLong(this.zzc, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.zzb.zzs.zzv().zzG().nextLong();
        long j12 = j11 + 1;
        SharedPreferences.Editor edit2 = this.zzb.zza().edit();
        if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j12) {
            edit2.putString(this.zzd, str);
        }
        edit2.putLong(this.zzc, j12);
        edit2.apply();
    }
}
