package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbyl extends zzcdv {
    final /* synthetic */ QueryInfoGenerationCallback zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyl(zzbym zzbymVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zza = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new QueryInfo(new com.google.android.gms.ads.internal.client.zzeg(str, bundle, str2)));
    }
}
