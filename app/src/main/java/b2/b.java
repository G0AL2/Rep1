package b2;

/* compiled from: DocumentData.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f4774a;

    /* renamed from: b  reason: collision with root package name */
    public String f4775b;

    /* renamed from: c  reason: collision with root package name */
    public float f4776c;

    /* renamed from: d  reason: collision with root package name */
    public a f4777d;

    /* renamed from: e  reason: collision with root package name */
    public int f4778e;

    /* renamed from: f  reason: collision with root package name */
    public float f4779f;

    /* renamed from: g  reason: collision with root package name */
    public float f4780g;

    /* renamed from: h  reason: collision with root package name */
    public int f4781h;

    /* renamed from: i  reason: collision with root package name */
    public int f4782i;

    /* renamed from: j  reason: collision with root package name */
    public float f4783j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4784k;

    /* compiled from: DocumentData.java */
    /* loaded from: classes.dex */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10) {
        this.f4774a = str;
        this.f4775b = str2;
        this.f4776c = f10;
        this.f4777d = aVar;
        this.f4778e = i10;
        this.f4779f = f11;
        this.f4780g = f12;
        this.f4781h = i11;
        this.f4782i = i12;
        this.f4783j = f13;
        this.f4784k = z10;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f4774a.hashCode() * 31) + this.f4775b.hashCode()) * 31) + this.f4776c)) * 31) + this.f4777d.ordinal()) * 31) + this.f4778e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f4779f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f4781h;
    }

    public b() {
    }
}
