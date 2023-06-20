package nc;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import lc.f;
import lc.g;

/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes3.dex */
final class e implements lc.e, g {

    /* renamed from: a  reason: collision with root package name */
    private e f34740a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f34741b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f34742c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, lc.d<?>> f34743d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f34744e;

    /* renamed from: f  reason: collision with root package name */
    private final lc.d<Object> f34745f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f34746g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Writer writer, Map<Class<?>, lc.d<?>> map, Map<Class<?>, f<?>> map2, lc.d<Object> dVar, boolean z10) {
        this.f34742c = new JsonWriter(writer);
        this.f34743d = map;
        this.f34744e = map2;
        this.f34745f = dVar;
        this.f34746g = z10;
    }

    private boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e t(String str, Object obj) throws IOException, lc.b {
        v();
        this.f34742c.name(str);
        if (obj == null) {
            this.f34742c.nullValue();
            return this;
        }
        return i(obj, false);
    }

    private e u(String str, Object obj) throws IOException, lc.b {
        if (obj == null) {
            return this;
        }
        v();
        this.f34742c.name(str);
        return i(obj, false);
    }

    private void v() throws IOException {
        if (this.f34741b) {
            e eVar = this.f34740a;
            if (eVar != null) {
                eVar.v();
                this.f34740a.f34741b = false;
                this.f34740a = null;
                this.f34742c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // lc.e
    public lc.e b(lc.c cVar, Object obj) throws IOException {
        return m(cVar.b(), obj);
    }

    @Override // lc.e
    public lc.e d(lc.c cVar, long j10) throws IOException {
        return l(cVar.b(), j10);
    }

    @Override // lc.e
    public lc.e e(lc.c cVar, int i10) throws IOException {
        return k(cVar.b(), i10);
    }

    @Override // lc.e
    public lc.e f(lc.c cVar, boolean z10) throws IOException {
        return n(cVar.b(), z10);
    }

    public e g(int i10) throws IOException {
        v();
        this.f34742c.value(i10);
        return this;
    }

    public e h(long j10) throws IOException {
        v();
        this.f34742c.value(j10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e i(Object obj, boolean z10) throws IOException {
        int[] iArr;
        int i10 = 0;
        if (z10 && q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new lc.b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f34742c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f34742c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return p((byte[]) obj);
            }
            this.f34742c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    this.f34742c.value(iArr[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    h(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f34742c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f34742c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    i(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    i(obj2, false);
                }
            }
            this.f34742c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f34742c.beginArray();
            for (Object obj3 : (Collection) obj) {
                i(obj3, false);
            }
            this.f34742c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f34742c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new lc.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                }
            }
            this.f34742c.endObject();
            return this;
        } else {
            lc.d<?> dVar = this.f34743d.get(obj.getClass());
            if (dVar != null) {
                return s(dVar, obj, z10);
            }
            f<?> fVar = this.f34744e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                a(((Enum) obj).name());
                return this;
            } else {
                return s(this.f34745f, obj, z10);
            }
        }
    }

    @Override // lc.g
    /* renamed from: j */
    public e a(String str) throws IOException {
        v();
        this.f34742c.value(str);
        return this;
    }

    public e k(String str, int i10) throws IOException {
        v();
        this.f34742c.name(str);
        return g(i10);
    }

    public e l(String str, long j10) throws IOException {
        v();
        this.f34742c.name(str);
        return h(j10);
    }

    public e m(String str, Object obj) throws IOException {
        if (this.f34746g) {
            return u(str, obj);
        }
        return t(str, obj);
    }

    public e n(String str, boolean z10) throws IOException {
        v();
        this.f34742c.name(str);
        return c(z10);
    }

    @Override // lc.g
    /* renamed from: o */
    public e c(boolean z10) throws IOException {
        v();
        this.f34742c.value(z10);
        return this;
    }

    public e p(byte[] bArr) throws IOException {
        v();
        if (bArr == null) {
            this.f34742c.nullValue();
        } else {
            this.f34742c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() throws IOException {
        v();
        this.f34742c.flush();
    }

    e s(lc.d<Object> dVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f34742c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f34742c.endObject();
        }
        return this;
    }
}
