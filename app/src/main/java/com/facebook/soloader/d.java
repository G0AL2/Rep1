package com.facebook.soloader;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: DirectorySoSource.java */
/* loaded from: classes.dex */
public class d extends q {

    /* renamed from: a  reason: collision with root package name */
    protected final File f16511a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f16512b;

    /* renamed from: c  reason: collision with root package name */
    protected final List<String> f16513c;

    public d(File file, int i10) {
        this(file, i10, new String[0]);
    }

    private void g(String str, f fVar, int i10, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        String[] e10 = e(str, fVar);
        Log.d("SoLoader", "Loading lib dependencies: " + Arrays.toString(e10));
        for (String str2 : e10) {
            if (!str2.startsWith("/")) {
                SoLoader.r(str2, i10 | 1, threadPolicy);
            }
        }
    }

    @Override // com.facebook.soloader.q
    public int a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return h(str, i10, this.f16511a, threadPolicy);
    }

    @Override // com.facebook.soloader.q
    public File c(String str) throws IOException {
        return f(str);
    }

    protected f d(File file) throws IOException {
        return new g(file);
    }

    protected String[] e(String str, f fVar) throws IOException {
        boolean z10 = SoLoader.f16482a;
        if (z10) {
            Api18TraceUtils.a("SoLoader.getElfDependencies[", str, "]");
        }
        try {
            String[] a10 = n.a(str, fVar);
            if (z10) {
                Api18TraceUtils.b();
            }
            return a10;
        } catch (Throwable th) {
            if (SoLoader.f16482a) {
                Api18TraceUtils.b();
            }
            throw th;
        }
    }

    protected File f(String str) throws IOException {
        File file = new File(this.f16511a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int h(String str, int i10, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f16483b != null) {
            if (this.f16513c.contains(str)) {
                Log.d("SoLoader", str + " is on the denyList, skip loading from " + file.getCanonicalPath());
                return 0;
            }
            File f10 = f(str);
            if (f10 == null) {
                Log.d("SoLoader", str + " not found on " + file.getCanonicalPath());
                return 0;
            }
            Log.d("SoLoader", str + " found on " + file.getCanonicalPath());
            if ((i10 & 1) != 0 && (this.f16512b & 2) != 0) {
                Log.d("SoLoader", str + " loaded implicitly");
                return 2;
            }
            f fVar = null;
            boolean z10 = (this.f16512b & 1) != 0;
            boolean equals = f10.getName().equals(str);
            if (z10 || !equals) {
                try {
                    fVar = d(f10);
                } catch (Throwable th) {
                    if (fVar != null) {
                        fVar.close();
                    }
                    throw th;
                }
            }
            if (z10) {
                g(str, fVar, i10, threadPolicy);
            } else {
                Log.d("SoLoader", "Not resolving dependencies for " + str);
            }
            try {
                if (equals) {
                    SoLoader.f16483b.a(f10.getAbsolutePath(), i10);
                } else {
                    SoLoader.f16483b.b(f10.getAbsolutePath(), fVar, i10);
                }
                if (fVar != null) {
                    fVar.close();
                }
                return 1;
            } catch (UnsatisfiedLinkError e10) {
                if (e10.getMessage().contains("bad ELF magic")) {
                    Log.d("SoLoader", "Corrupted lib file detected");
                    if (fVar != null) {
                        fVar.close();
                    }
                    return 3;
                }
                throw e10;
            }
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    @Override // com.facebook.soloader.q
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f16511a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f16511a.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.f16512b + ']';
    }

    public d(File file, int i10, String[] strArr) {
        this.f16511a = file;
        this.f16512b = i10;
        this.f16513c = Arrays.asList(strArr);
    }
}
