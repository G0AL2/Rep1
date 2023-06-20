package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfsh extends zzfsl {
    final /* synthetic */ Comparator zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsh(Comparator comparator) {
        this.zza = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfsl
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
