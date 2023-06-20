package com.ironsource.sdk.controller;

import android.os.Build;
import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f27713b = "d";

    /* renamed from: a  reason: collision with root package name */
    final x.d f27714a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(x.d dVar) {
        this.f27714a = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(String str, String str2) {
        if (this.f27714a == null) {
            Logger.e(f27713b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = x.d.class.getDeclaredMethod(str, String.class);
        if (Build.VERSION.SDK_INT >= 17 && !declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
        declaredMethod.invoke(this.f27714a, str2);
    }
}
