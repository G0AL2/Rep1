package u3;

import android.content.Context;
import java.io.File;
import y3.k;
import y3.n;

/* compiled from: DiskCacheConfig.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f37367a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37368b;

    /* renamed from: c  reason: collision with root package name */
    private final n<File> f37369c;

    /* renamed from: d  reason: collision with root package name */
    private final long f37370d;

    /* renamed from: e  reason: collision with root package name */
    private final long f37371e;

    /* renamed from: f  reason: collision with root package name */
    private final long f37372f;

    /* renamed from: g  reason: collision with root package name */
    private final h f37373g;

    /* renamed from: h  reason: collision with root package name */
    private final t3.a f37374h;

    /* renamed from: i  reason: collision with root package name */
    private final t3.c f37375i;

    /* renamed from: j  reason: collision with root package name */
    private final v3.b f37376j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f37377k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f37378l;

    /* compiled from: DiskCacheConfig.java */
    /* loaded from: classes.dex */
    class a implements n<File> {
        a() {
        }

        @Override // y3.n
        /* renamed from: a */
        public File get() {
            k.g(c.this.f37377k);
            return c.this.f37377k.getApplicationContext().getCacheDir();
        }
    }

    /* compiled from: DiskCacheConfig.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f37380a;

        /* renamed from: b  reason: collision with root package name */
        private String f37381b;

        /* renamed from: c  reason: collision with root package name */
        private n<File> f37382c;

        /* renamed from: d  reason: collision with root package name */
        private long f37383d;

        /* renamed from: e  reason: collision with root package name */
        private long f37384e;

        /* renamed from: f  reason: collision with root package name */
        private long f37385f;

        /* renamed from: g  reason: collision with root package name */
        private h f37386g;

        /* renamed from: h  reason: collision with root package name */
        private t3.a f37387h;

        /* renamed from: i  reason: collision with root package name */
        private t3.c f37388i;

        /* renamed from: j  reason: collision with root package name */
        private v3.b f37389j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f37390k;

        /* renamed from: l  reason: collision with root package name */
        private final Context f37391l;

        /* synthetic */ b(Context context, a aVar) {
            this(context);
        }

        public c n() {
            return new c(this);
        }

        private b(Context context) {
            this.f37380a = 1;
            this.f37381b = "image_cache";
            this.f37383d = 41943040L;
            this.f37384e = 10485760L;
            this.f37385f = 2097152L;
            this.f37386g = new u3.b();
            this.f37391l = context;
        }
    }

    protected c(b bVar) {
        t3.a aVar;
        t3.c cVar;
        v3.b bVar2;
        Context context = bVar.f37391l;
        this.f37377k = context;
        k.j((bVar.f37382c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f37382c == null && context != null) {
            bVar.f37382c = new a();
        }
        this.f37367a = bVar.f37380a;
        this.f37368b = (String) k.g(bVar.f37381b);
        this.f37369c = (n) k.g(bVar.f37382c);
        this.f37370d = bVar.f37383d;
        this.f37371e = bVar.f37384e;
        this.f37372f = bVar.f37385f;
        this.f37373g = (h) k.g(bVar.f37386g);
        if (bVar.f37387h != null) {
            aVar = bVar.f37387h;
        } else {
            aVar = t3.g.b();
        }
        this.f37374h = aVar;
        if (bVar.f37388i != null) {
            cVar = bVar.f37388i;
        } else {
            cVar = t3.h.i();
        }
        this.f37375i = cVar;
        if (bVar.f37389j != null) {
            bVar2 = bVar.f37389j;
        } else {
            bVar2 = v3.c.b();
        }
        this.f37376j = bVar2;
        this.f37378l = bVar.f37390k;
    }

    public static b m(Context context) {
        return new b(context, null);
    }

    public String b() {
        return this.f37368b;
    }

    public n<File> c() {
        return this.f37369c;
    }

    public t3.a d() {
        return this.f37374h;
    }

    public t3.c e() {
        return this.f37375i;
    }

    public long f() {
        return this.f37370d;
    }

    public v3.b g() {
        return this.f37376j;
    }

    public h h() {
        return this.f37373g;
    }

    public boolean i() {
        return this.f37378l;
    }

    public long j() {
        return this.f37371e;
    }

    public long k() {
        return this.f37372f;
    }

    public int l() {
        return this.f37367a;
    }
}
