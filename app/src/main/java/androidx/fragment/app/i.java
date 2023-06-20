package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* compiled from: FragmentFactory.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.collection.g<ClassLoader, androidx.collection.g<String, Class<?>>> f3152a = new androidx.collection.g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        androidx.collection.g<ClassLoader, androidx.collection.g<String, Class<?>>> gVar = f3152a;
        androidx.collection.g<String, Class<?>> gVar2 = gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new androidx.collection.g<>();
            gVar.put(classLoader, gVar2);
        }
        Class<?> cls = gVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            gVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
