package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class q {

    /* renamed from: b  reason: collision with root package name */
    private final m f8777b;

    /* renamed from: c  reason: collision with root package name */
    private final v f8778c;

    /* renamed from: a  reason: collision with root package name */
    private final String f8776a = "FileManager";

    /* renamed from: d  reason: collision with root package name */
    private final Object f8779d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f8780e = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(m mVar) {
        this.f8777b = mVar;
        this.f8778c = mVar.A();
    }

    private long a() {
        long longValue = ((Long) this.f8777b.a(com.applovin.impl.sdk.c.b.bk)).longValue();
        if (longValue < 0 || !b()) {
            return -1L;
        }
        return longValue;
    }

    private long a(long j10) {
        return j10 / 1048576;
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (v.a()) {
                this.f8778c.b("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (v.a()) {
            v vVar = this.f8778c;
            vVar.b("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File e10 = e(context);
        File file = new File(e10, str);
        if (z10) {
            try {
                e10.mkdirs();
            } catch (Throwable th) {
                if (v.a()) {
                    v vVar2 = this.f8778c;
                    vVar2.b("FileManager", "Unable to make cache directory at " + e10, th);
                }
                return null;
            }
        }
        return file;
    }

    private void a(long j10, Context context) {
        v vVar;
        String str;
        if (b()) {
            long intValue = ((Integer) this.f8777b.a(com.applovin.impl.sdk.c.b.bl)).intValue();
            if (intValue != -1) {
                int i10 = (a(j10) > intValue ? 1 : (a(j10) == intValue ? 0 : -1));
                boolean a10 = v.a();
                if (i10 > 0) {
                    if (a10) {
                        this.f8778c.b("FileManager", "Cache has exceeded maximum size; dropping...");
                    }
                    for (File file : d(context)) {
                        b(file);
                    }
                    this.f8777b.T().a(com.applovin.impl.sdk.d.f.f8323f);
                    return;
                } else if (!a10) {
                    return;
                } else {
                    vVar = this.f8778c;
                    str = "Cache is present but under size limit; not dropping...";
                }
            } else if (!v.a()) {
                return;
            } else {
                vVar = this.f8778c;
                str = "Cache has no maximum size set; skipping drop...";
            }
            vVar.b("FileManager", str);
        }
    }

    private boolean a(File file, String str, List<String> list, boolean z10, com.applovin.impl.sdk.d.e eVar) {
        if (file == null || !file.exists() || file.isDirectory()) {
            InputStream inputStream = null;
            try {
                inputStream = a(str, list, z10, eVar);
                return b(inputStream, file);
            } finally {
                Utils.close(inputStream, this.f8777b);
            }
        }
        if (v.a()) {
            v vVar = this.f8778c;
            vVar.b("FileManager", "File exists for " + str);
        }
        if (eVar != null) {
            eVar.b(file.length());
            return true;
        }
        return true;
    }

    private boolean b() {
        return ((Boolean) this.f8777b.a(com.applovin.impl.sdk.c.b.bj)).booleanValue();
    }

    private boolean b(File file) {
        if (v.a()) {
            v vVar = this.f8778c;
            vVar.b("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            c(file);
            return file.delete();
        } catch (Exception e10) {
            if (v.a()) {
                v vVar2 = this.f8778c;
                vVar2.b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", e10);
            }
            return false;
        } finally {
            d(file);
        }
    }

    private long c(Context context) {
        boolean z10;
        long a10 = a();
        boolean z11 = a10 != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List<String> b10 = this.f8777b.b(com.applovin.impl.sdk.c.b.bq);
        long j10 = 0;
        for (File file : d(context)) {
            if (!z11 || b10.contains(file.getName()) || e(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= a10) {
                z10 = false;
            } else {
                if (v.a()) {
                    v vVar = this.f8778c;
                    vVar.b("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                z10 = b(file);
            }
            if (z10) {
                this.f8777b.T().a(com.applovin.impl.sdk.d.f.f8322e);
            } else {
                j10 += file.length();
            }
        }
        return j10;
    }

    private void c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8779d) {
            boolean add = this.f8780e.add(absolutePath);
            while (!add) {
                try {
                    this.f8779d.wait();
                    add = this.f8780e.add(absolutePath);
                } catch (InterruptedException e10) {
                    if (v.a()) {
                        v vVar = this.f8778c;
                        vVar.b("FileManager", "Lock '" + absolutePath + "' interrupted", e10);
                    }
                    throw new RuntimeException(e10);
                }
            }
        }
    }

    private List<File> d(Context context) {
        File[] listFiles;
        File e10 = e(context);
        return (!e10.isDirectory() || (listFiles = e10.listFiles()) == null) ? Collections.emptyList() : Arrays.asList(listFiles);
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8779d) {
            this.f8780e.remove(absolutePath);
            this.f8779d.notifyAll();
        }
    }

    private File e(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    private boolean e(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8779d) {
            contains = this.f8780e.contains(absolutePath);
        }
        return contains;
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public InputStream a(String str, List<String> list, boolean z10, com.applovin.impl.sdk.d.e eVar) {
        if (z10 && !Utils.isDomainWhitelisted(str, list)) {
            if (v.a()) {
                v vVar = this.f8778c;
                vVar.b("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        if (((Boolean) this.f8777b.a(com.applovin.impl.sdk.c.b.cQ)).booleanValue() && !str.contains("https://")) {
            if (v.a()) {
                this.f8778c.d("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            str = str.replace("http://", "https://");
        }
        if (v.a()) {
            v vVar2 = this.f8778c;
            vVar2.b("FileManager", "Loading " + str + "...");
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(((Integer) this.f8777b.a(com.applovin.impl.sdk.c.b.cO)).intValue());
            httpURLConnection.setReadTimeout(((Integer) this.f8777b.a(com.applovin.impl.sdk.c.b.cP)).intValue());
            httpURLConnection.setDefaultUseCaches(true);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            int responseCode = httpURLConnection.getResponseCode();
            eVar.a(responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                if (v.a()) {
                    v vVar3 = this.f8778c;
                    vVar3.b("FileManager", "Opened stream to resource " + str);
                }
                return httpURLConnection.getInputStream();
            }
            return null;
        } catch (Exception e10) {
            if (v.a()) {
                v vVar4 = this.f8778c;
                vVar4.b("FileManager", "Error loading " + str, e10);
            }
            eVar.a(e10);
            return null;
        }
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z10, com.applovin.impl.sdk.d.e eVar) {
        return a(context, str, str2, list, z10, false, eVar);
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z10, boolean z11, com.applovin.impl.sdk.d.e eVar) {
        if (!StringUtils.isValidString(str)) {
            if (v.a()) {
                this.f8778c.b("FileManager", "Nothing to cache, skipping...");
            }
            return null;
        }
        Uri parse = Uri.parse(str);
        String fileName = ((Boolean) this.f8777b.a(com.applovin.impl.sdk.c.b.eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
        if (StringUtils.isValidString(fileName) && StringUtils.isValidString(str2)) {
            fileName = str2 + fileName;
        }
        String str3 = fileName;
        File a10 = a(str3, context);
        if (a(a10, str, list, z10, eVar)) {
            if (v.a()) {
                this.f8778c.b("FileManager", "Caching succeeded for file " + str3);
            }
            return z11 ? Uri.fromFile(a10).toString() : str3;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public String a(File file) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        String str = null;
        if (file == null) {
            return null;
        }
        boolean a10 = v.a();
        ?? r12 = a10;
        if (a10) {
            v vVar = this.f8778c;
            vVar.b("FileManager", "Reading resource from filesystem: " + file.getName());
            r12 = vVar;
        }
        try {
            try {
                c(file);
                r12 = new FileInputStream(file);
            } catch (FileNotFoundException e10) {
                e = e10;
                r12 = 0;
            } catch (IOException e11) {
                e = e11;
                r12 = 0;
            } catch (Throwable th) {
                th = th;
                r12 = 0;
            }
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    bArr = new byte[Constants.BUFFER_SIZE];
                } catch (FileNotFoundException e12) {
                    e = e12;
                    r12 = r12;
                    if (v.a()) {
                        this.f8778c.c("FileManager", "File not found. " + e);
                        r12 = r12;
                    }
                    return str;
                } catch (IOException e13) {
                    e = e13;
                    r12 = r12;
                    if (v.a()) {
                        this.f8778c.b("FileManager", "Failed to read file: " + file.getName() + e);
                        r12 = r12;
                    }
                    return str;
                }
            } catch (Throwable th2) {
                th = th2;
                r12 = r12;
                if (v.a()) {
                    this.f8778c.b("FileManager", "Unknown failure to read file.", th);
                    r12 = r12;
                }
                return str;
            }
            while (true) {
                int read = r12.read(bArr, 0, Constants.BUFFER_SIZE);
                if (read < 0) {
                    break;
                }
                try {
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Exception unused) {
                    Utils.close(byteArrayOutputStream, this.f8777b);
                }
                return str;
            }
            str = byteArrayOutputStream.toString("UTF-8");
            return str;
        } finally {
            Utils.close(r12, this.f8777b);
            d(file);
        }
    }

    public void a(Context context) {
        if (b() && this.f8777b.c()) {
            if (v.a()) {
                this.f8778c.b("FileManager", "Compacting cache...");
            }
            a(c(context), context);
        }
    }

    public boolean a(File file, String str, List<String> list, com.applovin.impl.sdk.d.e eVar) {
        return a(file, str, list, true, eVar);
    }

    public boolean a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        if (v.a()) {
            v vVar = this.f8778c;
            vVar.b("FileManager", "Writing resource to filesystem: " + file.getName());
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            c(file);
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[Constants.BUFFER_SIZE];
            while (true) {
                int read = inputStream.read(bArr, 0, Constants.BUFFER_SIZE);
                if (read < 0) {
                    Utils.close(fileOutputStream, this.f8777b);
                    d(file);
                    return true;
                }
                try {
                    fileOutputStream.write(bArr, 0, read);
                } catch (Exception e10) {
                    if (v.a()) {
                        this.f8778c.b("FileManager", "Failed to write next buffer to file", e10);
                    }
                    Utils.close(fileOutputStream, this.f8777b);
                    d(file);
                    return false;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                if (v.a()) {
                    this.f8778c.b("FileManager", "Unknown failure to write file.", th);
                }
                Utils.close(fileOutputStream2, this.f8777b);
                d(file);
                return false;
            } catch (Throwable th3) {
                Utils.close(fileOutputStream2, this.f8777b);
                d(file);
                throw th3;
            }
        }
    }

    public void b(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(e(context), ".nomedia");
            if (file.exists()) {
                return;
            }
            if (v.a()) {
                v vVar = this.f8778c;
                vVar.b("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (!file.createNewFile() && v.a()) {
                this.f8778c.e("FileManager", "Failed to create .nomedia file");
            }
        } catch (IOException e10) {
            if (v.a()) {
                this.f8778c.b("FileManager", "Failed to create .nomedia file", e10);
            }
        }
    }

    public boolean b(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (v.a()) {
            v vVar = this.f8778c;
            vVar.b("FileManager", "Caching " + file.getAbsolutePath() + "...");
        }
        if (!a(inputStream, file)) {
            if (v.a()) {
                v vVar2 = this.f8778c;
                vVar2.e("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        } else if (v.a()) {
            v vVar3 = this.f8778c;
            vVar3.b("FileManager", "Caching completed for " + file);
            return true;
        } else {
            return true;
        }
    }

    public boolean b(String str, Context context) {
        File a10 = a(str, false, context);
        return (a10 == null || !a10.exists() || a10.isDirectory()) ? false : true;
    }
}
