package dc;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FileStore.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final File f29349a;

    /* renamed from: b  reason: collision with root package name */
    private final File f29350b;

    /* renamed from: c  reason: collision with root package name */
    private final File f29351c;

    /* renamed from: d  reason: collision with root package name */
    private final File f29352d;

    /* renamed from: e  reason: collision with root package name */
    private final File f29353e;

    public f(Context context) {
        File p10 = p(new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1"));
        this.f29349a = p10;
        this.f29350b = p(new File(p10, "open-sessions"));
        this.f29351c = p(new File(p10, "reports"));
        this.f29352d = p(new File(p10, "priority-reports"));
        this.f29353e = p(new File(p10, "native-reports"));
    }

    private File m(String str) {
        return q(new File(this.f29350b, str));
    }

    private static synchronized File p(File file) {
        synchronized (f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                vb.f f10 = vb.f.f();
                f10.b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (file.mkdirs()) {
                return file;
            }
            throw new IllegalStateException("Could not create Crashlytics-specific directory: " + file);
        }
    }

    private static File q(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                r(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> s(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public void a() {
        File[] fileArr = {new File(this.f29349a.getParent(), ".com.google.firebase.crashlytics"), new File(this.f29349a.getParent(), ".com.google.firebase.crashlytics-ndk")};
        for (int i10 = 0; i10 < 2; i10++) {
            File file = fileArr[i10];
            if (file.exists() && r(file)) {
                vb.f f10 = vb.f.f();
                f10.b("Deleted legacy Crashlytics files from " + file.getPath());
            }
        }
    }

    public boolean b(String str) {
        return r(new File(this.f29350b, str));
    }

    public List<String> c() {
        return s(this.f29350b.list());
    }

    public File d(String str) {
        return new File(this.f29349a, str);
    }

    public List<File> e(FilenameFilter filenameFilter) {
        return s(this.f29349a.listFiles(filenameFilter));
    }

    public File f(String str) {
        return new File(this.f29353e, str);
    }

    public List<File> g() {
        return s(this.f29353e.listFiles());
    }

    public File h(String str) {
        return q(new File(m(str), "native"));
    }

    public File i(String str) {
        return new File(this.f29352d, str);
    }

    public List<File> j() {
        return s(this.f29352d.listFiles());
    }

    public File k(String str) {
        return new File(this.f29351c, str);
    }

    public List<File> l() {
        return s(this.f29351c.listFiles());
    }

    public File n(String str, String str2) {
        return new File(m(str), str2);
    }

    public List<File> o(String str, FilenameFilter filenameFilter) {
        return s(m(str).listFiles(filenameFilter));
    }
}
