package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import android.media.MediaCodec;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f18149a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18150b;

    /* renamed from: c  reason: collision with root package name */
    public final c f18151c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedBlockingDeque<com.fyber.inneractive.sdk.player.exoplayer2.upstream.a> f18152d;

    /* renamed from: e  reason: collision with root package name */
    public final b f18153e;

    /* renamed from: f  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18154f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicInteger f18155g;

    /* renamed from: h  reason: collision with root package name */
    public long f18156h;

    /* renamed from: i  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.i f18157i;

    /* renamed from: j  reason: collision with root package name */
    public long f18158j;

    /* renamed from: k  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.a f18159k;

    /* renamed from: l  reason: collision with root package name */
    public int f18160l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f18161m;

    /* renamed from: n  reason: collision with root package name */
    public InterfaceC0248d f18162n;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f18163a;

        /* renamed from: b  reason: collision with root package name */
        public long f18164b;

        /* renamed from: c  reason: collision with root package name */
        public long f18165c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f18166d;

        public b() {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0248d {
        void a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar);
    }

    public d(com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f18149a = bVar;
        int a10 = ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.k) bVar).a();
        this.f18150b = a10;
        this.f18151c = new c();
        this.f18152d = new LinkedBlockingDeque<>();
        this.f18153e = new b();
        this.f18154f = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(32);
        this.f18155g = new AtomicInteger();
        this.f18160l = a10;
    }

    public void a(boolean z10) {
        int andSet = this.f18155g.getAndSet(z10 ? 0 : 2);
        a();
        c cVar = this.f18151c;
        cVar.f18179m = Long.MIN_VALUE;
        cVar.f18180n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f18157i = null;
        }
    }

    public void b() {
        if (this.f18155g.getAndSet(2) == 0) {
            a();
        }
    }

    public final void c() {
        if (this.f18155g.compareAndSet(1, 0)) {
            return;
        }
        a();
    }

    public long d() {
        long max;
        c cVar = this.f18151c;
        synchronized (cVar) {
            max = Math.max(cVar.f18179m, cVar.f18180n);
        }
        return max;
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.i e() {
        com.fyber.inneractive.sdk.player.exoplayer2.i iVar;
        c cVar = this.f18151c;
        synchronized (cVar) {
            iVar = cVar.f18182p ? null : cVar.f18183q;
        }
        return iVar;
    }

    public boolean f() {
        boolean z10;
        c cVar = this.f18151c;
        synchronized (cVar) {
            z10 = cVar.f18175i == 0;
        }
        return z10;
    }

    public void g() {
        long j10;
        c cVar = this.f18151c;
        synchronized (cVar) {
            int i10 = cVar.f18175i;
            if (i10 == 0) {
                j10 = -1;
            } else {
                int i11 = cVar.f18177k + i10;
                int i12 = cVar.f18167a;
                int i13 = (i11 - 1) % i12;
                cVar.f18177k = i11 % i12;
                cVar.f18176j += i10;
                cVar.f18175i = 0;
                j10 = cVar.f18169c[i13] + cVar.f18170d[i13];
            }
        }
        if (j10 != -1) {
            a(j10);
        }
    }

    public final boolean h() {
        return this.f18155g.compareAndSet(0, 1);
    }

    public boolean a(long j10, boolean z10) {
        long j11;
        c cVar = this.f18151c;
        synchronized (cVar) {
            if (cVar.f18175i != 0) {
                long[] jArr = cVar.f18172f;
                int i10 = cVar.f18177k;
                if (j10 >= jArr[i10] && (j10 <= cVar.f18180n || z10)) {
                    int i11 = -1;
                    int i12 = 0;
                    while (i10 != cVar.f18178l && cVar.f18172f[i10] <= j10) {
                        if ((cVar.f18171e[i10] & 1) != 0) {
                            i11 = i12;
                        }
                        i10 = (i10 + 1) % cVar.f18167a;
                        i12++;
                    }
                    if (i11 != -1) {
                        int i13 = (cVar.f18177k + i11) % cVar.f18167a;
                        cVar.f18177k = i13;
                        cVar.f18176j += i11;
                        cVar.f18175i -= i11;
                        j11 = cVar.f18169c[i13];
                    }
                }
            }
            j11 = -1;
        }
        if (j11 == -1) {
            return false;
        }
        a(j11);
        return true;
    }

    public int a(com.fyber.inneractive.sdk.player.exoplayer2.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar, boolean z10, boolean z11, long j10) {
        long j11;
        char c10;
        int i10;
        c cVar = this.f18151c;
        com.fyber.inneractive.sdk.player.exoplayer2.i iVar = this.f18157i;
        b bVar2 = this.f18153e;
        synchronized (cVar) {
            if (cVar.f18175i != 0) {
                if (!z10) {
                    com.fyber.inneractive.sdk.player.exoplayer2.i[] iVarArr = cVar.f18174h;
                    int i11 = cVar.f18177k;
                    if (iVarArr[i11] == iVar) {
                        if (!(bVar.f18124c == null && bVar.f18126e == 0)) {
                            long j12 = cVar.f18172f[i11];
                            bVar.f18125d = j12;
                            bVar.f18122a = cVar.f18171e[i11];
                            bVar2.f18163a = cVar.f18170d[i11];
                            bVar2.f18164b = cVar.f18169c[i11];
                            bVar2.f18166d = cVar.f18173g[i11];
                            cVar.f18179m = Math.max(cVar.f18179m, j12);
                            int i12 = cVar.f18175i - 1;
                            cVar.f18175i = i12;
                            int i13 = cVar.f18177k + 1;
                            cVar.f18177k = i13;
                            cVar.f18176j++;
                            if (i13 == cVar.f18167a) {
                                cVar.f18177k = 0;
                            }
                            if (i12 > 0) {
                                j11 = cVar.f18169c[cVar.f18177k];
                            } else {
                                j11 = bVar2.f18164b + bVar2.f18163a;
                            }
                            bVar2.f18165c = j11;
                            c10 = 65532;
                        }
                        c10 = 65533;
                    }
                }
                jVar.f19140a = cVar.f18174h[cVar.f18177k];
                c10 = 65531;
            } else if (z11) {
                bVar.f18122a = 4;
                c10 = 65532;
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.i iVar2 = cVar.f18183q;
                if (iVar2 != null && (z10 || iVar2 != iVar)) {
                    jVar.f19140a = iVar2;
                    c10 = 65531;
                }
                c10 = 65533;
            }
        }
        if (c10 == 65531) {
            this.f18157i = jVar.f19140a;
            return -5;
        } else if (c10 != 65532) {
            if (c10 == 65533) {
                return -3;
            }
            throw new IllegalStateException();
        } else if (bVar.b(4)) {
            return -4;
        } else {
            if (bVar.f18125d < j10) {
                bVar.f18122a |= RecyclerView.UNDEFINED_DURATION;
            }
            if (bVar.b(1073741824)) {
                b bVar3 = this.f18153e;
                long j13 = bVar3.f18164b;
                this.f18154f.c(1);
                a(j13, this.f18154f.f19579a, 1);
                long j14 = j13 + 1;
                byte b10 = this.f18154f.f19579a[0];
                boolean z12 = (b10 & 128) != 0;
                int i14 = b10 & Byte.MAX_VALUE;
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.a aVar = bVar.f18123b;
                if (aVar.f18112a == null) {
                    aVar.f18112a = new byte[16];
                }
                a(j14, aVar.f18112a, i14);
                long j15 = j14 + i14;
                if (z12) {
                    this.f18154f.c(2);
                    a(j15, this.f18154f.f19579a, 2);
                    j15 += 2;
                    i10 = this.f18154f.q();
                } else {
                    i10 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.a aVar2 = bVar.f18123b;
                int[] iArr = aVar2.f18115d;
                if (iArr == null || iArr.length < i10) {
                    iArr = new int[i10];
                }
                int[] iArr2 = aVar2.f18116e;
                if (iArr2 == null || iArr2.length < i10) {
                    iArr2 = new int[i10];
                }
                if (z12) {
                    int i15 = i10 * 6;
                    this.f18154f.c(i15);
                    a(j15, this.f18154f.f19579a, i15);
                    j15 += i15;
                    this.f18154f.e(0);
                    for (int i16 = 0; i16 < i10; i16++) {
                        iArr[i16] = this.f18154f.q();
                        iArr2[i16] = this.f18154f.o();
                    }
                } else {
                    iArr[0] = 0;
                    iArr2[0] = bVar3.f18163a - ((int) (j15 - bVar3.f18164b));
                }
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.a aVar3 = bVar.f18123b;
                byte[] bArr = bVar3.f18166d;
                byte[] bArr2 = aVar3.f18112a;
                aVar3.f18117f = i10;
                aVar3.f18115d = iArr;
                aVar3.f18116e = iArr2;
                aVar3.f18113b = bArr;
                aVar3.f18112a = bArr2;
                aVar3.f18114c = 1;
                int i17 = u.f19606a;
                if (i17 >= 16) {
                    MediaCodec.CryptoInfo cryptoInfo = aVar3.f18118g;
                    cryptoInfo.numSubSamples = i10;
                    cryptoInfo.numBytesOfClearData = iArr;
                    cryptoInfo.numBytesOfEncryptedData = iArr2;
                    cryptoInfo.key = bArr;
                    cryptoInfo.iv = bArr2;
                    cryptoInfo.mode = 1;
                    if (i17 >= 24) {
                        a.b bVar4 = aVar3.f18119h;
                        bVar4.f18121b.set(0, 0);
                        bVar4.f18120a.setPattern(bVar4.f18121b);
                    }
                }
                long j16 = bVar3.f18164b;
                int i18 = (int) (j15 - j16);
                bVar3.f18164b = j16 + i18;
                bVar3.f18163a -= i18;
            }
            int i19 = this.f18153e.f18163a;
            ByteBuffer byteBuffer = bVar.f18124c;
            if (byteBuffer == null) {
                bVar.f18124c = bVar.a(i19);
            } else {
                int capacity = byteBuffer.capacity();
                int position = bVar.f18124c.position();
                int i20 = i19 + position;
                if (capacity < i20) {
                    ByteBuffer a10 = bVar.a(i20);
                    if (position > 0) {
                        bVar.f18124c.position(0);
                        bVar.f18124c.limit(position);
                        a10.put(bVar.f18124c);
                    }
                    bVar.f18124c = a10;
                }
            }
            b bVar5 = this.f18153e;
            long j17 = bVar5.f18164b;
            ByteBuffer byteBuffer2 = bVar.f18124c;
            int i21 = bVar5.f18163a;
            while (i21 > 0) {
                a(j17);
                int i22 = (int) (j17 - this.f18156h);
                int min = Math.min(i21, this.f18150b - i22);
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a peek = this.f18152d.peek();
                byteBuffer2.put(peek.f19374a, peek.f19375b + i22, min);
                j17 += min;
                i21 -= min;
            }
            a(this.f18153e.f18165c);
            return -4;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: i  reason: collision with root package name */
        public int f18175i;

        /* renamed from: j  reason: collision with root package name */
        public int f18176j;

        /* renamed from: k  reason: collision with root package name */
        public int f18177k;

        /* renamed from: l  reason: collision with root package name */
        public int f18178l;

        /* renamed from: q  reason: collision with root package name */
        public com.fyber.inneractive.sdk.player.exoplayer2.i f18183q;

        /* renamed from: r  reason: collision with root package name */
        public int f18184r;

        /* renamed from: a  reason: collision with root package name */
        public int f18167a = 1000;

        /* renamed from: b  reason: collision with root package name */
        public int[] f18168b = new int[1000];

        /* renamed from: c  reason: collision with root package name */
        public long[] f18169c = new long[1000];

        /* renamed from: f  reason: collision with root package name */
        public long[] f18172f = new long[1000];

        /* renamed from: e  reason: collision with root package name */
        public int[] f18171e = new int[1000];

        /* renamed from: d  reason: collision with root package name */
        public int[] f18170d = new int[1000];

        /* renamed from: g  reason: collision with root package name */
        public byte[][] f18173g = new byte[1000];

        /* renamed from: h  reason: collision with root package name */
        public com.fyber.inneractive.sdk.player.exoplayer2.i[] f18174h = new com.fyber.inneractive.sdk.player.exoplayer2.i[1000];

        /* renamed from: m  reason: collision with root package name */
        public long f18179m = Long.MIN_VALUE;

        /* renamed from: n  reason: collision with root package name */
        public long f18180n = Long.MIN_VALUE;

        /* renamed from: p  reason: collision with root package name */
        public boolean f18182p = true;

        /* renamed from: o  reason: collision with root package name */
        public boolean f18181o = true;

        public synchronized void a(long j10, int i10, long j11, int i11, byte[] bArr) {
            if (this.f18181o) {
                if ((i10 & 1) == 0) {
                    return;
                }
                this.f18181o = false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(!this.f18182p);
            synchronized (this) {
                this.f18180n = Math.max(this.f18180n, j10);
                long[] jArr = this.f18172f;
                int i12 = this.f18178l;
                jArr[i12] = j10;
                long[] jArr2 = this.f18169c;
                jArr2[i12] = j11;
                this.f18170d[i12] = i11;
                this.f18171e[i12] = i10;
                this.f18173g[i12] = bArr;
                this.f18174h[i12] = this.f18183q;
                this.f18168b[i12] = this.f18184r;
                int i13 = this.f18175i + 1;
                this.f18175i = i13;
                int i14 = this.f18167a;
                if (i13 == i14) {
                    int i15 = i14 + 1000;
                    int[] iArr = new int[i15];
                    long[] jArr3 = new long[i15];
                    long[] jArr4 = new long[i15];
                    int[] iArr2 = new int[i15];
                    int[] iArr3 = new int[i15];
                    byte[][] bArr2 = new byte[i15];
                    com.fyber.inneractive.sdk.player.exoplayer2.i[] iVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.i[i15];
                    int i16 = this.f18177k;
                    int i17 = i14 - i16;
                    System.arraycopy(jArr2, i16, jArr3, 0, i17);
                    System.arraycopy(this.f18172f, this.f18177k, jArr4, 0, i17);
                    System.arraycopy(this.f18171e, this.f18177k, iArr2, 0, i17);
                    System.arraycopy(this.f18170d, this.f18177k, iArr3, 0, i17);
                    System.arraycopy(this.f18173g, this.f18177k, bArr2, 0, i17);
                    System.arraycopy(this.f18174h, this.f18177k, iVarArr, 0, i17);
                    System.arraycopy(this.f18168b, this.f18177k, iArr, 0, i17);
                    int i18 = this.f18177k;
                    System.arraycopy(this.f18169c, 0, jArr3, i17, i18);
                    System.arraycopy(this.f18172f, 0, jArr4, i17, i18);
                    System.arraycopy(this.f18171e, 0, iArr2, i17, i18);
                    System.arraycopy(this.f18170d, 0, iArr3, i17, i18);
                    System.arraycopy(this.f18173g, 0, bArr2, i17, i18);
                    System.arraycopy(this.f18174h, 0, iVarArr, i17, i18);
                    System.arraycopy(this.f18168b, 0, iArr, i17, i18);
                    this.f18169c = jArr3;
                    this.f18172f = jArr4;
                    this.f18171e = iArr2;
                    this.f18170d = iArr3;
                    this.f18173g = bArr2;
                    this.f18174h = iVarArr;
                    this.f18168b = iArr;
                    this.f18177k = 0;
                    int i19 = this.f18167a;
                    this.f18178l = i19;
                    this.f18175i = i19;
                    this.f18167a = i15;
                } else {
                    int i20 = i12 + 1;
                    this.f18178l = i20;
                    if (i20 == i14) {
                        this.f18178l = 0;
                    }
                }
            }
        }

        public synchronized boolean a(long j10) {
            boolean z10 = false;
            if (this.f18179m >= j10) {
                return false;
            }
            int i10 = this.f18175i;
            while (i10 > 0 && this.f18172f[((this.f18177k + i10) - 1) % this.f18167a] >= j10) {
                i10--;
            }
            int i11 = this.f18176j;
            int i12 = this.f18175i;
            int i13 = (i11 + i12) - (i10 + i11);
            if (i13 >= 0 && i13 <= i12) {
                z10 = true;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z10);
            if (i13 == 0) {
                if (this.f18176j != 0) {
                    int i14 = this.f18178l;
                    if (i14 == 0) {
                        i14 = this.f18167a;
                    }
                    int i15 = i14 - 1;
                    long j11 = this.f18169c[i15];
                    int i16 = this.f18170d[i15];
                }
            } else {
                int i17 = this.f18175i - i13;
                this.f18175i = i17;
                int i18 = this.f18178l;
                int i19 = this.f18167a;
                this.f18178l = ((i18 + i19) - i13) % i19;
                this.f18180n = Long.MIN_VALUE;
                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                    int i21 = (this.f18177k + i20) % this.f18167a;
                    this.f18180n = Math.max(this.f18180n, this.f18172f[i21]);
                    if ((this.f18171e[i21] & 1) != 0) {
                        break;
                    }
                }
                long j12 = this.f18169c[this.f18178l];
            }
            return true;
        }
    }

    public final void a(long j10, byte[] bArr, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            a(j10);
            int i12 = (int) (j10 - this.f18156h);
            int min = Math.min(i10 - i11, this.f18150b - i12);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a peek = this.f18152d.peek();
            System.arraycopy(peek.f19374a, peek.f19375b + i12, bArr, i11, min);
            j10 += min;
            i11 += min;
        }
    }

    public final void a(long j10) {
        int i10 = ((int) (j10 - this.f18156h)) / this.f18150b;
        for (int i11 = 0; i11 < i10; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f18149a;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a remove = this.f18152d.remove();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.k) bVar;
            synchronized (kVar) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = kVar.f19472d;
                aVarArr[0] = remove;
                kVar.a(aVarArr);
            }
            this.f18156h += this.f18150b;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar) {
        boolean z10;
        if (iVar == null) {
            iVar = null;
        }
        c cVar = this.f18151c;
        synchronized (cVar) {
            z10 = true;
            if (iVar == null) {
                cVar.f18182p = true;
            } else {
                cVar.f18182p = false;
                if (!u.a(iVar, cVar.f18183q)) {
                    cVar.f18183q = iVar;
                }
            }
            z10 = false;
        }
        InterfaceC0248d interfaceC0248d = this.f18162n;
        if (interfaceC0248d == null || !z10) {
            return;
        }
        interfaceC0248d.a(iVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public int a(g gVar, int i10, boolean z10) throws IOException, InterruptedException {
        if (!h()) {
            int b10 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(i10);
            if (b10 == -1) {
                if (z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return b10;
        }
        try {
            int a10 = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f18159k;
            int a11 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).a(aVar.f19374a, aVar.f19375b + this.f18160l, a10);
            if (a11 == -1) {
                if (z10) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f18160l += a11;
            this.f18158j += a11;
            return a11;
        } finally {
            c();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10) {
        if (!h()) {
            kVar.e(kVar.f19580b + i10);
            return;
        }
        while (i10 > 0) {
            int a10 = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f18159k;
            kVar.a(aVar.f19374a, aVar.f19375b + this.f18160l, a10);
            this.f18160l += a10;
            this.f18158j += a10;
            i10 -= a10;
        }
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(long j10, int i10, int i11, int i12, byte[] bArr) {
        if (!h()) {
            c cVar = this.f18151c;
            synchronized (cVar) {
                cVar.f18180n = Math.max(cVar.f18180n, j10);
            }
            return;
        }
        try {
            if (this.f18161m) {
                if ((i10 & 1) != 0 && this.f18151c.a(j10)) {
                    this.f18161m = false;
                }
                return;
            }
            long j11 = j10 + 0;
            this.f18151c.a(j11, i10, (this.f18158j - i11) - i12, i11, bArr);
        } finally {
            c();
        }
    }

    public final void a() {
        c cVar = this.f18151c;
        cVar.f18176j = 0;
        cVar.f18177k = 0;
        cVar.f18178l = 0;
        cVar.f18175i = 0;
        cVar.f18181o = true;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f18149a;
        LinkedBlockingDeque<com.fyber.inneractive.sdk.player.exoplayer2.upstream.a> linkedBlockingDeque = this.f18152d;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.k) bVar).a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[]) linkedBlockingDeque.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[linkedBlockingDeque.size()]));
        this.f18152d.clear();
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.k) this.f18149a).b();
        this.f18156h = 0L;
        this.f18158j = 0L;
        this.f18159k = null;
        this.f18160l = this.f18150b;
    }

    public final int a(int i10) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar;
        if (this.f18160l == this.f18150b) {
            this.f18160l = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.k) this.f18149a;
            synchronized (kVar) {
                kVar.f19474f++;
                int i11 = kVar.f19475g;
                if (i11 > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = kVar.f19476h;
                    int i12 = i11 - 1;
                    kVar.f19475g = i12;
                    aVar = aVarArr[i12];
                    aVarArr[i12] = null;
                } else {
                    aVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a(new byte[kVar.f19470b], 0);
                }
            }
            this.f18159k = aVar;
            this.f18152d.add(aVar);
        }
        return Math.min(i10, this.f18150b - this.f18160l);
    }
}
