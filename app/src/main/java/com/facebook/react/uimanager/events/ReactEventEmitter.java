package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* loaded from: classes.dex */
public class ReactEventEmitter implements RCTModernEventEmitter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ReactEventEmitter";
    private RCTModernEventEmitter mFabricEventEmitter = null;
    private RCTEventEmitter mRCTEventEmitter = null;
    private final ReactApplicationContext mReactContext;

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    private RCTEventEmitter getEventEmitter(int i10) {
        int a10 = x6.a.a(i10);
        if (this.mRCTEventEmitter == null) {
            if (this.mReactContext.hasActiveReactInstance()) {
                this.mRCTEventEmitter = (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter from Context for reactTag: " + i10 + " - uiManagerType: " + a10 + " - No active Catalyst instance!"));
            }
        }
        return this.mRCTEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(-1, i10, str, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        f6.a.a(writableArray.size() > 0);
        int i10 = writableArray.getMap(0).getInt(Analytics.Param.TARGET);
        if (x6.a.a(i10) != 1 || getEventEmitter(i10) == null) {
            return;
        }
        this.mRCTEventEmitter.receiveTouches(str, writableArray, writableArray2);
    }

    public void register(int i10, RCTModernEventEmitter rCTModernEventEmitter) {
        this.mFabricEventEmitter = rCTModernEventEmitter;
    }

    public void unregister(int i10) {
        if (i10 == 1) {
            this.mRCTEventEmitter = null;
        } else {
            this.mFabricEventEmitter = null;
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i10, int i11, String str, WritableMap writableMap) {
        receiveEvent(i10, i11, str, false, 0, writableMap, 2);
    }

    public void register(int i10, RCTEventEmitter rCTEventEmitter) {
        this.mRCTEventEmitter = rCTEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i10, int i11, String str, boolean z10, int i12, WritableMap writableMap, int i13) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int a10 = x6.a.a(i11);
        if (a10 == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            rCTModernEventEmitter.receiveEvent(i10, i11, str, z10, i12, writableMap, i13);
        } else if (a10 == 1 && getEventEmitter(i11) != null) {
            this.mRCTEventEmitter.receiveEvent(i11, str, writableMap);
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receiveEvent: SurfaceId[" + i10 + "] ReactTag[" + i11 + "] UIManagerType[" + a10 + "] EventName[" + str + "]"));
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(j jVar) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int viewTag = jVar.getViewTag();
        int a10 = x6.a.a(viewTag);
        if (a10 == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            rCTModernEventEmitter.receiveTouches(jVar);
        } else if (a10 == 1 && getEventEmitter(viewTag) != null) {
            m.d(this.mRCTEventEmitter, jVar);
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receivedTouches: ReactTag[" + viewTag + "] UIManagerType[" + a10 + "] EventName[" + jVar.getEventName() + "]"));
        }
    }
}
