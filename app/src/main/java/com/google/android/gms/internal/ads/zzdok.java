package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdok implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdse zzd;
    private final Clock zze;
    private zzbmv zzf;
    private zzbom zzg;

    public zzdok(zzdse zzdseVar, Clock clock) {
        this.zzd = zzdseVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.zza);
            hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzg("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    public final zzbmv zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzc(final zzbmv zzbmvVar) {
        this.zzf = zzbmvVar;
        zzbom zzbomVar = this.zzg;
        if (zzbomVar != null) {
            this.zzd.zzk("/unconfirmedClick", zzbomVar);
        }
        zzbom zzbomVar2 = new zzbom() { // from class: com.google.android.gms.internal.ads.zzdoj
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzdok zzdokVar = zzdok.this;
                zzbmv zzbmvVar2 = zzbmvVar;
                try {
                    zzdokVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzcfi.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzdokVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbmvVar2 == null) {
                    zzcfi.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbmvVar2.zzf(str);
                } catch (RemoteException e10) {
                    zzcfi.zzl("#007 Could not call remote method.", e10);
                }
            }
        };
        this.zzg = zzbomVar2;
        this.zzd.zzi("/unconfirmedClick", zzbomVar2);
    }
}
