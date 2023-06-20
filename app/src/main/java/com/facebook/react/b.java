package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DebugCorePackage.java */
/* loaded from: classes.dex */
public class b extends y {

    /* compiled from: DebugCorePackage.java */
    /* loaded from: classes.dex */
    class a implements p6.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f15336a;

        a(b bVar, Map map) {
            this.f15336a = map;
        }

        @Override // p6.a
        public Map<String, ReactModuleInfo> a() {
            return this.f15336a;
        }
    }

    @Override // com.facebook.react.y
    public NativeModule c(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (str.equals(JSCHeapCapture.TAG)) {
            return new JSCHeapCapture(reactApplicationContext);
        }
        throw new IllegalArgumentException("In DebugCorePackage, could not find Native module for " + str);
    }

    @Override // com.facebook.react.y
    public p6.a e() {
        try {
            return (p6.a) Class.forName("com.facebook.react.DebugCorePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {JSCHeapCapture.class};
            HashMap hashMap = new HashMap();
            for (int i10 = 0; i10 < 1; i10++) {
                Class cls = clsArr[i10];
                o6.a aVar = (o6.a) cls.getAnnotation(o6.a.class);
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            }
            return new a(this, hashMap);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e11);
        }
    }
}
