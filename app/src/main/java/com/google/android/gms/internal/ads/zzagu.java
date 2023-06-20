package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzagu extends zzyh {
    public zzagu(zzee zzeeVar, long j10, long j11) {
        super(new zzyc(), new zzagt(zzeeVar, null), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int zzh(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}
