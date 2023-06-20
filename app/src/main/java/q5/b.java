package q5;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import y3.j;

/* compiled from: ImageDecodeOptions.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: m  reason: collision with root package name */
    private static final b f35916m = b().a();

    /* renamed from: a  reason: collision with root package name */
    public final int f35917a;

    /* renamed from: b  reason: collision with root package name */
    public final int f35918b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f35919c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f35920d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f35921e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f35922f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f35923g;

    /* renamed from: h  reason: collision with root package name */
    public final Bitmap.Config f35924h;

    /* renamed from: i  reason: collision with root package name */
    public final u5.c f35925i;

    /* renamed from: j  reason: collision with root package name */
    public final e6.a f35926j;

    /* renamed from: k  reason: collision with root package name */
    public final ColorSpace f35927k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f35928l;

    public b(c cVar) {
        this.f35917a = cVar.l();
        this.f35918b = cVar.k();
        this.f35919c = cVar.h();
        this.f35920d = cVar.m();
        this.f35921e = cVar.g();
        this.f35922f = cVar.j();
        this.f35923g = cVar.c();
        this.f35924h = cVar.b();
        this.f35925i = cVar.f();
        this.f35926j = cVar.d();
        this.f35927k = cVar.e();
        this.f35928l = cVar.i();
    }

    public static b a() {
        return f35916m;
    }

    public static c b() {
        return new c();
    }

    protected j.b c() {
        return j.c(this).a("minDecodeIntervalMs", this.f35917a).a("maxDimensionPx", this.f35918b).c("decodePreviewFrame", this.f35919c).c("useLastFrameForPreview", this.f35920d).c("decodeAllFrames", this.f35921e).c("forceStaticImage", this.f35922f).b("bitmapConfigName", this.f35923g.name()).b("animatedBitmapConfigName", this.f35924h.name()).b("customImageDecoder", this.f35925i).b("bitmapTransformation", this.f35926j).b("colorSpace", this.f35927k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f35917a == bVar.f35917a && this.f35918b == bVar.f35918b && this.f35919c == bVar.f35919c && this.f35920d == bVar.f35920d && this.f35921e == bVar.f35921e && this.f35922f == bVar.f35922f) {
            boolean z10 = this.f35928l;
            if (z10 || this.f35923g == bVar.f35923g) {
                return (z10 || this.f35924h == bVar.f35924h) && this.f35925i == bVar.f35925i && this.f35926j == bVar.f35926j && this.f35927k == bVar.f35927k;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((((this.f35917a * 31) + this.f35918b) * 31) + (this.f35919c ? 1 : 0)) * 31) + (this.f35920d ? 1 : 0)) * 31) + (this.f35921e ? 1 : 0)) * 31) + (this.f35922f ? 1 : 0);
        if (!this.f35928l) {
            i10 = (i10 * 31) + this.f35923g.ordinal();
        }
        if (!this.f35928l) {
            int i11 = i10 * 31;
            Bitmap.Config config = this.f35924h;
            i10 = i11 + (config != null ? config.ordinal() : 0);
        }
        int i12 = i10 * 31;
        u5.c cVar = this.f35925i;
        int hashCode = (i12 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        e6.a aVar = this.f35926j;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ColorSpace colorSpace = this.f35927k;
        return hashCode2 + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}
