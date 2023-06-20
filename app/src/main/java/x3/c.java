package x3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import y3.k;

/* compiled from: FileUtils.java */
/* loaded from: classes.dex */
public class c {

    /* compiled from: FileUtils.java */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* compiled from: FileUtils.java */
    /* loaded from: classes.dex */
    public static class b extends IOException {
        public b(String str) {
            super(str);
        }
    }

    /* compiled from: FileUtils.java */
    /* renamed from: x3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0536c extends FileNotFoundException {
        public C0536c(String str) {
            super(str);
        }
    }

    /* compiled from: FileUtils.java */
    /* loaded from: classes.dex */
    public static class d extends IOException {
        public d(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static void a(File file) throws a {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new a(file.getAbsolutePath(), new b(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new a(file.getAbsolutePath());
        }
    }

    public static void b(File file, File file2) throws d {
        k.g(file);
        k.g(file2);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable th = null;
        if (!file2.exists()) {
            if (file.getParentFile().exists()) {
                if (!file.exists()) {
                    th = new FileNotFoundException(file.getAbsolutePath());
                }
            } else {
                th = new C0536c(file.getAbsolutePath());
            }
        } else {
            th = new b(file2.getAbsolutePath());
        }
        throw new d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), th);
    }
}
