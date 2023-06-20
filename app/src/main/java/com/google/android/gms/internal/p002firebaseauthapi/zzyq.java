package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyq  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzyq extends IOException {
    zzyq() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyq(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyq(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
