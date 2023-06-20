package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfuk extends zzfum {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuk(zzfre zzfreVar, boolean z10) {
        super(zzfreVar, true);
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzfum
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzfrx.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzful zzfulVar = (zzful) it.next();
            zza.add(zzfulVar != null ? zzfulVar.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
