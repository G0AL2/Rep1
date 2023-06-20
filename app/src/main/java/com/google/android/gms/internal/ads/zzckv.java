package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzckv extends zzchi implements zzfs, zzkk {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzckg zze;
    private final zzve zzf;
    private final zzchq zzg;
    private final WeakReference zzh;
    private final zztf zzi;
    private zzjy zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private zzchh zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private final String zzq;
    private final int zzr;
    private final ArrayList zzt;
    private volatile zzcki zzu;
    private final Object zzs = new Object();
    private final Set zzv = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhz.zzbB)).booleanValue() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
        if (r7.zzj == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fb, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fe, code lost:
        if (r7.zzo == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0100, code lost:
        r8 = new com.google.android.gms.internal.ads.zzckm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
        if (r7.zzi <= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
        r8 = new com.google.android.gms.internal.ads.zzckn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0110, code lost:
        r8 = new com.google.android.gms.internal.ads.zzcko();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0117, code lost:
        if (r7.zzj == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0119, code lost:
        r7 = new com.google.android.gms.internal.ads.zzckp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0120, code lost:
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0121, code lost:
        r6 = r5.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0123, code lost:
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0129, code lost:
        if (r6.limit() <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012b, code lost:
        r6 = new byte[r5.zzk.limit()];
        r5.zzk.get(r6);
        r7 = new com.google.android.gms.internal.ads.zzckq();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzckv(android.content.Context r6, com.google.android.gms.internal.ads.zzchq r7, com.google.android.gms.internal.ads.zzchr r8) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzckv.<init>(android.content.Context, com.google.android.gms.internal.ads.zzchq, com.google.android.gms.internal.ads.zzchr):void");
    }

    private final boolean zzZ() {
        return this.zzu != null && this.zzu.zzq();
    }

    public final void finalize() {
        zzchi.zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzA() {
        if (zzZ()) {
            return 0L;
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzB() {
        if (!zzZ()) {
            synchronized (this.zzs) {
                while (!this.zzt.isEmpty()) {
                    long j10 = this.zzp;
                    Map zze = ((zzfn) this.zzt.remove(0)).zze();
                    long j11 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfoc.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzp = j10 + j11;
                }
            }
            return this.zzp;
        }
        return this.zzu.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zzsc zzssVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z10;
        int length = uriArr.length;
        if (length == 1) {
            zzssVar = zzW(uriArr[0]);
        } else {
            zzsc[] zzscVarArr = new zzsc[length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                zzscVarArr[i10] = zzW(uriArr[i10]);
            }
            zzssVar = new zzss(false, false, zzscVarArr);
        }
        this.zzj.zzB(zzssVar);
        this.zzj.zzy();
        zzchi.zzb.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzE() {
        zzjy zzjyVar = this.zzj;
        if (zzjyVar != null) {
            zzjyVar.zzA(this);
            this.zzj.zzz();
            this.zzj = null;
            zzchi.zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzF(long j10) {
        zzjy zzjyVar = this.zzj;
        zzjyVar.zzp(zzjyVar.zzf(), j10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzG(int i10) {
        this.zze.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzH(int i10) {
        this.zze.zzl(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzI(zzchh zzchhVar) {
        this.zzm = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzJ(int i10) {
        this.zze.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzK(int i10) {
        this.zze.zzn(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzL(boolean z10) {
        this.zzj.zzC(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzM(boolean z10) {
        if (this.zzj == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            this.zzj.zzt();
            if (i10 >= 2) {
                return;
            }
            zzve zzveVar = this.zzf;
            zzuv zzd = zzveVar.zzc().zzd();
            zzd.zzo(i10, !z10);
            zzveVar.zzg(zzd);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzN(int i10) {
        for (WeakReference weakReference : this.zzv) {
            zzckf zzckfVar = (zzckf) weakReference.get();
            if (zzckfVar != null) {
                zzckfVar.zzm(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzO(Surface surface, boolean z10) {
        zzjy zzjyVar = this.zzj;
        if (zzjyVar == null) {
            return;
        }
        zzjyVar.zzE(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzP(float f10, boolean z10) {
        zzjy zzjyVar = this.zzj;
        if (zzjyVar == null) {
            return;
        }
        zzjyVar.zzF(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzQ() {
        this.zzj.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final boolean zzR() {
        return this.zzj != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeq zzS(String str, boolean z10) {
        zzckv zzckvVar = true != z10 ? null : this;
        zzchq zzchqVar = this.zzg;
        return new zzcky(str, zzckvVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzp, zzchqVar.zzq);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeq zzT(String str, boolean z10) {
        zzckv zzckvVar = true != z10 ? null : this;
        zzchq zzchqVar = this.zzg;
        zzckf zzckfVar = new zzckf(str, zzckvVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzi);
        this.zzv.add(new WeakReference(zzckfVar));
        return zzckfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeq zzU(String str, boolean z10) {
        zzey zzeyVar = new zzey();
        zzeyVar.zzf(str);
        zzeyVar.zze(true != z10 ? null : this);
        zzeyVar.zzc(this.zzg.zzd);
        zzeyVar.zzd(this.zzg.zzf);
        zzeyVar.zzb(true);
        return zzeyVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeq zzV(zzep zzepVar) {
        return new zzcki(this.zzd, zzepVar.zza(), this.zzq, this.zzr, this, new zzckl(this), null);
    }

    @VisibleForTesting
    final zzsc zzW(Uri uri) {
        zzah zzahVar = new zzah();
        zzahVar.zzb(uri);
        zzbb zzc2 = zzahVar.zzc();
        zztf zztfVar = this.zzi;
        zztfVar.zza(this.zzg.zzg);
        return zztfVar.zzb(zzc2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzX(boolean z10, long j10) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzi(z10, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzjt[] zzY(Handler handler, zzxq zzxqVar, zznk zznkVar, zzua zzuaVar, zzra zzraVar) {
        Context context = this.zzd;
        zzqk zzqkVar = zzqk.zzb;
        zzmv zzmvVar = zzmv.zza;
        zzmy[] zzmyVarArr = new zzmy[0];
        zzoa zzoaVar = new zzoa();
        if (zzmvVar == null) {
            Objects.requireNonNull(zzmvVar, "Both parameters are null");
        }
        zzoaVar.zzb(zzmvVar);
        zzoaVar.zzc(zzmyVarArr);
        zzom zzd = zzoaVar.zzd();
        zzqc zzqcVar = zzqc.zza;
        return new zzjt[]{new zzos(context, zzqcVar, zzqkVar, false, handler, zznkVar, zzd), new zzwt(this.zzd, zzqcVar, zzqkVar, 0L, false, handler, zzxqVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zza(zzeq zzeqVar, zzev zzevVar, boolean z10, int i10) {
        this.zzn += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzb(zzeq zzeqVar, zzev zzevVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzc(zzeq zzeqVar, zzev zzevVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd(zzeq zzeqVar, zzev zzevVar, boolean z10) {
        if (zzeqVar instanceof zzfn) {
            synchronized (this.zzs) {
                this.zzt.add((zzfn) zzeqVar);
            }
        } else if (zzeqVar instanceof zzcki) {
            this.zzu = (zzcki) zzeqVar;
            final zzchr zzchrVar = (zzchr) this.zzh.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchrVar != null && this.zzu.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzu.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzu.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcks
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzchr zzchrVar2 = zzchr.this;
                        Map map = hashMap;
                        int i10 = zzckv.zzc;
                        zzchrVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zze(zzki zzkiVar, zzad zzadVar, zzgm zzgmVar) {
        zzchr zzchrVar = (zzchr) this.zzh.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() || zzchrVar == null || zzadVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzadVar.zzl);
        hashMap.put("audioSampleMime", zzadVar.zzm);
        hashMap.put("audioCodec", zzadVar.zzj);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzf(zzki zzkiVar, int i10, long j10, long j11) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzg(zzki zzkiVar, zzrw zzrwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzh(zzki zzkiVar, int i10, long j10) {
        this.zzo += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzi(zzcb zzcbVar, zzkj zzkjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzj(zzki zzkiVar, zzrr zzrrVar, zzrw zzrwVar, IOException iOException, boolean z10) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            if (this.zzg.zzl) {
                zzchhVar.zzl("onLoadException", iOException);
            } else {
                zzchhVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzk(zzki zzkiVar, int i10) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzm(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzl(zzki zzkiVar, zzbr zzbrVar) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzk("onPlayerError", zzbrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzm(zzki zzkiVar, zzca zzcaVar, zzca zzcaVar2, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzn(zzki zzkiVar, Object obj, long j10) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzo(zzki zzkiVar, zzgl zzglVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzp(zzki zzkiVar, zzad zzadVar, zzgm zzgmVar) {
        zzchr zzchrVar = (zzchr) this.zzh.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() || zzchrVar == null || zzadVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzadVar.zzt));
        hashMap.put("bitRate", String.valueOf(zzadVar.zzi));
        int i10 = zzadVar.zzr;
        int i11 = zzadVar.zzs;
        hashMap.put("resolution", i10 + "x" + i11);
        hashMap.put("videoMime", zzadVar.zzl);
        hashMap.put("videoSampleMime", zzadVar.zzm);
        hashMap.put("videoCodec", zzadVar.zzj);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzq(zzki zzkiVar, zzcv zzcvVar) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzC(zzcvVar.zzc, zzcvVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzr() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzt() {
        return this.zzj.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzv() {
        return this.zzj.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzw() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzx() {
        if (zzZ() && this.zzu.zzp()) {
            return Math.min(this.zzn, this.zzu.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzy() {
        return this.zzj.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzz() {
        return this.zzj.zzv();
    }
}
