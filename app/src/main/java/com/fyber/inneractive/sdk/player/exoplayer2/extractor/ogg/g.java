package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: o  reason: collision with root package name */
    public static final int f18739o = u.a("Opus");

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f18740p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n  reason: collision with root package name */
    public boolean f18741n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f18741n = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        byte[] bArr = kVar.f19579a;
        int i10 = bArr[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int i11 = i10 & 3;
        int i12 = 2;
        if (i11 == 0) {
            i12 = 1;
        } else if (i11 != 1 && i11 != 2) {
            i12 = bArr[1] & 63;
        }
        int i13 = i10 >> 3;
        int i14 = i13 & 3;
        return a(i12 * (i13 >= 16 ? IronSourceConstants.IS_INSTANCE_NOT_FOUND << i14 : i13 >= 12 ? 10000 << (i14 & 1) : i14 == 3 ? 60000 : 10000 << i14));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, long j10, h.a aVar) throws IOException, InterruptedException {
        if (!this.f18741n) {
            byte[] copyOf = Arrays.copyOf(kVar.f19579a, kVar.f19581c);
            int i10 = copyOf[9] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            a(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            a(arrayList, 3840);
            aVar.f18755a = com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "audio/opus", (String) null, -1, -1, i10, 48000, -1, arrayList, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null);
            this.f18741n = true;
            return true;
        }
        boolean z10 = kVar.c() == f18739o;
        kVar.e(0);
        return z10;
    }

    public final void a(List<byte[]> list, int i10) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i10 * 1000000000) / 48000).array());
    }
}
