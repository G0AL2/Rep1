package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* compiled from: FastServiceLoader.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f33508a = new g();

    private g() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final List<String> d(URL url) {
        boolean y10;
        String q02;
        String v02;
        String q03;
        String url2 = url.toString();
        qe.k.b(url2, "url.toString()");
        y10 = ve.p.y(url2, "jar", false, 2, null);
        if (y10) {
            q02 = ve.q.q0(url2, "jar:file:", null, 2, null);
            v02 = ve.q.v0(q02, '!', null, 2, null);
            q03 = ve.q.q0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(v02, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(q03)), "UTF-8"));
                List<String> e10 = f33508a.e(bufferedReader);
                ne.a.a(bufferedReader, null);
                jarFile.close();
                return e10;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        ee.b.a(th, th3);
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            List<String> e11 = f33508a.e(bufferedReader2);
            ne.a.a(bufferedReader2, null);
            return e11;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ne.a.a(bufferedReader2, th4);
                throw th5;
            }
        }
    }

    private final List<String> e(BufferedReader bufferedReader) {
        List<String> N;
        String w02;
        CharSequence x02;
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                w02 = ve.q.w0(readLine, "#", null, 2, null);
                if (w02 == null) {
                    throw new ee.r("null cannot be cast to non-null type kotlin.CharSequence");
                }
                x02 = ve.q.x0(w02);
                String obj = x02.toString();
                int i10 = 0;
                while (true) {
                    if (i10 >= obj.length()) {
                        z10 = true;
                        break;
                    }
                    char charAt = obj.charAt(i10);
                    if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
                if (z10) {
                    if (obj.length() > 0) {
                        linkedHashSet.add(obj);
                    }
                } else {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            } else {
                N = fe.x.N(linkedHashSet);
                return N;
            }
        }
    }

    public final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> N;
        qe.k.g(cls, "service");
        qe.k.g(classLoader, "loader");
        try {
            return c(cls, classLoader);
        } catch (Throwable unused) {
            ServiceLoader load = ServiceLoader.load(cls, classLoader);
            qe.k.b(load, "ServiceLoader.load(service, loader)");
            N = fe.x.N(load);
            return N;
        }
    }

    public final <S> List<S> c(Class<S> cls, ClassLoader classLoader) {
        Set<String> Q;
        int p10;
        qe.k.g(cls, "service");
        qe.k.g(classLoader, "loader");
        Enumeration<URL> resources = classLoader.getResources("META-INF/services/" + cls.getName());
        qe.k.b(resources, "urls");
        ArrayList<URL> list = Collections.list(resources);
        qe.k.b(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            g gVar = f33508a;
            qe.k.b(url, "it");
            fe.u.s(arrayList, gVar.d(url));
        }
        Q = fe.x.Q(arrayList);
        if (!Q.isEmpty()) {
            p10 = fe.q.p(Q, 10);
            ArrayList arrayList2 = new ArrayList(p10);
            for (String str : Q) {
                arrayList2.add(f33508a.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
