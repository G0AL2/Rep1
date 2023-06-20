package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcuo implements zzgqu {
    private final zzgrh zza;

    public zzcuo(zzgrh zzgrhVar) {
        this.zza = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcyn) this.zza).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
