package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdse {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzclu zzc;
    private final Context zzd;
    private final zzdwh zze;
    private final zzfgp zzf;
    private final Executor zzg;
    private final zzaoc zzh;
    private final zzcfo zzi;
    private final zzees zzk;
    private final zzfii zzl;
    private zzfvl zzm;
    private final zzdry zza = new zzdry(null);
    private final zzbpa zzj = new zzbpa();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdse(zzdsb zzdsbVar) {
        this.zzd = zzdsb.zza(zzdsbVar);
        this.zzg = zzdsb.zzj(zzdsbVar);
        this.zzh = zzdsb.zzb(zzdsbVar);
        this.zzi = zzdsb.zzd(zzdsbVar);
        this.zzb = zzdsb.zzc(zzdsbVar);
        this.zzc = zzdsb.zze(zzdsbVar);
        this.zzk = zzdsb.zzg(zzdsbVar);
        this.zzl = zzdsb.zzi(zzdsbVar);
        this.zze = zzdsb.zzf(zzdsbVar);
        this.zzf = zzdsb.zzh(zzdsbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcli zza(zzcli zzcliVar) {
        zzcliVar.zzaf("/result", this.zzj);
        zzcmv zzP = zzcliVar.zzP();
        zzdry zzdryVar = this.zza;
        zzP.zzL(null, zzdryVar, zzdryVar, zzdryVar, zzdryVar, false, null, new com.google.android.gms.ads.internal.zzb(this.zzd, null, null), null, null, this.zzk, this.zzl, this.zze, this.zzf, null, null);
        return zzcliVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(String str, JSONObject jSONObject, zzcli zzcliVar) throws Exception {
        return this.zzj.zzb(zzcliVar, str, jSONObject);
    }

    public final synchronized zzfvl zzd(final String str, final JSONObject jSONObject) {
        zzfvl zzfvlVar = this.zzm;
        if (zzfvlVar == null) {
            return zzfvc.zzi(null);
        }
        return zzfvc.zzn(zzfvlVar, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzdrq
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzdse.this.zzc(str, jSONObject, (zzcli) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(zzfbl zzfblVar, zzfbo zzfboVar) {
        zzfvl zzfvlVar = this.zzm;
        if (zzfvlVar == null) {
            return;
        }
        zzfvc.zzr(zzfvlVar, new zzdrw(this, zzfblVar, zzfboVar), this.zzg);
    }

    public final synchronized void zzf() {
        zzfvl zzfvlVar = this.zzm;
        if (zzfvlVar == null) {
            return;
        }
        zzfvc.zzr(zzfvlVar, new zzdrs(this), this.zzg);
        this.zzm = null;
    }

    public final synchronized void zzg(String str, Map map) {
        zzfvl zzfvlVar = this.zzm;
        if (zzfvlVar == null) {
            return;
        }
        zzfvc.zzr(zzfvlVar, new zzdrv(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh() {
        final Context context = this.zzd;
        final zzcfo zzcfoVar = this.zzi;
        final String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcN);
        final zzaoc zzaocVar = this.zzh;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzfvl zzm = zzfvc.zzm(zzfvc.zzl(new zzfui() { // from class: com.google.android.gms.internal.ads.zzclr
            @Override // com.google.android.gms.internal.ads.zzfui
            public final zzfvl zza() {
                Context context2 = context;
                zzaoc zzaocVar2 = zzaocVar;
                zzcfo zzcfoVar2 = zzcfoVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                String str2 = str;
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcli zza = zzclu.zza(context2, zzcmx.zza(), "", false, false, zzaocVar2, null, zzcfoVar2, null, null, zzaVar2, zzbdm.zza(), null, null);
                final zzcfz zza2 = zzcfz.zza(zza);
                zza.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzcls
                    @Override // com.google.android.gms.internal.ads.zzcmt
                    public final void zza(boolean z10) {
                        zzcfz.this.zzb();
                    }
                });
                zza.loadUrl(str2);
                return zza2;
            }
        }, zzcfv.zze), new zzfok() { // from class: com.google.android.gms.internal.ads.zzdrr
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                zzcli zzcliVar = (zzcli) obj;
                zzdse.this.zza(zzcliVar);
                return zzcliVar;
            }
        }, this.zzg);
        this.zzm = zzm;
        zzcfy.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbom zzbomVar) {
        zzfvl zzfvlVar = this.zzm;
        if (zzfvlVar == null) {
            return;
        }
        zzfvc.zzr(zzfvlVar, new zzdrt(this, str, zzbomVar), this.zzg);
    }

    public final void zzj(WeakReference weakReference, String str, zzbom zzbomVar) {
        zzi(str, new zzdsd(this, weakReference, str, zzbomVar, null));
    }

    public final synchronized void zzk(String str, zzbom zzbomVar) {
        zzfvl zzfvlVar = this.zzm;
        if (zzfvlVar == null) {
            return;
        }
        zzfvc.zzr(zzfvlVar, new zzdru(this, str, zzbomVar), this.zzg);
    }
}
