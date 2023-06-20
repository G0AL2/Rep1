package u8;

import com.inmobi.media.fq;
import ea.a0;
import java.io.IOException;
import p8.j;

/* compiled from: Sniffer.java */
/* loaded from: classes2.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f37659a = new a0(8);

    /* renamed from: b  reason: collision with root package name */
    private int f37660b;

    private long a(j jVar) throws IOException {
        int i10 = 0;
        jVar.p(this.f37659a.d(), 0, 1);
        int i11 = this.f37659a.d()[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        jVar.p(this.f37659a.d(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f37659a.d()[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) + (i14 << 8);
        }
        this.f37660b += i13 + 1;
        return i14;
    }

    public boolean b(j jVar) throws IOException {
        long a10;
        int i10;
        long b10 = jVar.b();
        long j10 = 1024;
        int i11 = (b10 > (-1L) ? 1 : (b10 == (-1L) ? 0 : -1));
        if (i11 != 0 && b10 <= 1024) {
            j10 = b10;
        }
        int i12 = (int) j10;
        jVar.p(this.f37659a.d(), 0, 4);
        long F = this.f37659a.F();
        this.f37660b = 4;
        while (F != 440786851) {
            int i13 = this.f37660b + 1;
            this.f37660b = i13;
            if (i13 == i12) {
                return false;
            }
            jVar.p(this.f37659a.d(), 0, 1);
            F = ((F << 8) & (-256)) | (this.f37659a.d()[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        long a11 = a(jVar);
        long j11 = this.f37660b;
        if (a11 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a11 >= b10) {
            return false;
        }
        while (true) {
            int i14 = this.f37660b;
            long j12 = j11 + a11;
            if (i14 >= j12) {
                return ((long) i14) == j12;
            } else if (a(jVar) != Long.MIN_VALUE && (a(jVar)) >= 0 && a10 <= 2147483647L) {
                if (i10 != 0) {
                    int i15 = (int) a10;
                    jVar.j(i15);
                    this.f37660b += i15;
                }
            }
        }
    }
}
