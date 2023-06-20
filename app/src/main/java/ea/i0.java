package ea;

import java.util.Arrays;

/* compiled from: TimedValueQueue.java */
/* loaded from: classes2.dex */
public final class i0<V> {

    /* renamed from: a  reason: collision with root package name */
    private long[] f29689a;

    /* renamed from: b  reason: collision with root package name */
    private V[] f29690b;

    /* renamed from: c  reason: collision with root package name */
    private int f29691c;

    /* renamed from: d  reason: collision with root package name */
    private int f29692d;

    public i0() {
        this(10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f29691c;
        int i11 = this.f29692d;
        V[] vArr = this.f29690b;
        int length = (i10 + i11) % vArr.length;
        this.f29689a[length] = j10;
        vArr[length] = v10;
        this.f29692d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f29692d;
        if (i10 > 0) {
            if (j10 <= this.f29689a[((this.f29691c + i10) - 1) % this.f29690b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f29690b.length;
        if (this.f29692d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f29691c;
        int i12 = length - i11;
        System.arraycopy(this.f29689a, i11, jArr, 0, i12);
        System.arraycopy(this.f29690b, this.f29691c, vArr, 0, i12);
        int i13 = this.f29691c;
        if (i13 > 0) {
            System.arraycopy(this.f29689a, 0, jArr, i12, i13);
            System.arraycopy(this.f29690b, 0, vArr, i12, this.f29691c);
        }
        this.f29689a = jArr;
        this.f29690b = vArr;
        this.f29691c = 0;
    }

    private static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    private V h(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f29692d > 0) {
            long j12 = j10 - this.f29689a[this.f29691c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v10 = k();
            j11 = j12;
        }
        return v10;
    }

    private V k() {
        a.f(this.f29692d > 0);
        V[] vArr = this.f29690b;
        int i10 = this.f29691c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f29691c = (i10 + 1) % vArr.length;
        this.f29692d--;
        return v10;
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public synchronized void c() {
        this.f29691c = 0;
        this.f29692d = 0;
        Arrays.fill(this.f29690b, (Object) null);
    }

    public synchronized V g(long j10) {
        return h(j10, false);
    }

    public synchronized V i() {
        return this.f29692d == 0 ? null : k();
    }

    public synchronized V j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f29692d;
    }

    public i0(int i10) {
        this.f29689a = new long[i10];
        this.f29690b = (V[]) f(i10);
    }
}
