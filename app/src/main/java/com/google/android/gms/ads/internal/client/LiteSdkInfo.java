package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbua;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class LiteSdkInfo extends zzci {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public zzbua getAdapterCreator() {
        return new zzbtx();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public zzeh getLiteSdkVersion() {
        return new zzeh(ModuleDescriptor.MODULE_VERSION, 221908000, "21.1.0");
    }
}
