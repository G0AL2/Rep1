package hf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import mf.c0;
import mf.e0;
import mf.r;
import mf.s;
import qe.g;
import qe.k;

/* compiled from: FileSystem.kt */
/* loaded from: classes3.dex */
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31417a;

    /* compiled from: FileSystem.kt */
    /* renamed from: hf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0400a {

        /* compiled from: FileSystem.kt */
        /* renamed from: hf.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0401a implements a {
            @Override // hf.a
            public void a(File file) throws IOException {
                k.f(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        k.e(file2, "file");
                        if (file2.isDirectory()) {
                            a(file2);
                        }
                        if (!file2.delete()) {
                            throw new IOException("failed to delete " + file2);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + file);
            }

            @Override // hf.a
            public boolean b(File file) {
                k.f(file, "file");
                return file.exists();
            }

            @Override // hf.a
            public c0 c(File file) throws FileNotFoundException {
                k.f(file, "file");
                try {
                    return r.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return r.a(file);
                }
            }

            @Override // hf.a
            public long d(File file) {
                k.f(file, "file");
                return file.length();
            }

            @Override // hf.a
            public e0 e(File file) throws FileNotFoundException {
                k.f(file, "file");
                return r.j(file);
            }

            @Override // hf.a
            public c0 f(File file) throws FileNotFoundException {
                c0 g10;
                c0 g11;
                k.f(file, "file");
                try {
                    g11 = s.g(file, false, 1, null);
                    return g11;
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    g10 = s.g(file, false, 1, null);
                    return g10;
                }
            }

            @Override // hf.a
            public void g(File file, File file2) throws IOException {
                k.f(file, "from");
                k.f(file2, "to");
                h(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // hf.a
            public void h(File file) throws IOException {
                k.f(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0400a() {
        }

        public /* synthetic */ C0400a(g gVar) {
            this();
        }
    }

    static {
        new C0400a(null);
        f31417a = new C0400a.C0401a();
    }

    void a(File file) throws IOException;

    boolean b(File file);

    c0 c(File file) throws FileNotFoundException;

    long d(File file);

    e0 e(File file) throws FileNotFoundException;

    c0 f(File file) throws FileNotFoundException;

    void g(File file, File file2) throws IOException;

    void h(File file) throws IOException;
}
