package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgju extends IOException {
    zzgju() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgju(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgju(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
