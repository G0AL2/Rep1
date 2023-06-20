package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzeqa implements zzetf {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeqa(String str, String str2, Bundle bundle, zzepz zzepzVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.zza);
        bundle.putString("fc_consent", this.zzb);
        bundle.putBundle("iab_consent_info", this.zzc);
    }
}
