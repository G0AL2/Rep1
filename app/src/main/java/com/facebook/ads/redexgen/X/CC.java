package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

@SuppressLint({"HandlerLeak"})
/* loaded from: assets/audience_network.dex */
public class CC extends Handler {
    public final /* synthetic */ C1374Wy A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CC != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    public CC(C1374Wy c1374Wy, Looper looper) {
        super(looper);
        this.A00 = c1374Wy;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CC != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List<C1375Wz> list;
        if (L0.A02(this)) {
            return;
        }
        try {
            byte[] bArr = (byte[]) message.obj;
            list = this.A00.A09;
            for (C1375Wz c1375Wz : list) {
                if (c1375Wz.A0N(bArr)) {
                    c1375Wz.A0J(message.what);
                    return;
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
