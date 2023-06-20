package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzim extends zzk implements zzhe {
    public static final /* synthetic */ int zzd = 0;
    private final zzkf zzA;
    private final zzkg zzB;
    private final long zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private int zzG;
    private zzjw zzH;
    private zzbx zzI;
    private zzbh zzJ;
    private zzbh zzK;
    private zzad zzL;
    private zzad zzM;
    private AudioTrack zzN;
    private Object zzO;
    private Surface zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private zzgl zzT;
    private zzgl zzU;
    private int zzV;
    private zzi zzW;
    private float zzX;
    private boolean zzY;
    private List zzZ;
    private boolean zzaa;
    private boolean zzab;
    private zzr zzac;
    private zzcv zzad;
    private zzbh zzae;
    private zzjn zzaf;
    private int zzag;
    private long zzah;
    private final zzhp zzai;
    private zztt zzaj;
    final zzvn zzb;
    final zzbx zzc;
    private final zzcz zze;
    private final Context zzf;
    private final zzcb zzg;
    private final zzjt[] zzh;
    private final zzvm zzi;
    private final zzdg zzj;
    private final zziw zzk;
    private final zzdm zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcf zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzrz zzq;
    private final zzkh zzr;
    private final Looper zzs;
    private final zzvu zzt;
    private final zzcx zzu;
    private final zzii zzv;
    private final zzik zzw;
    private final zzgf zzx;
    private final zzgj zzy;
    private final zzke zzz;

    static {
        zzbc.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzkh, com.google.android.gms.internal.ads.zzvt, java.lang.Object] */
    @SuppressLint({"HandlerLeak"})
    public zzim(zzhd zzhdVar, zzcb zzcbVar) {
        zzmu zza;
        Object obj;
        zzcz zzczVar = new zzcz(zzcx.zza);
        this.zze = zzczVar;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzeg.zze;
            Log.i("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.0.0-alpha03] [" + str + "]");
            Context applicationContext = zzhdVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzhdVar.zzh.apply(zzhdVar.zzb);
            this.zzr = apply;
            this.zzW = zzhdVar.zzj;
            this.zzQ = 1;
            this.zzY = false;
            this.zzC = Constants.MIN_PROGRESS_TIME;
            zzii zziiVar = new zzii(this, null);
            this.zzv = zziiVar;
            zzik zzikVar = new zzik(null);
            this.zzw = zzikVar;
            Handler handler = new Handler(zzhdVar.zzi);
            zzjt[] zza2 = ((zzgx) zzhdVar.zzc).zza.zza(handler, zziiVar, zziiVar, zziiVar, zziiVar);
            this.zzh = zza2;
            int length = zza2.length;
            zzvm zzvmVar = (zzvm) zzhdVar.zze.zza();
            this.zzi = zzvmVar;
            this.zzq = zzhd.zza(((zzgy) zzhdVar.zzd).zza);
            zzvy zzg = zzvy.zzg(((zzhb) zzhdVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = true;
            this.zzH = zzhdVar.zzk;
            Looper looper = zzhdVar.zzi;
            this.zzs = looper;
            zzcx zzcxVar = zzhdVar.zzb;
            this.zzu = zzcxVar;
            this.zzg = zzcbVar;
            zzdm zzdmVar = new zzdm(looper, zzcxVar, new zzdk() { // from class: com.google.android.gms.internal.ads.zzho
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj2, zzy zzyVar) {
                    zzby zzbyVar = (zzby) obj2;
                }
            });
            this.zzl = zzdmVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzaj = new zztt(0);
            int length2 = zza2.length;
            zzvn zzvnVar = new zzvn(new zzjv[2], new zzvg[2], zzct.zza, null);
            this.zzb = zzvnVar;
            this.zzn = new zzcf();
            zzbv zzbvVar = new zzbv();
            zzbvVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            zzvmVar.zzh();
            zzbvVar.zzd(29, true);
            zzbx zze = zzbvVar.zze();
            this.zzc = zze;
            zzbv zzbvVar2 = new zzbv();
            zzbvVar2.zzb(zze);
            zzbvVar2.zza(4);
            zzbvVar2.zza(10);
            this.zzI = zzbvVar2.zze();
            this.zzj = zzcxVar.zzb(looper, null);
            zzhp zzhpVar = new zzhp(this);
            this.zzai = zzhpVar;
            this.zzaf = zzjn.zzh(zzvnVar);
            apply.zzS(zzcbVar, looper);
            int i10 = zzeg.zza;
            if (i10 < 31) {
                zza = new zzmu();
            } else {
                zza = zzib.zza(applicationContext, this, true);
            }
            this.zzk = new zziw(zza2, zzvmVar, zzvnVar, (zzja) zzhdVar.zzf.zza(), zzg, 0, false, apply, this.zzH, zzhdVar.zzm, 500L, false, looper, zzcxVar, zzhpVar, zza, null);
            this.zzX = 1.0f;
            zzbh zzbhVar = zzbh.zza;
            this.zzJ = zzbhVar;
            this.zzK = zzbhVar;
            this.zzae = zzbhVar;
            this.zzag = -1;
            if (i10 < 21) {
                AudioTrack audioTrack = this.zzN;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzN.release();
                    obj = null;
                    this.zzN = null;
                }
                if (this.zzN == null) {
                    this.zzN = new AudioTrack(3, TTAdSdk.INIT_LOCAL_FAIL_CODE, 4, 2, 2, 0, 0);
                }
                this.zzV = this.zzN.getAudioSessionId();
            } else {
                obj = null;
                this.zzV = zzeg.zzi(applicationContext);
            }
            this.zzZ = zzfrj.zzo();
            this.zzaa = true;
            Objects.requireNonNull(apply);
            zzdmVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zziiVar);
            this.zzx = new zzgf(zzhdVar.zza, handler, zziiVar);
            this.zzy = new zzgj(zzhdVar.zza, handler, zziiVar);
            zzeg.zzS(obj, obj);
            zzke zzkeVar = new zzke(zzhdVar.zza, handler, zziiVar);
            this.zzz = zzkeVar;
            int i11 = this.zzW.zzc;
            zzkeVar.zzf(3);
            this.zzA = new zzkf(zzhdVar.zza);
            this.zzB = new zzkg(zzhdVar.zza);
            this.zzac = zzam(zzkeVar);
            this.zzad = zzcv.zza;
            zzaq(1, 10, Integer.valueOf(this.zzV));
            zzaq(2, 10, Integer.valueOf(this.zzV));
            zzaq(1, 3, this.zzW);
            zzaq(2, 4, Integer.valueOf(this.zzQ));
            zzaq(2, 5, 0);
            zzaq(1, 9, Boolean.valueOf(this.zzY));
            zzaq(2, 7, zzikVar);
            zzaq(6, 8, zzikVar);
            zzczVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzN(zzim zzimVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzimVar.zzas(surface);
        zzimVar.zzP = surface;
    }

    private final int zzag() {
        if (this.zzaf.zza.zzo()) {
            return this.zzag;
        }
        zzjn zzjnVar = this.zzaf;
        return zzjnVar.zza.zzn(zzjnVar.zzb.zza, this.zzn).zzd;
    }

    public static int zzah(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private final long zzai(zzjn zzjnVar) {
        if (zzjnVar.zza.zzo()) {
            return zzeg.zzv(this.zzah);
        }
        if (zzjnVar.zzb.zzb()) {
            return zzjnVar.zzs;
        }
        zzci zzciVar = zzjnVar.zza;
        zzsa zzsaVar = zzjnVar.zzb;
        long j10 = zzjnVar.zzs;
        zzak(zzciVar, zzsaVar, j10);
        return j10;
    }

    private static long zzaj(zzjn zzjnVar) {
        zzch zzchVar = new zzch();
        zzcf zzcfVar = new zzcf();
        zzjnVar.zza.zzn(zzjnVar.zzb.zza, zzcfVar);
        long j10 = zzjnVar.zzc;
        if (j10 == -9223372036854775807L) {
            long j11 = zzjnVar.zza.zze(zzcfVar.zzd, zzchVar, 0L).zzm;
            return 0L;
        }
        return j10;
    }

    private final long zzak(zzci zzciVar, zzsa zzsaVar, long j10) {
        zzciVar.zzn(zzsaVar.zza, this.zzn);
        return j10;
    }

    private final Pair zzal(zzci zzciVar, int i10, long j10) {
        if (zzciVar.zzo()) {
            this.zzag = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.zzah = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzciVar.zzc()) {
            i10 = zzciVar.zzg(false);
            long j11 = zzciVar.zze(i10, this.zza, 0L).zzm;
            j10 = zzeg.zzz(0L);
        }
        return zzciVar.zzl(this.zza, this.zzn, i10, zzeg.zzv(j10));
    }

    public static zzr zzam(zzke zzkeVar) {
        return new zzr(0, zzkeVar.zzb(), zzkeVar.zza());
    }

    private final zzjn zzan(zzjn zzjnVar, zzci zzciVar, Pair pair) {
        zzsa zzsaVar;
        zzty zztyVar;
        zzsa zzsaVar2;
        zzvn zzvnVar;
        List list;
        int i10;
        zzjn zzb;
        long j10;
        zzcw.zzd(zzciVar.zzo() || pair != null);
        zzci zzciVar2 = zzjnVar.zza;
        zzjn zzg = zzjnVar.zzg(zzciVar);
        if (zzciVar.zzo()) {
            zzsa zzi = zzjn.zzi();
            long zzv = zzeg.zzv(this.zzah);
            zzjn zza = zzg.zzb(zzi, zzv, zzv, zzv, 0L, zzty.zza, this.zzb, zzfrj.zzo()).zza(zzi);
            zza.zzq = zza.zzs;
            return zza;
        }
        Object obj = zzg.zzb.zza;
        int i11 = zzeg.zza;
        boolean z10 = !obj.equals(pair.first);
        if (z10) {
            zzsaVar = new zzsa(pair.first);
        } else {
            zzsaVar = zzg.zzb;
        }
        zzsa zzsaVar3 = zzsaVar;
        long longValue = ((Long) pair.second).longValue();
        long zzv2 = zzeg.zzv(zzk());
        if (!zzciVar2.zzo()) {
            zzciVar2.zzn(obj, this.zzn);
        }
        if (z10 || longValue < zzv2) {
            zzcw.zzf(!zzsaVar3.zzb());
            if (z10) {
                zztyVar = zzty.zza;
            } else {
                zztyVar = zzg.zzh;
            }
            zzty zztyVar2 = zztyVar;
            if (z10) {
                zzsaVar2 = zzsaVar3;
                zzvnVar = this.zzb;
            } else {
                zzsaVar2 = zzsaVar3;
                zzvnVar = zzg.zzi;
            }
            zzvn zzvnVar2 = zzvnVar;
            if (z10) {
                list = zzfrj.zzo();
            } else {
                list = zzg.zzj;
            }
            zzjn zza2 = zzg.zzb(zzsaVar2, longValue, longValue, longValue, 0L, zztyVar2, zzvnVar2, list).zza(zzsaVar2);
            zza2.zzq = longValue;
            return zza2;
        }
        if (i10 == 0) {
            int zza3 = zzciVar.zza(zzg.zzk.zza);
            if (zza3 != -1 && zzciVar.zzd(zza3, this.zzn, false).zzd == zzciVar.zzn(zzsaVar3.zza, this.zzn).zzd) {
                return zzg;
            }
            zzciVar.zzn(zzsaVar3.zza, this.zzn);
            if (zzsaVar3.zzb()) {
                j10 = this.zzn.zzg(zzsaVar3.zzb, zzsaVar3.zzc);
            } else {
                j10 = this.zzn.zze;
            }
            zzb = zzg.zzb(zzsaVar3, zzg.zzs, zzg.zzs, zzg.zzd, j10 - zzg.zzs, zzg.zzh, zzg.zzi, zzg.zzj).zza(zzsaVar3);
            zzb.zzq = j10;
        } else {
            zzcw.zzf(!zzsaVar3.zzb());
            long max = Math.max(0L, zzg.zzr - (longValue - zzv2));
            long j11 = zzg.zzq;
            if (zzg.zzk.equals(zzg.zzb)) {
                j11 = longValue + max;
            }
            zzb = zzg.zzb(zzsaVar3, longValue, longValue, longValue, max, zzg.zzh, zzg.zzi, zzg.zzj);
            zzb.zzq = j11;
        }
        return zzb;
    }

    private final zzjq zzao(zzjp zzjpVar) {
        int zzag = zzag();
        zziw zziwVar = this.zzk;
        return new zzjq(zziwVar, zzjpVar, this.zzaf.zza, zzag == -1 ? 0 : zzag, this.zzu, zziwVar.zzb());
    }

    public final void zzap(final int i10, final int i11) {
        if (i10 == this.zzR && i11 == this.zzS) {
            return;
        }
        this.zzR = i10;
        this.zzS = i11;
        zzdm zzdmVar = this.zzl;
        zzdmVar.zzd(24, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhs
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                int i12 = i10;
                int i13 = i11;
                int i14 = zzim.zzd;
                ((zzby) obj).zzr(i12, i13);
            }
        });
        zzdmVar.zzc();
    }

    private final void zzaq(int i10, int i11, Object obj) {
        zzjt[] zzjtVarArr = this.zzh;
        int length = zzjtVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzjt zzjtVar = zzjtVarArr[i12];
            if (zzjtVar.zzb() == i10) {
                zzjq zzao = zzao(zzjtVar);
                zzao.zzf(i11);
                zzao.zze(obj);
                zzao.zzd();
            }
        }
    }

    public final void zzar() {
        zzaq(1, 2, Float.valueOf(this.zzX * this.zzy.zza()));
    }

    public final void zzas(Object obj) {
        boolean z10;
        ArrayList<zzjq> arrayList = new ArrayList();
        zzjt[] zzjtVarArr = this.zzh;
        int length = zzjtVarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= 2) {
                break;
            }
            zzjt zzjtVar = zzjtVarArr[i10];
            if (zzjtVar.zzb() == 2) {
                zzjq zzao = zzao(zzjtVar);
                zzao.zzf(1);
                zzao.zze(obj);
                zzao.zzd();
                arrayList.add(zzao);
            }
            i10++;
        }
        Object obj2 = this.zzO;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (zzjq zzjqVar : arrayList) {
                    zzjqVar.zzi(this.zzC);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (z10) {
            zzat(false, zzgt.zzd(new zziy(3), 1003));
        }
    }

    private final void zzat(boolean z10, zzgt zzgtVar) {
        zzjn zzjnVar = this.zzaf;
        zzjn zza = zzjnVar.zza(zzjnVar.zzb);
        zza.zzq = zza.zzs;
        zza.zzr = 0L;
        zzjn zzf = zza.zzf(1);
        if (zzgtVar != null) {
            zzf = zzf.zze(zzgtVar);
        }
        zzjn zzjnVar2 = zzf;
        this.zzD++;
        this.zzk.zzo();
        zzav(zzjnVar2, 0, 1, false, zzjnVar2.zza.zzo() && !this.zzaf.zza.zzo(), 4, zzai(zzjnVar2), -1);
    }

    public final void zzau(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        zzjn zzjnVar = this.zzaf;
        if (zzjnVar.zzl == z11 && zzjnVar.zzm == i12) {
            return;
        }
        this.zzD++;
        zzjn zzd2 = zzjnVar.zzd(z11, i12);
        this.zzk.zzn(z11, i12);
        zzav(zzd2, 0, i11, false, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzav(final com.google.android.gms.internal.ads.zzjn r44, final int r45, final int r46, boolean r47, boolean r48, final int r49, long r50, int r52) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzim.zzav(com.google.android.gms.internal.ads.zzjn, int, int, boolean, boolean, int, long, int):void");
    }

    public final void zzaw() {
        int zzh = zzh();
        if (zzh == 2 || zzh == 3) {
            zzax();
            boolean z10 = this.zzaf.zzp;
            zzq();
            zzq();
        }
    }

    private final void zzax() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String zzH = zzeg.zzH("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (!this.zzaa) {
                zzdn.zzb("ExoPlayerImpl", zzH, this.zzab ? null : new IllegalStateException());
                this.zzab = true;
                return;
            }
            throw new IllegalStateException(zzH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzay(zzjn zzjnVar) {
        return zzjnVar.zze == 3 && zzjnVar.zzl && zzjnVar.zzm == 0;
    }

    public final zzgt zzA() {
        zzax();
        return this.zzaf.zzf;
    }

    public final void zzR(zzkk zzkkVar) {
        Objects.requireNonNull(zzkkVar);
        this.zzr.zzw(zzkkVar);
    }

    public final /* synthetic */ void zzS(zziu zziuVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.zzD - zziuVar.zzb;
        this.zzD = i10;
        boolean z11 = true;
        if (zziuVar.zzc) {
            this.zzE = zziuVar.zzd;
            this.zzF = true;
        }
        if (zziuVar.zze) {
            this.zzG = zziuVar.zzf;
        }
        if (i10 == 0) {
            zzci zzciVar = zziuVar.zza.zza;
            if (!this.zzaf.zza.zzo() && zzciVar.zzo()) {
                this.zzag = -1;
                this.zzah = 0L;
            }
            if (!zzciVar.zzo()) {
                List zzw = ((zzjr) zzciVar).zzw();
                zzcw.zzf(zzw.size() == this.zzo.size());
                for (int i11 = 0; i11 < zzw.size(); i11++) {
                    ((zzil) this.zzo.get(i11)).zzb = (zzci) zzw.get(i11);
                }
            }
            if (this.zzF) {
                if (zziuVar.zza.zzb.equals(this.zzaf.zzb) && zziuVar.zza.zzd == this.zzaf.zzs) {
                    z11 = false;
                }
                if (z11) {
                    if (!zzciVar.zzo() && !zziuVar.zza.zzb.zzb()) {
                        zzjn zzjnVar = zziuVar.zza;
                        zzsa zzsaVar = zzjnVar.zzb;
                        j11 = zzjnVar.zzd;
                        zzak(zzciVar, zzsaVar, j11);
                    } else {
                        j11 = zziuVar.zza.zzd;
                    }
                    z10 = z11;
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                    z10 = z11;
                }
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.zzF = false;
            zzav(zziuVar.zza, 1, this.zzG, false, z10, this.zzE, j10, -1);
        }
    }

    public final /* synthetic */ void zzT(final zziu zziuVar) {
        this.zzj.zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhq
            @Override // java.lang.Runnable
            public final void run() {
                zzim.this.zzS(zziuVar);
            }
        });
    }

    public final /* synthetic */ void zzU(zzby zzbyVar) {
        zzbyVar.zza(this.zzI);
    }

    public final void zzW() {
        zzax();
        boolean zzq = zzq();
        int zzb = this.zzy.zzb(zzq, 2);
        zzau(zzq, zzb, zzah(zzq, zzb));
        zzjn zzjnVar = this.zzaf;
        if (zzjnVar.zze != 1) {
            return;
        }
        zzjn zze = zzjnVar.zze(null);
        zzjn zzf = zze.zzf(true == zze.zza.zzo() ? 4 : 2);
        this.zzD++;
        this.zzk.zzk();
        zzav(zzf, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void zzX() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzeg.zze;
        String zza = zzbc.zza();
        Log.i("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.0.0-alpha03] [" + str + "] [" + zza + "]");
        zzax();
        if (zzeg.zza < 21 && (audioTrack = this.zzN) != null) {
            audioTrack.release();
            this.zzN = null;
        }
        this.zzz.zze();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzdm zzdmVar = this.zzl;
            zzdmVar.zzd(10, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhr
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj) {
                    ((zzby) obj).zzl(zzgt.zzd(new zziy(1), 1003));
                }
            });
            zzdmVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zzd(null);
        this.zzt.zzf(this.zzr);
        zzjn zzf = this.zzaf.zzf(1);
        this.zzaf = zzf;
        zzjn zza2 = zzf.zza(zzf.zzb);
        this.zzaf = zza2;
        zza2.zzq = zza2.zzs;
        this.zzaf.zzr = 0L;
        this.zzr.zzQ();
        this.zzi.zzo();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        this.zzZ = zzfrj.zzo();
    }

    public final void zzY(zzkk zzkkVar) {
        this.zzr.zzR(zzkkVar);
    }

    public final void zzZ(zzsc zzscVar) {
        zzax();
        List singletonList = Collections.singletonList(zzscVar);
        zzax();
        zzax();
        zzag();
        zzl();
        this.zzD++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.zzo.remove(i10);
            }
            this.zzaj = this.zzaj.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < singletonList.size(); i11++) {
            zzjk zzjkVar = new zzjk((zzsc) singletonList.get(i11), this.zzp);
            arrayList.add(zzjkVar);
            this.zzo.add(i11, new zzil(zzjkVar.zzb, zzjkVar.zza.zzA()));
        }
        this.zzaj = this.zzaj.zzg(0, arrayList.size());
        zzjr zzjrVar = new zzjr(this.zzo, this.zzaj, null);
        if (!zzjrVar.zzo() && zzjrVar.zzc() < 0) {
            throw new zzae(zzjrVar, -1, -9223372036854775807L);
        }
        int zzg = zzjrVar.zzg(false);
        zzjn zzan = zzan(this.zzaf, zzjrVar, zzal(zzjrVar, zzg, -9223372036854775807L));
        int i12 = zzan.zze;
        if (zzg != -1 && i12 != 1) {
            i12 = (zzjrVar.zzo() || zzg >= zzjrVar.zzc()) ? 4 : 2;
        }
        zzjn zzf = zzan.zzf(i12);
        this.zzk.zzq(arrayList, zzg, zzeg.zzv(-9223372036854775807L), this.zzaj);
        zzav(zzf, 0, 1, false, (this.zzaf.zzb.zza.equals(zzf.zzb.zza) || this.zzaf.zza.zzo()) ? false : true, 4, zzai(zzf), -1);
    }

    public final void zzaa(boolean z10) {
        zzax();
        int zzb = this.zzy.zzb(z10, zzh());
        zzau(z10, zzb, zzah(z10, zzb));
    }

    public final void zzab(boolean z10) {
        this.zzaa = false;
    }

    public final void zzac(Surface surface) {
        zzax();
        zzas(surface);
        int i10 = surface == null ? 0 : -1;
        zzap(i10, i10);
    }

    public final void zzad(float f10) {
        zzax();
        final float zza = zzeg.zza(f10, 0.0f, 1.0f);
        if (this.zzX == zza) {
            return;
        }
        this.zzX = zza;
        zzar();
        zzdm zzdmVar = this.zzl;
        zzdmVar.zzd(22, new zzdj() { // from class: com.google.android.gms.internal.ads.zzht
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                float f11 = zza;
                int i10 = zzim.zzd;
                ((zzby) obj).zzv(f11);
            }
        });
        zzdmVar.zzc();
    }

    public final void zzae() {
        zzax();
        zzax();
        this.zzy.zzb(zzq(), 1);
        zzat(false, null);
        this.zzZ = zzfrj.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzd() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zze() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzf() {
        zzax();
        int zzag = zzag();
        if (zzag == -1) {
            return 0;
        }
        return zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzg() {
        zzax();
        if (this.zzaf.zza.zzo()) {
            return 0;
        }
        zzjn zzjnVar = this.zzaf;
        return zzjnVar.zza.zza(zzjnVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzh() {
        zzax();
        return this.zzaf.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzi() {
        zzax();
        return this.zzaf.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzj() {
        zzax();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzk() {
        zzax();
        if (zzs()) {
            zzjn zzjnVar = this.zzaf;
            zzjnVar.zza.zzn(zzjnVar.zzb.zza, this.zzn);
            zzjn zzjnVar2 = this.zzaf;
            if (zzjnVar2.zzc == -9223372036854775807L) {
                long j10 = zzjnVar2.zza.zze(zzf(), this.zza, 0L).zzm;
                return zzeg.zzz(0L);
            }
            return zzeg.zzz(0L) + zzeg.zzz(this.zzaf.zzc);
        }
        return zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzl() {
        zzax();
        return zzeg.zzz(zzai(this.zzaf));
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzm() {
        zzax();
        return zzeg.zzz(this.zzaf.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final zzci zzn() {
        zzax();
        return this.zzaf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final zzct zzo() {
        zzax();
        return this.zzaf.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final void zzp(int i10, long j10) {
        zzax();
        this.zzr.zzx();
        zzci zzciVar = this.zzaf.zza;
        if (i10 >= 0 && (zzciVar.zzo() || i10 < zzciVar.zzc())) {
            this.zzD++;
            if (zzs()) {
                Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zziu zziuVar = new zziu(this.zzaf);
                zziuVar.zza(1);
                this.zzai.zza.zzT(zziuVar);
                return;
            }
            int i11 = zzh() != 1 ? 2 : 1;
            int zzf = zzf();
            zzjn zzan = zzan(this.zzaf.zzf(i11), zzciVar, zzal(zzciVar, i10, j10));
            this.zzk.zzl(zzciVar, i10, zzeg.zzv(j10));
            zzav(zzan, 0, 1, true, true, 1, zzai(zzan), zzf);
            return;
        }
        throw new zzae(zzciVar, i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzq() {
        zzax();
        return this.zzaf.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzr() {
        zzax();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzs() {
        zzax();
        return this.zzaf.zzb.zzb();
    }

    public final int zzu() {
        zzax();
        int length = this.zzh.length;
        return 2;
    }

    public final long zzv() {
        zzax();
        if (zzs()) {
            zzjn zzjnVar = this.zzaf;
            if (zzjnVar.zzk.equals(zzjnVar.zzb)) {
                return zzeg.zzz(this.zzaf.zzq);
            }
            return zzw();
        }
        zzax();
        if (this.zzaf.zza.zzo()) {
            return this.zzah;
        }
        zzjn zzjnVar2 = this.zzaf;
        long j10 = 0;
        if (zzjnVar2.zzk.zzd != zzjnVar2.zzb.zzd) {
            return zzeg.zzz(zzjnVar2.zza.zze(zzf(), this.zza, 0L).zzn);
        }
        long j11 = zzjnVar2.zzq;
        if (this.zzaf.zzk.zzb()) {
            zzjn zzjnVar3 = this.zzaf;
            zzjnVar3.zza.zzn(zzjnVar3.zzk.zza, this.zzn).zzh(this.zzaf.zzk.zzb);
        } else {
            j10 = j11;
        }
        zzjn zzjnVar4 = this.zzaf;
        zzak(zzjnVar4.zza, zzjnVar4.zzk, j10);
        return zzeg.zzz(j10);
    }

    public final long zzw() {
        zzax();
        if (!zzs()) {
            zzci zzn = zzn();
            if (zzn.zzo()) {
                return -9223372036854775807L;
            }
            return zzeg.zzz(zzn.zze(zzf(), this.zza, 0L).zzn);
        }
        zzjn zzjnVar = this.zzaf;
        zzsa zzsaVar = zzjnVar.zzb;
        zzjnVar.zza.zzn(zzsaVar.zza, this.zzn);
        return zzeg.zzz(this.zzn.zzg(zzsaVar.zzb, zzsaVar.zzc));
    }
}
