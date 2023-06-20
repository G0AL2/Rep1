package gf;

import com.google.android.gms.common.api.Api;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import gf.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Http2Writer.kt */
/* loaded from: classes3.dex */
public final class j implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private static final Logger f31030g;

    /* renamed from: a  reason: collision with root package name */
    private final mf.f f31031a;

    /* renamed from: b  reason: collision with root package name */
    private int f31032b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f31033c;

    /* renamed from: d  reason: collision with root package name */
    private final d.b f31034d;

    /* renamed from: e  reason: collision with root package name */
    private final mf.g f31035e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f31036f;

    /* compiled from: Http2Writer.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
        f31030g = Logger.getLogger(e.class.getName());
    }

    public j(mf.g gVar, boolean z10) {
        qe.k.f(gVar, "sink");
        this.f31035e = gVar;
        this.f31036f = z10;
        mf.f fVar = new mf.f();
        this.f31031a = fVar;
        this.f31032b = 16384;
        this.f31034d = new d.b(0, false, fVar, 3, null);
    }

    private final void O(int i10, long j10) throws IOException {
        while (j10 > 0) {
            long min = Math.min(this.f31032b, j10);
            j10 -= min;
            h(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f31035e.n0(this.f31031a, min);
        }
    }

    public final synchronized void A(int i10, b bVar) throws IOException {
        qe.k.f(bVar, IronSourceConstants.EVENTS_ERROR_CODE);
        if (!this.f31033c) {
            if (bVar.f() != -1) {
                h(i10, 4, 3, 0);
                this.f31035e.writeInt(bVar.f());
                this.f31035e.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
    }

    public final synchronized void C(m mVar) throws IOException {
        qe.k.f(mVar, "settings");
        if (!this.f31033c) {
            int i10 = 0;
            h(0, mVar.i() * 6, 4, 0);
            while (i10 < 10) {
                if (mVar.f(i10)) {
                    this.f31035e.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.f31035e.writeInt(mVar.a(i10));
                }
                i10++;
            }
            this.f31035e.flush();
        } else {
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
    }

    public final synchronized void L(int i10, long j10) throws IOException {
        if (this.f31033c) {
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
        if (j10 != 0 && j10 <= 2147483647L) {
            h(i10, 4, 8, 0);
            this.f31035e.writeInt((int) j10);
            this.f31035e.flush();
        } else {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
    }

    public final synchronized void a(m mVar) throws IOException {
        qe.k.f(mVar, "peerSettings");
        if (!this.f31033c) {
            this.f31032b = mVar.e(this.f31032b);
            if (mVar.b() != -1) {
                this.f31034d.e(mVar.b());
            }
            h(0, 0, 4, 1);
            this.f31035e.flush();
        } else {
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
    }

    public final synchronized void b() throws IOException {
        if (!this.f31033c) {
            if (this.f31036f) {
                Logger logger = f31030g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(ze.c.q(">> CONNECTION " + e.f30905a.p(), new Object[0]));
                }
                this.f31035e.Y(e.f30905a);
                this.f31035e.flush();
                return;
            }
            return;
        }
        throw new IOException(RNAdsEvents.EVENT_CLOSED);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f31033c = true;
        this.f31035e.close();
    }

    public final synchronized void d(boolean z10, int i10, mf.f fVar, int i11) throws IOException {
        if (!this.f31033c) {
            e(i10, z10 ? 1 : 0, fVar, i11);
        } else {
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
    }

    public final void e(int i10, int i11, mf.f fVar, int i12) throws IOException {
        h(i10, i12, 0, i11);
        if (i12 > 0) {
            mf.g gVar = this.f31035e;
            qe.k.c(fVar);
            gVar.n0(fVar, i12);
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.f31033c) {
            this.f31035e.flush();
        } else {
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) throws IOException {
        Logger logger = f31030g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.f30909e.c(false, i10, i11, i12, i13));
        }
        if (!(i11 <= this.f31032b)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f31032b + ": " + i11).toString());
        }
        if ((((int) 2147483648L) & i10) == 0) {
            ze.c.Y(this.f31035e, i11);
            this.f31035e.writeByte(i12 & 255);
            this.f31035e.writeByte(i13 & 255);
            this.f31035e.writeInt(i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            return;
        }
        throw new IllegalArgumentException(("reserved bit set: " + i10).toString());
    }

    public final synchronized void l(int i10, b bVar, byte[] bArr) throws IOException {
        qe.k.f(bVar, IronSourceConstants.EVENTS_ERROR_CODE);
        qe.k.f(bArr, "debugData");
        if (!this.f31033c) {
            if (bVar.f() != -1) {
                h(0, bArr.length + 8, 7, 0);
                this.f31035e.writeInt(i10);
                this.f31035e.writeInt(bVar.f());
                if (!(bArr.length == 0)) {
                    this.f31035e.write(bArr);
                }
                this.f31035e.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
    }

    public final synchronized void q(boolean z10, int i10, List<c> list) throws IOException {
        qe.k.f(list, "headerBlock");
        if (!this.f31033c) {
            this.f31034d.g(list);
            long C0 = this.f31031a.C0();
            long min = Math.min(this.f31032b, C0);
            int i11 = (C0 > min ? 1 : (C0 == min ? 0 : -1));
            int i12 = i11 == 0 ? 4 : 0;
            if (z10) {
                i12 |= 1;
            }
            h(i10, (int) min, 1, i12);
            this.f31035e.n0(this.f31031a, min);
            if (i11 > 0) {
                O(i10, C0 - min);
            }
        } else {
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
    }

    public final int w() {
        return this.f31032b;
    }

    public final synchronized void y(boolean z10, int i10, int i11) throws IOException {
        if (!this.f31033c) {
            h(0, 8, 6, z10 ? 1 : 0);
            this.f31035e.writeInt(i10);
            this.f31035e.writeInt(i11);
            this.f31035e.flush();
        } else {
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
    }

    public final synchronized void z(int i10, int i11, List<c> list) throws IOException {
        qe.k.f(list, "requestHeaders");
        if (!this.f31033c) {
            this.f31034d.g(list);
            long C0 = this.f31031a.C0();
            int min = (int) Math.min(this.f31032b - 4, C0);
            int i12 = min + 4;
            long j10 = min;
            int i13 = (C0 > j10 ? 1 : (C0 == j10 ? 0 : -1));
            h(i10, i12, 5, i13 == 0 ? 4 : 0);
            this.f31035e.writeInt(i11 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f31035e.n0(this.f31031a, j10);
            if (i13 > 0) {
                O(i10, C0 - j10);
            }
        } else {
            throw new IOException(RNAdsEvents.EVENT_CLOSED);
        }
    }
}
