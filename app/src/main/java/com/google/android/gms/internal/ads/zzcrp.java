package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcrp extends com.google.android.gms.ads.internal.client.zzcl {
    private final Context zza;
    private final zzcfo zzb;
    private final zzduc zzc;
    private final zzeff zzd;
    private final zzele zze;
    private final zzdyj zzf;
    private final zzcdn zzg;
    private final zzduh zzh;
    private final zzdzb zzi;
    private final zzbki zzj;
    private final zzfhu zzk;
    private final zzfcw zzl;
    private boolean zzm = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrp(Context context, zzcfo zzcfoVar, zzduc zzducVar, zzeff zzeffVar, zzele zzeleVar, zzdyj zzdyjVar, zzcdn zzcdnVar, zzduh zzduhVar, zzdzb zzdzbVar, zzbki zzbkiVar, zzfhu zzfhuVar, zzfcw zzfcwVar) {
        this.zza = context;
        this.zzb = zzcfoVar;
        this.zzc = zzducVar;
        this.zzd = zzeffVar;
        this.zze = zzeleVar;
        this.zzf = zzdyjVar;
        this.zzg = zzcdnVar;
        this.zzh = zzduhVar;
        this.zzi = zzdzbVar;
        this.zzj = zzbkiVar;
        this.zzk = zzfhuVar;
        this.zzl = zzfcwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
            if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, com.google.android.gms.ads.internal.zzt.zzo().zzh().zzl(), this.zzb.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzB(false);
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzA("");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zze();
        if (zze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzcfi.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap hashMap = new HashMap();
            for (zzbtv zzbtvVar : zze.values()) {
                for (zzbtu zzbtuVar : zzbtvVar.zza) {
                    String str = zzbtuVar.zzk;
                    for (String str2 : zzbtuVar.zzc) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzefg zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzfcy zzfcyVar = (zzfcy) zza.zzb;
                        if (!zzfcyVar.zzA() && zzfcyVar.zzz()) {
                            zzfcyVar.zzj(this.zza, (zzeha) zza.zzc, (List) entry.getValue());
                            zzcfi.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfci e10) {
                    zzcfi.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        zzfdf.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzt.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        return this.zzb.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) {
        this.zze.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzj() {
        if (this.zzm) {
            zzcfi.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbhz.zzc(this.zza);
        com.google.android.gms.ads.internal.zzt.zzo().zzr(this.zza, this.zzb);
        com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zza);
        this.zzm = true;
        this.zzf.zzr();
        this.zze.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdb)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzf();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
            zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrl
                @Override // java.lang.Runnable
                public final void run() {
                    zzcrp.this.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzio)).booleanValue()) {
            zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrk
                @Override // java.lang.Runnable
                public final void run() {
                    zzcrp.this.zzu();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzco)).booleanValue()) {
            zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrm
                @Override // java.lang.Runnable
                public final void run() {
                    zzcrp.this.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        Runnable runnable;
        zzbhz.zzc(this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdd)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            str2 = com.google.android.gms.ads.internal.util.zzs.zzo(this.zza);
        } else {
            str2 = "";
        }
        boolean z10 = true;
        String str3 = true != TextUtils.isEmpty(str2) ? str2 : str;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzda)).booleanValue();
        zzbhr zzbhrVar = zzbhz.zzaK;
        boolean booleanValue2 = booleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrn
                @Override // java.lang.Runnable
                public final void run() {
                    final zzcrp zzcrpVar = zzcrp.this;
                    final Runnable runnable3 = runnable2;
                    zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcro
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcrp.this.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z10 = booleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z10) {
            com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str3, runnable3, this.zzk);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(com.google.android.gms.ads.internal.client.zzcy zzcyVar) throws RemoteException {
        this.zzi.zzg(zzcyVar, zzdza.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzcfi.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzcfi.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context);
        zzasVar.zzn(str);
        zzasVar.zzo(this.zzb.zza);
        zzasVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbua zzbuaVar) throws RemoteException {
        this.zzl.zze(zzbuaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzo(boolean z10) {
        com.google.android.gms.ads.internal.zzt.zzr().zzc(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzp(float f10) {
        com.google.android.gms.ads.internal.zzt.zzr().zzd(f10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzq(String str) {
        zzbhz.zzc(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzda)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str, null, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbqn zzbqnVar) throws RemoteException {
        this.zzf.zzs(zzbqnVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(com.google.android.gms.ads.internal.client.zzez zzezVar) throws RemoteException {
        this.zzg.zzq(this.zza, zzezVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized boolean zzt() {
        return com.google.android.gms.ads.internal.zzt.zzr().zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzu() {
        this.zzj.zza(new zzbzd());
    }
}
