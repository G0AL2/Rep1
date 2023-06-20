package w7;

import com.google.auto.value.AutoValue;
import w7.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendRequest.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class n {

    /* compiled from: SendRequest.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract n a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(u7.b bVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(u7.c<?> cVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(u7.e<?, byte[]> eVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract u7.b b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract u7.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract u7.e<?, byte[]> e();

    public abstract o f();

    public abstract String g();
}
