package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfdn {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfem zzd = new zzfem();

    public zzfdn(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
    }

    private final void zzi() {
        while (!this.zza.isEmpty() && com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - ((zzfdx) this.zza.getFirst()).zzd >= this.zzc) {
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfdx zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfdx zzfdxVar = (zzfdx) this.zza.remove();
        if (zzfdxVar != null) {
            this.zzd.zzh();
        }
        return zzfdxVar;
    }

    public final zzfel zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfdx zzfdxVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfdxVar);
        return true;
    }
}
