package p8;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import ea.n0;
import j8.m1;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: DefaultExtractorInput.java */
/* loaded from: classes2.dex */
public final class f implements j {

    /* renamed from: b  reason: collision with root package name */
    private final da.i f35649b;

    /* renamed from: c  reason: collision with root package name */
    private final long f35650c;

    /* renamed from: d  reason: collision with root package name */
    private long f35651d;

    /* renamed from: f  reason: collision with root package name */
    private int f35653f;

    /* renamed from: g  reason: collision with root package name */
    private int f35654g;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f35652e = new byte[Constants.MIN_PROGRESS_STEP];

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f35648a = new byte[4096];

    static {
        m1.a("goog.exo.extractor");
    }

    public f(da.i iVar, long j10, long j11) {
        this.f35649b = iVar;
        this.f35651d = j10;
        this.f35650c = j11;
    }

    private void q(int i10) {
        if (i10 != -1) {
            this.f35651d += i10;
        }
    }

    private void r(int i10) {
        int i11 = this.f35653f + i10;
        byte[] bArr = this.f35652e;
        if (i11 > bArr.length) {
            this.f35652e = Arrays.copyOf(this.f35652e, n0.q(bArr.length * 2, Constants.MIN_PROGRESS_STEP + i11, i11 + 524288));
        }
    }

    private int s(byte[] bArr, int i10, int i11) {
        int i12 = this.f35654g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f35652e, 0, bArr, i10, min);
        w(min);
        return min;
    }

    private int t(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int c10 = this.f35649b.c(bArr, i10 + i12, i11 - i12);
            if (c10 == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + c10;
        }
        throw new InterruptedIOException();
    }

    private int u(int i10) {
        int min = Math.min(this.f35654g, i10);
        w(min);
        return min;
    }

    private void w(int i10) {
        int i11 = this.f35654g - i10;
        this.f35654g = i11;
        this.f35653f = 0;
        byte[] bArr = this.f35652e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[Constants.MIN_PROGRESS_STEP + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f35652e = bArr2;
    }

    @Override // p8.j
    public int a(int i10) throws IOException {
        int u10 = u(i10);
        if (u10 == 0) {
            byte[] bArr = this.f35648a;
            u10 = t(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        q(u10);
        return u10;
    }

    @Override // p8.j
    public long b() {
        return this.f35650c;
    }

    @Override // p8.j, da.i
    public int c(byte[] bArr, int i10, int i11) throws IOException {
        int s10 = s(bArr, i10, i11);
        if (s10 == 0) {
            s10 = t(bArr, i10, i11, 0, true);
        }
        q(s10);
        return s10;
    }

    @Override // p8.j
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (n(i11, z10)) {
            System.arraycopy(this.f35652e, this.f35653f - i11, bArr, i10, i11);
            return true;
        }
        return false;
    }

    @Override // p8.j
    public void f() {
        this.f35653f = 0;
    }

    @Override // p8.j
    public long getPosition() {
        return this.f35651d;
    }

    @Override // p8.j
    public boolean h(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int s10 = s(bArr, i10, i11);
        while (s10 < i11 && s10 != -1) {
            s10 = t(bArr, i10, i11, s10, z10);
        }
        q(s10);
        return s10 != -1;
    }

    @Override // p8.j
    public long i() {
        return this.f35651d + this.f35653f;
    }

    @Override // p8.j
    public void j(int i10) throws IOException {
        n(i10, false);
    }

    @Override // p8.j
    public int k(byte[] bArr, int i10, int i11) throws IOException {
        int min;
        r(i11);
        int i12 = this.f35654g;
        int i13 = this.f35653f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = t(this.f35652e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f35654g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f35652e, this.f35653f, bArr, i10, min);
        this.f35653f += min;
        return min;
    }

    @Override // p8.j
    public void m(int i10) throws IOException {
        v(i10, false);
    }

    @Override // p8.j
    public boolean n(int i10, boolean z10) throws IOException {
        r(i10);
        int i11 = this.f35654g - this.f35653f;
        while (i11 < i10) {
            i11 = t(this.f35652e, this.f35653f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f35654g = this.f35653f + i11;
        }
        this.f35653f += i10;
        return true;
    }

    @Override // p8.j
    public void p(byte[] bArr, int i10, int i11) throws IOException {
        d(bArr, i10, i11, false);
    }

    @Override // p8.j
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        h(bArr, i10, i11, false);
    }

    public boolean v(int i10, boolean z10) throws IOException {
        int u10 = u(i10);
        while (u10 < i10 && u10 != -1) {
            u10 = t(this.f35648a, -u10, Math.min(i10, this.f35648a.length + u10), u10, z10);
        }
        q(u10);
        return u10 != -1;
    }
}
