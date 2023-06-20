package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfhj implements zzfhh {
    private final Context zza;
    private final int zzl;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzm = 2;
    private int zzn = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private boolean zzj = false;
    private boolean zzk = false;

    public zzfhj(Context context, int i10) {
        this.zza = context;
        this.zzl = i10;
    }

    public final synchronized zzfhj zzA(int i10) {
        this.zzm = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzo(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzb(zzfbw zzfbwVar) {
        zzp(zzfbwVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzc(String str) {
        zzq(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzd(String str) {
        zzr(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zze(boolean z10) {
        zzs(z10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzf() {
        zzt();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzg() {
        zzu();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final synchronized boolean zzh() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final boolean zzi() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final synchronized zzfhl zzj() {
        if (this.zzj) {
            return null;
        }
        this.zzj = true;
        if (!this.zzk) {
            zzt();
        }
        if (this.zzc < 0) {
            zzu();
        }
        return new zzfhl(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzk(int i10) {
        zzA(i10);
        return this;
    }

    public final synchronized zzfhj zzo(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        zzdbm zzdbmVar = (zzdbm) iBinder;
        String zzj = zzdbmVar.zzj();
        if (!TextUtils.isEmpty(zzj)) {
            this.zzf = zzj;
        }
        String zzh = zzdbmVar.zzh();
        if (!TextUtils.isEmpty(zzh)) {
            this.zzg = zzh;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
        r2.zzg = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzfhj zzp(com.google.android.gms.internal.ads.zzfbw r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfbo r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzfbo r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            r2.zzf = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzfbl r0 = (com.google.android.gms.internal.ads.zzfbl) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zzac     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.zzac     // Catch: java.lang.Throwable -> L31
            r2.zzg = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfhj.zzp(com.google.android.gms.internal.ads.zzfbw):com.google.android.gms.internal.ads.zzfhj");
    }

    public final synchronized zzfhj zzq(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfhj zzr(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfhj zzs(boolean z10) {
        this.zzd = z10;
        return this;
    }

    public final synchronized zzfhj zzt() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzt.zzq().zzl(this.zza);
        Resources resources = this.zza.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzn = i10;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        this.zzk = true;
        return this;
    }

    public final synchronized zzfhj zzu() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        return this;
    }
}
