package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzsj {
    public final int zza;
    public final zzsa zzb;
    private final CopyOnWriteArrayList zzc;

    public zzsj() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    private zzsj(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzsa zzsaVar, long j10) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i10;
        this.zzb = zzsaVar;
    }

    private static final long zzn(long j10) {
        long zzz = zzeg.zzz(j10);
        if (zzz == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzz;
    }

    public final zzsj zza(int i10, zzsa zzsaVar, long j10) {
        return new zzsj(this.zzc, i10, zzsaVar, 0L);
    }

    public final void zzb(Handler handler, zzsk zzskVar) {
        Objects.requireNonNull(zzskVar);
        this.zzc.add(new zzsi(handler, zzskVar));
    }

    public final void zzc(final zzrw zzrwVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            final zzsk zzskVar = zzsiVar.zzb;
            zzeg.zzX(zzsiVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsd
                @Override // java.lang.Runnable
                public final void run() {
                    zzsj zzsjVar = zzsj.this;
                    zzskVar.zzaf(zzsjVar.zza, zzsjVar.zzb, zzrwVar);
                }
            });
        }
    }

    public final void zzd(int i10, zzad zzadVar, int i11, Object obj, long j10) {
        zzc(new zzrw(1, i10, zzadVar, 0, null, zzn(j10), -9223372036854775807L));
    }

    public final void zze(final zzrr zzrrVar, final zzrw zzrwVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            final zzsk zzskVar = zzsiVar.zzb;
            zzeg.zzX(zzsiVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzse
                @Override // java.lang.Runnable
                public final void run() {
                    zzsj zzsjVar = zzsj.this;
                    zzskVar.zzag(zzsjVar.zza, zzsjVar.zzb, zzrrVar, zzrwVar);
                }
            });
        }
    }

    public final void zzf(zzrr zzrrVar, int i10, int i11, zzad zzadVar, int i12, Object obj, long j10, long j11) {
        zze(zzrrVar, new zzrw(1, -1, null, 0, null, zzn(j10), zzn(j11)));
    }

    public final void zzg(final zzrr zzrrVar, final zzrw zzrwVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            final zzsk zzskVar = zzsiVar.zzb;
            zzeg.zzX(zzsiVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsh
                @Override // java.lang.Runnable
                public final void run() {
                    zzsj zzsjVar = zzsj.this;
                    zzskVar.zzah(zzsjVar.zza, zzsjVar.zzb, zzrrVar, zzrwVar);
                }
            });
        }
    }

    public final void zzh(zzrr zzrrVar, int i10, int i11, zzad zzadVar, int i12, Object obj, long j10, long j11) {
        zzg(zzrrVar, new zzrw(1, -1, null, 0, null, zzn(j10), zzn(j11)));
    }

    public final void zzi(final zzrr zzrrVar, final zzrw zzrwVar, final IOException iOException, final boolean z10) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            final zzsk zzskVar = zzsiVar.zzb;
            zzeg.zzX(zzsiVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsf
                @Override // java.lang.Runnable
                public final void run() {
                    zzsj zzsjVar = zzsj.this;
                    zzskVar.zzai(zzsjVar.zza, zzsjVar.zzb, zzrrVar, zzrwVar, iOException, z10);
                }
            });
        }
    }

    public final void zzj(zzrr zzrrVar, int i10, int i11, zzad zzadVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        zzi(zzrrVar, new zzrw(1, -1, null, 0, null, zzn(j10), zzn(j11)), iOException, z10);
    }

    public final void zzk(final zzrr zzrrVar, final zzrw zzrwVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            final zzsk zzskVar = zzsiVar.zzb;
            zzeg.zzX(zzsiVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsg
                @Override // java.lang.Runnable
                public final void run() {
                    zzsj zzsjVar = zzsj.this;
                    zzskVar.zzaj(zzsjVar.zza, zzsjVar.zzb, zzrrVar, zzrwVar);
                }
            });
        }
    }

    public final void zzl(zzrr zzrrVar, int i10, int i11, zzad zzadVar, int i12, Object obj, long j10, long j11) {
        zzk(zzrrVar, new zzrw(1, -1, null, 0, null, zzn(j10), zzn(j11)));
    }

    public final void zzm(zzsk zzskVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            if (zzsiVar.zzb == zzskVar) {
                this.zzc.remove(zzsiVar);
            }
        }
    }
}
