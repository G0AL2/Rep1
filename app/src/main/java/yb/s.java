package yb;

/* compiled from: DeliveryMechanism.java */
/* loaded from: classes3.dex */
public enum s {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f39494a;

    s(int i10) {
        this.f39494a = i10;
    }

    public static s a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int f() {
        return this.f39494a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f39494a);
    }
}
