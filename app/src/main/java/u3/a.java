package u3;

import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import t3.a;
import u3.d;
import x3.c;
import y3.k;

/* compiled from: DefaultDiskStorage.java */
/* loaded from: classes.dex */
public class a implements u3.d {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f37347f = a.class;

    /* renamed from: g  reason: collision with root package name */
    static final long f37348g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final File f37349a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f37350b;

    /* renamed from: c  reason: collision with root package name */
    private final File f37351c;

    /* renamed from: d  reason: collision with root package name */
    private final t3.a f37352d;

    /* renamed from: e  reason: collision with root package name */
    private final f4.a f37353e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    public class b implements x3.b {

        /* renamed from: a  reason: collision with root package name */
        private final List<d.a> f37354a;

        private b() {
            this.f37354a = new ArrayList();
        }

        @Override // x3.b
        public void a(File file) {
        }

        @Override // x3.b
        public void b(File file) {
            d u10 = a.this.u(file);
            if (u10 == null || u10.f37360a != ".cnt") {
                return;
            }
            this.f37354a.add(new c(u10.f37361b, file));
        }

        @Override // x3.b
        public void c(File file) {
        }

        public List<d.a> d() {
            return Collections.unmodifiableList(this.f37354a);
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    static class c implements d.a {

        /* renamed from: a  reason: collision with root package name */
        private final String f37356a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.binaryresource.b f37357b;

        /* renamed from: c  reason: collision with root package name */
        private long f37358c;

        /* renamed from: d  reason: collision with root package name */
        private long f37359d;

        @Override // u3.d.a
        public long a() {
            if (this.f37359d < 0) {
                this.f37359d = this.f37357b.d().lastModified();
            }
            return this.f37359d;
        }

        public com.facebook.binaryresource.b b() {
            return this.f37357b;
        }

        @Override // u3.d.a
        public String getId() {
            return this.f37356a;
        }

        @Override // u3.d.a
        public long getSize() {
            if (this.f37358c < 0) {
                this.f37358c = this.f37357b.size();
            }
            return this.f37358c;
        }

        private c(String str, File file) {
            k.g(file);
            this.f37356a = (String) k.g(str);
            this.f37357b = com.facebook.binaryresource.b.b(file);
            this.f37358c = -1L;
            this.f37359d = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f37360a;

        /* renamed from: b  reason: collision with root package name */
        public final String f37361b;

        public static d b(File file) {
            String s10;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf > 0 && (s10 = a.s(name.substring(lastIndexOf))) != null) {
                String substring = name.substring(0, lastIndexOf);
                if (s10.equals(".tmp")) {
                    int lastIndexOf2 = substring.lastIndexOf(46);
                    if (lastIndexOf2 <= 0) {
                        return null;
                    }
                    substring = substring.substring(0, lastIndexOf2);
                }
                return new d(s10, substring);
            }
            return null;
        }

        public File a(File file) throws IOException {
            return File.createTempFile(this.f37361b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f37361b + this.f37360a;
        }

        public String toString() {
            return this.f37360a + "(" + this.f37361b + ")";
        }

        private d(String str, String str2) {
            this.f37360a = str;
            this.f37361b = str2;
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    private static class e extends IOException {
        public e(long j10, long j11) {
            super("File was not written completely. Expected: " + j10 + ", found: " + j11);
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    class f implements d.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f37362a;

        /* renamed from: b  reason: collision with root package name */
        final File f37363b;

        public f(String str, File file) {
            this.f37362a = str;
            this.f37363b = file;
        }

        @Override // u3.d.b
        public com.facebook.binaryresource.a a(Object obj) throws IOException {
            return c(obj, a.this.f37353e.now());
        }

        @Override // u3.d.b
        public void b(t3.j jVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f37363b);
                try {
                    y3.c cVar = new y3.c(fileOutputStream);
                    jVar.a(cVar);
                    cVar.flush();
                    long a10 = cVar.a();
                    fileOutputStream.close();
                    if (this.f37363b.length() != a10) {
                        throw new e(a10, this.f37363b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                a.this.f37352d.a(a.EnumC0503a.WRITE_UPDATE_FILE_NOT_FOUND, a.f37347f, "updateResource", e10);
                throw e10;
            }
        }

        public com.facebook.binaryresource.a c(Object obj, long j10) throws IOException {
            a.EnumC0503a enumC0503a;
            File q10 = a.this.q(this.f37362a);
            try {
                x3.c.b(this.f37363b, q10);
                if (q10.exists()) {
                    q10.setLastModified(j10);
                }
                return com.facebook.binaryresource.b.b(q10);
            } catch (c.d e10) {
                Throwable cause = e10.getCause();
                if (cause != null) {
                    if (!(cause instanceof c.C0536c)) {
                        if (cause instanceof FileNotFoundException) {
                            enumC0503a = a.EnumC0503a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                        } else {
                            enumC0503a = a.EnumC0503a.WRITE_RENAME_FILE_OTHER;
                        }
                    } else {
                        enumC0503a = a.EnumC0503a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                    }
                } else {
                    enumC0503a = a.EnumC0503a.WRITE_RENAME_FILE_OTHER;
                }
                a.this.f37352d.a(enumC0503a, a.f37347f, "commit", e10);
                throw e10;
            }
        }

        @Override // u3.d.b
        public boolean i() {
            return !this.f37363b.exists() || this.f37363b.delete();
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    /* loaded from: classes.dex */
    private class g implements x3.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f37365a;

        private g() {
        }

        private boolean d(File file) {
            d u10 = a.this.u(file);
            if (u10 == null) {
                return false;
            }
            String str = u10.f37360a;
            if (str == ".tmp") {
                return e(file);
            }
            k.i(str == ".cnt");
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > a.this.f37353e.now() - a.f37348g;
        }

        @Override // x3.b
        public void a(File file) {
            if (!a.this.f37349a.equals(file) && !this.f37365a) {
                file.delete();
            }
            if (this.f37365a && file.equals(a.this.f37351c)) {
                this.f37365a = false;
            }
        }

        @Override // x3.b
        public void b(File file) {
            if (this.f37365a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // x3.b
        public void c(File file) {
            if (this.f37365a || !file.equals(a.this.f37351c)) {
                return;
            }
            this.f37365a = true;
        }
    }

    public a(File file, int i10, t3.a aVar) {
        k.g(file);
        this.f37349a = file;
        this.f37350b = y(file, aVar);
        this.f37351c = new File(file, x(i10));
        this.f37352d = aVar;
        B();
        this.f37353e = f4.c.a();
    }

    private boolean A(String str, boolean z10) {
        File q10 = q(str);
        boolean exists = q10.exists();
        if (z10 && exists) {
            q10.setLastModified(this.f37353e.now());
        }
        return exists;
    }

    private void B() {
        boolean z10 = true;
        if (this.f37349a.exists()) {
            if (this.f37351c.exists()) {
                z10 = false;
            } else {
                x3.a.b(this.f37349a);
            }
        }
        if (z10) {
            try {
                x3.c.a(this.f37351c);
            } catch (c.a unused) {
                t3.a aVar = this.f37352d;
                a.EnumC0503a enumC0503a = a.EnumC0503a.WRITE_CREATE_DIR;
                Class<?> cls = f37347f;
                aVar.a(enumC0503a, cls, "version directory could not be created: " + this.f37351c, null);
            }
        }
    }

    private long p(File file) {
        if (file.exists()) {
            long length = file.length();
            if (file.delete()) {
                return length;
            }
            return -1L;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String t(String str) {
        d dVar = new d(".cnt", str);
        return dVar.c(w(dVar.f37361b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d u(File file) {
        d b10 = d.b(file);
        if (b10 != null && v(b10.f37361b).equals(file.getParentFile())) {
            return b10;
        }
        return null;
    }

    private File v(String str) {
        return new File(w(str));
    }

    private String w(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.f37351c + File.separator + valueOf;
    }

    static String x(int i10) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i10));
    }

    private static boolean y(File file, t3.a aVar) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            try {
                try {
                    return file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException e10) {
                    e = e10;
                    a.EnumC0503a enumC0503a = a.EnumC0503a.OTHER;
                    Class<?> cls = f37347f;
                    aVar.a(enumC0503a, cls, "failed to read folder to check if external: " + ((String) null), e);
                    return false;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Exception e12) {
            aVar.a(a.EnumC0503a.OTHER, f37347f, "failed to get the external storage directory!", e12);
            return false;
        }
    }

    private void z(File file, String str) throws IOException {
        try {
            x3.c.a(file);
        } catch (c.a e10) {
            this.f37352d.a(a.EnumC0503a.WRITE_CREATE_DIR, f37347f, str, e10);
            throw e10;
        }
    }

    @Override // u3.d
    public void a() {
        x3.a.c(this.f37349a, new g());
    }

    @Override // u3.d
    public boolean b(String str, Object obj) {
        return A(str, true);
    }

    @Override // u3.d
    public boolean c() {
        return this.f37350b;
    }

    @Override // u3.d
    public void clearAll() {
        x3.a.a(this.f37349a);
    }

    @Override // u3.d
    public d.b d(String str, Object obj) throws IOException {
        d dVar = new d(".tmp", str);
        File v10 = v(dVar.f37361b);
        if (!v10.exists()) {
            z(v10, "insert");
        }
        try {
            return new f(str, dVar.a(v10));
        } catch (IOException e10) {
            this.f37352d.a(a.EnumC0503a.WRITE_CREATE_TEMPFILE, f37347f, "insert", e10);
            throw e10;
        }
    }

    @Override // u3.d
    public boolean e(String str, Object obj) {
        return A(str, false);
    }

    @Override // u3.d
    public com.facebook.binaryresource.a f(String str, Object obj) {
        File q10 = q(str);
        if (q10.exists()) {
            q10.setLastModified(this.f37353e.now());
            return com.facebook.binaryresource.b.c(q10);
        }
        return null;
    }

    @Override // u3.d
    public long h(d.a aVar) {
        return p(((c) aVar).b().d());
    }

    File q(String str) {
        return new File(t(str));
    }

    @Override // u3.d
    /* renamed from: r */
    public List<d.a> g() throws IOException {
        b bVar = new b();
        x3.a.c(this.f37351c, bVar);
        return bVar.d();
    }

    @Override // u3.d
    public long remove(String str) {
        return p(q(str));
    }
}
