package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzakj extends ThreadLocal {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakj(zzakk zzakkVar) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
