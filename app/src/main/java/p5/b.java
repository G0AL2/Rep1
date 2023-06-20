package p5;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;

/* compiled from: BitmapMemoryCacheKey.java */
/* loaded from: classes.dex */
public class b implements t3.d {

    /* renamed from: a  reason: collision with root package name */
    private final String f35513a;

    /* renamed from: b  reason: collision with root package name */
    private final q5.e f35514b;

    /* renamed from: c  reason: collision with root package name */
    private final q5.f f35515c;

    /* renamed from: d  reason: collision with root package name */
    private final q5.b f35516d;

    /* renamed from: e  reason: collision with root package name */
    private final t3.d f35517e;

    /* renamed from: f  reason: collision with root package name */
    private final String f35518f;

    /* renamed from: g  reason: collision with root package name */
    private final int f35519g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f35520h;

    public b(String str, q5.e eVar, q5.f fVar, q5.b bVar, t3.d dVar, String str2, Object obj) {
        this.f35513a = (String) y3.k.g(str);
        this.f35514b = eVar;
        this.f35515c = fVar;
        this.f35516d = bVar;
        this.f35517e = dVar;
        this.f35518f = str2;
        this.f35519g = g4.b.d(Integer.valueOf(str.hashCode()), Integer.valueOf(eVar != null ? eVar.hashCode() : 0), Integer.valueOf(fVar.hashCode()), bVar, dVar, str2);
        this.f35520h = obj;
        RealtimeSinceBootClock.get().now();
    }

    @Override // t3.d
    public String a() {
        return this.f35513a;
    }

    @Override // t3.d
    public boolean b(Uri uri) {
        return a().contains(uri.toString());
    }

    @Override // t3.d
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f35519g == bVar.f35519g && this.f35513a.equals(bVar.f35513a) && y3.j.a(this.f35514b, bVar.f35514b) && y3.j.a(this.f35515c, bVar.f35515c) && y3.j.a(this.f35516d, bVar.f35516d) && y3.j.a(this.f35517e, bVar.f35517e) && y3.j.a(this.f35518f, bVar.f35518f);
        }
        return false;
    }

    public int hashCode() {
        return this.f35519g;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.f35513a, this.f35514b, this.f35515c, this.f35516d, this.f35517e, this.f35518f, Integer.valueOf(this.f35519g));
    }
}
