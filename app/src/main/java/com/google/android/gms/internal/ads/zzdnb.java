package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdnb implements zzban {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdnc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdnb(zzdnc zzdncVar, String str) {
        this.zzb = zzdncVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbamVar) {
        Map map;
        zzdpc zzdpcVar;
        zzdpc zzdpcVar2;
        zzdpc zzdpcVar3;
        zzdpc zzdpcVar4;
        Map map2;
        zzdpc zzdpcVar5;
        zzdpc zzdpcVar6;
        zzdpc zzdpcVar7;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbv)).booleanValue()) {
            if (zzbamVar.zzj) {
                map = this.zzb.zzy;
                map.put(this.zza, Boolean.TRUE);
                zzdnc zzdncVar = this.zzb;
                zzdpcVar = zzdncVar.zzo;
                View zzf = zzdpcVar.zzf();
                zzdpcVar2 = this.zzb.zzo;
                Map zzl = zzdpcVar2.zzl();
                zzdpcVar3 = this.zzb.zzo;
                zzdncVar.zzv(zzf, zzl, zzdpcVar3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzbamVar.zzj) {
                zzdnc zzdncVar2 = this.zzb;
                zzdpcVar4 = zzdncVar2.zzo;
                if (zzdpcVar4 == null) {
                    return;
                }
                map2 = zzdncVar2.zzy;
                map2.put(this.zza, Boolean.TRUE);
                zzdnc zzdncVar3 = this.zzb;
                zzdpcVar5 = zzdncVar3.zzo;
                View zzf2 = zzdpcVar5.zzf();
                zzdpcVar6 = this.zzb.zzo;
                Map zzl2 = zzdpcVar6.zzl();
                zzdpcVar7 = this.zzb.zzo;
                zzdncVar3.zzv(zzf2, zzl2, zzdpcVar7.zzm(), true);
            }
        }
    }
}
