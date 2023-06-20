package com.unity3d.services.ads.operation;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;
import java.util.UUID;

/* loaded from: classes3.dex */
public class OperationState implements IWebViewSharedObject {
    private static String _emptyPlacementId = "";
    public Configuration configuration;

    /* renamed from: id  reason: collision with root package name */
    public String f28537id;
    public String placementId;
    public ConditionVariable timeoutCV;

    public OperationState(String str, Configuration configuration) {
        this.placementId = str == null ? _emptyPlacementId : str;
        this.configuration = configuration;
        this.timeoutCV = new ConditionVariable();
        this.f28537id = UUID.randomUUID().toString();
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public String getId() {
        return this.f28537id;
    }
}
