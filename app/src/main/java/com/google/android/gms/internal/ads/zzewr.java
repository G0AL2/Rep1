package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzewr implements zzemx {
    protected final zzcnf zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzexh zzd;
    private final zzeza zze;
    private final zzcfo zzf;
    private final ViewGroup zzg;
    private final zzfhu zzh;
    private final zzfcb zzi;
    private zzfvl zzj;

    public zzewr(Context context, Executor executor, zzcnf zzcnfVar, zzeza zzezaVar, zzexh zzexhVar, zzfcb zzfcbVar, zzcfo zzcfoVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcnfVar;
        this.zze = zzezaVar;
        this.zzd = zzexhVar;
        this.zzi = zzfcbVar;
        this.zzf = zzcfoVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcnfVar.zzy();
    }

    public static /* synthetic */ zzdbb zzd(zzewr zzewrVar, zzeyy zzeyyVar) {
        return zzewrVar.zzm(zzeyyVar);
    }

    public final synchronized zzdbb zzm(zzeyy zzeyyVar) {
        zzewq zzewqVar = (zzewq) zzeyyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgQ)).booleanValue()) {
            zzcvs zzcvsVar = new zzcvs(this.zzg);
            zzdbd zzdbdVar = new zzdbd();
            zzdbdVar.zzc(this.zzb);
            zzdbdVar.zzf(zzewqVar.zza);
            zzdbf zzg = zzdbdVar.zzg();
            zzdhd zzdhdVar = new zzdhd();
            zzdhdVar.zzc(this.zzd, this.zzc);
            zzdhdVar.zzl(this.zzd, this.zzc);
            return zzc(zzcvsVar, zzg, zzdhdVar.zzn());
        }
        zzexh zzi = zzexh.zzi(this.zzd);
        zzdhd zzdhdVar2 = new zzdhd();
        zzdhdVar2.zzb(zzi, this.zzc);
        zzdhdVar2.zzg(zzi, this.zzc);
        zzdhdVar2.zzh(zzi, this.zzc);
        zzdhdVar2.zzi(zzi, this.zzc);
        zzdhdVar2.zzc(zzi, this.zzc);
        zzdhdVar2.zzl(zzi, this.zzc);
        zzdhdVar2.zzm(zzi);
        zzcvs zzcvsVar2 = new zzcvs(this.zzg);
        zzdbd zzdbdVar2 = new zzdbd();
        zzdbdVar2.zzc(this.zzb);
        zzdbdVar2.zzf(zzewqVar.zza);
        return zzc(zzcvsVar2, zzdbdVar2.zzg(), zzdhdVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzemx
    public final boolean zza() {
        zzfvl zzfvlVar = this.zzj;
        return (zzfvlVar == null || zzfvlVar.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:42:0x0001, B:44:0x0011, B:48:0x0026, B:53:0x0045, B:56:0x0056, B:60:0x005c, B:62:0x006c, B:64:0x0074, B:66:0x0089, B:68:0x00a2, B:70:0x00a6, B:71:0x00af, B:51:0x003e), top: B:77:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:42:0x0001, B:44:0x0011, B:48:0x0026, B:53:0x0045, B:56:0x0056, B:60:0x005c, B:62:0x006c, B:64:0x0074, B:66:0x0089, B:68:0x00a2, B:70:0x00a6, B:71:0x00af, B:51:0x003e), top: B:77:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzemx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.google.android.gms.internal.ads.zzemv r10, com.google.android.gms.internal.ads.zzemw r11) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewr.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzemv, com.google.android.gms.internal.ads.zzemw):boolean");
    }

    protected abstract zzdbb zzc(zzcvs zzcvsVar, zzdbf zzdbfVar, zzdhf zzdhfVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zza(zzfdc.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
