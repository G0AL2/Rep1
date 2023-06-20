package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class r {

    /* renamed from: b  reason: collision with root package name */
    private final m f8782b;

    /* renamed from: c  reason: collision with root package name */
    private final v f8783c;

    /* renamed from: a  reason: collision with root package name */
    private final String f8781a = "FileManagerOld";

    /* renamed from: d  reason: collision with root package name */
    private final Object f8784d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(m mVar) {
        this.f8782b = mVar;
        this.f8783c = mVar.A();
    }

    private File a(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    private boolean a(File file, String str, List<String> list, boolean z10, com.applovin.impl.sdk.d.e eVar) {
        if (file == null || !file.exists() || file.isDirectory()) {
            ByteArrayOutputStream a10 = a(str, list, z10, eVar);
            if (eVar != null && a10 != null) {
                eVar.a(a10.size());
            }
            return a(a10, file);
        }
        if (v.a(this.f8782b)) {
            v vVar = this.f8783c;
            vVar.b("FileManagerOld", "File exists for " + str);
        }
        if (eVar != null) {
            eVar.b(file.length());
            return true;
        }
        return true;
    }

    private boolean b(ByteArrayOutputStream byteArrayOutputStream, File file) {
        m mVar;
        if (v.a(this.f8782b)) {
            v vVar = this.f8783c;
            vVar.b("FileManagerOld", "Writing resource to filesystem: " + file.getName());
        }
        FileOutputStream fileOutputStream = null;
        boolean z10 = false;
        synchronized (this.f8784d) {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    byteArrayOutputStream.writeTo(fileOutputStream2);
                    z10 = true;
                    Utils.close(fileOutputStream2, this.f8782b);
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    if (v.a(this.f8782b)) {
                        this.f8783c.b("FileManagerOld", "Unable to write data to file.", e);
                    }
                    mVar = this.f8782b;
                    Utils.close(fileOutputStream, mVar);
                    return z10;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (v.a(this.f8782b)) {
                        this.f8783c.b("FileManagerOld", "Unknown failure to write file.", th);
                    }
                    mVar = this.f8782b;
                    Utils.close(fileOutputStream, mVar);
                    return z10;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return z10;
    }

    public ByteArrayOutputStream a(File file) {
        FileInputStream fileInputStream;
        if (file == null) {
            return null;
        }
        if (v.a(this.f8782b)) {
            this.f8783c.b("FileManagerOld", "Reading resource from filesystem: " + file.getName());
        }
        synchronized (this.f8784d) {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e10) {
                e = e10;
                fileInputStream = null;
            } catch (IOException e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
                        if (read < 0) {
                            Utils.close(fileInputStream, this.f8782b);
                            return byteArrayOutputStream;
                        }
                        try {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } catch (Exception unused) {
                            Utils.close(byteArrayOutputStream, this.f8782b);
                            Utils.close(fileInputStream, this.f8782b);
                            return null;
                        }
                    }
                } catch (FileNotFoundException e12) {
                    e = e12;
                    if (v.a(this.f8782b)) {
                        this.f8783c.c("FileManagerOld", "File not found. " + e);
                    }
                    Utils.close(fileInputStream, this.f8782b);
                    return null;
                } catch (IOException e13) {
                    e = e13;
                    if (v.a(this.f8782b)) {
                        this.f8783c.b("FileManagerOld", "Failed to read file: " + file.getName() + e);
                    }
                    Utils.close(fileInputStream, this.f8782b);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (v.a(this.f8782b)) {
                    this.f8783c.b("FileManagerOld", "Unknown failure to read file.", th);
                }
                Utils.close(fileInputStream, this.f8782b);
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142 A[Catch: all -> 0x015c, TryCatch #7 {all -> 0x015c, blocks: (B:30:0x00d0, B:31:0x00d2, B:33:0x00d8, B:39:0x00f1, B:41:0x00f9, B:35:0x00dc, B:60:0x013a, B:62:0x0142, B:63:0x0158), top: B:72:0x007a }] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.applovin.impl.sdk.c.b<java.lang.Boolean>, com.applovin.impl.sdk.c.b] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.ByteArrayOutputStream a(java.lang.String r8, java.util.List<java.lang.String> r9, boolean r10, com.applovin.impl.sdk.d.e r11) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.r.a(java.lang.String, java.util.List, boolean, com.applovin.impl.sdk.d.e):java.io.ByteArrayOutputStream");
    }

    public File a(String str, Context context) {
        File file;
        if (!StringUtils.isValidString(str)) {
            if (v.a(this.f8782b)) {
                this.f8783c.b("FileManagerOld", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (v.a(this.f8782b)) {
            v vVar = this.f8783c;
            vVar.b("FileManagerOld", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        synchronized (this.f8784d) {
            File a10 = a(context);
            file = new File(a10, str);
            a10.mkdirs();
        }
        return file;
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z10, com.applovin.impl.sdk.d.e eVar) {
        return a(context, str, str2, list, z10, false, eVar);
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z10, boolean z11, com.applovin.impl.sdk.d.e eVar) {
        if (!StringUtils.isValidString(str)) {
            if (v.a(this.f8782b)) {
                this.f8783c.b("FileManagerOld", "Nothing to cache, skipping...");
            }
            return null;
        }
        Uri parse = Uri.parse(str);
        String fileName = ((Boolean) this.f8782b.a(com.applovin.impl.sdk.c.b.eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
        if (StringUtils.isValidString(fileName) && StringUtils.isValidString(str2)) {
            fileName = str2 + fileName;
        }
        String str3 = fileName;
        File a10 = a(str3, context);
        if (a(a10, str, list, z10, eVar)) {
            if (v.a(this.f8782b)) {
                this.f8783c.b("FileManagerOld", "Caching succeeded for file " + str3);
            }
            return z11 ? Uri.fromFile(a10).toString() : str3;
        }
        return null;
    }

    public boolean a(ByteArrayOutputStream byteArrayOutputStream, File file) {
        if (file == null) {
            return false;
        }
        if (v.a(this.f8782b)) {
            v vVar = this.f8783c;
            vVar.b("FileManagerOld", "Caching " + file.getAbsolutePath() + "...");
        }
        if (byteArrayOutputStream == null || byteArrayOutputStream.size() <= 0) {
            if (v.a(this.f8782b)) {
                v vVar2 = this.f8783c;
                vVar2.d("FileManagerOld", "No data for " + file.getAbsolutePath());
            }
            return false;
        } else if (!b(byteArrayOutputStream, file)) {
            if (v.a(this.f8782b)) {
                v vVar3 = this.f8783c;
                vVar3.e("FileManagerOld", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        } else if (v.a(this.f8782b)) {
            v vVar4 = this.f8783c;
            vVar4.b("FileManagerOld", "Caching completed for " + file);
            return true;
        } else {
            return true;
        }
    }

    public boolean a(File file, String str, List<String> list, com.applovin.impl.sdk.d.e eVar) {
        return a(file, str, list, true, eVar);
    }

    public boolean b(String str, Context context) {
        boolean z10;
        synchronized (this.f8784d) {
            File a10 = a(str, context);
            z10 = (a10 == null || !a10.exists() || a10.isDirectory()) ? false : true;
        }
        return z10;
    }
}
