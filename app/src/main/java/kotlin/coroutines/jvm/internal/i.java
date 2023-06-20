package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DebugMetadata.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f33469a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final a f33470b = new a(null, null, null);

    /* renamed from: c  reason: collision with root package name */
    private static a f33471c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DebugMetadata.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f33472a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f33473b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f33474c;

        public a(Method method, Method method2, Method method3) {
            this.f33472a = method;
            this.f33473b = method2;
            this.f33474c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f33471c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f33470b;
            f33471c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a aVar) {
        qe.k.f(aVar, "continuation");
        a aVar2 = f33471c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f33470b) {
            return null;
        }
        Method method = aVar2.f33472a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f33473b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f33474c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
