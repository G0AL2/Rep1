package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcvy extends zzcvv {
    private final Context zzc;
    private final View zzd;
    private final zzcli zze;
    private final zzfbm zzf;
    private final zzcxv zzg;
    private final zzdns zzh;
    private final zzdji zzi;
    private final zzgqo zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzq zzl;

    public zzcvy(zzcxw zzcxwVar, Context context, zzfbm zzfbmVar, View view, zzcli zzcliVar, zzcxv zzcxvVar, zzdns zzdnsVar, zzdji zzdjiVar, zzgqo zzgqoVar, Executor executor) {
        super(zzcxwVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcliVar;
        this.zzf = zzfbmVar;
        this.zzg = zzcxvVar;
        this.zzh = zzdnsVar;
        this.zzi = zzdjiVar;
        this.zzj = zzgqoVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcvy zzcvyVar) {
        zzdns zzdnsVar = zzcvyVar.zzh;
        if (zzdnsVar.zze() == null) {
            return;
        }
        try {
            zzdnsVar.zze().zze((com.google.android.gms.ads.internal.client.zzbs) zzcvyVar.zzj.zzb(), ObjectWrapper.wrap(zzcvyVar.zzc));
        } catch (RemoteException e10) {
            zzcfi.zzh("RemoteException when notifyAdLoad is called", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxx
    public final void zzW() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvx
            @Override // java.lang.Runnable
            public final void run() {
                zzcvy.zzi(zzcvy.this);
            }
        });
        super.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final int zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() && this.zzb.zzai) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgC)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final View zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final com.google.android.gms.ads.internal.client.zzdk zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfci unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final zzfbm zze() {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzl;
        if (zzqVar != null) {
            return zzfch.zzc(zzqVar);
        }
        zzfbl zzfblVar = this.zzb;
        if (zzfblVar.zzad) {
            for (String str : zzfblVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzfbm(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return zzfch.zzb(this.zzb.zzs, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final zzfbm zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzg() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzcli zzcliVar;
        if (viewGroup == null || (zzcliVar = this.zze) == null) {
            return;
        }
        zzcliVar.zzai(zzcmx.zzc(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.zzl = zzqVar;
    }
}
