package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfb extends zzfqz {
    private final Map zza;

    public zzfb(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final Set entrySet() {
        return zzfte.zzb(this.zza.entrySet(), new zzfov() { // from class: com.google.android.gms.internal.ads.zzez
            @Override // com.google.android.gms.internal.ads.zzfov
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final boolean isEmpty() {
        return this.zza.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final Set keySet() {
        return zzfte.zzb(this.zza.keySet(), new zzfov() { // from class: com.google.android.gms.internal.ads.zzfa
            @Override // com.google.android.gms.internal.ads.zzfov
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqz, com.google.android.gms.internal.ads.zzfra
    protected final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfqz
    protected final Map zzb() {
        return this.zza;
    }
}
