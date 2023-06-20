package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzeod implements zzetg {
    private final Set zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeod(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.zza) {
            arrayList.add(str);
        }
        return zzfvc.zzi(new zzetf() { // from class: com.google.android.gms.internal.ads.zzeoc
            @Override // com.google.android.gms.internal.ads.zzetf
            public final void zzf(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
