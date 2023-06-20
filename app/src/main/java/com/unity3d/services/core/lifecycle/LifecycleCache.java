package com.unity3d.services.core.lifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@TargetApi(14)
/* loaded from: classes3.dex */
public class LifecycleCache implements Application.ActivityLifecycleCallbacks {
    private LifecycleEvent _currentState = LifecycleEvent.RESUMED;
    private boolean _appActive = true;
    private Map<String, IAppActiveListener> _appActiveListeners = new ConcurrentHashMap();

    public void addListener(String str, IAppActiveListener iAppActiveListener) {
        this._appActiveListeners.put(str, iAppActiveListener);
    }

    public LifecycleEvent getCurrentState() {
        return this._currentState;
    }

    public boolean isAppActive() {
        return this._appActive;
    }

    public void notifyListeners(String str) {
        if (this._appActiveListeners.get(str) != null) {
            this._appActiveListeners.get(str).onAppStateChanged(this._appActive ? LifecycleEvent.RESUMED : LifecycleEvent.PAUSED);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.CREATED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this._currentState = LifecycleEvent.DESTROYED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this._currentState = LifecycleEvent.PAUSED;
        this._appActive = false;
        if (this._appActiveListeners.containsKey(activity.getClass().getName())) {
            notifyListeners(activity.getClass().getName());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this._currentState = LifecycleEvent.RESUMED;
        this._appActive = true;
        if (this._appActiveListeners.containsKey(activity.getClass().getName())) {
            notifyListeners(activity.getClass().getName());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.SAVE_INSTANCE_STATE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this._currentState = LifecycleEvent.STARTED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this._currentState = LifecycleEvent.STOPPED;
    }

    public void removeListener(String str) {
        this._appActiveListeners.remove(str);
    }
}
