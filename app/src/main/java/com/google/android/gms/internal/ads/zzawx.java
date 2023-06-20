package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawx implements zzaxb, zzaxa {
    private final Uri zza;
    private final zzayi zzb;
    private final zzaty zzc;
    private final int zzd;
    private final Handler zze;
    private final zzaww zzf;
    private final zzasc zzg = new zzasc();
    private final int zzh;
    private zzaxa zzi;
    private zzase zzj;
    private boolean zzk;

    public zzawx(Uri uri, zzayi zzayiVar, zzaty zzatyVar, int i10, Handler handler, zzaww zzawwVar, String str, int i11) {
        this.zza = uri;
        this.zzb = zzayiVar;
        this.zzc = zzatyVar;
        this.zzd = i10;
        this.zze = handler;
        this.zzf = zzawwVar;
        this.zzh = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zza() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zzb(zzarj zzarjVar, boolean z10, zzaxa zzaxaVar) {
        this.zzi = zzaxaVar;
        zzaxo zzaxoVar = new zzaxo(-9223372036854775807L, false);
        this.zzj = zzaxoVar;
        zzaxaVar.zzg(zzaxoVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zzc(zzawz zzawzVar) {
        ((zzawv) zzawzVar).zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zzd() {
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final zzawz zze(int i10, zzaym zzaymVar) {
        zzayz.zzc(i10 == 0);
        return new zzawv(this.zza, this.zzb.zza(), this.zzc.zza(), this.zzd, this.zze, this.zzf, this, zzaymVar, null, this.zzh, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zzg(zzase zzaseVar, Object obj) {
        zzasc zzascVar = this.zzg;
        zzaseVar.zzd(0, zzascVar, false);
        boolean z10 = zzascVar.zzc != -9223372036854775807L;
        if (!this.zzk || z10) {
            this.zzj = zzaseVar;
            this.zzk = z10;
            this.zzi.zzg(zzaseVar, null);
        }
    }
}
