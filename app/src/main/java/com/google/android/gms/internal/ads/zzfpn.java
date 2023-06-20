package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
class zzfpn extends zzfqe implements zzfru {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzfpn(Map map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfqe
    public /* bridge */ /* synthetic */ Collection zza() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfqe
    public final Collection zzb(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfqe
    public final Collection zzc(Object obj, Collection collection) {
        return zzk(obj, (List) collection, null);
    }
}
