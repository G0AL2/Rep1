package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaap implements zzyr {
    public static final zzyy zza = new zzyy() { // from class: com.google.android.gms.internal.ads.zzaao
        @Override // com.google.android.gms.internal.ads.zzyy
        public final zzyr[] zza() {
            zzyy zzyyVar = zzaap.zza;
            return new zzyr[]{new zzaap()};
        }

        @Override // com.google.android.gms.internal.ads.zzyy
        public final /* synthetic */ zzyr[] zzb(Uri uri, Map map) {
            return zzyx.zza(this, uri, map);
        }
    };
    private zzyu zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzaan zzp;
    private zzaat zzq;
    private final zzdy zzb = new zzdy(4);
    private final zzdy zzc = new zzdy(9);
    private final zzdy zzd = new zzdy(11);
    private final zzdy zze = new zzdy();
    private final zzaaq zzf = new zzaaq();
    private int zzh = 1;

    private final zzdy zze(zzys zzysVar) throws IOException {
        if (this.zzm > this.zze.zzb()) {
            zzdy zzdyVar = this.zze;
            int zzb = zzdyVar.zzb();
            zzdyVar.zzD(new byte[Math.max(zzb + zzb, this.zzm)], 0);
        } else {
            this.zze.zzF(0);
        }
        this.zze.zzE(this.zzm);
        ((zzyl) zzysVar).zzn(this.zze.zzH(), 0, this.zzm, false);
        return this.zze;
    }

    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzL(new zzzt(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzys r17, com.google.android.gms.internal.ads.zzzr r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaap.zza(com.google.android.gms.internal.ads.zzys, com.google.android.gms.internal.ads.zzzr):int");
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzg = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j10, long j11) {
        if (j10 == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        zzyl zzylVar = (zzyl) zzysVar;
        zzylVar.zzm(this.zzb.zzH(), 0, 3, false);
        this.zzb.zzF(0);
        if (this.zzb.zzm() != 4607062) {
            return false;
        }
        zzylVar.zzm(this.zzb.zzH(), 0, 2, false);
        this.zzb.zzF(0);
        if ((this.zzb.zzo() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        zzylVar.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        int zze = this.zzb.zze();
        zzysVar.zzj();
        zzyl zzylVar2 = (zzyl) zzysVar;
        zzylVar2.zzl(zze, false);
        zzylVar2.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        return this.zzb.zze() == 0;
    }
}
