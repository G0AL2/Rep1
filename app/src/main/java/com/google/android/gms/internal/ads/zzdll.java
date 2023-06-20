package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdll implements zzdbt, zzdiq {
    private final zzccv zza;
    private final Context zzb;
    private final zzcdn zzc;
    private final View zzd;
    private String zze;
    private final zzbdw zzf;

    public zzdll(zzccv zzccvVar, Context context, zzcdn zzcdnVar, View view, zzbdw zzbdwVar) {
        this.zza = zzccvVar;
        this.zzb = context;
        this.zzc = zzcdnVar;
        this.zzd = view;
        this.zzf = zzbdwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzf() {
        if (this.zzf == zzbdw.APP_OPEN) {
            return;
        }
        String zzd = this.zzc.zzd(this.zzb);
        this.zze = zzd;
        this.zze = String.valueOf(zzd).concat(this.zzf == zzbdw.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(zzcal zzcalVar, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzcdn zzcdnVar = this.zzc;
                Context context = this.zzb;
                zzcdnVar.zzo(context, zzcdnVar.zza(context), this.zza.zza(), zzcalVar.zzc(), zzcalVar.zzb());
            } catch (RemoteException e10) {
                zzcfi.zzk("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
    }
}
