package com.bytedance.sdk.component.a;

import com.bytedance.sdk.component.a.d;
import com.bytedance.sdk.component.a.t;
import com.bytedance.sdk.component.a.v;
import com.bytedance.sdk.component.a.w;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* compiled from: CallHandler.java */
/* loaded from: classes.dex */
class g implements w.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f9224a;

    /* renamed from: b  reason: collision with root package name */
    private final u f9225b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, b> f9226c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d.b> f9227d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List<q> f9228e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Set<d> f9229f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final m f9230g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f9231h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f9232i;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.sdk.component.a.a f9233j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallHandler.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f9239a;

        /* renamed from: b  reason: collision with root package name */
        String f9240b;

        private a(boolean z10, String str) {
            this.f9239a = z10;
            this.f9240b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(j jVar, com.bytedance.sdk.component.a.a aVar, v vVar) {
        this.f9233j = aVar;
        this.f9224a = jVar.f9246d;
        u uVar = new u(vVar, jVar.f9254l, jVar.f9255m);
        this.f9225b = uVar;
        uVar.a(this);
        uVar.a(jVar.f9258p);
        this.f9230g = jVar.f9251i;
        this.f9231h = jVar.f9250h;
        this.f9232i = jVar.f9257o;
    }

    private x b(String str, b bVar) {
        if (this.f9232i) {
            return x.PRIVATE;
        }
        return this.f9225b.a(this.f9231h, str, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(q qVar, f fVar) throws Exception {
        b bVar = this.f9226c.get(qVar.f9263d);
        if (bVar != null) {
            try {
                x b10 = b(fVar.f9221b, bVar);
                fVar.f9223d = b10;
                if (b10 == null) {
                    m mVar = this.f9230g;
                    if (mVar != null) {
                        mVar.a(fVar.f9221b, qVar.f9263d, 1);
                    }
                    i.a("Permission denied, call: " + qVar);
                    throw new s(-1);
                } else if (bVar instanceof e) {
                    i.a("Processing stateless call: " + qVar);
                    return a(qVar, (e) bVar, fVar);
                } else if (bVar instanceof c) {
                    i.a("Processing raw call: " + qVar);
                    return a(qVar, (c) bVar, b10);
                }
            } catch (v.a e10) {
                i.a("No remote permission config fetched, call pending: " + qVar, e10);
                this.f9228e.add(qVar);
                return new a(false, y.a());
            }
        }
        d.b bVar2 = this.f9227d.get(qVar.f9263d);
        if (bVar2 != null) {
            d a10 = bVar2.a();
            a10.a(qVar.f9263d);
            x b11 = b(fVar.f9221b, a10);
            fVar.f9223d = b11;
            if (b11 != null) {
                i.a("Processing stateful call: " + qVar);
                return a(qVar, a10, fVar);
            }
            i.a("Permission denied, call: " + qVar);
            a10.e();
            throw new s(-1);
        }
        m mVar2 = this.f9230g;
        if (mVar2 != null) {
            mVar2.a(fVar.f9221b, qVar.f9263d, 2);
        }
        i.b("Received call: " + qVar + ", but not registered.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, e<?, ?> eVar) {
        eVar.a(str);
        this.f9226c.put(str, eVar);
        i.a("JsBridge stateless method registered: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, d.b bVar) {
        this.f9227d.put(str, bVar);
        i.a("JsBridge stateful method registered: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        for (d dVar : this.f9229f) {
            dVar.f();
        }
        this.f9229f.clear();
        this.f9226c.clear();
        this.f9227d.clear();
        this.f9225b.b(this);
    }

    private a a(q qVar, e eVar, f fVar) throws Exception {
        return new a(true, y.a(this.f9224a.a((h) eVar.a(a(qVar.f9264e, (b) eVar), fVar))));
    }

    private a a(final q qVar, final d dVar, f fVar) throws Exception {
        this.f9229f.add(dVar);
        dVar.a(a(qVar.f9264e, dVar), fVar, new d.a() { // from class: com.bytedance.sdk.component.a.g.1
            @Override // com.bytedance.sdk.component.a.d.a
            public void a(Object obj) {
                if (g.this.f9233j == null) {
                    return;
                }
                g.this.f9233j.b(y.a(g.this.f9224a.a((h) obj)), qVar);
                g.this.f9229f.remove(dVar);
            }

            @Override // com.bytedance.sdk.component.a.d.a
            public void a(Throwable th) {
                if (g.this.f9233j == null) {
                    return;
                }
                g.this.f9233j.b(y.a(th), qVar);
                g.this.f9229f.remove(dVar);
            }
        });
        return new a(false, y.a());
    }

    private a a(final q qVar, c cVar, x xVar) throws Exception {
        cVar.a(qVar, new t(qVar.f9263d, xVar, new t.a() { // from class: com.bytedance.sdk.component.a.g.2
        }));
        return new a(false, y.a());
    }

    private Object a(String str, b bVar) throws JSONException {
        return this.f9224a.a(str, a(bVar)[0]);
    }

    private static Type[] a(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
