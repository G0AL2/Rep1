package p8;

import j8.p1;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: TrackOutput.java */
/* loaded from: classes2.dex */
public interface a0 {

    /* compiled from: TrackOutput.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f35611a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f35612b;

        /* renamed from: c  reason: collision with root package name */
        public final int f35613c;

        /* renamed from: d  reason: collision with root package name */
        public final int f35614d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f35611a = i10;
            this.f35612b = bArr;
            this.f35613c = i11;
            this.f35614d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35611a == aVar.f35611a && this.f35613c == aVar.f35613c && this.f35614d == aVar.f35614d && Arrays.equals(this.f35612b, aVar.f35612b);
        }

        public int hashCode() {
            return (((((this.f35611a * 31) + Arrays.hashCode(this.f35612b)) * 31) + this.f35613c) * 31) + this.f35614d;
        }
    }

    void a(ea.a0 a0Var, int i10);

    int b(da.i iVar, int i10, boolean z10, int i11) throws IOException;

    int c(da.i iVar, int i10, boolean z10) throws IOException;

    void d(p1 p1Var);

    void e(long j10, int i10, int i11, int i12, a aVar);

    void f(ea.a0 a0Var, int i10, int i11);
}
