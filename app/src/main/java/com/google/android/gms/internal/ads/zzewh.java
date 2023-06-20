package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzewh extends com.google.android.gms.ads.internal.client.zzbr implements com.google.android.gms.ads.internal.overlay.zzaa, zzbca, zzdds {
    protected zzcve zza;
    private final zzcnf zzb;
    private final Context zzc;
    private final ViewGroup zzd;
    private final String zzf;
    private final zzewb zzg;
    private final zzexh zzh;
    private final zzcfo zzi;
    private zzcup zzk;
    private AtomicBoolean zze = new AtomicBoolean();
    private long zzj = -1;

    public zzewh(zzcnf zzcnfVar, Context context, String str, zzewb zzewbVar, zzexh zzexhVar, zzcfo zzcfoVar) {
        this.zzd = new FrameLayout(context);
        this.zzb = zzcnfVar;
        this.zzc = context;
        this.zzf = str;
        this.zzg = zzewbVar;
        this.zzh = zzexhVar;
        zzexhVar.zzn(this);
        this.zzi = zzcfoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.overlay.zzr zze(zzewh zzewhVar, zzcve zzcveVar) {
        boolean zzh = zzcveVar.zzh();
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdU)).intValue();
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = new com.google.android.gms.ads.internal.overlay.zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != zzh ? 0 : intValue;
        zzqVar.zzb = true != zzh ? intValue : 0;
        zzqVar.zzc = intValue;
        return new com.google.android.gms.ads.internal.overlay.zzr(zzewhVar.zzc, zzqVar, zzewhVar);
    }

    private final synchronized void zzq(int i10) {
        if (this.zze.compareAndSet(false, true)) {
            zzcve zzcveVar = this.zza;
            if (zzcveVar != null && zzcveVar.zzj() != null) {
                this.zzh.zzt(zzcveVar.zzj());
            }
            this.zzh.zzj();
            this.zzd.removeAllViews();
            zzcup zzcupVar = this.zzk;
            if (zzcupVar != null) {
                com.google.android.gms.ads.internal.zzt.zzb().zze(zzcupVar);
            }
            if (this.zza != null) {
                long j10 = -1;
                if (this.zzj != -1) {
                    j10 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzj;
                }
                this.zza.zzi(j10, i10);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbcj zzbcjVar) {
        this.zzh.zzr(zzbcjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzg.zzl(zzwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbye zzbyeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(zzbiu zzbiuVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyh zzbyhVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcar zzcarVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbca
    public final void zza() {
        zzq(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004d, B:18:0x0052, B:21:0x0064, B:25:0x006c, B:12:0x003d), top: B:31:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjn.zzd     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbhr r0 = com.google.android.gms.internal.ads.zzbhz.zziv     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzbhx r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r2.zzb(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.internal.ads.zzcfo r2 = r5.zzi     // Catch: java.lang.Throwable -> L87
            int r2 = r2.zzc     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzbhr r3 = com.google.android.gms.internal.ads.zzbhz.zziw     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzbhx r4 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r3 = r4.zzb(r3)     // Catch: java.lang.Throwable -> L87
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L87
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L87
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L87
        L42:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L87
            android.content.Context r0 = r5.zzc     // Catch: java.lang.Throwable -> L87
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzD(r0)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L64
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L52
            goto L64
        L52:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzcfi.zzg(r6)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzexh r6 = r5.zzh     // Catch: java.lang.Throwable -> L87
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfdc.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L87
            r6.zza(r0)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r1
        L64:
            boolean r0 = r5.zzY()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L6c
            monitor-exit(r5)
            return r1
        L6c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L87
            r0.<init>()     // Catch: java.lang.Throwable -> L87
            r5.zze = r0     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzewf r0 = new com.google.android.gms.internal.ads.zzewf     // Catch: java.lang.Throwable -> L87
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzewb r1 = r5.zzg     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r5.zzf     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzewg r3 = new com.google.android.gms.internal.ads.zzewg     // Catch: java.lang.Throwable -> L87
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L87
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r6
        L87:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewh.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzbJ() {
        zzq(4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcve zzcveVar = this.zza;
        if (zzcveVar != null) {
            return zzfch.zza(this.zzc, Collections.singletonList(zzcveVar.zzc()));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzh() {
        if (this.zza == null) {
            return;
        }
        this.zzj = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        int zza = this.zza.zza();
        if (zza <= 0) {
            return;
        }
        zzcup zzcupVar = new zzcup(this.zzb.zzB(), com.google.android.gms.ads.internal.zzt.zzA());
        this.zzk = zzcupVar;
        zzcupVar.zzd(zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzewe
            @Override // java.lang.Runnable
            public final void run() {
                zzewh.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo() {
        zzq(5);
    }

    @VisibleForTesting
    public final void zzp() {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        if (zzcfb.zzt()) {
            zzq(5);
        } else {
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewd
                @Override // java.lang.Runnable
                public final void run() {
                    zzewh.this.zzo();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcve zzcveVar = this.zza;
        if (zzcveVar != null) {
            zzcveVar.zzV();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
