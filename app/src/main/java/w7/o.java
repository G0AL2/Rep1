package w7;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import w7.d;

/* compiled from: TransportContext.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class o {

    /* compiled from: TransportContext.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(u7.d dVar);
    }

    public static a a() {
        return new d.b().d(u7.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract u7.d d();

    public boolean e() {
        return c() != null;
    }

    public o f(u7.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
