package u6;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r5.i;

/* compiled from: MainReactPackage.java */
/* loaded from: classes.dex */
public class b extends y {

    /* compiled from: MainReactPackage.java */
    /* loaded from: classes.dex */
    class a implements p6.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f37580a;

        a(b bVar, Map map) {
            this.f37580a = map;
        }

        @Override // p6.a
        public Map<String, ReactModuleInfo> a() {
            return this.f37580a;
        }
    }

    public b(u6.a aVar) {
    }

    @Override // com.facebook.react.y
    public NativeModule c(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2115067288:
                if (str.equals(ToastModule.NAME)) {
                    c10 = 0;
                    break;
                }
                break;
            case -2033388651:
                if (str.equals(AsyncStorageModule.NAME)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1962922905:
                if (str.equals(ImageStoreManager.NAME)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1850625090:
                if (str.equals(SoundManagerModule.NAME)) {
                    c10 = 3;
                    break;
                }
                break;
            case -1654566518:
                if (str.equals(DialogModule.NAME)) {
                    c10 = 4;
                    break;
                }
                break;
            case -1344126773:
                if (str.equals(FileReaderModule.NAME)) {
                    c10 = 5;
                    break;
                }
                break;
            case -1062061717:
                if (str.equals(PermissionsModule.NAME)) {
                    c10 = 6;
                    break;
                }
                break;
            case -657277650:
                if (str.equals(ImageLoaderModule.NAME)) {
                    c10 = 7;
                    break;
                }
                break;
            case -570370161:
                if (str.equals(I18nManagerModule.NAME)) {
                    c10 = '\b';
                    break;
                }
                break;
            case -504784764:
                if (str.equals(AppearanceModule.NAME)) {
                    c10 = '\t';
                    break;
                }
                break;
            case -457866500:
                if (str.equals(AccessibilityInfoModule.NAME)) {
                    c10 = '\n';
                    break;
                }
                break;
            case -382654004:
                if (str.equals(StatusBarModule.NAME)) {
                    c10 = 11;
                    break;
                }
                break;
            case -254310125:
                if (str.equals("WebSocketModule")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 163245714:
                if (str.equals(FrescoModule.NAME)) {
                    c10 = '\r';
                    break;
                }
                break;
            case 403570038:
                if (str.equals(ClipboardModule.NAME)) {
                    c10 = 14;
                    break;
                }
                break;
            case 563961875:
                if (str.equals(IntentModule.NAME)) {
                    c10 = 15;
                    break;
                }
                break;
            case 1221389072:
                if (str.equals(AppStateModule.NAME)) {
                    c10 = 16;
                    break;
                }
                break;
            case 1515242260:
                if (str.equals(NetworkingModule.NAME)) {
                    c10 = 17;
                    break;
                }
                break;
            case 1547941001:
                if (str.equals(BlobModule.NAME)) {
                    c10 = 18;
                    break;
                }
                break;
            case 1555425035:
                if (str.equals(ShareModule.NAME)) {
                    c10 = 19;
                    break;
                }
                break;
            case 1721274886:
                if (str.equals(NativeAnimatedModule.NAME)) {
                    c10 = 20;
                    break;
                }
                break;
            case 1922110066:
                if (str.equals(VibrationModule.NAME)) {
                    c10 = 21;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new ToastModule(reactApplicationContext);
            case 1:
                return new AsyncStorageModule(reactApplicationContext);
            case 2:
                return new ImageStoreManager(reactApplicationContext);
            case 3:
                return new SoundManagerModule(reactApplicationContext);
            case 4:
                return new DialogModule(reactApplicationContext);
            case 5:
                return new FileReaderModule(reactApplicationContext);
            case 6:
                return new PermissionsModule(reactApplicationContext);
            case 7:
                return new ImageLoaderModule(reactApplicationContext);
            case '\b':
                return new I18nManagerModule(reactApplicationContext);
            case '\t':
                return new AppearanceModule(reactApplicationContext);
            case '\n':
                return new AccessibilityInfoModule(reactApplicationContext);
            case 11:
                return new StatusBarModule(reactApplicationContext);
            case '\f':
                return new WebSocketModule(reactApplicationContext);
            case '\r':
                return new FrescoModule(reactApplicationContext, true, (i) null);
            case 14:
                return new ClipboardModule(reactApplicationContext);
            case 15:
                return new IntentModule(reactApplicationContext);
            case 16:
                return new AppStateModule(reactApplicationContext);
            case 17:
                return new NetworkingModule(reactApplicationContext);
            case 18:
                return new BlobModule(reactApplicationContext);
            case 19:
                return new ShareModule(reactApplicationContext);
            case 20:
                return new NativeAnimatedModule(reactApplicationContext);
            case 21:
                return new VibrationModule(reactApplicationContext);
            default:
                return null;
        }
    }

    @Override // com.facebook.react.y, com.facebook.react.t
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactDrawerLayoutManager());
        arrayList.add(new ReactHorizontalScrollViewManager());
        arrayList.add(new ReactHorizontalScrollContainerViewManager());
        arrayList.add(new ReactProgressBarViewManager());
        arrayList.add(new ReactScrollViewManager());
        arrayList.add(new ReactSliderManager());
        arrayList.add(new ReactSwitchManager());
        arrayList.add(new SwipeRefreshLayoutManager());
        arrayList.add(new FrescoBasedReactTextInlineImageViewManager());
        arrayList.add(new ReactImageManager());
        arrayList.add(new ReactModalHostManager());
        arrayList.add(new ReactRawTextManager());
        arrayList.add(new ReactTextInputManager());
        arrayList.add(new ReactTextViewManager());
        arrayList.add(new ReactViewManager());
        arrayList.add(new ReactVirtualTextViewManager());
        arrayList.add(new ReactUnimplementedViewManager());
        return arrayList;
    }

    @Override // com.facebook.react.y
    public p6.a e() {
        try {
            return (p6.a) Class.forName("com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, FileReaderModule.class, AsyncStorageModule.class, ClipboardModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class};
            HashMap hashMap = new HashMap();
            for (int i10 = 0; i10 < 22; i10++) {
                Class cls = clsArr[i10];
                o6.a aVar = (o6.a) cls.getAnnotation(o6.a.class);
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            }
            return new a(this, hashMap);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e11);
        }
    }
}
