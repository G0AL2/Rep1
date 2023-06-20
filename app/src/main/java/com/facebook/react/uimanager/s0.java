package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: UIImplementationProvider.java */
@Deprecated
/* loaded from: classes.dex */
public class s0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r0 a(ReactApplicationContext reactApplicationContext, c1 c1Var, com.facebook.react.uimanager.events.d dVar, int i10) {
        com.facebook.systrace.a.c(0L, "UIImplementationProvider.createUIImplementation[3]");
        try {
            return new r0(reactApplicationContext, c1Var, dVar, i10);
        } finally {
            com.facebook.systrace.a.g(0L);
        }
    }
}
