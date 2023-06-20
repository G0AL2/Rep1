package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: LazyReactPackage.java */
/* loaded from: classes.dex */
public abstract class c implements t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyReactPackage.java */
    /* loaded from: classes.dex */
    public class a implements Iterable<ModuleHolder> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f15337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f15338b;

        /* compiled from: LazyReactPackage.java */
        /* renamed from: com.facebook.react.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0208a implements Iterator<ModuleHolder> {

            /* renamed from: a  reason: collision with root package name */
            int f15339a = 0;

            C0208a() {
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public ModuleHolder next() {
                List list = a.this.f15337a;
                int i10 = this.f15339a;
                this.f15339a = i10 + 1;
                ModuleSpec moduleSpec = (ModuleSpec) list.get(i10);
                String name = moduleSpec.getName();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) a.this.f15338b.get(name);
                if (reactModuleInfo == null) {
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                    try {
                        NativeModule nativeModule = moduleSpec.getProvider().get();
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                        return new ModuleHolder(nativeModule);
                    } catch (Throwable th) {
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                        throw th;
                    }
                }
                return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f15339a < a.this.f15337a.size();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove native modules from the list");
            }
        }

        a(c cVar, List list, Map map) {
            this.f15337a = list;
            this.f15338b = map;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0208a();
        }
    }

    public Iterable<ModuleHolder> a(ReactApplicationContext reactApplicationContext) {
        return new a(this, b(reactApplicationContext), c().a());
    }

    protected abstract List<ModuleSpec> b(ReactApplicationContext reactApplicationContext);

    public abstract p6.a c();

    @Override // com.facebook.react.t
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : b(reactApplicationContext)) {
            com.facebook.systrace.b.a(0L, "createNativeModule").b("module", moduleSpec.getType()).c();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                com.facebook.systrace.b.b(0L).c();
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                com.facebook.systrace.b.b(0L).c();
                throw th;
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.t
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> d10 = d(reactApplicationContext);
        if (d10 != null && !d10.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ModuleSpec moduleSpec : d10) {
                arrayList.add((ViewManager) moduleSpec.getProvider().get());
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public List<ModuleSpec> d(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
