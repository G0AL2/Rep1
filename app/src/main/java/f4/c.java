package f4;

/* compiled from: SystemClock.java */
/* loaded from: classes.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final c f30093a = new c();

    private c() {
    }

    public static c a() {
        return f30093a;
    }

    @Override // f4.a
    public long now() {
        return System.currentTimeMillis();
    }
}
