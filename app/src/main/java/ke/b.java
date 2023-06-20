package ke;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import qe.k;
import ve.q;

/* compiled from: PlatformImplementations.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33463a;

    static {
        a aVar;
        Object newInstance;
        Object newInstance2;
        int a10 = a();
        if (a10 >= 65544 || a10 < 65536) {
            try {
                newInstance = me.a.class.newInstance();
                k.e(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            } catch (ClassNotFoundException unused) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                k.e(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) newInstance3;
                } catch (ClassCastException e10) {
                    ClassLoader classLoader = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader2 = a.class.getClassLoader();
                    if (k.a(classLoader, classLoader2)) {
                        throw e10;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
                }
            }
            try {
                if (newInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
                aVar = (a) newInstance;
                f33463a = aVar;
            } catch (ClassCastException e11) {
                ClassLoader classLoader3 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader4 = a.class.getClassLoader();
                if (k.a(classLoader3, classLoader4)) {
                    throw e11;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
            }
        }
        if (a10 >= 65543 || a10 < 65536) {
            try {
                try {
                    newInstance2 = le.a.class.newInstance();
                    k.e(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (ClassCastException e12) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = a.class.getClassLoader();
                        if (k.a(classLoader5, classLoader6)) {
                            throw e12;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } catch (ClassNotFoundException unused3) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                k.e(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) newInstance4;
                } catch (ClassCastException e13) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = a.class.getClassLoader();
                    if (k.a(classLoader7, classLoader8)) {
                        throw e13;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
                }
            }
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            aVar = (a) newInstance2;
            f33463a = aVar;
        }
        aVar = new a();
        f33463a = aVar;
    }

    private static final int a() {
        int N;
        int N2;
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        N = q.N(property, '.', 0, false, 6, null);
        if (N < 0) {
            try {
                return Integer.parseInt(property) * Constants.MIN_PROGRESS_STEP;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i10 = N + 1;
        N2 = q.N(property, '.', i10, false, 4, null);
        if (N2 < 0) {
            N2 = property.length();
        }
        String substring = property.substring(0, N);
        k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = property.substring(i10, N2);
        k.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(substring) * Constants.MIN_PROGRESS_STEP) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
