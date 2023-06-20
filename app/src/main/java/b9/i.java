package b9;

import com.inmobi.media.fq;
import j8.p1;
import java.nio.ByteBuffer;
import l8.e0;

/* compiled from: C2Mp3TimestampTracker.java */
/* loaded from: classes2.dex */
final class i {

    /* renamed from: a  reason: collision with root package name */
    private long f4933a;

    /* renamed from: b  reason: collision with root package name */
    private long f4934b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4935c;

    private long a(long j10) {
        return this.f4933a + Math.max(0L, ((this.f4934b - 529) * 1000000) / j10);
    }

    public long b(p1 p1Var) {
        return a(p1Var.f32723z);
    }

    public void c() {
        this.f4933a = 0L;
        this.f4934b = 0L;
        this.f4935c = false;
    }

    public long d(p1 p1Var, m8.g gVar) {
        if (this.f4934b == 0) {
            this.f4933a = gVar.f34292e;
        }
        if (this.f4935c) {
            return gVar.f34292e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ea.a.e(gVar.f34290c);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        int m10 = e0.m(i10);
        if (m10 == -1) {
            this.f4935c = true;
            this.f4934b = 0L;
            this.f4933a = gVar.f34292e;
            ea.r.h("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gVar.f34292e;
        }
        long a10 = a(p1Var.f32723z);
        this.f4934b += m10;
        return a10;
    }
}
