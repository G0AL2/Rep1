package wc;

import com.google.auto.value.AutoValue;
import wc.b;

/* compiled from: TokenResult.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class f {

    /* compiled from: TokenResult.java */
    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j10);
    }

    /* compiled from: TokenResult.java */
    /* loaded from: classes3.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new b.C0532b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
