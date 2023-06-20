package d3;

import com.bytedance.sdk.component.b.a.m;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import y2.i;

/* compiled from: VolleyResponseWrapper.java */
/* loaded from: classes.dex */
public class f extends a {

    /* renamed from: c  reason: collision with root package name */
    private m f29055c;

    public f(m mVar, e eVar) {
        com.bytedance.sdk.component.b.a.e g10;
        this.f29055c = mVar;
        this.f29049a = new ArrayList();
        if (mVar != null && (g10 = mVar.g()) != null) {
            for (int i10 = 0; i10 < g10.a(); i10++) {
                this.f29049a.add(new i.b(g10.a(i10), g10.b(i10)));
            }
        }
        this.f29050b = eVar;
    }

    @Override // d3.a
    public int a() {
        return this.f29055c.c();
    }

    @Override // d3.a
    public String c(String str, String str2) {
        return d(str) != null ? d(str).f39241b : str2;
    }

    @Override // d3.a
    public boolean e() {
        return this.f29055c.c() >= 200 && this.f29055c.c() < 300;
    }

    @Override // d3.a
    public List<i.b> f() {
        return this.f29049a;
    }

    @Override // d3.a
    public InputStream g() {
        return this.f29055c.f().c();
    }

    @Override // d3.a
    public String h() {
        m mVar = this.f29055c;
        return (mVar == null || mVar.h() == null) ? "http/1.1" : this.f29055c.h().toString();
    }

    @Override // d3.a
    public String i() {
        return b(this.f29055c.c());
    }
}
