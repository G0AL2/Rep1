package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.l;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.store.StoreError;
import com.unity3d.services.store.StoreEvent;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class StoreExceptionHandler {
    private final WebViewErrorHandler _webViewErrorHandler;

    public StoreExceptionHandler(WebViewErrorHandler webViewErrorHandler) {
        this._webViewErrorHandler = webViewErrorHandler;
    }

    private StoreError getStoreError(Exception exc) {
        StoreError storeError = StoreError.UNKNOWN_ERROR;
        if (exc instanceof NoSuchMethodException) {
            return StoreError.NO_SUCH_METHOD;
        }
        if (exc instanceof IllegalAccessException) {
            return StoreError.ILLEGAL_ACCESS;
        }
        if (exc instanceof JSONException) {
            return StoreError.JSON_ERROR;
        }
        if (exc instanceof InvocationTargetException) {
            return StoreError.INVOCATION_TARGET;
        }
        return exc instanceof ClassNotFoundException ? StoreError.CLASS_NOT_FOUND : storeError;
    }

    private void sendErrorToWebView(StoreEvent storeEvent, StoreError storeError, int i10, Exception exc) {
        this._webViewErrorHandler.handleError((l) new StoreWebViewError(storeEvent, exc.getMessage(), Integer.valueOf(i10), storeError, exc.getMessage()));
    }

    public void handleStoreException(StoreEvent storeEvent, int i10, Exception exc) {
        sendErrorToWebView(storeEvent, getStoreError(exc), i10, exc);
    }
}
