package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.ads.mediationtestsuite.dataobjects.AdUnit;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdbm extends com.google.android.gms.ads.internal.client.zzdg {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final List zzd;
    private final long zze;
    private final String zzf;
    private final zzefi zzg;
    private final Bundle zzh;

    public zzdbm(zzfbl zzfblVar, String str, zzefi zzefiVar, zzfbo zzfboVar) {
        String str2 = null;
        this.zzb = zzfblVar == null ? null : zzfblVar.zzac;
        this.zzc = zzfboVar == null ? null : zzfboVar.zzb;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || AdUnit.CUSTOM_EVENT_ADAPTER_CLASS.equals(str)) {
            try {
                str2 = zzfblVar.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str2 != null ? str2 : str;
        this.zzd = zzefiVar.zzc();
        this.zzg = zzefiVar;
        this.zze = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfN)).booleanValue() || zzfboVar == null) {
            this.zzh = new Bundle();
        } else {
            this.zzh = zzfboVar.zzj;
        }
        this.zzf = (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhM)).booleanValue() || zzfboVar == null || TextUtils.isEmpty(zzfboVar.zzh)) ? "" : zzfboVar.zzh;
    }

    public final long zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final Bundle zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final com.google.android.gms.ads.internal.client.zzu zzf() {
        zzefi zzefiVar = this.zzg;
        if (zzefiVar != null) {
            return zzefiVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final List zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzc;
    }
}
