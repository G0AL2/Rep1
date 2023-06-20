package oc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import oc.h;

/* compiled from: ProtobufEncoder.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a */
    private final Map<Class<?>, lc.d<?>> f35229a;

    /* renamed from: b */
    private final Map<Class<?>, lc.f<?>> f35230b;

    /* renamed from: c */
    private final lc.d<Object> f35231c;

    /* compiled from: ProtobufEncoder.java */
    /* loaded from: classes3.dex */
    public static final class a implements mc.b<a> {

        /* renamed from: d */
        private static final lc.d<Object> f35232d = new lc.d() { // from class: oc.g
            @Override // lc.d
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (lc.e) obj2);
            }
        };

        /* renamed from: a */
        private final Map<Class<?>, lc.d<?>> f35233a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, lc.f<?>> f35234b = new HashMap();

        /* renamed from: c */
        private lc.d<Object> f35235c = f35232d;

        public static /* synthetic */ void b(Object obj, lc.e eVar) {
            e(obj, eVar);
        }

        public static /* synthetic */ void e(Object obj, lc.e eVar) throws IOException {
            throw new lc.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f35233a), new HashMap(this.f35234b), this.f35235c);
        }

        public a d(mc.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // mc.b
        /* renamed from: f */
        public <U> a a(Class<U> cls, lc.d<? super U> dVar) {
            this.f35233a.put(cls, dVar);
            this.f35234b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, lc.d<?>> map, Map<Class<?>, lc.f<?>> map2, lc.d<Object> dVar) {
        this.f35229a = map;
        this.f35230b = map2;
        this.f35231c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) throws IOException {
        new f(outputStream, this.f35229a, this.f35230b, this.f35231c).s(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
