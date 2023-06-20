package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    private static final cb.e f22764c = new cb.e("AssetPackStorage");

    /* renamed from: a  reason: collision with root package name */
    private final Context f22765a;

    /* renamed from: b  reason: collision with root package name */
    private final e2 f22766b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14L);
        timeUnit.toMillis(28L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(Context context, e2 e2Var) {
        this.f22765a = context;
        this.f22766b = e2Var;
    }

    private final File B(String str) {
        return new File(G(), str);
    }

    private final File C(String str, int i10, long j10) {
        return new File(m(str, i10, j10), "merge.tmp");
    }

    private final List<File> D() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e10) {
            f22764c.e("Could not process directory while scanning installed packs. %s", e10);
        }
        if (G().exists() && G().listFiles() != null) {
            for (File file : G().listFiles()) {
                if (!file.getCanonicalPath().equals(E().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    private final File E() {
        return new File(G(), "_tmp");
    }

    private final File F(String str, int i10, long j10) {
        return new File(new File(new File(E(), str), String.valueOf(i10)), String.valueOf(j10));
    }

    private final File G() {
        return new File(this.f22765a.getFilesDir(), "assetpacks");
    }

    private final File a(String str, int i10) {
        return new File(B(str), String.valueOf(i10));
    }

    private static void e(File file) {
        File[] listFiles;
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long h10 = h(file);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(h10)) && !file2.getName().equals("stale.tmp")) {
                q(file2);
            }
        }
    }

    private static long h(File file) {
        File[] listFiles;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            try {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e10) {
                f22764c.d(e10, "Corrupt asset pack directories.", new Object[0]);
            }
            if (arrayList.isEmpty()) {
                return -1L;
            }
            Collections.sort(arrayList);
            return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
        }
        return -1L;
    }

    private static boolean q(File file) {
        boolean z10;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z10 = true;
            for (File file2 : listFiles) {
                z10 &= q(file2);
            }
        } else {
            z10 = true;
        }
        return file.delete() && true == z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(String str, int i10, long j10) {
        if (F(str, i10, j10).exists()) {
            q(F(str, i10, j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File b(String str, int i10, long j10) {
        return new File(a(str, i10), String.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File c(String str, int i10, long j10, String str2) {
        return new File(new File(new File(F(str, i10, j10), "_slices"), "_unverified"), str2);
    }

    final Map<String, b> d() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : D()) {
                b i10 = i(file.getName());
                if (i10 != null) {
                    hashMap.put(file.getName(), i10);
                }
            }
        } catch (IOException e10) {
            f22764c.e("Could not process directory while scanning installed packs: %s", e10);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(String str, int i10, long j10, int i11) throws IOException {
        File C = C(str, i10, j10);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i11));
        C.getParentFile().mkdirs();
        C.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(C);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(List<String> list) {
        int a10 = this.f22766b.a();
        List<File> D = D();
        int size = D.size();
        for (int i10 = 0; i10 < size; i10++) {
            File file = D.get(i10);
            if (!list.contains(file.getName()) && h(file) != a10) {
                q(file);
            }
        }
    }

    final b i(String str) throws IOException {
        String o10 = o(str);
        if (o10 == null) {
            return null;
        }
        File file = new File(o10, "assets");
        if (file.isDirectory()) {
            return b.a(o10, file.getCanonicalPath());
        }
        f22764c.e("Failed to find assets directory: %s", file);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File j(String str, int i10, long j10) {
        return new File(b(str, i10, j10), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File k(String str, int i10, long j10, String str2) {
        return new File(new File(new File(F(str, i10, j10), "_slices"), "_verified"), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, Long> l() {
        HashMap hashMap = new HashMap();
        for (String str : d().keySet()) {
            hashMap.put(str, Long.valueOf(x(str)));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File m(String str, int i10, long j10) {
        return new File(F(str, i10, j10), "_packs");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File n(String str, int i10, long j10, String str2) {
        return new File(y(str, i10, j10, str2), "checkpoint.dat");
    }

    final String o(String str) throws IOException {
        int length;
        File file = new File(G(), str);
        if (!file.exists()) {
            f22764c.c("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f22766b.a()));
        if (!file2.exists()) {
            f22764c.c("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f22766b.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f22764c.c("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f22766b.a()));
            return null;
        } else if (length > 1) {
            f22764c.e("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f22766b.a()));
            return null;
        } else {
            return listFiles[0].getCanonicalPath();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        List<File> D = D();
        int size = D.size();
        for (int i10 = 0; i10 < size; i10++) {
            File file = D.get(i10);
            if (file.listFiles() != null) {
                e(file);
                long h10 = h(file);
                if (this.f22766b.a() != h10) {
                    try {
                        new File(new File(file, String.valueOf(h10)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f22764c.e("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    e(file2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int r(String str, int i10, long j10) throws IOException {
        File C = C(str, i10, j10);
        if (C.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(C);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("numberOfMerges") != null) {
                    try {
                        return Integer.parseInt(properties.getProperty("numberOfMerges"));
                    } catch (NumberFormatException e10) {
                        throw new s0("Merge checkpoint file corrupt.", e10);
                    }
                }
                throw new s0("Merge checkpoint file corrupt.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    cb.c0.a(th, th2);
                }
                throw th;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File s(String str, int i10, long j10, String str2) {
        return new File(y(str, i10, j10, str2), "checkpoint_ext.dat");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t(String str) {
        if (B(str).exists()) {
            return q(B(str));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int u(String str) {
        return (int) h(B(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File v(String str, int i10, long j10) {
        return new File(new File(F(str, i10, j10), "_slices"), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File w(String str, int i10, long j10, String str2) {
        return new File(y(str, i10, j10, str2), "slice.zip");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long x(String str) {
        return h(a(str, u(str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File y(String str, int i10, long j10, String str2) {
        return new File(v(str, i10, j10), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z() {
        q(G());
    }
}
