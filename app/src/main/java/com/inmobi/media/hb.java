package com.inmobi.media;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* compiled from: VastBitRateNetworkConnection.java */
/* loaded from: classes3.dex */
public final class hb extends gv {
    public hb(gx gxVar) {
        super(gxVar);
    }

    @Override // com.inmobi.media.gv
    public final /* bridge */ /* synthetic */ gy a() {
        return super.a();
    }

    @Override // com.inmobi.media.gv
    protected final gy b() {
        gy gyVar = new gy();
        try {
            this.f25604c.getResponseCode();
        } catch (SocketTimeoutException unused) {
            gyVar.f25627a = new gw(ms.bd.o.Pgl.c.COLLECT_MODE_TIKTOK_GUEST, "HTTP_GATEWAY_TIMEOUT");
        } catch (IOException unused2) {
            gyVar.f25627a = new gw(-2, "NETWORK_IO_ERROR");
        } catch (Exception unused3) {
            gyVar.f25627a = new gw(-1, "UNKNOWN_ERROR");
        } catch (OutOfMemoryError unused4) {
            gyVar.f25627a = new gw(-3, "OUT_OF_MEMORY_ERROR");
        }
        try {
            gyVar.f25628b = this.f25604c.getContentLength();
            this.f25604c.disconnect();
            return gyVar;
        } catch (Throwable th) {
            this.f25604c.disconnect();
            throw th;
        }
    }
}
