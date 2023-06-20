package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjz {
    private JSONObject zza;
    private final zzfki zzb;

    public zzfjz(zzfki zzfkiVar) {
        this.zzb = zzfkiVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfkj(this, null));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzfkk(this, hashSet, jSONObject, j10, null));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzfkl(this, hashSet, jSONObject, j10, null));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
