package com.unity3d.services.core.configuration;

/* loaded from: classes3.dex */
public interface IInitializationNotificationCenter {
    void addListener(IInitializationListener iInitializationListener);

    void removeListener(IInitializationListener iInitializationListener);

    void triggerOnSdkInitializationFailed(String str, int i10);

    void triggerOnSdkInitialized();
}
