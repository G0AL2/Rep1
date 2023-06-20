package da;

import java.io.IOException;

/* compiled from: LoadErrorHandlingPolicy.java */
/* loaded from: classes2.dex */
public interface d0 {

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f29131a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29132b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29133c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29134d;

        public a(int i10, int i11, int i12, int i13) {
            this.f29131a = i10;
            this.f29132b = i11;
            this.f29133c = i12;
            this.f29134d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                if (this.f29131a - this.f29132b <= 1) {
                    return false;
                }
            } else if (this.f29133c - this.f29134d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29135a;

        /* renamed from: b  reason: collision with root package name */
        public final long f29136b;

        public b(int i10, long j10) {
            ea.a.a(j10 >= 0);
            this.f29135a = i10;
            this.f29136b = j10;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final IOException f29137a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29138b;

        public c(i9.n nVar, i9.q qVar, IOException iOException, int i10) {
            this.f29137a = iOException;
            this.f29138b = i10;
        }
    }

    b a(a aVar, c cVar);

    long b(c cVar);

    int c(int i10);

    void d(long j10);
}
