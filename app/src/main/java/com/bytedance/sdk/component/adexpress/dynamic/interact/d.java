package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;

/* compiled from: InteractViewFactory.java */
/* loaded from: classes.dex */
public class d {
    public static b a(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar, int i10, int i11) {
        if (context == null || dynamicBaseWidget == null || gVar == null) {
            return null;
        }
        String D = gVar.D();
        D.hashCode();
        char c10 = 65535;
        switch (D.hashCode()) {
            case 50:
                if (D.equals("2")) {
                    c10 = 0;
                    break;
                }
                break;
            case 53:
                if (D.equals("5")) {
                    c10 = 1;
                    break;
                }
                break;
            case 54:
                if (D.equals("6")) {
                    c10 = 2;
                    break;
                }
                break;
            case 55:
                if (D.equals("7")) {
                    c10 = 3;
                    break;
                }
                break;
            case 56:
                if (D.equals("8")) {
                    c10 = 4;
                    break;
                }
                break;
            case 57:
                if (D.equals("9")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1568:
                if (D.equals("11")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1569:
                if (D.equals("12")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1570:
                if (D.equals("13")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1571:
                if (D.equals("14")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1573:
                if (D.equals("16")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1574:
                if (D.equals("17")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1575:
                if (D.equals("18")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new a(context, dynamicBaseWidget, gVar);
            case 1:
            case 7:
                return new i(context, dynamicBaseWidget, gVar);
            case 2:
            case 6:
                return new g(context, dynamicBaseWidget, gVar);
            case 3:
            case '\t':
                return new e(context, dynamicBaseWidget, gVar);
            case 4:
                return new f(context, dynamicBaseWidget, gVar);
            case 5:
            case '\n':
                return new h(context, dynamicBaseWidget, gVar, D, i10);
            case '\b':
                return new j(context, dynamicBaseWidget, gVar);
            case 11:
            case '\f':
                return new k(context, dynamicBaseWidget, gVar, D, i11);
            default:
                return null;
        }
    }
}
