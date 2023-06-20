package gd;

import com.google.gson.internal.d;
import java.lang.reflect.AccessibleObject;

/* compiled from: ReflectionAccessor.java */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final b f30831a;

    static {
        f30831a = d.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return f30831a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
