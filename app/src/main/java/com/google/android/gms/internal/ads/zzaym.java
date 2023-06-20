package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaym {
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzayg[] zze = new zzayg[100];
    private final zzayg[] zza = new zzayg[1];

    public zzaym(boolean z10, int i10) {
    }

    public final synchronized int zza() {
        return this.zzc * Constants.MIN_PROGRESS_STEP;
    }

    public final synchronized zzayg zzb() {
        zzayg zzaygVar;
        this.zzc++;
        int i10 = this.zzd;
        if (i10 > 0) {
            zzayg[] zzaygVarArr = this.zze;
            int i11 = i10 - 1;
            this.zzd = i11;
            zzaygVar = zzaygVarArr[i11];
            zzaygVarArr[i11] = null;
        } else {
            zzaygVar = new zzayg(new byte[Constants.MIN_PROGRESS_STEP], 0);
        }
        return zzaygVar;
    }

    public final synchronized void zzc(zzayg zzaygVar) {
        zzayg[] zzaygVarArr = this.zza;
        zzaygVarArr[0] = zzaygVar;
        zzd(zzaygVarArr);
    }

    public final synchronized void zzd(zzayg[] zzaygVarArr) {
        int length = this.zzd + zzaygVarArr.length;
        zzayg[] zzaygVarArr2 = this.zze;
        int length2 = zzaygVarArr2.length;
        if (length >= length2) {
            this.zze = (zzayg[]) Arrays.copyOf(zzaygVarArr2, Math.max(length2 + length2, length));
        }
        for (zzayg zzaygVar : zzaygVarArr) {
            byte[] bArr = zzaygVar.zza;
            zzayg[] zzaygVarArr3 = this.zze;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            zzaygVarArr3[i10] = zzaygVar;
        }
        this.zzc -= zzaygVarArr.length;
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zzb;
        this.zzb = i10;
        if (i10 < i11) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzazo.zzd(this.zzb, Constants.MIN_PROGRESS_STEP) - this.zzc);
        int i10 = this.zzd;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.zze, max, i10, (Object) null);
        this.zzd = max;
    }
}
