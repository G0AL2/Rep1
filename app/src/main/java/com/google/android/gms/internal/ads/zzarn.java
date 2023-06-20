package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzarn {
    public final zzawz zza;
    public final Object zzb;
    public final int zzc;
    public final zzaxl[] zzd;
    public final boolean[] zze;
    public final long zzf;
    public int zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public zzarn zzl;
    public zzayf zzm;
    private final zzary[] zzn;
    private final zzarz[] zzo;
    private final zzaye zzp;
    private final zzaxb zzq;
    private zzayf zzr;
    private final zzcio zzs;

    public zzarn(zzary[] zzaryVarArr, zzarz[] zzarzVarArr, long j10, zzaye zzayeVar, zzcio zzcioVar, zzaxb zzaxbVar, Object obj, int i10, int i11, boolean z10, long j11, byte[] bArr) {
        this.zzn = zzaryVarArr;
        this.zzo = zzarzVarArr;
        this.zzf = j10;
        this.zzp = zzayeVar;
        this.zzs = zzcioVar;
        this.zzq = zzaxbVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
        this.zzc = i10;
        this.zzg = i11;
        this.zzi = z10;
        this.zzh = j11;
        this.zzd = new zzaxl[2];
        this.zze = new boolean[2];
        this.zza = zzaxbVar.zze(i11, zzcioVar.zzl());
    }

    public final long zza(long j10, boolean z10) {
        return zzb(j10, false, new boolean[2]);
    }

    public final long zzb(long j10, boolean z10, boolean[] zArr) {
        zzayc zzaycVar = this.zzm.zzb;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= 2) {
                break;
            }
            boolean[] zArr2 = this.zze;
            if (z10 || !this.zzm.zza(this.zzr, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        long zzB = this.zza.zzB(zzaycVar.zzb(), this.zze, this.zzd, zArr, j10);
        this.zzr = this.zzm;
        this.zzk = false;
        int i11 = 0;
        while (true) {
            zzaxl[] zzaxlVarArr = this.zzd;
            if (i11 >= 2) {
                this.zzs.zzd(this.zzn, this.zzm.zza, zzaycVar);
                return zzB;
            }
            if (zzaxlVarArr[i11] != null) {
                zzayz.zze(zzaycVar.zza(i11) != null);
                this.zzk = true;
            } else {
                zzayz.zze(zzaycVar.zza(i11) == null);
            }
            i11++;
        }
    }

    public final void zzc() {
        try {
            this.zzq.zzc(this.zza);
        } catch (RuntimeException e10) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e10);
        }
    }

    public final boolean zzd() {
        return this.zzj && (!this.zzk || this.zza.zzg() == Long.MIN_VALUE);
    }

    public final boolean zze() throws zzarf {
        zzayf zzc = this.zzp.zzc(this.zzo, this.zza.zzn());
        zzayf zzayfVar = this.zzr;
        if (zzayfVar != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (zzc.zza(zzayfVar, i10)) {
                }
            }
            return false;
        }
        this.zzm = zzc;
        return true;
    }
}
