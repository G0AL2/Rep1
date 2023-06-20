package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafv implements zzyr {
    public static final zzyy zza = new zzyy() { // from class: com.google.android.gms.internal.ads.zzafu
        @Override // com.google.android.gms.internal.ads.zzyy
        public final zzyr[] zza() {
            zzyy zzyyVar = zzafv.zza;
            return new zzyr[]{new zzafv(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyy
        public final /* synthetic */ zzyr[] zzb(Uri uri, Map map) {
            return zzyx.zza(this, uri, map);
        }
    };
    private final zzafw zzb;
    private final zzdy zzc;
    private final zzdy zzd;
    private final zzdx zze;
    private zzyu zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzafv() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        zzcw.zzb(this.zzf);
        int zza2 = zzysVar.zza(this.zzc.zzH(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzL(new zzzt(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzf = zzyuVar;
        this.zzb.zzb(zzyuVar, new zzahm(RecyclerView.UNDEFINED_DURATION, 0, 1));
        zzyuVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j10, long j11) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        int i10 = 0;
        while (true) {
            zzyl zzylVar = (zzyl) zzysVar;
            zzylVar.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(0);
            if (this.zzd.zzm() != 4801587) {
                break;
            }
            this.zzd.zzG(3);
            int zzj = this.zzd.zzj();
            i10 += zzj + 10;
            zzylVar.zzl(zzj, false);
        }
        zzysVar.zzj();
        zzyl zzylVar2 = (zzyl) zzysVar;
        zzylVar2.zzl(i10, false);
        if (this.zzh == -1) {
            this.zzh = i10;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            zzylVar2.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            if (zzafw.zzf(this.zzd.zzo())) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                zzylVar2.zzm(this.zzd.zzH(), 0, 4, false);
                this.zze.zzh(14);
                int zzc = this.zze.zzc(13);
                if (zzc <= 6) {
                    i11++;
                    zzysVar.zzj();
                    zzylVar2.zzl(i11, false);
                } else {
                    zzylVar2.zzl(zzc - 6, false);
                    i13 += zzc;
                }
            } else {
                i11++;
                zzysVar.zzj();
                zzylVar2.zzl(i11, false);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
        return false;
    }

    public zzafv(int i10) {
        this.zzb = new zzafw(true, null);
        this.zzc = new zzdy(2048);
        this.zzh = -1L;
        zzdy zzdyVar = new zzdy(10);
        this.zzd = zzdyVar;
        byte[] zzH = zzdyVar.zzH();
        this.zze = new zzdx(zzH, zzH.length);
    }
}
