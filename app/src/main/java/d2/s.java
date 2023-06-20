package d2;

import com.airbnb.lottie.d0;
import y1.u;

/* compiled from: ShapeTrimPath.java */
/* loaded from: classes.dex */
public class s implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29040a;

    /* renamed from: b  reason: collision with root package name */
    private final a f29041b;

    /* renamed from: c  reason: collision with root package name */
    private final c2.b f29042c;

    /* renamed from: d  reason: collision with root package name */
    private final c2.b f29043d;

    /* renamed from: e  reason: collision with root package name */
    private final c2.b f29044e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f29045f;

    /* compiled from: ShapeTrimPath.java */
    /* loaded from: classes.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a a(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i10);
            }
            return SIMULTANEOUSLY;
        }
    }

    public s(String str, a aVar, c2.b bVar, c2.b bVar2, c2.b bVar3, boolean z10) {
        this.f29040a = str;
        this.f29041b = aVar;
        this.f29042c = bVar;
        this.f29043d = bVar2;
        this.f29044e = bVar3;
        this.f29045f = z10;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        return new u(bVar, this);
    }

    public c2.b b() {
        return this.f29043d;
    }

    public String c() {
        return this.f29040a;
    }

    public c2.b d() {
        return this.f29044e;
    }

    public c2.b e() {
        return this.f29042c;
    }

    public a f() {
        return this.f29041b;
    }

    public boolean g() {
        return this.f29045f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f29042c + ", end: " + this.f29043d + ", offset: " + this.f29044e + "}";
    }
}
