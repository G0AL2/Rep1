package c7;

import android.view.View;
import c7.b;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;

/* compiled from: AndroidDrawerLayoutManagerDelegate.java */
/* loaded from: classes.dex */
public class a<T extends View, U extends com.facebook.react.uimanager.b<T> & b<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public a(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.a1
    public void a(T t10, String str, Object obj) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2082382380:
                if (str.equals("statusBarBackgroundColor")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1233873500:
                if (str.equals("drawerBackgroundColor")) {
                    c10 = 1;
                    break;
                }
                break;
            case -764307226:
                if (str.equals("keyboardDismissMode")) {
                    c10 = 2;
                    break;
                }
                break;
            case 268251989:
                if (str.equals("drawerWidth")) {
                    c10 = 3;
                    break;
                }
                break;
            case 695891258:
                if (str.equals("drawerPosition")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1857208703:
                if (str.equals("drawerLockMode")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((b) this.f15748a).setStatusBarBackgroundColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            case 1:
                ((b) this.f15748a).setDrawerBackgroundColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            case 2:
                ((b) this.f15748a).setKeyboardDismissMode(t10, (String) obj);
                return;
            case 3:
                ((b) this.f15748a).setDrawerWidth(t10, obj == null ? null : Float.valueOf(((Double) obj).floatValue()));
                return;
            case 4:
                ((b) this.f15748a).setDrawerPosition(t10, (String) obj);
                return;
            case 5:
                ((b) this.f15748a).setDrawerLockMode(t10, (String) obj);
                return;
            default:
                super.a(t10, str, obj);
                return;
        }
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.a1
    public void b(T t10, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("closeDrawer")) {
            ((b) this.f15748a).closeDrawer(t10);
        } else if (str.equals("openDrawer")) {
            ((b) this.f15748a).openDrawer(t10);
        }
    }
}
