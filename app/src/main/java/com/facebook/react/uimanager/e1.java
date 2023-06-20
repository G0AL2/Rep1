package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewManagersPropertyCache.java */
/* loaded from: classes.dex */
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class, Map<String, m>> f15783a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, m> f15784b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public class a extends ThreadLocal<Object[]> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15785a;

        a(int i10) {
            this.f15785a = i10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Object[] initialValue() {
            return new Object[this.f15785a];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class b extends m {
        public b(w6.a aVar, Method method) {
            super(aVar, "Array", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class c extends m {

        /* renamed from: i  reason: collision with root package name */
        private final boolean f15786i;

        public c(w6.a aVar, Method method, boolean z10) {
            super(aVar, "boolean", method, (a) null);
            this.f15786i = z10;
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            return obj == null ? this.f15786i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class d extends m {
        public d(w6.a aVar, Method method) {
            super(aVar, "boolean", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class e extends m {
        public e(w6.a aVar, Method method) {
            super(aVar, "mixed", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ColorPropConverter.getColor(obj, context);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class f extends m {
        public f(w6.a aVar, Method method) {
            super(aVar, "number", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                if (obj instanceof Double) {
                    return Integer.valueOf(((Double) obj).intValue());
                }
                return (Integer) obj;
            }
            return null;
        }

        public f(w6.b bVar, Method method, int i10) {
            super(bVar, "number", method, i10, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class g extends m {

        /* renamed from: i  reason: collision with root package name */
        private final int f15787i;

        public g(w6.a aVar, Method method, int i10) {
            super(aVar, "mixed", method, (a) null);
            this.f15787i = i10;
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            if (obj == null) {
                return Integer.valueOf(this.f15787i);
            }
            return ColorPropConverter.getColor(obj, context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class i extends m {
        public i(w6.a aVar, Method method) {
            super(aVar, "mixed", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }

        public i(w6.b bVar, Method method, int i10) {
            super(bVar, "mixed", method, i10, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class l extends m {
        public l(w6.a aVar, Method method) {
            super(aVar, "Map", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static abstract class m {

        /* renamed from: e  reason: collision with root package name */
        private static final ThreadLocal<Object[]> f15791e = e1.e(2);

        /* renamed from: f  reason: collision with root package name */
        private static final ThreadLocal<Object[]> f15792f = e1.e(3);

        /* renamed from: g  reason: collision with root package name */
        private static final ThreadLocal<Object[]> f15793g = e1.e(1);

        /* renamed from: h  reason: collision with root package name */
        private static final ThreadLocal<Object[]> f15794h = e1.e(2);

        /* renamed from: a  reason: collision with root package name */
        protected final String f15795a;

        /* renamed from: b  reason: collision with root package name */
        protected final String f15796b;

        /* renamed from: c  reason: collision with root package name */
        protected final Method f15797c;

        /* renamed from: d  reason: collision with root package name */
        protected final Integer f15798d;

        /* synthetic */ m(w6.a aVar, String str, Method method, a aVar2) {
            this(aVar, str, method);
        }

        public String a() {
            return this.f15795a;
        }

        public String b() {
            return this.f15796b;
        }

        protected abstract Object c(Object obj, Context context);

        public void d(d0 d0Var, Object obj) {
            Object[] objArr;
            try {
                if (this.f15798d == null) {
                    objArr = f15793g.get();
                    objArr[0] = c(obj, d0Var.U());
                } else {
                    objArr = f15794h.get();
                    objArr[0] = this.f15798d;
                    objArr[1] = c(obj, d0Var.U());
                }
                this.f15797c.invoke(d0Var, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                z3.a.g(ViewManager.class, "Error while updating prop " + this.f15795a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f15795a + "' in shadow node of type: " + d0Var.y(), th);
            }
        }

        public void e(ViewManager viewManager, View view, Object obj) {
            Object[] objArr;
            try {
                if (this.f15798d == null) {
                    objArr = f15791e.get();
                    objArr[0] = view;
                    objArr[1] = c(obj, view.getContext());
                } else {
                    objArr = f15792f.get();
                    objArr[0] = view;
                    objArr[1] = this.f15798d;
                    objArr[2] = c(obj, view.getContext());
                }
                this.f15797c.invoke(viewManager, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                z3.a.g(ViewManager.class, "Error while updating prop " + this.f15795a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f15795a + "' of a view managed by: " + viewManager.getName(), th);
            }
        }

        /* synthetic */ m(w6.b bVar, String str, Method method, int i10, a aVar) {
            this(bVar, str, method, i10);
        }

        private m(w6.a aVar, String str, Method method) {
            this.f15795a = aVar.name();
            this.f15796b = "__default_type__".equals(aVar.customType()) ? str : aVar.customType();
            this.f15797c = method;
            this.f15798d = null;
        }

        private m(w6.b bVar, String str, Method method, int i10) {
            this.f15795a = bVar.names()[i10];
            this.f15796b = "__default_type__".equals(bVar.customType()) ? str : bVar.customType();
            this.f15797c = method;
            this.f15798d = Integer.valueOf(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class n extends m {
        public n(w6.a aVar, Method method) {
            super(aVar, "String", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            return (String) obj;
        }
    }

    public static void b() {
        f15783a.clear();
        f15784b.clear();
    }

    private static m c(w6.a aVar, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new i(aVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new c(aVar, method, aVar.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            if ("Color".equals(aVar.customType())) {
                return new g(aVar, method, aVar.defaultInt());
            }
            return new k(aVar, method, aVar.defaultInt());
        } else if (cls == Float.TYPE) {
            return new j(aVar, method, aVar.defaultFloat());
        } else {
            if (cls == Double.TYPE) {
                return new h(aVar, method, aVar.defaultDouble());
            }
            if (cls == String.class) {
                return new n(aVar, method);
            }
            if (cls == Boolean.class) {
                return new d(aVar, method);
            }
            if (cls == Integer.class) {
                if ("Color".equals(aVar.customType())) {
                    return new e(aVar, method);
                }
                return new f(aVar, method);
            } else if (cls == ReadableArray.class) {
                return new b(aVar, method);
            } else {
                if (cls == ReadableMap.class) {
                    return new l(aVar, method);
                }
                throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
            }
        }
    }

    private static void d(w6.b bVar, Method method, Class<?> cls, Map<String, m> map) {
        String[] names = bVar.names();
        int i10 = 0;
        if (cls == Dynamic.class) {
            while (i10 < names.length) {
                map.put(names[i10], new i(bVar, method, i10));
                i10++;
            }
        } else if (cls == Integer.TYPE) {
            while (i10 < names.length) {
                map.put(names[i10], new k(bVar, method, i10, bVar.defaultInt()));
                i10++;
            }
        } else if (cls == Float.TYPE) {
            while (i10 < names.length) {
                map.put(names[i10], new j(bVar, method, i10, bVar.defaultFloat()));
                i10++;
            }
        } else if (cls == Double.TYPE) {
            while (i10 < names.length) {
                map.put(names[i10], new h(bVar, method, i10, bVar.defaultDouble()));
                i10++;
            }
        } else if (cls == Integer.class) {
            while (i10 < names.length) {
                map.put(names[i10], new f(bVar, method, i10));
                i10++;
            }
        } else {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ThreadLocal<Object[]> e(int i10) {
        if (i10 <= 0) {
            return null;
        }
        return new a(i10);
    }

    private static void f(Class<? extends d0> cls, Map<String, m> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            w6.a aVar = (w6.a) method.getAnnotation(w6.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map.put(aVar.name(), c(aVar, method, parameterTypes[0]));
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            w6.b bVar = (w6.b) method.getAnnotation(w6.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length == 2) {
                    if (parameterTypes2[0] == Integer.TYPE) {
                        d(bVar, method, parameterTypes2[1], map);
                    } else {
                        throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                    }
                } else {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
        }
    }

    private static void g(Class<? extends ViewManager> cls, Map<String, m> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            w6.a aVar = (w6.a) method.getAnnotation(w6.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 2) {
                    if (View.class.isAssignableFrom(parameterTypes[0])) {
                        map.put(aVar.name(), c(aVar, method, parameterTypes[1]));
                    } else {
                        throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                    }
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            w6.b bVar = (w6.b) method.getAnnotation(w6.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length == 3) {
                    if (View.class.isAssignableFrom(parameterTypes2[0])) {
                        if (parameterTypes2[1] == Integer.TYPE) {
                            d(bVar, method, parameterTypes2[2], map);
                        } else {
                            throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                        }
                    } else {
                        throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                    }
                } else {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, m> h(Class<? extends d0> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == d0.class) {
                return f15784b;
            }
        }
        Map<Class, Map<String, m>> map = f15783a;
        Map<String, m> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap hashMap = new HashMap(h(cls.getSuperclass()));
        f(cls, hashMap);
        map.put(cls, hashMap);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, m> i(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return f15784b;
        }
        Map<Class, Map<String, m>> map = f15783a;
        Map<String, m> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap hashMap = new HashMap(i(cls.getSuperclass()));
        g(cls, hashMap);
        map.put(cls, hashMap);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class h extends m {

        /* renamed from: i  reason: collision with root package name */
        private final double f15788i;

        public h(w6.a aVar, Method method, double d10) {
            super(aVar, "number", method, (a) null);
            this.f15788i = d10;
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.f15788i : ((Double) obj).doubleValue());
        }

        public h(w6.b bVar, Method method, int i10, double d10) {
            super(bVar, "number", method, i10, null);
            this.f15788i = d10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class j extends m {

        /* renamed from: i  reason: collision with root package name */
        private final float f15789i;

        public j(w6.a aVar, Method method, float f10) {
            super(aVar, "number", method, (a) null);
            this.f15789i = f10;
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.f15789i : Float.valueOf(((Double) obj).floatValue()).floatValue());
        }

        public j(w6.b bVar, Method method, int i10, float f10) {
            super(bVar, "number", method, i10, null);
            this.f15789i = f10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache.java */
    /* loaded from: classes.dex */
    public static class k extends m {

        /* renamed from: i  reason: collision with root package name */
        private final int f15790i;

        public k(w6.a aVar, Method method, int i10) {
            super(aVar, "number", method, (a) null);
            this.f15790i = i10;
        }

        @Override // com.facebook.react.uimanager.e1.m
        protected Object c(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.f15790i : Integer.valueOf(((Double) obj).intValue()).intValue());
        }

        public k(w6.b bVar, Method method, int i10, int i11) {
            super(bVar, "number", method, i10, null);
            this.f15790i = i11;
        }
    }
}
