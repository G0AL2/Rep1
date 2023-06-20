package com.ironsource.sdk.i;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.b;

/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C0354a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f28199a;

        static {
            int[] iArr = new int[d.a.a().length];
            f28199a = iArr;
            try {
                int i10 = d.a.f28161a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f28199a;
                int i11 = d.a.f28162b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f28199a;
                int i12 = d.a.f28163c;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static boolean a(Activity activity) {
        int parseInt = Integer.parseInt(b.a().f28257a.getString("back_button_state", "2"));
        if (C0354a.f28199a[(parseInt == 0 ? d.a.f28161a : parseInt == 1 ? d.a.f28162b : d.a.f28163c) - 1] != 3) {
            return false;
        }
        try {
            x xVar = (x) com.ironsource.sdk.d.b.a((Context) activity).f28044a.f27736a;
            if (xVar != null) {
                xVar.b(x.b("nativeNavigationPressed", x.a("action", "back", null, null, null, null, null, null, null, false)));
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
