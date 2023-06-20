package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReactPackageHelper.java */
/* loaded from: classes.dex */
public class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactPackageHelper.java */
    /* loaded from: classes.dex */
    public class a implements Iterable<ModuleHolder> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f15738a;

        /* compiled from: ReactPackageHelper.java */
        /* renamed from: com.facebook.react.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0216a implements Iterator<ModuleHolder> {

            /* renamed from: a  reason: collision with root package name */
            int f15739a = 0;

            C0216a() {
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public ModuleHolder next() {
                List list = a.this.f15738a;
                int i10 = this.f15739a;
                this.f15739a = i10 + 1;
                return new ModuleHolder((NativeModule) list.get(i10));
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f15739a < a.this.f15738a.size();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove methods ");
            }
        }

        a(List list) {
            this.f15738a = list;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0216a();
        }
    }

    public static Iterable<ModuleHolder> a(t tVar, ReactApplicationContext reactApplicationContext, p pVar) {
        List<NativeModule> createNativeModules;
        z3.a.b("ReactNative", tVar.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        if (tVar instanceof r) {
            createNativeModules = ((r) tVar).a(reactApplicationContext, pVar);
        } else {
            createNativeModules = tVar.createNativeModules(reactApplicationContext);
        }
        return new a(createNativeModules);
    }
}
