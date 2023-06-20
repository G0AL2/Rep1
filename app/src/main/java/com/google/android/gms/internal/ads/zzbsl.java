package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbsl extends zzcgh {
    private final com.google.android.gms.ads.internal.util.zzbb zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbsl(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zzb = zzbbVar;
    }

    public final zzbsg zza() {
        zzbsg zzbsgVar = new zzbsg(this);
        synchronized (this.zza) {
            zzi(new zzbsh(this, zzbsgVar), new zzbsi(this, zzbsgVar));
            Preconditions.checkState(this.zzd >= 0);
            this.zzd++;
        }
        return zzbsgVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
    }

    protected final void zzc() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            if (this.zzc && this.zzd == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                zzi(new zzbsk(this), new zzcgd());
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzd() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd > 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
    }
}
