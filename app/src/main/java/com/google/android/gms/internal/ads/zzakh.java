package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzakh implements zzajw {
    final /* synthetic */ Context zza;
    private File zzb = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakh(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
