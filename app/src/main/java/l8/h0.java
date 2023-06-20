package l8;

import ea.n0;
import java.nio.ByteBuffer;
import l8.f;

/* compiled from: SilenceSkippingAudioProcessor.java */
/* loaded from: classes2.dex */
public final class h0 extends w {

    /* renamed from: i  reason: collision with root package name */
    private final long f33821i;

    /* renamed from: j  reason: collision with root package name */
    private final long f33822j;

    /* renamed from: k  reason: collision with root package name */
    private final short f33823k;

    /* renamed from: l  reason: collision with root package name */
    private int f33824l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f33825m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f33826n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f33827o;

    /* renamed from: p  reason: collision with root package name */
    private int f33828p;

    /* renamed from: q  reason: collision with root package name */
    private int f33829q;

    /* renamed from: r  reason: collision with root package name */
    private int f33830r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f33831s;

    /* renamed from: t  reason: collision with root package name */
    private long f33832t;

    public h0() {
        this(150000L, 20000L, (short) 1024);
    }

    private int m(long j10) {
        return (int) ((j10 * this.f33944b.f33813a) / 1000000);
    }

    private int n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit >= byteBuffer.position()) {
                if (Math.abs((int) byteBuffer.getShort(limit)) > this.f33823k) {
                    int i10 = this.f33824l;
                    return ((limit / i10) * i10) + i10;
                }
            } else {
                return byteBuffer.position();
            }
        }
    }

    private int o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f33823k) {
                int i10 = this.f33824l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f33831s = true;
        }
    }

    private void r(byte[] bArr, int i10) {
        l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f33831s = true;
        }
    }

    private void s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o10 = o(byteBuffer);
        int position = o10 - byteBuffer.position();
        byte[] bArr = this.f33826n;
        int length = bArr.length;
        int i10 = this.f33829q;
        int i11 = length - i10;
        if (o10 < limit && position < i11) {
            r(bArr, i10);
            this.f33829q = 0;
            this.f33828p = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f33826n, this.f33829q, min);
        int i12 = this.f33829q + min;
        this.f33829q = i12;
        byte[] bArr2 = this.f33826n;
        if (i12 == bArr2.length) {
            if (this.f33831s) {
                r(bArr2, this.f33830r);
                this.f33832t += (this.f33829q - (this.f33830r * 2)) / this.f33824l;
            } else {
                this.f33832t += (i12 - this.f33830r) / this.f33824l;
            }
            w(byteBuffer, this.f33826n, this.f33829q);
            this.f33829q = 0;
            this.f33828p = 2;
        }
        byteBuffer.limit(limit);
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f33826n.length));
        int n10 = n(byteBuffer);
        if (n10 == byteBuffer.position()) {
            this.f33828p = 1;
        } else {
            byteBuffer.limit(n10);
            q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o10 = o(byteBuffer);
        byteBuffer.limit(o10);
        this.f33832t += byteBuffer.remaining() / this.f33824l;
        w(byteBuffer, this.f33827o, this.f33830r);
        if (o10 < limit) {
            r(this.f33827o, this.f33830r);
            this.f33828p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void w(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f33830r);
        int i11 = this.f33830r - min;
        System.arraycopy(bArr, i10 - i11, this.f33827o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f33827o, i11, min);
    }

    @Override // l8.w, l8.f
    public boolean a() {
        return this.f33825m;
    }

    @Override // l8.f
    public void e(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f33828p;
            if (i10 == 0) {
                t(byteBuffer);
            } else if (i10 == 1) {
                s(byteBuffer);
            } else if (i10 == 2) {
                u(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // l8.w
    public f.a h(f.a aVar) throws f.b {
        if (aVar.f33815c == 2) {
            return this.f33825m ? aVar : f.a.f33812e;
        }
        throw new f.b(aVar);
    }

    @Override // l8.w
    protected void i() {
        if (this.f33825m) {
            this.f33824l = this.f33944b.f33816d;
            int m10 = m(this.f33821i) * this.f33824l;
            if (this.f33826n.length != m10) {
                this.f33826n = new byte[m10];
            }
            int m11 = m(this.f33822j) * this.f33824l;
            this.f33830r = m11;
            if (this.f33827o.length != m11) {
                this.f33827o = new byte[m11];
            }
        }
        this.f33828p = 0;
        this.f33832t = 0L;
        this.f33829q = 0;
        this.f33831s = false;
    }

    @Override // l8.w
    protected void j() {
        int i10 = this.f33829q;
        if (i10 > 0) {
            r(this.f33826n, i10);
        }
        if (this.f33831s) {
            return;
        }
        this.f33832t += this.f33830r / this.f33824l;
    }

    @Override // l8.w
    protected void k() {
        this.f33825m = false;
        this.f33830r = 0;
        byte[] bArr = n0.f29714f;
        this.f33826n = bArr;
        this.f33827o = bArr;
    }

    public long p() {
        return this.f33832t;
    }

    public void v(boolean z10) {
        this.f33825m = z10;
    }

    public h0(long j10, long j11, short s10) {
        ea.a.a(j11 <= j10);
        this.f33821i = j10;
        this.f33822j = j11;
        this.f33823k = s10;
        byte[] bArr = n0.f29714f;
        this.f33826n = bArr;
        this.f33827o = bArr;
    }
}
