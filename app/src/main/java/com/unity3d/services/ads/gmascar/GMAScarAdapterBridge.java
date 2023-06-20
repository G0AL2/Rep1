package com.unity3d.services.ads.gmascar;

import com.google.android.gms.ads.AdActivity;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.l;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class GMAScarAdapterBridge {
    private GMAEventSender _gmaEventSender;
    private GMAInitializer _gmaInitializer;
    private f _scarAdapter;
    private ScarVersionFinder _scarVersionFinder;
    private final String SCAR_ACTIVITY_CLASS_NAME = AdActivity.CLASS_NAME;
    private MobileAdsBridge _mobileAdsBridge = new MobileAdsBridge();
    private InitializationStatusBridge _initializationStatusBridge = new InitializationStatusBridge();
    private InitializeListenerBridge _initializationListenerBridge = new InitializeListenerBridge();
    private AdapterStatusBridge _adapterStatusBridge = new AdapterStatusBridge();
    private WebViewErrorHandler _webViewErrorHandler = new WebViewErrorHandler();
    private ScarAdapterFactory _scarAdapterFactory = new ScarAdapterFactory();
    private PresenceDetector _presenceDetector = new PresenceDetector(this._mobileAdsBridge, this._initializationListenerBridge, this._initializationStatusBridge, this._adapterStatusBridge);

    public GMAScarAdapterBridge() {
        GMAInitializer gMAInitializer = new GMAInitializer(this._mobileAdsBridge, this._initializationListenerBridge, this._initializationStatusBridge, this._adapterStatusBridge);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new ScarVersionFinder(this._mobileAdsBridge, this._presenceDetector, gMAInitializer);
        this._gmaEventSender = new GMAEventSender();
    }

    private f getScarAdapterObject() {
        if (this._scarAdapter == null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(this._scarVersionFinder.getGoogleSdkVersionCode(), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer num) {
        return new EventSubject(AdActivity.CLASS_NAME, new ArrayDeque(Arrays.asList(c.FIRST_QUARTILE, c.MIDPOINT, c.THIRD_QUARTILE, c.LAST_QUARTILE)), num, new DefaultIntervalTimerFactory());
    }

    private void loadInterstitialAd(od.c cVar) {
        this._scarAdapter.b(ClientProperties.getApplicationContext(), cVar, new ScarInterstitialAdHandler(cVar, getScarEventSubject(cVar.e())));
    }

    private void loadRewardedAd(od.c cVar) {
        this._scarAdapter.d(ClientProperties.getApplicationContext(), cVar, new ScarRewardedAdHandler(cVar, getScarEventSubject(cVar.e())));
    }

    public void getSCARSignals(String[] strArr, String[] strArr2) {
        this._scarAdapter = getScarAdapterObject();
        SignalsHandler signalsHandler = new SignalsHandler();
        f fVar = this._scarAdapter;
        if (fVar != null) {
            fVar.a(ClientProperties.getApplicationContext(), strArr, strArr2, signalsHandler);
        } else {
            this._webViewErrorHandler.handleError((l) b.e("Could not create SCAR adapter object"));
        }
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public void initializeScar() {
        if (this._presenceDetector.areGMAClassesPresent()) {
            this._gmaEventSender.send(c.SCAR_PRESENT, new Object[0]);
            this._gmaInitializer.initializeGMA();
            return;
        }
        this._webViewErrorHandler.handleError((l) new b(c.SCAR_NOT_PRESENT, new Object[0]));
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z10, String str, String str2, String str3, String str4, int i10) {
        od.c cVar = new od.c(str, str2, str4, str3, Integer.valueOf(i10));
        f scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((l) b.c(cVar, "Scar Adapter object is null"));
        } else if (z10) {
            loadInterstitialAd(cVar);
        } else {
            loadRewardedAd(cVar);
        }
    }

    public void show(String str, String str2, boolean z10) {
        od.c cVar = new od.c(str, str2);
        f scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject != null) {
            scarAdapterObject.c(ClientProperties.getActivity(), str2, str);
        } else {
            this._webViewErrorHandler.handleError((l) b.d(cVar, "Scar Adapter object is null"));
        }
    }
}
