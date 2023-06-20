package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfkg extends zzfkh {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfkg(zzfjz zzfjzVar, HashSet hashSet, JSONObject jSONObject, long j10, byte[] bArr) {
        super(zzfjzVar, null);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j10;
    }
}
