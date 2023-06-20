package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfio {
    private final zzfiv zza;
    private final zzfiv zzb;
    private final zzfis zzc;
    private final zzfiu zzd;

    private zzfio(zzfis zzfisVar, zzfiu zzfiuVar, zzfiv zzfivVar, zzfiv zzfivVar2, boolean z10) {
        this.zzc = zzfisVar;
        this.zzd = zzfiuVar;
        this.zza = zzfivVar;
        if (zzfivVar2 == null) {
            this.zzb = zzfiv.NONE;
        } else {
            this.zzb = zzfivVar2;
        }
    }

    public static zzfio zza(zzfis zzfisVar, zzfiu zzfiuVar, zzfiv zzfivVar, zzfiv zzfivVar2, boolean z10) {
        zzfjv.zzb(zzfiuVar, "ImpressionType is null");
        zzfjv.zzb(zzfivVar, "Impression owner is null");
        if (zzfivVar != zzfiv.NONE) {
            if (zzfisVar == zzfis.DEFINED_BY_JAVASCRIPT && zzfivVar == zzfiv.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (zzfiuVar == zzfiu.DEFINED_BY_JAVASCRIPT && zzfivVar == zzfiv.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new zzfio(zzfisVar, zzfiuVar, zzfivVar, zzfivVar2, true);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfjt.zzg(jSONObject, "impressionOwner", this.zza);
        if (this.zzd != null) {
            zzfjt.zzg(jSONObject, "mediaEventsOwner", this.zzb);
            zzfjt.zzg(jSONObject, "creativeType", this.zzc);
            zzfjt.zzg(jSONObject, "impressionType", this.zzd);
        } else {
            zzfjt.zzg(jSONObject, "videoEventsOwner", this.zzb);
        }
        zzfjt.zzg(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
