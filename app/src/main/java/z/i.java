package z;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi28Impl.java */
/* loaded from: classes.dex */
public class i extends h {
    @Override // z.h
    protected Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f39872g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f39878m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // z.h
    protected Method x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
