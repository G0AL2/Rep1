package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbyn extends zzbyj {
    final /* synthetic */ UpdateImpressionUrlsCallback zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyn(zzbys zzbysVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
