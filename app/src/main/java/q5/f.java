package q5;

/* compiled from: RotationOptions.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    private static final f f35949c = new f(-1, false);

    /* renamed from: d  reason: collision with root package name */
    private static final f f35950d = new f(-2, false);

    /* renamed from: e  reason: collision with root package name */
    private static final f f35951e = new f(-1, true);

    /* renamed from: a  reason: collision with root package name */
    private final int f35952a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f35953b;

    private f(int i10, boolean z10) {
        this.f35952a = i10;
        this.f35953b = z10;
    }

    public static f a() {
        return f35949c;
    }

    public static f b() {
        return f35951e;
    }

    public static f d() {
        return f35950d;
    }

    public boolean c() {
        return this.f35953b;
    }

    public int e() {
        if (!g()) {
            return this.f35952a;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f35952a == fVar.f35952a && this.f35953b == fVar.f35953b;
        }
        return false;
    }

    public boolean f() {
        return this.f35952a != -2;
    }

    public boolean g() {
        return this.f35952a == -1;
    }

    public int hashCode() {
        return g4.b.c(Integer.valueOf(this.f35952a), Boolean.valueOf(this.f35953b));
    }

    public String toString() {
        return String.format(null, "%d defer:%b", Integer.valueOf(this.f35952a), Boolean.valueOf(this.f35953b));
    }
}
