package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.bundleloader.NativeDevSplitBundleLoaderModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.d1;
import com.facebook.react.uimanager.s0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: CoreModulesPackage.java */
/* loaded from: classes.dex */
public class a extends y implements v {

    /* renamed from: a  reason: collision with root package name */
    private final p f15185a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.modules.core.b f15186b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15187c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15188d;

    /* compiled from: CoreModulesPackage.java */
    /* renamed from: com.facebook.react.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0203a implements p6.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f15189a;

        C0203a(a aVar, Map map) {
            this.f15189a = map;
        }

        @Override // p6.a
        public Map<String, ReactModuleInfo> a() {
            return this.f15189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreModulesPackage.java */
    /* loaded from: classes.dex */
    public class b implements d1 {
        b() {
        }

        @Override // com.facebook.react.uimanager.d1
        public List<String> a() {
            return a.this.f15185a.C();
        }

        @Override // com.facebook.react.uimanager.d1
        public ViewManager b(String str) {
            return a.this.f15185a.v(str);
        }
    }

    public a(p pVar, com.facebook.react.modules.core.b bVar, s0 s0Var, boolean z10, int i10) {
        this.f15185a = pVar;
        this.f15186b = bVar;
        this.f15187c = z10;
        this.f15188d = i10;
    }

    private UIManagerModule h(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        com.facebook.systrace.a.c(0L, "createUIManagerModule");
        try {
            if (this.f15187c) {
                return new UIManagerModule(reactApplicationContext, new b(), this.f15188d);
            }
            return new UIManagerModule(reactApplicationContext, this.f15185a.B(reactApplicationContext), this.f15188d);
        } finally {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    @Override // com.facebook.react.v
    public void a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // com.facebook.react.v
    public void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // com.facebook.react.y
    public NativeModule c(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2013505529:
                if (str.equals(LogBoxModule.NAME)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1789797270:
                if (str.equals(TimingModule.NAME)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1633589448:
                if (str.equals(DevSettingsModule.NAME)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1520650172:
                if (str.equals(DeviceInfoModule.NAME)) {
                    c10 = 3;
                    break;
                }
                break;
            case -1037217463:
                if (str.equals(DeviceEventManagerModule.NAME)) {
                    c10 = 4;
                    break;
                }
                break;
            case -790603268:
                if (str.equals(AndroidInfoModule.NAME)) {
                    c10 = 5;
                    break;
                }
                break;
            case -508954630:
                if (str.equals(NativeDevSplitBundleLoaderModule.NAME)) {
                    c10 = 6;
                    break;
                }
                break;
            case 512434409:
                if (str.equals(ExceptionsManagerModule.NAME)) {
                    c10 = 7;
                    break;
                }
                break;
            case 881516744:
                if (str.equals(SourceCodeModule.NAME)) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1256514152:
                if (str.equals(HeadlessJsTaskSupportModule.NAME)) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1861242489:
                if (str.equals(UIManagerModule.NAME)) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new LogBoxModule(reactApplicationContext, this.f15185a.A());
            case 1:
                return new TimingModule(reactApplicationContext, this.f15185a.A());
            case 2:
                return new DevSettingsModule(reactApplicationContext, this.f15185a.A());
            case 3:
                return new DeviceInfoModule(reactApplicationContext);
            case 4:
                return new DeviceEventManagerModule(reactApplicationContext, this.f15186b);
            case 5:
                return new AndroidInfoModule(reactApplicationContext);
            case 6:
                return new NativeDevSplitBundleLoaderModule(reactApplicationContext, this.f15185a.A());
            case 7:
                return new ExceptionsManagerModule(this.f15185a.A());
            case '\b':
                return new SourceCodeModule(reactApplicationContext);
            case '\t':
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case '\n':
                return h(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    @Override // com.facebook.react.y
    public p6.a e() {
        try {
            return (p6.a) Class.forName("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class, NativeDevSplitBundleLoaderModule.class};
            HashMap hashMap = new HashMap();
            for (int i10 = 0; i10 < 11; i10++) {
                Class cls = clsArr[i10];
                o6.a aVar = (o6.a) cls.getAnnotation(o6.a.class);
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            }
            return new C0203a(this, hashMap);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e11);
        }
    }
}
