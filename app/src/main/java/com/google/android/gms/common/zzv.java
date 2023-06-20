package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
final class zzv extends zzw {
    private final Callable<String> zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzv(Callable callable, zzu zzuVar) {
        super(false, null, null);
        this.zzd = callable;
    }

    @Override // com.google.android.gms.common.zzw
    final String zza() {
        try {
            return this.zzd.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
