package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbyo extends zzbyj {
    final /* synthetic */ UpdateClickUrlCallback zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyo(zzbys zzbysVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
