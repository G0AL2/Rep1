package oc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import oc.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufDataEncoderContext.java */
/* loaded from: classes3.dex */
public final class f implements lc.e {

    /* renamed from: f */
    private static final Charset f35218f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final lc.c f35219g = lc.c.a("key").b(oc.a.b().c(1).a()).a();

    /* renamed from: h */
    private static final lc.c f35220h = lc.c.a(AppMeasurementSdk.ConditionalUserProperty.VALUE).b(oc.a.b().c(2).a()).a();

    /* renamed from: i */
    private static final lc.d<Map.Entry<Object, Object>> f35221i = new lc.d() { // from class: oc.e
        @Override // lc.d
        public final void a(Object obj, Object obj2) {
            f.a((Map.Entry) obj, (lc.e) obj2);
        }
    };

    /* renamed from: a */
    private OutputStream f35222a;

    /* renamed from: b */
    private final Map<Class<?>, lc.d<?>> f35223b;

    /* renamed from: c */
    private final Map<Class<?>, lc.f<?>> f35224c;

    /* renamed from: d */
    private final lc.d<Object> f35225d;

    /* renamed from: e */
    private final i f35226e = new i(this);

    /* compiled from: ProtobufDataEncoderContext.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35227a;

        static {
            int[] iArr = new int[d.a.values().length];
            f35227a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35227a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35227a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(OutputStream outputStream, Map<Class<?>, lc.d<?>> map, Map<Class<?>, lc.f<?>> map2, lc.d<Object> dVar) {
        this.f35222a = outputStream;
        this.f35223b = map;
        this.f35224c = map2;
        this.f35225d = dVar;
    }

    public static /* synthetic */ void a(Map.Entry entry, lc.e eVar) {
        v(entry, eVar);
    }

    private static ByteBuffer o(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long p(lc.d<T> dVar, T t10) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f35222a;
            this.f35222a = bVar;
            dVar.a(t10, this);
            this.f35222a = outputStream;
            long a10 = bVar.a();
            bVar.close();
            return a10;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private <T> f q(lc.d<T> dVar, lc.c cVar, T t10, boolean z10) throws IOException {
        long p10 = p(dVar, t10);
        if (z10 && p10 == 0) {
            return this;
        }
        w((u(cVar) << 3) | 2);
        x(p10);
        dVar.a(t10, this);
        return this;
    }

    private <T> f r(lc.f<T> fVar, lc.c cVar, T t10, boolean z10) throws IOException {
        this.f35226e.d(cVar, z10);
        fVar.a(t10, this.f35226e);
        return this;
    }

    private static d t(lc.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new lc.b("Field has no @Protobuf config");
    }

    private static int u(lc.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new lc.b("Field has no @Protobuf config");
    }

    public static /* synthetic */ void v(Map.Entry entry, lc.e eVar) throws IOException {
        eVar.b(f35219g, entry.getKey());
        eVar.b(f35220h, entry.getValue());
    }

    private void w(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f35222a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f35222a.write(i10 & 127);
    }

    private void x(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f35222a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f35222a.write(((int) j10) & 127);
    }

    @Override // lc.e
    public lc.e b(lc.c cVar, Object obj) throws IOException {
        return h(cVar, obj, true);
    }

    lc.e c(lc.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        w((u(cVar) << 3) | 1);
        this.f35222a.write(o(8).putDouble(d10).array());
        return this;
    }

    lc.e g(lc.c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        w((u(cVar) << 3) | 5);
        this.f35222a.write(o(4).putFloat(f10).array());
        return this;
    }

    public lc.e h(lc.c cVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            w((u(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f35218f);
            w(bytes.length);
            this.f35222a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                h(cVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                q(f35221i, cVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return c(cVar, ((Double) obj).doubleValue(), z10);
        } else {
            if (obj instanceof Float) {
                return g(cVar, ((Float) obj).floatValue(), z10);
            }
            if (obj instanceof Number) {
                return l(cVar, ((Number) obj).longValue(), z10);
            }
            if (obj instanceof Boolean) {
                return n(cVar, ((Boolean) obj).booleanValue(), z10);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return this;
                }
                w((u(cVar) << 3) | 2);
                w(bArr.length);
                this.f35222a.write(bArr);
                return this;
            }
            lc.d<?> dVar = this.f35223b.get(obj.getClass());
            if (dVar != null) {
                return q(dVar, cVar, obj, z10);
            }
            lc.f<?> fVar = this.f35224c.get(obj.getClass());
            if (fVar != null) {
                return r(fVar, cVar, obj, z10);
            }
            if (obj instanceof c) {
                return e(cVar, ((c) obj).f());
            }
            if (obj instanceof Enum) {
                return e(cVar, ((Enum) obj).ordinal());
            }
            return q(this.f35225d, cVar, obj, z10);
        }
    }

    @Override // lc.e
    /* renamed from: i */
    public f e(lc.c cVar, int i10) throws IOException {
        return j(cVar, i10, true);
    }

    f j(lc.c cVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        d t10 = t(cVar);
        int i11 = a.f35227a[t10.intEncoding().ordinal()];
        if (i11 == 1) {
            w(t10.tag() << 3);
            w(i10);
        } else if (i11 == 2) {
            w(t10.tag() << 3);
            w((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            w((t10.tag() << 3) | 5);
            this.f35222a.write(o(4).putInt(i10).array());
        }
        return this;
    }

    @Override // lc.e
    /* renamed from: k */
    public f d(lc.c cVar, long j10) throws IOException {
        return l(cVar, j10, true);
    }

    f l(lc.c cVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        d t10 = t(cVar);
        int i10 = a.f35227a[t10.intEncoding().ordinal()];
        if (i10 == 1) {
            w(t10.tag() << 3);
            x(j10);
        } else if (i10 == 2) {
            w(t10.tag() << 3);
            x((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            w((t10.tag() << 3) | 1);
            this.f35222a.write(o(8).putLong(j10).array());
        }
        return this;
    }

    @Override // lc.e
    /* renamed from: m */
    public f f(lc.c cVar, boolean z10) throws IOException {
        return n(cVar, z10, true);
    }

    public f n(lc.c cVar, boolean z10, boolean z11) throws IOException {
        return j(cVar, z10 ? 1 : 0, z11);
    }

    public f s(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        lc.d<?> dVar = this.f35223b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new lc.b("No encoder for " + obj.getClass());
    }
}
