package d2;

import android.graphics.Paint;
import com.airbnb.lottie.d0;
import java.util.List;
import y1.t;

/* compiled from: ShapeStroke.java */
/* loaded from: classes.dex */
public class r implements d2.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29020a;

    /* renamed from: b  reason: collision with root package name */
    private final c2.b f29021b;

    /* renamed from: c  reason: collision with root package name */
    private final List<c2.b> f29022c;

    /* renamed from: d  reason: collision with root package name */
    private final c2.a f29023d;

    /* renamed from: e  reason: collision with root package name */
    private final c2.d f29024e;

    /* renamed from: f  reason: collision with root package name */
    private final c2.b f29025f;

    /* renamed from: g  reason: collision with root package name */
    private final b f29026g;

    /* renamed from: h  reason: collision with root package name */
    private final c f29027h;

    /* renamed from: i  reason: collision with root package name */
    private final float f29028i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f29029j;

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29030a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f29031b;

        static {
            int[] iArr = new int[c.values().length];
            f29031b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29031b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29031b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f29030a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29030a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29030a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap f() {
            int i10 = a.f29030a[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join f() {
            int i10 = a.f29031b[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public r(String str, c2.b bVar, List<c2.b> list, c2.a aVar, c2.d dVar, c2.b bVar2, b bVar3, c cVar, float f10, boolean z10) {
        this.f29020a = str;
        this.f29021b = bVar;
        this.f29022c = list;
        this.f29023d = aVar;
        this.f29024e = dVar;
        this.f29025f = bVar2;
        this.f29026g = bVar3;
        this.f29027h = cVar;
        this.f29028i = f10;
        this.f29029j = z10;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        return new t(d0Var, bVar, this);
    }

    public b b() {
        return this.f29026g;
    }

    public c2.a c() {
        return this.f29023d;
    }

    public c2.b d() {
        return this.f29021b;
    }

    public c e() {
        return this.f29027h;
    }

    public List<c2.b> f() {
        return this.f29022c;
    }

    public float g() {
        return this.f29028i;
    }

    public String h() {
        return this.f29020a;
    }

    public c2.d i() {
        return this.f29024e;
    }

    public c2.b j() {
        return this.f29025f;
    }

    public boolean k() {
        return this.f29029j;
    }
}
