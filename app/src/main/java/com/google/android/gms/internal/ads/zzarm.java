package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzarm implements zzarj {
    private final zzary[] zza;
    private final zzaye zzb;
    private final zzayc zzc;
    private final Handler zzd;
    private final zzarr zze;
    private final CopyOnWriteArraySet zzf;
    private final zzasd zzg;
    private final zzasc zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzase zzo;
    private Object zzp;
    private zzaxq zzq;
    private zzayc zzr;
    private zzarx zzs;
    private zzaro zzt;
    private long zzu;

    @SuppressLint({"HandlerLeak"})
    public zzarm(zzary[] zzaryVarArr, zzaye zzayeVar, zzcio zzcioVar, byte[] bArr) {
        String str = zzazo.zze;
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.2 [" + str + "]");
        this.zza = zzaryVarArr;
        Objects.requireNonNull(zzayeVar);
        this.zzb = zzayeVar;
        this.zzj = false;
        this.zzk = 1;
        this.zzf = new CopyOnWriteArraySet();
        zzayc zzaycVar = new zzayc(new zzaxu[2], null);
        this.zzc = zzaycVar;
        this.zzo = zzase.zza;
        this.zzg = new zzasd();
        this.zzh = new zzasc();
        this.zzq = zzaxq.zza;
        this.zzr = zzaycVar;
        this.zzs = zzarx.zza;
        zzarl zzarlVar = new zzarl(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.zzd = zzarlVar;
        zzaro zzaroVar = new zzaro(0, 0L);
        this.zzt = zzaroVar;
        this.zze = new zzarr(zzaryVarArr, zzayeVar, zzcioVar, this.zzj, 0, zzarlVar, zzaroVar, this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final int zza() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final long zzb() {
        if (!this.zzo.zzh() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
            return zzare.zzb(0L) + zzare.zzb(this.zzt.zzd);
        }
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final long zzc() {
        if (!this.zzo.zzh() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
            return zzare.zzb(0L) + zzare.zzb(this.zzt.zzc);
        }
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final long zzd() {
        if (this.zzo.zzh()) {
            return -9223372036854775807L;
        }
        zzase zzaseVar = this.zzo;
        zzs();
        return zzare.zzb(zzaseVar.zzg(0, this.zzg, false).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zze(zzarg zzargVar) {
        this.zzf.add(zzargVar);
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzf(zzari... zzariVarArr) {
        if (this.zze.zzr()) {
            if (this.zze.zzq(zzariVarArr)) {
                return;
            }
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarg) it.next()).zzc(zzarf.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
            return;
        }
        this.zze.zza(zzariVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzg() {
        this.zze.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzh(int i10) {
        this.zze.zzc(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzi() {
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzj(zzaxb zzaxbVar) {
        if (!this.zzo.zzh() || this.zzp != null) {
            this.zzo = zzase.zza;
            this.zzp = null;
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarg) it.next()).zzf(this.zzo, this.zzp);
            }
        }
        if (this.zzi) {
            this.zzi = false;
            this.zzq = zzaxq.zza;
            this.zzr = this.zzc;
            this.zzb.zzd(null);
            Iterator it2 = this.zzf.iterator();
            while (it2.hasNext()) {
                ((zzarg) it2.next()).zzg(this.zzq, this.zzr);
            }
        }
        this.zzm++;
        this.zze.zzi(zzaxbVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzk() {
        if (this.zze.zzr()) {
            if (!this.zze.zzs()) {
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzarg) it.next()).zzc(zzarf.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
                }
            }
            this.zzd.removeCallbacksAndMessages(null);
            return;
        }
        this.zze.zzj();
        this.zzd.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzl(zzarg zzargVar) {
        this.zzf.remove(zzargVar);
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzm(long j10) {
        zzs();
        if (!this.zzo.zzh() && this.zzo.zzc() <= 0) {
            throw new zzarv(this.zzo, 0, j10);
        }
        this.zzl++;
        if (!this.zzo.zzh()) {
            this.zzo.zzg(0, this.zzg, false);
            long zza = zzare.zza(j10);
            long j11 = this.zzo.zzd(0, this.zzh, false).zzc;
            if (j11 != -9223372036854775807L) {
                int i10 = (zza > j11 ? 1 : (zza == j11 ? 0 : -1));
            }
        }
        this.zzu = j10;
        this.zze.zzk(this.zzo, 0, zzare.zza(j10));
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            ((zzarg) it.next()).zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzn(zzari... zzariVarArr) {
        this.zze.zzl(zzariVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzo(int i10) {
        this.zze.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzp(int i10) {
        this.zze.zzn(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzq(boolean z10) {
        if (this.zzj != z10) {
            this.zzj = z10;
            this.zze.zzo(z10);
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarg) it.next()).zzd(z10, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zzr() {
        this.zze.zzp();
    }

    public final int zzs() {
        if (!this.zzo.zzh() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzt(Message message) {
        switch (message.what) {
            case 0:
                this.zzm--;
                return;
            case 1:
                this.zzk = message.arg1;
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzarg) it.next()).zzd(this.zzj, this.zzk);
                }
                return;
            case 2:
                this.zzn = message.arg1 != 0;
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    ((zzarg) it2.next()).zza(this.zzn);
                }
                return;
            case 3:
                if (this.zzm == 0) {
                    zzayf zzayfVar = (zzayf) message.obj;
                    this.zzi = true;
                    this.zzq = zzayfVar.zza;
                    this.zzr = zzayfVar.zzb;
                    this.zzb.zzd(zzayfVar.zzc);
                    Iterator it3 = this.zzf.iterator();
                    while (it3.hasNext()) {
                        ((zzarg) it3.next()).zzg(this.zzq, this.zzr);
                    }
                    return;
                }
                return;
            case 4:
                int i10 = this.zzl - 1;
                this.zzl = i10;
                if (i10 == 0) {
                    this.zzt = (zzaro) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.zzf.iterator();
                        while (it4.hasNext()) {
                            ((zzarg) it4.next()).zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzl == 0) {
                    this.zzt = (zzaro) message.obj;
                    Iterator it5 = this.zzf.iterator();
                    while (it5.hasNext()) {
                        ((zzarg) it5.next()).zze();
                    }
                    return;
                }
                return;
            case 6:
                zzarq zzarqVar = (zzarq) message.obj;
                this.zzl -= zzarqVar.zzd;
                if (this.zzm == 0) {
                    this.zzo = zzarqVar.zza;
                    this.zzp = zzarqVar.zzb;
                    this.zzt = zzarqVar.zzc;
                    Iterator it6 = this.zzf.iterator();
                    while (it6.hasNext()) {
                        ((zzarg) it6.next()).zzf(this.zzo, this.zzp);
                    }
                    return;
                }
                return;
            case 7:
                zzarx zzarxVar = (zzarx) message.obj;
                if (this.zzs.equals(zzarxVar)) {
                    return;
                }
                this.zzs = zzarxVar;
                Iterator it7 = this.zzf.iterator();
                while (it7.hasNext()) {
                    ((zzarg) it7.next()).zzb(zzarxVar);
                }
                return;
            case 8:
                zzarf zzarfVar = (zzarf) message.obj;
                Iterator it8 = this.zzf.iterator();
                while (it8.hasNext()) {
                    ((zzarg) it8.next()).zzc(zzarfVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
