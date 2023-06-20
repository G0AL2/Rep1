package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzciz extends zzchi implements zzayy, zzaww, zzbai, zzasq, zzarg {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzcio zze;
    private final zzary zzf;
    private final zzary zzg;
    private final zzaya zzh;
    private final zzchq zzi;
    private zzarj zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private final WeakReference zzm;
    private zzchh zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private final String zzr;
    private final int zzs;
    private final ArrayList zzu;
    private volatile zzcin zzv;
    private final Object zzt = new Object();
    private final Set zzw = new HashSet();

    public zzciz(Context context, zzchq zzchqVar, zzchr zzchrVar) {
        this.zzd = context;
        this.zzi = zzchqVar;
        this.zzm = new WeakReference(zzchrVar);
        zzcio zzcioVar = new zzcio();
        this.zze = zzcioVar;
        zzavt zzavtVar = zzavt.zza;
        zzfnw zzfnwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzazx zzazxVar = new zzazx(context, zzavtVar, 0L, zzfnwVar, this, -1);
        this.zzf = zzazxVar;
        zzatf zzatfVar = new zzatf(zzavtVar, null, true, zzfnwVar, this);
        this.zzg = zzatfVar;
        zzaxw zzaxwVar = new zzaxw(null);
        this.zzh = zzaxwVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        zzchi.zza.incrementAndGet();
        zzarj zza = zzark.zza(new zzary[]{zzatfVar, zzazxVar}, zzaxwVar, zzcioVar);
        this.zzj = zza;
        zza.zze(this);
        this.zzo = 0;
        this.zzq = 0L;
        this.zzp = 0;
        this.zzu = new ArrayList();
        this.zzv = null;
        this.zzr = (zzchrVar == null || zzchrVar.zzt() == null) ? "" : zzchrVar.zzt();
        this.zzs = zzchrVar != null ? zzchrVar.zzh() : 0;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzn)).booleanValue()) {
            this.zzj.zzg();
        }
        if (zzchrVar != null && zzchrVar.zzg() > 0) {
            this.zzj.zzp(zzchrVar.zzg());
        }
        if (zzchrVar != null && zzchrVar.zzf() > 0) {
            this.zzj.zzo(zzchrVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzp)).booleanValue()) {
            this.zzj.zzi();
            this.zzj.zzh(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzq)).intValue());
        }
    }

    private final boolean zzY() {
        return this.zzv != null && this.zzv.zzk();
    }

    public final void finalize() throws Throwable {
        zzchi.zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzA() {
        if (zzY()) {
            return 0L;
        }
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzB() {
        if (!zzY()) {
            synchronized (this.zzt) {
                while (!this.zzu.isEmpty()) {
                    long j10 = this.zzq;
                    Map zze = ((zzays) this.zzu.remove(0)).zze();
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
                    this.zzq = j10 + j11;
                }
            }
            return this.zzq;
        }
        return this.zzv.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zzaxb zzaxfVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z10;
        int length = uriArr.length;
        if (length == 1) {
            zzaxfVar = zzp(uriArr[0], str);
        } else {
            zzaxb[] zzaxbVarArr = new zzaxb[length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                zzaxbVarArr[i10] = zzp(uriArr[i10], str);
            }
            zzaxfVar = new zzaxf(zzaxbVarArr);
        }
        this.zzj.zzj(zzaxfVar);
        zzchi.zzb.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzE() {
        zzarj zzarjVar = this.zzj;
        if (zzarjVar != null) {
            zzarjVar.zzl(this);
            this.zzj.zzk();
            this.zzj = null;
            zzchi.zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzF(long j10) {
        this.zzj.zzm(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzG(int i10) {
        this.zze.zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzH(int i10) {
        this.zze.zzg(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzI(zzchh zzchhVar) {
        this.zzn = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzJ(int i10) {
        this.zze.zzh(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzK(int i10) {
        this.zze.zzi(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzL(boolean z10) {
        this.zzj.zzq(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzM(boolean z10) {
        if (this.zzj != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                this.zzh.zze(i10, !z10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzN(int i10) {
        for (WeakReference weakReference : this.zzw) {
            zzcil zzcilVar = (zzcil) weakReference.get();
            if (zzcilVar != null) {
                zzcilVar.zzh(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzO(Surface surface, boolean z10) {
        zzarj zzarjVar = this.zzj;
        if (zzarjVar == null) {
            return;
        }
        zzari zzariVar = new zzari(this.zzf, 1, surface);
        if (z10) {
            zzarjVar.zzf(zzariVar);
        } else {
            zzarjVar.zzn(zzariVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzP(float f10, boolean z10) {
        if (this.zzj == null) {
            return;
        }
        this.zzj.zzn(new zzari(this.zzg, 2, Float.valueOf(f10)));
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzQ() {
        this.zzj.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final boolean zzR() {
        return this.zzj != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzayj zzS(String str, boolean z10) {
        zzciz zzcizVar = true != z10 ? null : this;
        zzchq zzchqVar = this.zzi;
        zzcil zzcilVar = new zzcil(str, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzi);
        this.zzw.add(new WeakReference(zzcilVar));
        return zzcilVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzayj zzT(String str, boolean z10) {
        zzciz zzcizVar = true != z10 ? null : this;
        zzchq zzchqVar = this.zzi;
        return new zzayn(str, null, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, true, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzayj zzU(zzayi zzayiVar) {
        return new zzcin(this.zzd, zzayiVar.zza(), this.zzr, this.zzs, this, new zzciv(this), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzV(boolean z10, long j10) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzi(z10, j10);
        }
    }

    public final void zzW(zzayj zzayjVar, int i10) {
        this.zzo += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    /* renamed from: zzX */
    public final void zzk(zzayj zzayjVar, zzayl zzaylVar) {
        if (zzayjVar instanceof zzays) {
            synchronized (this.zzt) {
                this.zzu.add((zzays) zzayjVar);
            }
        } else if (zzayjVar instanceof zzcin) {
            this.zzv = (zzcin) zzayjVar;
            final zzchr zzchrVar = (zzchr) this.zzm.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchrVar != null && this.zzv.zzh()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzv.zzj()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzv.zzi()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzchr zzchrVar2 = zzchr.this;
                        Map map = hashMap;
                        int i10 = zzciz.zzc;
                        zzchrVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zza(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzb(zzarx zzarxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzc(zzarf zzarfVar) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzk("onPlayerError", zzarfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzd(boolean z10, int i10) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzm(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzf(zzase zzaseVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzg(zzaxq zzaxqVar, zzayc zzaycVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzasq
    public final void zzh(zzart zzartVar) {
        zzchr zzchrVar = (zzchr) this.zzm.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() || zzchrVar == null || zzartVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzartVar.zze);
        hashMap.put("audioSampleMime", zzartVar.zzf);
        hashMap.put("audioCodec", zzartVar.zzc);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzaww
    public final void zzi(IOException iOException) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            if (this.zzi.zzl) {
                zzchhVar.zzl("onLoadException", iOException);
            } else {
                zzchhVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    public final /* synthetic */ void zzj(Object obj, int i10) {
        this.zzo += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzl(int i10, long j10) {
        this.zzp += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzm(Surface surface) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzn(zzart zzartVar) {
        zzchr zzchrVar = (zzchr) this.zzm.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() || zzchrVar == null || zzartVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzartVar.zzl));
        hashMap.put("bitRate", String.valueOf(zzartVar.zzb));
        int i10 = zzartVar.zzj;
        int i11 = zzartVar.zzk;
        hashMap.put("resolution", i10 + "x" + i11);
        hashMap.put("videoMime", zzartVar.zze);
        hashMap.put("videoSampleMime", zzartVar.zzf);
        hashMap.put("videoCodec", zzartVar.zzc);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzo(int i10, int i11, int i12, float f10) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzC(i10, i11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhz.zzbB)).booleanValue() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.google.android.gms.internal.ads.zzaxb zzp(android.net.Uri r11, final java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzawx r9 = new com.google.android.gms.internal.ads.zzawx
            boolean r0 = r10.zzl
            if (r0 == 0) goto L23
            java.nio.ByteBuffer r0 = r10.zzk
            int r0 = r0.limit()
            if (r0 <= 0) goto L23
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.zzk
            r0.get(r12)
            com.google.android.gms.internal.ads.zzcip r0 = new com.google.android.gms.internal.ads.zzcip
            r0.<init>()
        L20:
            r2 = r0
            goto L94
        L23:
            com.google.android.gms.internal.ads.zzbhr r0 = com.google.android.gms.internal.ads.zzbhz.zzbK
            com.google.android.gms.internal.ads.zzbhx r1 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzbhr r0 = com.google.android.gms.internal.ads.zzbhz.zzbB
            com.google.android.gms.internal.ads.zzbhx r2 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L50
        L48:
            com.google.android.gms.internal.ads.zzchq r0 = r10.zzi
            boolean r0 = r0.zzj
            if (r0 != 0) goto L4f
            goto L50
        L4f:
            r1 = 0
        L50:
            com.google.android.gms.internal.ads.zzchq r0 = r10.zzi
            boolean r2 = r0.zzo
            if (r2 == 0) goto L5c
            com.google.android.gms.internal.ads.zzciq r0 = new com.google.android.gms.internal.ads.zzciq
            r0.<init>()
            goto L6b
        L5c:
            int r0 = r0.zzi
            if (r0 <= 0) goto L66
            com.google.android.gms.internal.ads.zzcir r0 = new com.google.android.gms.internal.ads.zzcir
            r0.<init>()
            goto L6b
        L66:
            com.google.android.gms.internal.ads.zzcis r0 = new com.google.android.gms.internal.ads.zzcis
            r0.<init>()
        L6b:
            com.google.android.gms.internal.ads.zzchq r12 = r10.zzi
            boolean r12 = r12.zzj
            if (r12 == 0) goto L77
            com.google.android.gms.internal.ads.zzcit r12 = new com.google.android.gms.internal.ads.zzcit
            r12.<init>()
            r0 = r12
        L77:
            java.nio.ByteBuffer r12 = r10.zzk
            if (r12 == 0) goto L20
            int r12 = r12.limit()
            if (r12 <= 0) goto L20
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.zzk
            r1.get(r12)
            com.google.android.gms.internal.ads.zzciu r1 = new com.google.android.gms.internal.ads.zzciu
            r1.<init>()
            r2 = r1
        L94:
            com.google.android.gms.internal.ads.zzbhr r12 = com.google.android.gms.internal.ads.zzbhz.zzm
            com.google.android.gms.internal.ads.zzbhx r0 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r12 = r0.zzb(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto La9
            com.google.android.gms.internal.ads.zzcix r12 = new com.google.android.gms.internal.ads.zzaty() { // from class: com.google.android.gms.internal.ads.zzcix
                static {
                    /*
                        com.google.android.gms.internal.ads.zzcix r0 = new com.google.android.gms.internal.ads.zzcix
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.google.android.gms.internal.ads.zzcix) com.google.android.gms.internal.ads.zzcix.zza com.google.android.gms.internal.ads.zzcix
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcix.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcix.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzaty
                public final com.google.android.gms.internal.ads.zzatw[] zza() {
                    /*
                        r4 = this;
                        int r0 = com.google.android.gms.internal.ads.zzciz.zzc
                        r0 = 3
                        com.google.android.gms.internal.ads.zzatw[] r0 = new com.google.android.gms.internal.ads.zzatw[r0]
                        com.google.android.gms.internal.ads.zzavj r1 = new com.google.android.gms.internal.ads.zzavj
                        r1.<init>()
                        r2 = 0
                        r0[r2] = r1
                        com.google.android.gms.internal.ads.zzauo r1 = new com.google.android.gms.internal.ads.zzauo
                        r1.<init>(r2)
                        r3 = 1
                        r0[r3] = r1
                        com.google.android.gms.internal.ads.zzavf r1 = new com.google.android.gms.internal.ads.zzavf
                        r3 = 0
                        r1.<init>(r2, r3, r3)
                        r2 = 2
                        r0[r2] = r1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcix.zza():com.google.android.gms.internal.ads.zzatw[]");
                }
            }
            goto Lab
        La9:
            com.google.android.gms.internal.ads.zzciy r12 = new com.google.android.gms.internal.ads.zzaty() { // from class: com.google.android.gms.internal.ads.zzciy
                static {
                    /*
                        com.google.android.gms.internal.ads.zzciy r0 = new com.google.android.gms.internal.ads.zzciy
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.google.android.gms.internal.ads.zzciy) com.google.android.gms.internal.ads.zzciy.zza com.google.android.gms.internal.ads.zzciy
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciy.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciy.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzaty
                public final com.google.android.gms.internal.ads.zzatw[] zza() {
                    /*
                        r3 = this;
                        int r0 = com.google.android.gms.internal.ads.zzciz.zzc
                        r0 = 2
                        com.google.android.gms.internal.ads.zzatw[] r0 = new com.google.android.gms.internal.ads.zzatw[r0]
                        com.google.android.gms.internal.ads.zzavj r1 = new com.google.android.gms.internal.ads.zzavj
                        r1.<init>()
                        r2 = 0
                        r0[r2] = r1
                        com.google.android.gms.internal.ads.zzauo r1 = new com.google.android.gms.internal.ads.zzauo
                        r1.<init>(r2)
                        r2 = 1
                        r0[r2] = r1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciy.zza():com.google.android.gms.internal.ads.zzatw[]");
                }
            }
        Lab:
            r3 = r12
            com.google.android.gms.internal.ads.zzchq r12 = r10.zzi
            int r4 = r12.zzk
            com.google.android.gms.internal.ads.zzfnw r5 = com.google.android.gms.ads.internal.util.zzs.zza
            r7 = 0
            int r8 = r12.zzg
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciz.zzp(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.zzaxb");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzayj zzq(String str, boolean z10) {
        zzciz zzcizVar = true != z10 ? null : this;
        zzchq zzchqVar = this.zzi;
        return new zzcjd(str, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzp, zzchqVar.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzr() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzt() {
        return this.zzj.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzv() {
        return this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzw() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzx() {
        if (zzY() && this.zzv.zzj()) {
            return Math.min(this.zzo, this.zzv.zze());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzy() {
        return this.zzj.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzz() {
        return this.zzj.zzd();
    }
}
