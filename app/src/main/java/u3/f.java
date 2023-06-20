package u3;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import t3.a;
import u3.d;
import x3.c;
import y3.k;
import y3.n;

/* compiled from: DynamicDefaultDiskStorage.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f37418f = f.class;

    /* renamed from: a  reason: collision with root package name */
    private final int f37419a;

    /* renamed from: b  reason: collision with root package name */
    private final n<File> f37420b;

    /* renamed from: c  reason: collision with root package name */
    private final String f37421c;

    /* renamed from: d  reason: collision with root package name */
    private final t3.a f37422d;

    /* renamed from: e  reason: collision with root package name */
    volatile a f37423e = new a(null, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DynamicDefaultDiskStorage.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f37424a;

        /* renamed from: b  reason: collision with root package name */
        public final File f37425b;

        a(File file, d dVar) {
            this.f37424a = dVar;
            this.f37425b = file;
        }
    }

    public f(int i10, n<File> nVar, String str, t3.a aVar) {
        this.f37419a = i10;
        this.f37422d = aVar;
        this.f37420b = nVar;
        this.f37421c = str;
    }

    private void j() throws IOException {
        File file = new File(this.f37420b.get(), this.f37421c);
        i(file);
        this.f37423e = new a(file, new u3.a(file, this.f37419a, this.f37422d));
    }

    private boolean m() {
        File file;
        a aVar = this.f37423e;
        return aVar.f37424a == null || (file = aVar.f37425b) == null || !file.exists();
    }

    @Override // u3.d
    public void a() {
        try {
            l().a();
        } catch (IOException e10) {
            z3.a.g(f37418f, "purgeUnexpectedResources", e10);
        }
    }

    @Override // u3.d
    public boolean b(String str, Object obj) throws IOException {
        return l().b(str, obj);
    }

    @Override // u3.d
    public boolean c() {
        try {
            return l().c();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // u3.d
    public void clearAll() throws IOException {
        l().clearAll();
    }

    @Override // u3.d
    public d.b d(String str, Object obj) throws IOException {
        return l().d(str, obj);
    }

    @Override // u3.d
    public boolean e(String str, Object obj) throws IOException {
        return l().e(str, obj);
    }

    @Override // u3.d
    public com.facebook.binaryresource.a f(String str, Object obj) throws IOException {
        return l().f(str, obj);
    }

    @Override // u3.d
    public Collection<d.a> g() throws IOException {
        return l().g();
    }

    @Override // u3.d
    public long h(d.a aVar) throws IOException {
        return l().h(aVar);
    }

    void i(File file) throws IOException {
        try {
            x3.c.a(file);
            z3.a.a(f37418f, "Created cache directory %s", file.getAbsolutePath());
        } catch (c.a e10) {
            this.f37422d.a(a.EnumC0503a.WRITE_CREATE_DIR, f37418f, "createRootDirectoryIfNecessary", e10);
            throw e10;
        }
    }

    void k() {
        if (this.f37423e.f37424a == null || this.f37423e.f37425b == null) {
            return;
        }
        x3.a.b(this.f37423e.f37425b);
    }

    synchronized d l() throws IOException {
        if (m()) {
            k();
            j();
        }
        return (d) k.g(this.f37423e.f37424a);
    }

    @Override // u3.d
    public long remove(String str) throws IOException {
        return l().remove(str);
    }
}
