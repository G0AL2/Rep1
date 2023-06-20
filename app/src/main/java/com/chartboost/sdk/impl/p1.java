package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Libraries.CBLogging;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p1 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<com.chartboost.sdk.Model.e> f14247a;

    /* renamed from: b  reason: collision with root package name */
    private final q1 f14248b;

    public p1(Context context, AtomicReference<com.chartboost.sdk.Model.e> atomicReference) {
        q1 q1Var = new q1(context.getCacheDir());
        this.f14248b = q1Var;
        this.f14247a = atomicReference;
        try {
            long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(atomicReference.get().f13718i);
            File file = new File(q1Var.f14269a, "templates");
            if (file.exists()) {
                a(file.listFiles(), currentTimeMillis);
                a(q1Var);
            }
        } catch (Exception e10) {
            CBLogging.a("FileCache", "Exception while cleaning up templates directory at " + this.f14248b.f14270b.getPath(), e10);
            e10.printStackTrace();
        }
    }

    private void b(File[] fileArr, long j10) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.lastModified() < j10 && !file.delete()) {
                    CBLogging.b("FileCache", "Unable to delete " + file.getPath());
                }
            }
        }
    }

    public boolean a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    public boolean c(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    public File[] d() {
        File c10 = c();
        if (c10 != null) {
            return c10.listFiles();
        }
        return null;
    }

    public File e() {
        return this.f14248b.f14273e;
    }

    public JSONObject f() {
        String[] list;
        JSONObject jSONObject = new JSONObject();
        try {
            File file = a().f14269a;
            for (String str : this.f14247a.get().f13719j) {
                if (!str.equals("templates")) {
                    File file2 = new File(file, str);
                    JSONArray jSONArray = new JSONArray();
                    if (file2.exists() && (list = file2.list()) != null) {
                        for (String str2 : list) {
                            if (!str2.equals(".nomedia") && !str2.endsWith(".tmp")) {
                                jSONArray.put(str2);
                            }
                        }
                    }
                    n0.a(jSONObject, str, jSONArray);
                }
            }
        } catch (Exception e10) {
            CBLogging.b("FileCache", "getWebViewCacheAssets: " + e10.toString());
        }
        return jSONObject;
    }

    public File c() {
        return this.f14248b.f14272d;
    }

    public File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists() || file2.length() <= 0) {
            return null;
        }
        return file2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
        if (r1 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.io.File r6) {
        /*
            r5 = this;
            java.lang.String r0 = "FileCache"
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28 java.io.FileNotFoundException -> L31
            java.lang.String r3 = "rw"
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28 java.io.FileNotFoundException -> L31
            r3 = 0
            r2.seek(r3)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L20 java.io.FileNotFoundException -> L23
            int r6 = r2.read()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L20 java.io.FileNotFoundException -> L23
            r2.seek(r3)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L20 java.io.FileNotFoundException -> L23
            r2.write(r6)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L20 java.io.FileNotFoundException -> L23
            r2.close()     // Catch: java.io.IOException -> L3c
            goto L3c
        L1d:
            r6 = move-exception
            r1 = r2
            goto L3d
        L20:
            r6 = move-exception
            r1 = r2
            goto L29
        L23:
            r6 = move-exception
            r1 = r2
            goto L32
        L26:
            r6 = move-exception
            goto L3d
        L28:
            r6 = move-exception
        L29:
            java.lang.String r2 = "IOException when attempting to touch file"
            com.chartboost.sdk.Libraries.CBLogging.a(r0, r2, r6)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L3c
            goto L39
        L31:
            r6 = move-exception
        L32:
            java.lang.String r2 = "File not found when attempting to touch"
            com.chartboost.sdk.Libraries.CBLogging.a(r0, r2, r6)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L3c
        L39:
            r1.close()     // Catch: java.io.IOException -> L3c
        L3c:
            return
        L3d:
            if (r1 == 0) goto L42
            r1.close()     // Catch: java.io.IOException -> L42
        L42:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.p1.d(java.io.File):void");
    }

    private void a(File[] fileArr, long j10) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.isDirectory()) {
                    b(file.listFiles(), j10);
                    a(file.listFiles(), file);
                }
            }
        }
    }

    public long b(File file) {
        long j10 = 0;
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            j10 += b(file2);
                        }
                        return j10;
                    }
                    return 0L;
                }
            } catch (Exception e10) {
                CBLogging.b("FileCache", "getFolderSize: " + e10.toString());
                return 0L;
            }
        }
        if (file != null) {
            return file.length();
        }
        return 0L;
    }

    private void a(File[] fileArr, File file) {
        if (fileArr == null || fileArr.length != 0 || file.delete()) {
            return;
        }
        CBLogging.b("FileCache", "Unable to delete " + file.getPath());
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        n0.a(jSONObject, ".chartboost-internal-folder-size", Long.valueOf(b(this.f14248b.f14269a)));
        File file = a().f14269a;
        String[] list = file.list();
        if (list != null && list.length > 0) {
            for (String str : list) {
                File file2 = new File(file, str);
                JSONObject jSONObject2 = new JSONObject();
                n0.a(jSONObject2, file2.getName() + "-size", Long.valueOf(b(file2)));
                String[] list2 = file2.list();
                if (list2 != null) {
                    n0.a(jSONObject2, "count", Integer.valueOf(list2.length));
                }
                n0.a(jSONObject, file2.getName(), jSONObject2);
            }
        }
        return jSONObject;
    }

    private void a(q1 q1Var) {
        File file = new File(q1Var.f14269a, ".adId");
        if (!file.exists() || file.delete()) {
            return;
        }
        CBLogging.b("FileCache", "Unable to delete " + file.getPath());
    }

    public q1 a() {
        return this.f14248b;
    }
}
