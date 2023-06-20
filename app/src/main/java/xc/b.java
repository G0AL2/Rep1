package xc;

/* compiled from: SystemClock.java */
/* loaded from: classes3.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static b f38883a;

    private b() {
    }

    public static b a() {
        if (f38883a == null) {
            f38883a = new b();
        }
        return f38883a;
    }

    @Override // xc.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
