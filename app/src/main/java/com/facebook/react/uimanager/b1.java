package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.e1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ViewManagerPropertyUpdater.java */
/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, f<?, ?>> f15749a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, e<?>> f15750b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagerPropertyUpdater.java */
    /* loaded from: classes.dex */
    public static class b<T extends d0> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, e1.m> f15751a;

        @Override // com.facebook.react.uimanager.b1.d
        public void a(Map<String, String> map) {
            for (e1.m mVar : this.f15751a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.b1.e
        public void c(d0 d0Var, String str, Object obj) {
            e1.m mVar = this.f15751a.get(str);
            if (mVar != null) {
                mVar.d(d0Var, obj);
            }
        }

        private b(Class<? extends d0> cls) {
            this.f15751a = e1.h(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagerPropertyUpdater.java */
    /* loaded from: classes.dex */
    public static class c<T extends ViewManager, V extends View> implements f<T, V> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, e1.m> f15752a;

        @Override // com.facebook.react.uimanager.b1.d
        public void a(Map<String, String> map) {
            for (e1.m mVar : this.f15752a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.b1.f
        public void b(T t10, V v10, String str, Object obj) {
            e1.m mVar = this.f15752a.get(str);
            if (mVar != null) {
                mVar.e(t10, v10, obj);
            }
        }

        private c(Class<? extends ViewManager> cls) {
            this.f15752a = e1.i(cls);
        }
    }

    /* compiled from: ViewManagerPropertyUpdater.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(Map<String, String> map);
    }

    /* compiled from: ViewManagerPropertyUpdater.java */
    /* loaded from: classes.dex */
    public interface e<T extends d0> extends d {
        void c(T t10, String str, Object obj);
    }

    /* compiled from: ViewManagerPropertyUpdater.java */
    /* loaded from: classes.dex */
    public interface f<T extends ViewManager, V extends View> extends d {
        void b(T t10, V v10, String str, Object obj);
    }

    public static void a() {
        e1.b();
        f15749a.clear();
        f15750b.clear();
    }

    private static <T> T b(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            z3.a.G("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        }
    }

    private static <T extends ViewManager, V extends View> f<T, V> c(Class<? extends ViewManager> cls) {
        Map<Class<?>, f<?, ?>> map = f15749a;
        f<?, ?> fVar = map.get(cls);
        if (fVar == null) {
            fVar = (f) b(cls);
            if (fVar == null) {
                fVar = new c<>(cls);
            }
            map.put(cls, fVar);
        }
        return fVar;
    }

    private static <T extends d0> e<T> d(Class<? extends d0> cls) {
        Map<Class<?>, e<?>> map = f15750b;
        e<?> eVar = map.get(cls);
        if (eVar == null) {
            eVar = (e) b(cls);
            if (eVar == null) {
                eVar = new b<>(cls);
            }
            map.put(cls, eVar);
        }
        return eVar;
    }

    public static Map<String, String> e(Class<? extends ViewManager> cls, Class<? extends d0> cls2) {
        HashMap hashMap = new HashMap();
        c(cls).a(hashMap);
        d(cls2).a(hashMap);
        return hashMap;
    }

    public static <T extends d0> void f(T t10, f0 f0Var) {
        e d10 = d(t10.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = f0Var.f15851a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            d10.c(t10, next.getKey(), next.getValue());
        }
    }

    public static <T extends ViewManager, V extends View> void g(T t10, V v10, f0 f0Var) {
        f c10 = c(t10.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = f0Var.f15851a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            c10.b(t10, v10, next.getKey(), next.getValue());
        }
    }

    public static <T extends a1<V>, V extends View> void h(T t10, V v10, f0 f0Var) {
        Iterator<Map.Entry<String, Object>> entryIterator = f0Var.f15851a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            t10.a(v10, next.getKey(), next.getValue());
        }
    }
}
