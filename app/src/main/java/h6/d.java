package h6;

/* compiled from: LongArray.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private long[] f31106a;

    /* renamed from: b  reason: collision with root package name */
    private int f31107b = 0;

    private d(int i10) {
        this.f31106a = new long[i10];
    }

    public static d b(int i10) {
        return new d(i10);
    }

    private void e() {
        int i10 = this.f31107b;
        if (i10 == this.f31106a.length) {
            long[] jArr = new long[Math.max(i10 + 1, (int) (i10 * 1.8d))];
            System.arraycopy(this.f31106a, 0, jArr, 0, this.f31107b);
            this.f31106a = jArr;
        }
    }

    public void a(long j10) {
        e();
        long[] jArr = this.f31106a;
        int i10 = this.f31107b;
        this.f31107b = i10 + 1;
        jArr[i10] = j10;
    }

    public void c(int i10) {
        int i11 = this.f31107b;
        if (i10 <= i11) {
            this.f31107b = i11 - i10;
            return;
        }
        throw new IndexOutOfBoundsException("Trying to drop " + i10 + " items from array of length " + this.f31107b);
    }

    public long d(int i10) {
        if (i10 < this.f31107b) {
            return this.f31106a[i10];
        }
        throw new IndexOutOfBoundsException("" + i10 + " >= " + this.f31107b);
    }

    public void f(int i10, long j10) {
        if (i10 < this.f31107b) {
            this.f31106a[i10] = j10;
            return;
        }
        throw new IndexOutOfBoundsException("" + i10 + " >= " + this.f31107b);
    }

    public int g() {
        return this.f31107b;
    }
}
