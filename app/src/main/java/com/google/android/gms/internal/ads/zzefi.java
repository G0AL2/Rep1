package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzefi {
    private zzfbo zzc = null;
    private zzfbl zzd = null;
    private com.google.android.gms.ads.internal.client.zzu zze = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    private final void zzh(zzfbl zzfblVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z10) {
        String str = zzfblVar.zzx;
        if (this.zzb.containsKey(str)) {
            if (this.zzd == null) {
                this.zzd = zzfblVar;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str);
            zzuVar.zzb = j10;
            zzuVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfM)).booleanValue() && z10) {
                this.zze = zzuVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zze;
    }

    public final zzdbm zzb() {
        return new zzdbm(this.zzd, "", this, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbl zzfblVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = zzfblVar.zzx;
        if (this.zzb.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfblVar.zzw.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfblVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfL)).booleanValue()) {
            String str6 = zzfblVar.zzG;
            String str7 = zzfblVar.zzH;
            str = str6;
            str2 = str7;
            str3 = zzfblVar.zzI;
            str4 = zzfblVar.zzJ;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzfblVar.zzF, 0L, null, bundle, str, str2, str3, str4);
        this.zza.add(zzuVar);
        this.zzb.put(str5, zzuVar);
    }

    public final void zze(zzfbl zzfblVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzh(zzfblVar, j10, zzeVar, false);
    }

    public final void zzf(zzfbl zzfblVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzh(zzfblVar, j10, null, true);
    }

    public final void zzg(zzfbo zzfboVar) {
        this.zzc = zzfboVar;
    }
}
