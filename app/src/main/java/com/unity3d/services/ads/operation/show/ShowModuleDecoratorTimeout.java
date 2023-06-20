package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.request.metrics.SDKMetricEvents;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class ShowModuleDecoratorTimeout extends ShowModuleDecorator {
    private static String errorMsgTimeout = "[UnityAds] Timeout while trying to show ";
    private ExecutorService _executorService;

    public ShowModuleDecoratorTimeout(IShowModule iShowModule) {
        super(iShowModule);
        this._executorService = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOperationTimeout(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        if (showOperationState != null) {
            remove(showOperationState.f28537id);
            showOperationState.onUnityAdsShowFailure(unityAdsShowError, str);
        }
        getMetricSender().sendSDKMetricEvent(SDKMetricEvents.native_show_timeout_error);
    }

    private void releaseOperationTimeoutLock(String str) {
        IShowOperation iShowOperation = get(str);
        if (iShowOperation == null || iShowOperation.getShowOperationState() == null || iShowOperation.getShowOperationState().timeoutCV == null) {
            return;
        }
        iShowOperation.getShowOperationState().timeoutCV.open();
    }

    private void startShowTimeout(final ShowOperationState showOperationState) {
        this._executorService.submit(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowModuleDecoratorTimeout.1
            @Override // java.lang.Runnable
            public void run() {
                ShowOperationState showOperationState2 = showOperationState;
                if (showOperationState2.timeoutCV.block(showOperationState2.configuration.getShowTimeout())) {
                    return;
                }
                ShowModuleDecoratorTimeout showModuleDecoratorTimeout = ShowModuleDecoratorTimeout.this;
                ShowOperationState showOperationState3 = showOperationState;
                UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                showModuleDecoratorTimeout.onOperationTimeout(showOperationState3, unityAdsShowError, ShowModuleDecoratorTimeout.errorMsgTimeout + showOperationState.placementId);
            }
        });
    }

    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowConsent(String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowConsent(str);
    }

    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowStart(String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowStart(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, ShowOperationState showOperationState) {
        startShowTimeout(showOperationState);
        super.executeAdOperation(iWebViewBridgeInvoker, showOperationState);
    }
}
