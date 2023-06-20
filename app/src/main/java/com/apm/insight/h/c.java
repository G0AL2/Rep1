package com.apm.insight.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.apm.insight.l.i;
import com.apm.insight.l.k;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import dalvik.system.BaseDexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f6363a = new ArrayList();

    public static String a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String a10 = a(applicationInfo.sourceDir, str, file);
        if (a10 == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 21) {
            return "low";
        }
        for (String str2 : applicationInfo.splitSourceDirs) {
            a10 = a(str2, str, file);
            if (a10 == null) {
                return null;
            }
        }
        try {
            ClassLoader classLoader = c.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (classLoader instanceof BaseDexClassLoader) {
                Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(classLoader);
                Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
                declaredField2.setAccessible(true);
                for (String str3 : (String[]) declaredField2.get(obj)) {
                    File file2 = new File(str3, System.mapLibraryName(str));
                    if (file2.exists()) {
                        i.a(file2, file);
                        k.a(file.getAbsolutePath(), DownloadResource.STATUS_UNHANDLED_REDIRECT);
                        return null;
                    }
                }
                return "not_found";
            }
            return a10;
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public static String a(String str, String str2, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        String message;
        String str3;
        ZipEntry entry;
        FileOutputStream fileOutputStream = null;
        try {
            zipFile = new ZipFile(new File(str), 1);
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("lib/");
                str3 = Build.CPU_ABI;
                sb2.append(str3);
                sb2.append("/");
                sb2.append(System.mapLibraryName(str2));
                entry = zipFile.getEntry(sb2.toString());
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            zipFile = null;
        }
        if (entry == null) {
            int indexOf = str3.indexOf(45);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lib/");
            if (indexOf <= 0) {
                indexOf = str3.length();
            }
            sb3.append(str3.substring(0, indexOf));
            sb3.append("/");
            sb3.append(System.mapLibraryName(str2));
            String sb4 = sb3.toString();
            ZipEntry entry2 = zipFile.getEntry(sb4);
            if (entry2 == null) {
                message = "Library entry not found:" + sb4;
                k.a((Closeable) null);
                k.a((Closeable) null);
                k.a(zipFile);
                return message;
            }
            entry = entry2;
        }
        file.createNewFile();
        InputStream inputStream2 = zipFile.getInputStream(entry);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read <= 0) {
                        k.a(file.getAbsolutePath(), DownloadResource.STATUS_UNHANDLED_REDIRECT);
                        k.a(fileOutputStream2);
                        k.a(inputStream2);
                        k.a(zipFile);
                        return null;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                }
            } catch (Throwable th3) {
                fileOutputStream = fileOutputStream2;
                inputStream = inputStream2;
                th = th3;
                try {
                    message = th.getMessage();
                    k.a(fileOutputStream);
                    k.a(inputStream);
                    k.a(zipFile);
                    return message;
                } catch (Throwable th4) {
                    k.a(fileOutputStream);
                    k.a(inputStream);
                    k.a(zipFile);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            inputStream = inputStream2;
            th = th5;
        }
    }
}
