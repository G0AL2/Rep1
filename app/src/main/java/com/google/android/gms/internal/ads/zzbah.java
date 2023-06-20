package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbah {
    private final Handler zza;
    private final zzbai zzb;

    public zzbah(Handler handler, zzbai zzbaiVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzbaiVar;
    }

    public final void zzb(String str, long j10, long j11) {
        this.zza.post(new zzbab(this, str, j10, j11));
    }

    public final void zzc(zzatn zzatnVar) {
        this.zza.post(new zzbag(this, zzatnVar));
    }

    public final void zzd(int i10, long j10) {
        this.zza.post(new zzbad(this, i10, j10));
    }

    public final void zze(zzatn zzatnVar) {
        this.zza.post(new zzbaa(this, zzatnVar));
    }

    public final void zzf(zzart zzartVar) {
        this.zza.post(new zzbac(this, zzartVar));
    }

    public final void zzg(Surface surface) {
        this.zza.post(new zzbaf(this, surface));
    }

    public final void zzh(int i10, int i11, int i12, float f10) {
        this.zza.post(new zzbae(this, i10, i11, i12, f10));
    }
}
