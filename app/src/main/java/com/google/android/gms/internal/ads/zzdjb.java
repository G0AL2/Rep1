package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdjb extends zzdhc implements zzban {
    private final Map zzb;
    private final Context zzc;
    private final zzfbl zzd;

    public zzdjb(Context context, Set set, zzfbl zzfblVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfblVar;
    }

    public final synchronized void zza(View view) {
        zzbao zzbaoVar = (zzbao) this.zzb.get(view);
        if (zzbaoVar == null) {
            zzbaoVar = new zzbao(this.zzc, view);
            zzbaoVar.zzc(this);
            this.zzb.put(view, zzbaoVar);
        }
        if (this.zzd.zzY) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbh)).booleanValue()) {
                zzbaoVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbg)).longValue());
                return;
            }
        }
        zzbaoVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzbao) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final synchronized void zzc(final zzbam zzbamVar) {
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdja
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((zzban) obj).zzc(zzbam.this);
            }
        });
    }
}
