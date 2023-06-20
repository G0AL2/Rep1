package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaws implements zzayv {
    final /* synthetic */ zzawv zza;
    private final Uri zzb;
    private final zzayj zzc;
    private final zzawt zzd;
    private final zzazb zze;
    private final zzaub zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;

    public zzaws(zzawv zzawvVar, Uri uri, zzayj zzayjVar, zzawt zzawtVar, zzazb zzazbVar) {
        this.zza = zzawvVar;
        Objects.requireNonNull(uri);
        this.zzb = uri;
        Objects.requireNonNull(zzayjVar);
        this.zzc = zzayjVar;
        Objects.requireNonNull(zzawtVar);
        this.zzd = zzawtVar;
        this.zze = zzazbVar;
        this.zzf = new zzaub();
        this.zzh = true;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzb() {
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzc() throws IOException, InterruptedException {
        zzatv zzatvVar;
        long j10;
        while (!this.zzg) {
            int i10 = 0;
            try {
                long j11 = this.zzf.zza;
                long zzb = this.zzc.zzb(new zzayl(this.zzb, null, j11, j11, -1L, null, 0));
                this.zzj = zzb;
                if (zzb != -1) {
                    j10 = j11;
                    zzb += j10;
                    this.zzj = zzb;
                } else {
                    j10 = j11;
                }
                zzatvVar = new zzatv(this.zzc, j10, zzb);
                try {
                    zzatw zzb2 = this.zzd.zzb(zzatvVar, this.zzc.zzc());
                    if (this.zzh) {
                        zzb2.zze(j10, this.zzi);
                        this.zzh = false;
                    }
                    long j12 = j10;
                    int i11 = 0;
                    while (true) {
                        if (i11 != 0) {
                            break;
                        }
                        try {
                            if (this.zzg) {
                                i11 = 0;
                                break;
                            }
                            this.zze.zza();
                            i11 = zzb2.zzf(zzatvVar, this.zzf);
                            if (zzatvVar.zzd() > zzawv.zzf(this.zza) + j12) {
                                j12 = zzatvVar.zzd();
                                this.zze.zzb();
                                zzawv zzawvVar = this.zza;
                                zzawv.zzj(zzawvVar).post(zzawv.zzo(zzawvVar));
                            }
                        } catch (Throwable th) {
                            th = th;
                            i10 = i11;
                            if (i10 != 1 && zzatvVar != null) {
                                this.zzf.zza = zzatvVar.zzd();
                            }
                            zzazo.zzm(this.zzc);
                            throw th;
                        }
                    }
                    if (i11 != 1) {
                        this.zzf.zza = zzatvVar.zzd();
                        i10 = i11;
                    }
                    zzazo.zzm(this.zzc);
                    if (i10 != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zzatvVar = null;
            }
        }
    }

    public final void zzd(long j10, long j11) {
        this.zzf.zza = j10;
        this.zzi = j11;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final boolean zze() {
        return this.zzg;
    }
}
