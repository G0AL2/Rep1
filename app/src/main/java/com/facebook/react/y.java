package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;

/* compiled from: TurboReactPackage.java */
/* loaded from: classes.dex */
public abstract class y implements t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TurboReactPackage.java */
    /* loaded from: classes.dex */
    public class a implements Iterable<ModuleHolder> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f16474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f16475b;

        /* compiled from: TurboReactPackage.java */
        /* renamed from: com.facebook.react.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0220a implements Iterator<ModuleHolder> {

            /* renamed from: a  reason: collision with root package name */
            Map.Entry<String, ReactModuleInfo> f16477a = null;

            C0220a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void b() {
                /*
                    r3 = this;
                L0:
                    com.facebook.react.y$a r0 = com.facebook.react.y.a.this
                    java.util.Iterator r0 = r0.f16474a
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L28
                    com.facebook.react.y$a r0 = com.facebook.react.y.a.this
                    java.util.Iterator r0 = r0.f16474a
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r1 = r0.getValue()
                    com.facebook.react.module.model.ReactModuleInfo r1 = (com.facebook.react.module.model.ReactModuleInfo) r1
                    boolean r2 = com.facebook.react.config.ReactFeatureFlags.useTurboModules
                    if (r2 == 0) goto L25
                    boolean r1 = r1.e()
                    if (r1 == 0) goto L25
                    goto L0
                L25:
                    r3.f16477a = r0
                    return
                L28:
                    r0 = 0
                    r3.f16477a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.y.a.C0220a.b():void");
            }

            @Override // java.util.Iterator
            /* renamed from: c */
            public ModuleHolder next() {
                if (this.f16477a == null) {
                    b();
                }
                Map.Entry<String, ReactModuleInfo> entry = this.f16477a;
                if (entry != null) {
                    b();
                    a aVar = a.this;
                    return new ModuleHolder(entry.getValue(), new b(entry.getKey(), aVar.f16475b));
                }
                throw new NoSuchElementException("ModuleHolder not found");
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f16477a == null) {
                    b();
                }
                return this.f16477a != null;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove native modules from the list");
            }
        }

        a(Iterator it, ReactApplicationContext reactApplicationContext) {
            this.f16474a = it;
            this.f16475b = reactApplicationContext;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0220a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TurboReactPackage.java */
    /* loaded from: classes.dex */
    public class b implements Provider<NativeModule> {

        /* renamed from: a  reason: collision with root package name */
        private final String f16479a;

        /* renamed from: b  reason: collision with root package name */
        private final ReactApplicationContext f16480b;

        public b(String str, ReactApplicationContext reactApplicationContext) {
            this.f16479a = str;
            this.f16480b = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return y.this.c(this.f16479a, this.f16480b);
        }
    }

    public abstract NativeModule c(String str, ReactApplicationContext reactApplicationContext);

    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
    }

    @Override // com.facebook.react.t
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> f10 = f(reactApplicationContext);
        if (f10 != null && !f10.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ModuleSpec moduleSpec : f10) {
                arrayList.add((ViewManager) moduleSpec.getProvider().get());
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public Iterable<ModuleHolder> d(ReactApplicationContext reactApplicationContext) {
        return new a(e().a().entrySet().iterator(), reactApplicationContext);
    }

    public abstract p6.a e();

    protected List<ModuleSpec> f(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
