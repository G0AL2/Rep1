package com.bytedance.sdk.component.adexpress.a.b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.a.c.a;
import com.bytedance.sdk.component.utils.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONObject;

/* compiled from: Version.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static com.bytedance.sdk.component.adexpress.a.c.a f9352a;

    public static void a() {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File file = new File(b.f(), "temp_pkg_info.json");
                Long valueOf = Long.valueOf(file.length());
                if (valueOf.longValue() > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[valueOf.intValue()];
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        com.bytedance.sdk.component.adexpress.a.c.a a10 = com.bytedance.sdk.component.adexpress.a.c.a.a(new JSONObject(new String(bArr, "utf-8")));
                        if (a10 != null) {
                            f9352a = a10;
                            l.b("Version", "old version read success: " + f9352a.b());
                        }
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            l.c("Version", "version init error", th);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return;
                        } catch (Throwable th3) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th3;
                        }
                    }
                } else {
                    l.b("Version", "version pkg json file does not exist");
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th = th4;
            }
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
        } catch (IOException unused2) {
        }
    }

    public static synchronized com.bytedance.sdk.component.adexpress.a.c.a b() {
        com.bytedance.sdk.component.adexpress.a.c.a aVar;
        synchronized (e.class) {
            aVar = f9352a;
        }
        return aVar;
    }

    public static void c() {
        FileOutputStream fileOutputStream;
        com.bytedance.sdk.component.adexpress.a.c.a aVar = f9352a;
        if (aVar == null) {
            l.b("Version", "version save error1");
            return;
        }
        String g10 = aVar.g();
        if (TextUtils.isEmpty(g10)) {
            l.b("Version", "version save error2");
            return;
        }
        File file = new File(b.f(), "temp_pkg_info.json");
        File file2 = new File(file + ".tmp");
        if (file2.exists()) {
            file2.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(g10.getBytes("utf-8"));
                if (file.exists()) {
                    file.delete();
                }
                file2.renameTo(file);
                fileOutputStream.close();
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                try {
                    l.c("Version", "version save error3", th);
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                } catch (Throwable th3) {
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th3;
                }
            }
        } catch (IOException unused2) {
        }
    }

    public static void d() {
        com.bytedance.sdk.component.adexpress.a.c.a b10 = b();
        if (b10 == null) {
            return;
        }
        File f10 = b.f();
        try {
            new File(f10, "temp_pkg_info.json").delete();
        } catch (Throwable unused) {
        }
        if (b10.e() != null) {
            for (a.C0145a c0145a : b10.e()) {
                try {
                    new File(f10, com.bytedance.sdk.component.utils.e.a(c0145a.a())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
        f9352a = null;
    }

    public static boolean b(String str) {
        if (b() != null && !TextUtils.isEmpty(b().b())) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String b10 = b().b();
            String[] split = str.split("\\.");
            String[] split2 = b10.split("\\.");
            int min = Math.min(split.length, split2.length);
            for (int i10 = 0; i10 < min; i10++) {
                int length = split[i10].length() - split2[i10].length();
                if (length != 0) {
                    return length > 0;
                }
                int compareTo = split[i10].compareTo(split2[i10]);
                if (compareTo > 0) {
                    return true;
                }
                if (compareTo < 0) {
                    return false;
                }
                if (i10 == min - 1) {
                    return split.length > split2.length;
                }
            }
            return false;
        }
        return true;
    }

    public static synchronized void a(com.bytedance.sdk.component.adexpress.a.c.a aVar) {
        synchronized (e.class) {
            if (aVar != null) {
                if (aVar.f()) {
                    f9352a = aVar;
                }
            }
        }
    }

    public static a.C0145a a(String str) {
        if (!TextUtils.isEmpty(str) && b() != null && b().e() != null && b().f()) {
            for (a.C0145a c0145a : b().e()) {
                if (c0145a.a() != null && c0145a.a().equals(str)) {
                    return c0145a;
                }
            }
        }
        return null;
    }
}
