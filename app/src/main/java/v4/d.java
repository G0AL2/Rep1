package v4;

import java.util.Arrays;
import y3.k;

/* compiled from: RoundingParams.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private a f37799a = a.BITMAP_ONLY;

    /* renamed from: b  reason: collision with root package name */
    private boolean f37800b = false;

    /* renamed from: c  reason: collision with root package name */
    private float[] f37801c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f37802d = 0;

    /* renamed from: e  reason: collision with root package name */
    private float f37803e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    private int f37804f = 0;

    /* renamed from: g  reason: collision with root package name */
    private float f37805g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f37806h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f37807i = false;

    /* compiled from: RoundingParams.java */
    /* loaded from: classes.dex */
    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static d a(float f10) {
        return new d().n(f10);
    }

    private float[] e() {
        if (this.f37801c == null) {
            this.f37801c = new float[8];
        }
        return this.f37801c;
    }

    public int b() {
        return this.f37804f;
    }

    public float c() {
        return this.f37803e;
    }

    public float[] d() {
        return this.f37801c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f37800b == dVar.f37800b && this.f37802d == dVar.f37802d && Float.compare(dVar.f37803e, this.f37803e) == 0 && this.f37804f == dVar.f37804f && Float.compare(dVar.f37805g, this.f37805g) == 0 && this.f37799a == dVar.f37799a && this.f37806h == dVar.f37806h && this.f37807i == dVar.f37807i) {
            return Arrays.equals(this.f37801c, dVar.f37801c);
        }
        return false;
    }

    public int f() {
        return this.f37802d;
    }

    public float g() {
        return this.f37805g;
    }

    public boolean h() {
        return this.f37807i;
    }

    public int hashCode() {
        a aVar = this.f37799a;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f37800b ? 1 : 0)) * 31;
        float[] fArr = this.f37801c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f37802d) * 31;
        float f10 = this.f37803e;
        int floatToIntBits = (((hashCode2 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f37804f) * 31;
        float f11 = this.f37805g;
        return ((((floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31) + (this.f37806h ? 1 : 0)) * 31) + (this.f37807i ? 1 : 0);
    }

    public boolean i() {
        return this.f37800b;
    }

    public a j() {
        return this.f37799a;
    }

    public boolean k() {
        return this.f37806h;
    }

    public d l(int i10, float f10) {
        k.c(f10 >= 0.0f, "the border width cannot be < 0");
        this.f37803e = f10;
        this.f37804f = i10;
        return this;
    }

    public d m(float f10, float f11, float f12, float f13) {
        float[] e10 = e();
        e10[1] = f10;
        e10[0] = f10;
        e10[3] = f11;
        e10[2] = f11;
        e10[5] = f12;
        e10[4] = f12;
        e10[7] = f13;
        e10[6] = f13;
        return this;
    }

    public d n(float f10) {
        Arrays.fill(e(), f10);
        return this;
    }

    public d o(int i10) {
        this.f37802d = i10;
        this.f37799a = a.OVERLAY_COLOR;
        return this;
    }

    public d p(a aVar) {
        this.f37799a = aVar;
        return this;
    }
}
