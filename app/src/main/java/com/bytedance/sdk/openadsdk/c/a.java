package com.bytedance.sdk.openadsdk.c;

import android.util.SparseArray;
import com.bytedance.sdk.component.utils.l;
import java.lang.reflect.Method;

/* compiled from: BaseHook.java */
/* loaded from: classes.dex */
public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<Method> f11227a;

    /* renamed from: b  reason: collision with root package name */
    private Object f11228b;

    @Override // com.bytedance.sdk.openadsdk.c.c
    public <T> T a(int i10, Object... objArr) {
        Object obj;
        Method method = this.f11227a.get(i10);
        if (method != null && (obj = this.f11228b) != null) {
            try {
                if (obj instanceof Class) {
                    return (T) method.invoke(null, objArr);
                }
                return (T) method.invoke(obj, objArr);
            } catch (Throwable th) {
                String a10 = a();
                l.d(a10, "call method " + i10 + " failed: " + th.getMessage());
                return null;
            }
        }
        String a11 = a();
        l.d(a11, "call method " + i10 + " failed for null ");
        return null;
    }

    public abstract String a();
}
