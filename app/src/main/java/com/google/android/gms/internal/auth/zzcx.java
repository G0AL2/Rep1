package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzcx {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final zzdd<Context, Boolean> zzi;

    public zzcx(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzcx(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, zzdd<Context, Boolean> zzddVar) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = "";
        this.zzd = "";
        this.zze = z10;
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzcx zza() {
        if (this.zzc.isEmpty()) {
            return new zzcx(null, this.zzb, this.zzc, this.zzd, true, false, false, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzcz<Double> zzb(String str, double d10) {
        return new zzcv(this, str, Double.valueOf(0.0d), true);
    }

    public final zzcz<Long> zzc(String str, long j10) {
        return new zzct(this, str, Long.valueOf(j10), true);
    }

    public final zzcz<Boolean> zzd(String str, boolean z10) {
        return new zzcu(this, str, Boolean.valueOf(z10), true);
    }

    public final <T> zzcz<T> zze(String str, T t10, zzhl zzhlVar) {
        return new zzcw(this, "getTokenRefactor__blocked_packages", t10, true, zzhlVar, null);
    }
}
