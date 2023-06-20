package i9;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: IcyDataSource.java */
/* loaded from: classes2.dex */
final class m implements da.l {

    /* renamed from: a  reason: collision with root package name */
    private final da.l f31708a;

    /* renamed from: b  reason: collision with root package name */
    private final int f31709b;

    /* renamed from: c  reason: collision with root package name */
    private final a f31710c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f31711d;

    /* renamed from: e  reason: collision with root package name */
    private int f31712e;

    /* compiled from: IcyDataSource.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(ea.a0 a0Var);
    }

    public m(da.l lVar, int i10, a aVar) {
        ea.a.a(i10 > 0);
        this.f31708a = lVar;
        this.f31709b = i10;
        this.f31710c = aVar;
        this.f31711d = new byte[1];
        this.f31712e = i10;
    }

    private boolean q() throws IOException {
        if (this.f31708a.c(this.f31711d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f31711d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int c10 = this.f31708a.c(bArr, i12, i11);
            if (c10 == -1) {
                return false;
            }
            i12 += c10;
            i11 -= c10;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f31710c.a(new ea.a0(bArr, i10));
        }
        return true;
    }

    @Override // da.i
    public int c(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f31712e == 0) {
            if (!q()) {
                return -1;
            }
            this.f31712e = this.f31709b;
        }
        int c10 = this.f31708a.c(bArr, i10, Math.min(this.f31712e, i11));
        if (c10 != -1) {
            this.f31712e -= c10;
        }
        return c10;
    }

    @Override // da.l
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // da.l
    public Map<String, List<String>> e() {
        return this.f31708a.e();
    }

    @Override // da.l
    public long g(da.p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override // da.l
    public void l(da.m0 m0Var) {
        ea.a.e(m0Var);
        this.f31708a.l(m0Var);
    }

    @Override // da.l
    public Uri o() {
        return this.f31708a.o();
    }
}
