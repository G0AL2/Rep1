package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzp {
    public static List zza(byte[] bArr) {
        byte b10 = bArr[11];
        byte b11 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzc(zzb(((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b11 & fq.i.NETWORK_LOAD_LIMIT_DISABLED))));
        arrayList.add(zzc(zzb(3840L)));
        return arrayList;
    }

    private static long zzb(long j10) {
        return (j10 * 1000000000) / 48000;
    }

    private static byte[] zzc(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }
}
