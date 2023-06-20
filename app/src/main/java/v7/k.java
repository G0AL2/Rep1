package v7;

import com.google.auto.value.AutoValue;
import v7.e;

/* compiled from: ClientInfo.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class k {

    /* compiled from: ClientInfo.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract k a();

        public abstract a b(v7.a aVar);

        public abstract a c(b bVar);
    }

    /* compiled from: ClientInfo.java */
    /* loaded from: classes2.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        b(int i10) {
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract v7.a b();

    public abstract b c();
}
