package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class SoLoader {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f16482a;

    /* renamed from: b  reason: collision with root package name */
    static p f16483b;

    /* renamed from: f  reason: collision with root package name */
    private static s[] f16487f;

    /* renamed from: g  reason: collision with root package name */
    private static com.facebook.soloader.b f16488g;

    /* renamed from: m  reason: collision with root package name */
    private static int f16494m;

    /* renamed from: c  reason: collision with root package name */
    private static final ReentrantReadWriteLock f16484c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    private static q[] f16485d = null;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicInteger f16486e = new AtomicInteger(0);

    /* renamed from: h  reason: collision with root package name */
    private static final HashSet<String> f16489h = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    private static final Map<String, Object> f16490i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private static final Set<String> f16491j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k  reason: collision with root package name */
    private static r f16492k = null;

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f16493l = {System.mapLibraryName("breakpad")};

    /* renamed from: n  reason: collision with root package name */
    private static int f16495n = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e
    @TargetApi(14)
    /* loaded from: classes.dex */
    public static class Api14Utils {
        Api14Utils() {
        }

        public static String a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader != null && !(classLoader instanceof BaseDexClassLoader)) {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Exception e10) {
                throw new RuntimeException("Cannot call getLdLibraryPath", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f16496a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f16497b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f16498c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runtime f16499d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Method f16500e;

        a(boolean z10, String str, String str2, Runtime runtime, Method method) {
            this.f16496a = z10;
            this.f16497b = str;
            this.f16498c = str2;
            this.f16499d = runtime;
            this.f16500e = method;
        }

        private String c(String str) {
            try {
                File file = new File(str);
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read > 0) {
                            messageDigest.update(bArr, 0, read);
                        } else {
                            String format = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                            fileInputStream.close();
                            return format;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | SecurityException | NoSuchAlgorithmException e10) {
                return e10.toString();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
            if (r1 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
            android.util.Log.e("SoLoader", "Error when loading lib: " + r1 + " lib hash: " + c(r9) + " search path is " + r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
            return;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // com.facebook.soloader.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.lang.String r9, int r10) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.a.a(java.lang.String, int):void");
        }

        @Override // com.facebook.soloader.p
        public void b(String str, f fVar, int i10) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends UnsatisfiedLinkError {
        b(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th);
        }
    }

    static {
        boolean z10 = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z10 = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f16482a = z10;
    }

    private static void a(Context context, ArrayList<q> arrayList, int i10) throws IOException {
        if ((f16494m & 8) != 0) {
            f16487f = null;
            File r10 = s.r(context, "lib-main");
            try {
                SysUtil.c(r10);
                return;
            } catch (IOException e10) {
                Log.w("SoLoader", "Failed to delete " + r10.getCanonicalPath(), e10);
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        com.facebook.soloader.a aVar = new com.facebook.soloader.a(context, file, "lib-main", i10);
        arrayList2.add(aVar);
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "adding backup source from : " + aVar.toString());
        }
        d(context, i10, arrayList2);
        f16487f = (s[]) arrayList2.toArray(new s[arrayList2.size()]);
        arrayList.addAll(0, arrayList2);
    }

    private static void b(ArrayList<q> arrayList, String[] strArr) {
        String str = SysUtil.k() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str + ":" + str2;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding system library source: " + str3);
            }
            arrayList.add(new d(new File(str3), 2, strArr));
        }
    }

    private static void c(Context context, ArrayList<q> arrayList, int i10) {
        if (Build.VERSION.SDK_INT <= 17) {
            i10 |= 1;
        }
        f16488g = new com.facebook.soloader.b(context, i10);
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "adding application source: " + f16488g.toString());
        }
        arrayList.add(0, f16488g);
    }

    private static void d(Context context, int i10, ArrayList<s> arrayList) {
        if (Build.VERSION.SDK_INT < 21 || context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "adding backup sources from split apks");
        }
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        int length = strArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            File file = new File(strArr[i11]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lib-");
            int i13 = i12 + 1;
            sb2.append(i12);
            com.facebook.soloader.a aVar = new com.facebook.soloader.a(context, file, sb2.toString(), i10);
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding backup source: " + aVar.toString());
            }
            arrayList.add(aVar);
            i11++;
            i12 = i13;
        }
    }

    private static void e(Context context, ArrayList<q> arrayList) {
        if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding directApk sources from split apks");
            }
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                c cVar = new c(new File(str));
                if (Log.isLoggable("SoLoader", 3)) {
                    Log.d("SoLoader", "adding directApk source: " + cVar.toString());
                }
                arrayList.add(0, cVar);
            }
        }
        c cVar2 = new c(context);
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "adding directApk source: " + cVar2.toString());
        }
        arrayList.add(0, cVar2);
    }

    private static void f() {
        if (!o()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    private static void g(String str, int i10, StrictMode.ThreadPolicy threadPolicy) throws UnsatisfiedLinkError {
        boolean z10;
        int i11;
        ReentrantReadWriteLock reentrantReadWriteLock;
        s[] sVarArr;
        ReentrantReadWriteLock reentrantReadWriteLock2 = f16484c;
        reentrantReadWriteLock2.readLock().lock();
        try {
            if (f16485d != null) {
                reentrantReadWriteLock2.readLock().unlock();
                int i12 = 0;
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (f16482a) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
                }
                try {
                    reentrantReadWriteLock2.readLock().lock();
                    i11 = 0;
                    int i13 = 0;
                    while (i11 == 0) {
                        q[] qVarArr = f16485d;
                        if (i13 < qVarArr.length) {
                            i11 = qVarArr[i13].a(str, i10, threadPolicy);
                            if (i11 != 3 || f16487f == null) {
                                i13++;
                            } else {
                                if (Log.isLoggable("SoLoader", 3)) {
                                    Log.d("SoLoader", "Trying backup SoSource for " + str);
                                }
                                for (s sVar : f16487f) {
                                    sVar.t(str);
                                    int a10 = sVar.a(str, i10, threadPolicy);
                                    if (a10 == 1) {
                                        i11 = a10;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (f16482a) {
                        Api18TraceUtils.b();
                    }
                    if (z10) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    if (i11 == 0 || i11 == 3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("couldn't find DSO to load: ");
                        sb2.append(str);
                        reentrantReadWriteLock.readLock().lock();
                        while (i12 < f16485d.length) {
                            sb2.append("\n\tSoSource ");
                            sb2.append(i12);
                            sb2.append(": ");
                            sb2.append(f16485d[i12].toString());
                            i12++;
                        }
                        com.facebook.soloader.b bVar = f16488g;
                        if (bVar != null) {
                            File e10 = com.facebook.soloader.b.e(bVar.f());
                            sb2.append("\n\tNative lib dir: ");
                            sb2.append(e10.getAbsolutePath());
                            sb2.append("\n");
                        }
                        f16484c.readLock().unlock();
                        sb2.append(" result: ");
                        sb2.append(i11);
                        String sb3 = sb2.toString();
                        Log.e("SoLoader", sb3);
                        throw new UnsatisfiedLinkError(sb3);
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    i12 = i11;
                    if (f16482a) {
                        Api18TraceUtils.b();
                    }
                    if (z10) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    if (i12 == 0 || i12 == 3) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("couldn't find DSO to load: ");
                        sb4.append(str);
                        String message = th.getMessage();
                        if (message == null) {
                            message = th.toString();
                        }
                        sb4.append(" caused by: ");
                        sb4.append(message);
                        th.printStackTrace();
                        sb4.append(" result: ");
                        sb4.append(i12);
                        String sb5 = sb4.toString();
                        Log.e("SoLoader", sb5);
                        UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(sb5);
                        unsatisfiedLinkError.initCause(th);
                        throw unsatisfiedLinkError;
                    }
                    return;
                }
            }
            Log.e("SoLoader", "Could not load: " + str + " because no SO source exists");
            throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
        } finally {
            f16484c.readLock().unlock();
        }
    }

    private static int h(Context context, int i10) {
        int i11 = f16495n;
        if (i11 != 0) {
            return i11;
        }
        if ((i10 & 32) == 0 && context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i12 = applicationInfo.flags;
            r0 = (i12 & 1) != 0 ? (i12 & 128) != 0 ? 3 : 2 : 1;
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + r0);
            }
        }
        return r0;
    }

    private static int i() {
        int i10 = f16495n;
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return 1;
            }
            throw new RuntimeException("Unsupported app type, we should not reach here");
        }
        return 0;
    }

    public static void init(Context context, int i10) throws IOException {
        k(context, i10, null, f16493l);
    }

    private static Method j() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && i10 <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException e10) {
                Log.w("SoLoader", "Cannot get nativeLoad method", e10);
            }
        }
        return null;
    }

    public static void k(Context context, int i10, p pVar, String[] strArr) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            if (SysUtil.l(context)) {
                i10 |= 8;
            }
            f16495n = h(context, i10);
            m(pVar);
            n(context, i10, strArr);
            i7.a.b(new o());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public static void l(Context context, boolean z10) {
        try {
            k(context, z10 ? 1 : 0, null, f16493l);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static synchronized void m(p pVar) {
        synchronized (SoLoader.class) {
            if (pVar == null) {
                if (f16483b != null) {
                    return;
                }
            }
            if (pVar != null) {
                f16483b = pVar;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method j10 = j();
            boolean z10 = j10 != null;
            String a10 = z10 ? Api14Utils.a() : null;
            f16483b = new a(z10, a10, v(a10), runtime, j10);
        }
    }

    private static void n(Context context, int i10, String[] strArr) throws IOException {
        if (f16485d != null) {
            return;
        }
        f16484c.writeLock().lock();
        try {
            f16494m = i10;
            ArrayList arrayList = new ArrayList();
            b(arrayList, strArr);
            if (context != null) {
                if ((i10 & 1) != 0) {
                    f16487f = null;
                    if (Log.isLoggable("SoLoader", 3)) {
                        Log.d("SoLoader", "adding exo package source: lib-main");
                    }
                    arrayList.add(0, new i(context, "lib-main"));
                } else {
                    if (SysUtil.m(context, f16495n)) {
                        e(context, arrayList);
                    }
                    c(context, arrayList, i());
                    a(context, arrayList, 1);
                }
            }
            q[] qVarArr = (q[]) arrayList.toArray(new q[arrayList.size()]);
            int w10 = w();
            int length = qVarArr.length;
            while (true) {
                int i11 = length - 1;
                if (length <= 0) {
                    break;
                }
                if (Log.isLoggable("SoLoader", 3)) {
                    Log.d("SoLoader", "Preparing SO source: " + qVarArr[i11]);
                }
                qVarArr[i11].b(w10);
                length = i11;
            }
            f16485d = qVarArr;
            f16486e.getAndIncrement();
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "init finish: " + f16485d.length + " SO sources prepared");
            }
        } finally {
            f16484c.writeLock().unlock();
        }
    }

    public static boolean o() {
        ReentrantReadWriteLock reentrantReadWriteLock = f16484c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z10 = f16485d != null;
            reentrantReadWriteLock.readLock().unlock();
            return z10;
        } catch (Throwable th) {
            f16484c.readLock().unlock();
            throw th;
        }
    }

    public static boolean p(String str) {
        return q(str, 0);
    }

    public static boolean q(String str, int i10) throws UnsatisfiedLinkError {
        r rVar;
        Boolean u10 = u(str);
        if (u10 != null) {
            return u10.booleanValue();
        }
        int i11 = f16495n;
        if ((i11 == 2 || i11 == 3) && (rVar = f16492k) != null) {
            rVar.a(str);
            return true;
        }
        String b10 = l.b(str);
        return s(System.mapLibraryName(b10 != null ? b10 : str), str, b10, i10, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        t(str, null, null, i10, threadPolicy);
    }

    private static boolean s(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        boolean z11 = false;
        do {
            try {
                z11 = t(str, str2, str3, i10, threadPolicy);
                z10 = false;
                continue;
            } catch (UnsatisfiedLinkError e10) {
                int i11 = f16486e.get();
                f16484c.writeLock().lock();
                try {
                    try {
                        if (f16488g == null || !f16488g.d()) {
                            z10 = false;
                        } else {
                            Log.w("SoLoader", "sApplicationSoSource updated during load: " + str + ", attempting load again.");
                            f16486e.getAndIncrement();
                            z10 = true;
                        }
                        f16484c.writeLock().unlock();
                        if (f16486e.get() == i11) {
                            throw e10;
                        }
                    } catch (IOException e11) {
                        throw new RuntimeException(e11);
                    }
                } catch (Throwable th) {
                    f16484c.writeLock().unlock();
                    throw th;
                }
            }
        } while (z10);
        return z11;
    }

    private static boolean t(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        Object obj;
        boolean z11 = false;
        if (TextUtils.isEmpty(str2) || !f16491j.contains(str2)) {
            synchronized (SoLoader.class) {
                HashSet<String> hashSet = f16489h;
                if (!hashSet.contains(str)) {
                    z10 = false;
                } else if (str3 == null) {
                    return false;
                } else {
                    z10 = true;
                }
                Map<String, Object> map = f16490i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f16484c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z10) {
                            synchronized (SoLoader.class) {
                                if (hashSet.contains(str)) {
                                    if (str3 == null) {
                                        reentrantReadWriteLock.readLock().unlock();
                                        return false;
                                    }
                                    z10 = true;
                                }
                                if (!z10) {
                                    try {
                                        if (Log.isLoggable("SoLoader", 3)) {
                                            Log.d("SoLoader", "About to load: " + str);
                                        }
                                        g(str, i10, threadPolicy);
                                        if (Log.isLoggable("SoLoader", 3)) {
                                            Log.d("SoLoader", "Loaded: " + str);
                                        }
                                        synchronized (SoLoader.class) {
                                            hashSet.add(str);
                                        }
                                    } catch (UnsatisfiedLinkError e10) {
                                        String message = e10.getMessage();
                                        if (message != null && message.contains("unexpected e_machine:")) {
                                            throw new b(e10, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                        }
                                        throw e10;
                                    }
                                }
                            }
                        }
                        if ((i10 & 16) == 0) {
                            if (!TextUtils.isEmpty(str2) && f16491j.contains(str2)) {
                                z11 = true;
                            }
                            if (str3 != null && !z11) {
                                boolean z12 = f16482a;
                                if (z12) {
                                    Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                }
                                try {
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        Log.d("SoLoader", "About to merge: " + str2 + " / " + str);
                                    }
                                    l.a(str2);
                                    f16491j.add(str2);
                                    if (z12) {
                                        Api18TraceUtils.b();
                                    }
                                } catch (UnsatisfiedLinkError e11) {
                                    throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e11);
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return !z10;
                    }
                } catch (Throwable th) {
                    f16484c.readLock().unlock();
                    throw th;
                }
            }
        }
        return false;
    }

    private static Boolean u(String str) {
        Boolean valueOf;
        if (f16485d == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f16484c;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (f16485d == null) {
                    if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        f();
                    } else {
                        synchronized (SoLoader.class) {
                            boolean z10 = !f16489h.contains(str);
                            if (z10) {
                                r rVar = f16492k;
                                if (rVar != null) {
                                    rVar.a(str);
                                } else {
                                    System.loadLibrary(str);
                                }
                            }
                            valueOf = Boolean.valueOf(z10);
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return valueOf;
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                return null;
            } catch (Throwable th) {
                f16484c.readLock().unlock();
                throw th;
            }
        }
        return null;
    }

    public static String v(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    private static int w() {
        ReentrantReadWriteLock reentrantReadWriteLock = f16484c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i10 = (f16494m & 2) != 0 ? 1 : 0;
            reentrantReadWriteLock.writeLock().unlock();
            return i10;
        } catch (Throwable th) {
            f16484c.writeLock().unlock();
            throw th;
        }
    }

    public static File x(String str) throws UnsatisfiedLinkError {
        f();
        try {
            return y(System.mapLibraryName(str));
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    static File y(String str) throws IOException {
        f16484c.readLock().lock();
        try {
            for (q qVar : f16485d) {
                File c10 = qVar.c(str);
                if (c10 != null) {
                    return c10;
                }
            }
            f16484c.readLock().unlock();
            throw new FileNotFoundException(str);
        } finally {
            f16484c.readLock().unlock();
        }
    }
}
