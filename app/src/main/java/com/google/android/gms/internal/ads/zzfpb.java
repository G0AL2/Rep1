package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdSdk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfpb extends zzfpe {
    final /* synthetic */ zzfpc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpb(zzfpc zzfpcVar, zzfpg zzfpgVar, CharSequence charSequence) {
        super(zzfpgVar, charSequence);
        this.zza = zzfpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final int zzc(int i10) {
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final int zzd(int i10) {
        int i11 = i10 + TTAdSdk.INIT_LOCAL_FAIL_CODE;
        if (i11 < ((zzfpe) this).zzb.length()) {
            return i11;
        }
        return -1;
    }
}
