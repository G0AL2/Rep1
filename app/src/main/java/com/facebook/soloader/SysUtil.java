package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.facebook.soloader.m;
import java.io.DataOutput;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class SysUtil {

    @e
    @TargetApi(21)
    /* loaded from: classes.dex */
    private static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @e
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j10) throws IOException {
            int i10;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j10);
            } catch (ErrnoException e10) {
                if (e10.errno != OsConstants.EOPNOTSUPP && (i10 = e10.errno) != OsConstants.ENOSYS && i10 != OsConstants.EINVAL) {
                    throw new IOException(e10.toString(), e10);
                }
            }
        }

        @e
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add(m.b.AARCH64.toString());
                    treeSet.add(m.b.X86_64.toString());
                } else {
                    treeSet.add(m.b.ARM.toString());
                    treeSet.add(m.b.X86.toString());
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e10) {
                Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e10.errno), e10.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        @e
        public static boolean is64Bit() throws ErrnoException {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    @e
    @TargetApi(23)
    /* loaded from: classes.dex */
    private static final class MarshmallowSysdeps {
        private MarshmallowSysdeps() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            if (r1.getMethod() != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean a(android.content.Context r5) throws java.io.IOException {
            /*
                java.io.File r0 = new java.io.File
                android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
                java.lang.String r5 = r5.sourceDir
                r0.<init>(r5)
                java.util.zip.ZipFile r5 = new java.util.zip.ZipFile
                r5.<init>(r0)
                java.util.Enumeration r0 = r5.entries()     // Catch: java.lang.Throwable -> L4a
            L14:
                boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L4a
                r2 = 0
                if (r1 == 0) goto L46
                java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Throwable -> L4a
                java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L14
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L4a
                java.lang.String r4 = ".so"
                boolean r3 = r3.endsWith(r4)     // Catch: java.lang.Throwable -> L4a
                if (r3 == 0) goto L14
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L4a
                java.lang.String r4 = "/lib"
                boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L4a
                if (r3 == 0) goto L14
                int r0 = r1.getMethod()     // Catch: java.lang.Throwable -> L4a
                if (r0 != 0) goto L42
                r2 = 1
            L42:
                r5.close()
                return r2
            L46:
                r5.close()
                return r2
            L4a:
                r0 = move-exception
                r5.close()     // Catch: java.lang.Throwable -> L4f
                goto L53
            L4f:
                r5 = move-exception
                r0.addSuppressed(r5)
            L53:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SysUtil.MarshmallowSysdeps.a(android.content.Context):boolean");
        }

        public static boolean b(Context context) {
            return context != null && (context.getApplicationInfo().flags & 268435456) == 0;
        }

        public static boolean c(Context context, int i10) throws IOException {
            if (i10 == 2) {
                return a(context);
            }
            return b(context);
        }

        @e
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add(m.b.AARCH64.toString());
                treeSet.add(m.b.X86_64.toString());
            } else {
                treeSet.add(m.b.ARM.toString());
                treeSet.add(m.b.X86.toString());
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        @e
        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(DataOutput dataOutput, InputStream inputStream, int i10, byte[] bArr) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i10 - i11));
            if (read == -1) {
                break;
            }
            dataOutput.write(bArr, 0, read);
            i11 += read;
        }
        return i11;
    }

    public static void b(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            Log.e("SysUtil", "Enable write permission failed: " + parentFile);
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("Could not delete file " + file);
    }

    public static void c(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                c(file2);
            }
        }
        b(file);
    }

    public static void d(FileDescriptor fileDescriptor, long j10) throws IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            LollipopSysdeps.fallocateIfSupported(fileDescriptor, j10);
        }
    }

    public static int e(String[] strArr, String str) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10] != null && str.equals(strArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public static void f(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    f(file2);
                }
                return;
            }
            throw new IOException("cannot list directory " + file);
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static int g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    public static String h(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf > 0 ? str.substring(0, lastIndexOf) : str;
    }

    public static k i(File file, File file2, boolean z10) throws IOException {
        boolean z11 = true;
        try {
            if (z10) {
                return k.b(file2);
            }
            return k.d(file2);
        } catch (FileNotFoundException e10) {
            try {
                if (file.setWritable(true)) {
                    if (z10) {
                        k b10 = k.b(file2);
                        if (!file.setWritable(false)) {
                            Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                        }
                        return b10;
                    }
                    k d10 = k.d(file2);
                    if (!file.setWritable(false)) {
                        Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                    }
                    return d10;
                }
                throw e10;
            } catch (Throwable th) {
                th = th;
                if (z11 && !file.setWritable(false)) {
                    Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z11 = false;
            if (z11) {
                Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th;
        }
    }

    public static String[] j() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return MarshmallowSysdeps.getSupportedAbis();
        }
        return i10 >= 21 ? LollipopSysdeps.getSupportedAbis() : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return MarshmallowSysdeps.is64Bit();
        }
        if (i10 >= 21) {
            try {
                return LollipopSysdeps.is64Bit();
            } catch (Exception e10) {
                Log.e("SysUtil", String.format("Could not read /proc/self/exe. Err msg: %s", e10.getMessage()));
                return false;
            }
        }
        return false;
    }

    public static boolean l(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return MarshmallowSysdeps.b(context);
        }
        return false;
    }

    public static boolean m(Context context, int i10) throws IOException {
        if (Build.VERSION.SDK_INT >= 23) {
            return MarshmallowSysdeps.c(context, i10);
        }
        return false;
    }

    public static void n(File file) throws IOException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("cannot mkdir: " + file);
    }
}
