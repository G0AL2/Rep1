package nc;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import lc.f;
import lc.g;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes3.dex */
public final class d implements mc.b<d> {

    /* renamed from: e */
    private static final lc.d<Object> f34730e = new lc.d() { // from class: nc.a
        @Override // lc.d
        public final void a(Object obj, Object obj2) {
            d.b(obj, (lc.e) obj2);
        }
    };

    /* renamed from: f */
    private static final f<String> f34731f = new f() { // from class: nc.c
        @Override // lc.f
        public final void a(Object obj, Object obj2) {
            d.c((String) obj, (g) obj2);
        }
    };

    /* renamed from: g */
    private static final f<Boolean> f34732g = new f() { // from class: nc.b
        @Override // lc.f
        public final void a(Object obj, Object obj2) {
            d.d((Boolean) obj, (g) obj2);
        }
    };

    /* renamed from: h */
    private static final b f34733h = new b(null);

    /* renamed from: a */
    private final Map<Class<?>, lc.d<?>> f34734a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, f<?>> f34735b = new HashMap();

    /* renamed from: c */
    private lc.d<Object> f34736c = f34730e;

    /* renamed from: d */
    private boolean f34737d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonDataEncoderBuilder.java */
    /* loaded from: classes3.dex */
    public class a implements lc.a {
        a() {
            d.this = r1;
        }

        @Override // lc.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f34734a, d.this.f34735b, d.this.f34736c, d.this.f34737d);
            eVar.i(obj, false);
            eVar.r();
        }

        @Override // lc.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JsonDataEncoderBuilder.java */
    /* loaded from: classes3.dex */
    public static final class b implements f<Date> {

        /* renamed from: a */
        private static final DateFormat f34739a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f34739a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // lc.f
        /* renamed from: b */
        public void a(Date date, g gVar) throws IOException {
            gVar.a(f34739a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f34731f);
        p(Boolean.class, f34732g);
        p(Date.class, f34733h);
    }

    public static /* synthetic */ void b(Object obj, lc.e eVar) {
        l(obj, eVar);
    }

    public static /* synthetic */ void c(String str, g gVar) {
        gVar.a(str);
    }

    public static /* synthetic */ void d(Boolean bool, g gVar) {
        n(bool, gVar);
    }

    public static /* synthetic */ void l(Object obj, lc.e eVar) throws IOException {
        throw new lc.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static /* synthetic */ void n(Boolean bool, g gVar) throws IOException {
        gVar.c(bool.booleanValue());
    }

    public lc.a i() {
        return new a();
    }

    public d j(mc.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f34737d = z10;
        return this;
    }

    @Override // mc.b
    /* renamed from: o */
    public <T> d a(Class<T> cls, lc.d<? super T> dVar) {
        this.f34734a.put(cls, dVar);
        this.f34735b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, f<? super T> fVar) {
        this.f34735b.put(cls, fVar);
        this.f34734a.remove(cls);
        return this;
    }
}
