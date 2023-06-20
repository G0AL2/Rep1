package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

/* loaded from: classes.dex */
public class UserServiceImpl implements AppLovinUserService {

    /* renamed from: a  reason: collision with root package name */
    private final m f7975a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserServiceImpl(m mVar) {
        this.f7975a = mVar;
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void preloadConsentDialog() {
        this.f7975a.W().c();
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f7975a.W().a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
