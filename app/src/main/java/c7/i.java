package c7;

import android.view.View;
import c7.j;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;

/* compiled from: ModalHostViewManagerDelegate.java */
/* loaded from: classes.dex */
public class i<T extends View, U extends com.facebook.react.uimanager.b<T> & j<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public i(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.a1
    public void a(T t10, String str, Object obj) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1851617609:
                if (str.equals("presentationStyle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1850124175:
                if (str.equals("supportedOrientations")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1726194350:
                if (str.equals("transparent")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1618432855:
                if (str.equals("identifier")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    c10 = 4;
                    break;
                }
                break;
            case -795203165:
                if (str.equals("animated")) {
                    c10 = 5;
                    break;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1195991583:
                if (str.equals("hardwareAccelerated")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2031205598:
                if (str.equals("animationType")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((j) this.f15748a).setPresentationStyle(t10, (String) obj);
                return;
            case 1:
                ((j) this.f15748a).setSupportedOrientations(t10, (ReadableArray) obj);
                return;
            case 2:
                ((j) this.f15748a).setTransparent(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 3:
                ((j) this.f15748a).setIdentifier(t10, obj != null ? ((Double) obj).intValue() : 0);
                return;
            case 4:
                ((j) this.f15748a).setStatusBarTranslucent(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((j) this.f15748a).setAnimated(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 6:
                ((j) this.f15748a).setVisible(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 7:
                ((j) this.f15748a).setHardwareAccelerated(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case '\b':
                ((j) this.f15748a).setAnimationType(t10, (String) obj);
                return;
            default:
                super.a(t10, str, obj);
                return;
        }
    }
}
