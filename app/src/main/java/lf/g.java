package lf;

import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import mf.f;
import mf.i;
import qe.k;

/* compiled from: WebSocketReader.kt */
/* loaded from: classes3.dex */
public final class g implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private boolean f34105a;

    /* renamed from: b  reason: collision with root package name */
    private int f34106b;

    /* renamed from: c  reason: collision with root package name */
    private long f34107c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f34108d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34109e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f34110f;

    /* renamed from: g  reason: collision with root package name */
    private final mf.f f34111g;

    /* renamed from: h  reason: collision with root package name */
    private final mf.f f34112h;

    /* renamed from: i  reason: collision with root package name */
    private c f34113i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f34114j;

    /* renamed from: k  reason: collision with root package name */
    private final f.a f34115k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f34116l;

    /* renamed from: m  reason: collision with root package name */
    private final mf.h f34117m;

    /* renamed from: n  reason: collision with root package name */
    private final a f34118n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f34119o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f34120p;

    /* compiled from: WebSocketReader.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void c(String str) throws IOException;

        void d(i iVar) throws IOException;

        void e(i iVar);

        void g(i iVar);

        void h(int i10, String str);
    }

    public g(boolean z10, mf.h hVar, a aVar, boolean z11, boolean z12) {
        k.f(hVar, "source");
        k.f(aVar, "frameCallback");
        this.f34116l = z10;
        this.f34117m = hVar;
        this.f34118n = aVar;
        this.f34119o = z11;
        this.f34120p = z12;
        this.f34111g = new mf.f();
        this.f34112h = new mf.f();
        this.f34114j = z10 ? null : new byte[4];
        this.f34115k = z10 ? null : new f.a();
    }

    private final void b() throws IOException {
        String str;
        long j10 = this.f34107c;
        if (j10 > 0) {
            this.f34117m.y0(this.f34111g, j10);
            if (!this.f34116l) {
                mf.f fVar = this.f34111g;
                f.a aVar = this.f34115k;
                k.c(aVar);
                fVar.Z(aVar);
                this.f34115k.d(0L);
                f fVar2 = f.f34104a;
                f.a aVar2 = this.f34115k;
                byte[] bArr = this.f34114j;
                k.c(bArr);
                fVar2.b(aVar2, bArr);
                this.f34115k.close();
            }
        }
        switch (this.f34106b) {
            case 8:
                short s10 = 1005;
                long C0 = this.f34111g.C0();
                if (C0 != 1) {
                    if (C0 != 0) {
                        s10 = this.f34111g.readShort();
                        str = this.f34111g.r0();
                        String a10 = f.f34104a.a(s10);
                        if (a10 != null) {
                            throw new ProtocolException(a10);
                        }
                    } else {
                        str = "";
                    }
                    this.f34118n.h(s10, str);
                    this.f34105a = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f34118n.e(this.f34111g.g0());
                return;
            case 10:
                this.f34118n.g(this.f34111g.g0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + ze.c.N(this.f34106b));
        }
    }

    private final void d() throws IOException, ProtocolException {
        boolean z10;
        if (!this.f34105a) {
            long h10 = this.f34117m.k().h();
            this.f34117m.k().b();
            try {
                int b10 = ze.c.b(this.f34117m.readByte(), 255);
                this.f34117m.k().g(h10, TimeUnit.NANOSECONDS);
                int i10 = b10 & 15;
                this.f34106b = i10;
                boolean z11 = (b10 & 128) != 0;
                this.f34108d = z11;
                boolean z12 = (b10 & 8) != 0;
                this.f34109e = z12;
                if (z12 && !z11) {
                    throw new ProtocolException("Control frames must be final.");
                }
                boolean z13 = (b10 & 64) != 0;
                if (i10 == 1 || i10 == 2) {
                    if (!z13) {
                        z10 = false;
                    } else if (!this.f34119o) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    } else {
                        z10 = true;
                    }
                    this.f34110f = z10;
                } else if (z13) {
                    throw new ProtocolException("Unexpected rsv1 flag");
                }
                if ((b10 & 32) != 0) {
                    throw new ProtocolException("Unexpected rsv2 flag");
                }
                if (!((b10 & 16) != 0)) {
                    int b11 = ze.c.b(this.f34117m.readByte(), 255);
                    boolean z14 = (b11 & 128) != 0;
                    if (z14 == this.f34116l) {
                        throw new ProtocolException(this.f34116l ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    long j10 = b11 & 127;
                    this.f34107c = j10;
                    if (j10 == 126) {
                        this.f34107c = ze.c.c(this.f34117m.readShort(), 65535);
                    } else if (j10 == 127) {
                        long readLong = this.f34117m.readLong();
                        this.f34107c = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException("Frame length 0x" + ze.c.O(this.f34107c) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.f34109e && this.f34107c > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    }
                    if (z14) {
                        mf.h hVar = this.f34117m;
                        byte[] bArr = this.f34114j;
                        k.c(bArr);
                        hVar.readFully(bArr);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("Unexpected rsv3 flag");
            } catch (Throwable th) {
                this.f34117m.k().g(h10, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException(RNAdsEvents.EVENT_CLOSED);
    }

    private final void e() throws IOException {
        while (!this.f34105a) {
            long j10 = this.f34107c;
            if (j10 > 0) {
                this.f34117m.y0(this.f34112h, j10);
                if (!this.f34116l) {
                    mf.f fVar = this.f34112h;
                    f.a aVar = this.f34115k;
                    k.c(aVar);
                    fVar.Z(aVar);
                    this.f34115k.d(this.f34112h.C0() - this.f34107c);
                    f fVar2 = f.f34104a;
                    f.a aVar2 = this.f34115k;
                    byte[] bArr = this.f34114j;
                    k.c(bArr);
                    fVar2.b(aVar2, bArr);
                    this.f34115k.close();
                }
            }
            if (this.f34108d) {
                return;
            }
            l();
            if (this.f34106b != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + ze.c.N(this.f34106b));
            }
        }
        throw new IOException(RNAdsEvents.EVENT_CLOSED);
    }

    private final void h() throws IOException {
        int i10 = this.f34106b;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + ze.c.N(i10));
        }
        e();
        if (this.f34110f) {
            c cVar = this.f34113i;
            if (cVar == null) {
                cVar = new c(this.f34120p);
                this.f34113i = cVar;
            }
            cVar.a(this.f34112h);
        }
        if (i10 == 1) {
            this.f34118n.c(this.f34112h.r0());
        } else {
            this.f34118n.d(this.f34112h.g0());
        }
    }

    private final void l() throws IOException {
        while (!this.f34105a) {
            d();
            if (!this.f34109e) {
                return;
            }
            b();
        }
    }

    public final void a() throws IOException {
        d();
        if (this.f34109e) {
            b();
        } else {
            h();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c cVar = this.f34113i;
        if (cVar != null) {
            cVar.close();
        }
    }
}
