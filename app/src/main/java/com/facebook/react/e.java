package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;

/* compiled from: NativeModuleRegistryBuilder.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f15372a;

    /* renamed from: b  reason: collision with root package name */
    private final p f15373b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, ModuleHolder> f15374c = new HashMap();

    public e(ReactApplicationContext reactApplicationContext, p pVar) {
        this.f15372a = reactApplicationContext;
        this.f15373b = pVar;
    }

    public NativeModuleRegistry a() {
        return new NativeModuleRegistry(this.f15372a, this.f15374c);
    }

    public void b(t tVar) {
        Iterable<ModuleHolder> a10;
        if (tVar instanceof c) {
            a10 = ((c) tVar).a(this.f15372a);
        } else if (tVar instanceof y) {
            a10 = ((y) tVar).d(this.f15372a);
        } else {
            a10 = u.a(tVar, this.f15372a, this.f15373b);
        }
        for (ModuleHolder moduleHolder : a10) {
            String name = moduleHolder.getName();
            if (this.f15374c.containsKey(name)) {
                ModuleHolder moduleHolder2 = this.f15374c.get(name);
                if (moduleHolder.getCanOverrideExistingModule()) {
                    this.f15374c.remove(moduleHolder2);
                } else {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder2.getClassName() + ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                }
            }
            this.f15374c.put(name, moduleHolder);
        }
    }
}
