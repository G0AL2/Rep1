package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ReadableMapBuffer implements Iterable<c> {

    /* renamed from: a  reason: collision with root package name */
    ByteBuffer f15348a;

    /* renamed from: b  reason: collision with root package name */
    private int f15349b;
    @g6.a
    private HybridData mHybridData;

    /* loaded from: classes.dex */
    class a implements Iterator<c> {

        /* renamed from: a  reason: collision with root package name */
        int f15350a = 0;

        /* renamed from: b  reason: collision with root package name */
        final int f15351b;

        a() {
            this.f15351b = ReadableMapBuffer.this.getCount() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public c next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i10 = this.f15350a;
            this.f15350a = i10 + 1;
            return new c(readableMapBuffer, ReadableMapBuffer.n(i10), null);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15350a <= this.f15351b;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BOOL,
        INT,
        DOUBLE,
        STRING,
        MAP
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f15359a;

        /* synthetic */ c(ReadableMapBuffer readableMapBuffer, int i10, a aVar) {
            this(i10);
        }

        private void a(b bVar) {
            b h10 = h();
            if (bVar == h10) {
                return;
            }
            throw new IllegalStateException("Expected " + bVar + " for key: " + e() + " found " + h10.toString() + " instead.");
        }

        public boolean b() {
            a(b.BOOL);
            return ReadableMapBuffer.this.u(this.f15359a + 4);
        }

        public double c() {
            a(b.DOUBLE);
            return ReadableMapBuffer.this.w(this.f15359a + 4);
        }

        public int d() {
            a(b.INT);
            return ReadableMapBuffer.this.y(this.f15359a + 4);
        }

        public int e() {
            return ReadableMapBuffer.this.B(this.f15359a);
        }

        public ReadableMapBuffer f() {
            a(b.MAP);
            return ReadableMapBuffer.this.z(this.f15359a + 4);
        }

        public String g() {
            a(b.STRING);
            return ReadableMapBuffer.this.A(this.f15359a + 4);
        }

        public b h() {
            return b.values()[ReadableMapBuffer.this.B(this.f15359a + 2)];
        }

        private c(int i10) {
            this.f15359a = i10;
        }
    }

    static {
        i6.a.a();
    }

    @g6.a
    private ReadableMapBuffer(HybridData hybridData) {
        this.f15348a = null;
        this.f15349b = 0;
        this.mHybridData = hybridData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A(int i10) {
        int p10 = p() + this.f15348a.getInt(i10);
        int i11 = this.f15348a.getInt(p10);
        byte[] bArr = new byte[i11];
        this.f15348a.position(p10 + 4);
        this.f15348a.get(bArr, 0, i11);
        return new String(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int B(int i10) {
        return this.f15348a.getShort(i10) & 65535;
    }

    private native ByteBuffer importByteBuffer();

    private int k(int i10) {
        t();
        int count = getCount() - 1;
        int i11 = 0;
        while (i11 <= count) {
            int i12 = (i11 + count) >>> 1;
            int B = B(n(i12));
            if (B < i10) {
                i11 = i12 + 1;
            } else if (B <= i10) {
                return i12;
            } else {
                count = i12 - 1;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int i10) {
        return (i10 * 12) + 8;
    }

    private int p() {
        return n(this.f15349b);
    }

    private int r(int i10, b bVar) {
        int k10 = k(i10);
        b v10 = v(k10);
        if (k10 == -1) {
            throw new IllegalArgumentException("Key not found: " + i10);
        } else if (v10 == bVar) {
            return n(k10) + 4;
        } else {
            throw new IllegalStateException("Expected " + bVar + " for key: " + i10 + " found " + v10.toString() + " instead.");
        }
    }

    private ByteBuffer t() {
        ByteBuffer byteBuffer = this.f15348a;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        this.f15348a = importByteBuffer();
        x();
        return this.f15348a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u(int i10) {
        return y(i10) == 1;
    }

    private b v(int i10) {
        return b.values()[B(n(i10) + 2)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double w(int i10) {
        return this.f15348a.getDouble(i10);
    }

    private void x() {
        if (this.f15348a.getShort() != 254) {
            this.f15348a.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f15349b = B(this.f15348a.position());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y(int i10) {
        return this.f15348a.getInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReadableMapBuffer z(int i10) {
        int p10 = p() + this.f15348a.getInt(i10);
        int i11 = this.f15348a.getInt(p10);
        byte[] bArr = new byte[i11];
        this.f15348a.position(p10 + 4);
        this.f15348a.get(bArr, 0, i11);
        return new ReadableMapBuffer(ByteBuffer.wrap(bArr));
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReadableMapBuffer) {
            ByteBuffer t10 = t();
            ByteBuffer t11 = ((ReadableMapBuffer) obj).t();
            if (t10 == t11) {
                return true;
            }
            t10.rewind();
            t11.rewind();
            return t10.equals(t11);
        }
        return false;
    }

    public int getCount() {
        t();
        return this.f15349b;
    }

    public int hashCode() {
        ByteBuffer t10 = t();
        t10.rewind();
        return t10.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return new a();
    }

    public boolean j(int i10) {
        return u(r(i10, b.BOOL));
    }

    public double l(int i10) {
        return w(r(i10, b.DOUBLE));
    }

    public int m(int i10) {
        return y(r(i10, b.INT));
    }

    public ReadableMapBuffer o(int i10) {
        return z(r(i10, b.MAP));
    }

    public String q(int i10) {
        return A(r(i10, b.STRING));
    }

    public boolean s(int i10) {
        return k(i10) != -1;
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer) {
        this.f15348a = null;
        this.f15349b = 0;
        this.f15348a = byteBuffer;
        x();
    }
}
