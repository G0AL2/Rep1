package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbso implements zzbrf, zzbsn {
    private final zzbsn zza;
    private final HashSet zzb = new HashSet();

    public zzbso(zzbsn zzbsnVar) {
        this.zza = zzbsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf, com.google.android.gms.internal.ads.zzbrq
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf, com.google.android.gms.internal.ads.zzbrq
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbre.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbom) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbom) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbre.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf, com.google.android.gms.internal.ads.zzbrd
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbre.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbre.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzq(String str, zzbom zzbomVar) {
        this.zza.zzq(str, zzbomVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbomVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzr(String str, zzbom zzbomVar) {
        this.zza.zzr(str, zzbomVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbomVar));
    }
}
