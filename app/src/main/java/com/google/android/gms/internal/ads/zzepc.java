package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzepc implements zzetg {
    private static final Object zza = new Object();
    private final String zzb;
    private final String zzc;
    private final zzczk zzd;
    private final zzfdi zze;
    private final zzfcd zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();
    private final zzdwc zzh;

    public zzepc(String str, String str2, zzczk zzczkVar, zzfdi zzfdiVar, zzfcd zzfcdVar, zzdwc zzdwcVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzczkVar;
        this.zze = zzfdiVar;
        this.zzf = zzfcdVar;
        this.zzh = zzdwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgw)).booleanValue()) {
            this.zzh.zza().put("seq_num", this.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeB)).booleanValue()) {
            this.zzd.zzg(this.zzf.zzd);
            bundle.putAll(this.zze.zzb());
        }
        return zzfvc.zzi(new zzetf() { // from class: com.google.android.gms.internal.ads.zzepb
            @Override // com.google.android.gms.internal.ads.zzetf
            public final void zzf(Object obj) {
                zzepc.this.zzc(bundle, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeB)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeA)).booleanValue()) {
                synchronized (zza) {
                    this.zzd.zzg(this.zzf.zzd);
                    bundle2.putBundle("quality_signals", this.zze.zzb());
                }
            } else {
                this.zzd.zzg(this.zzf.zzd);
                bundle2.putBundle("quality_signals", this.zze.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzb);
        if (this.zzg.zzP()) {
            return;
        }
        bundle2.putString("session_id", this.zzc);
    }
}
