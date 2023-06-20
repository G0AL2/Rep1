package gd;

import com.google.gson.i;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* compiled from: UnsafeReflectionAccessor.java */
/* loaded from: classes3.dex */
final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private static Class f30832d;

    /* renamed from: b  reason: collision with root package name */
    private final Object f30833b = d();

    /* renamed from: c  reason: collision with root package name */
    private final Field f30834c = c();

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f30832d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // gd.b
    public void b(AccessibleObject accessibleObject) {
        if (e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            throw new i("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
        }
    }

    boolean e(AccessibleObject accessibleObject) {
        if (this.f30833b != null && this.f30834c != null) {
            try {
                f30832d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f30833b, accessibleObject, Long.valueOf(((Long) f30832d.getMethod("objectFieldOffset", Field.class).invoke(this.f30833b, this.f30834c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
