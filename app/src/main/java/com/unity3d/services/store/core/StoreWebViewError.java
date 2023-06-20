package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.l;
import com.unity3d.services.core.webview.WebViewEventCategory;

/* loaded from: classes3.dex */
public class StoreWebViewError extends l {
    public StoreWebViewError(Enum<?> r12, String str, Object... objArr) {
        super(r12, str, objArr);
    }

    @Override // com.unity3d.scar.adapter.common.l
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
