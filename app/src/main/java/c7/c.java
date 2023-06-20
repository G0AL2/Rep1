package c7;

import android.view.View;
import c7.d;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.b;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;

/* compiled from: AndroidProgressBarManagerDelegate.java */
/* loaded from: classes.dex */
public class c<T extends View, U extends com.facebook.react.uimanager.b<T> & d<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public c(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.a1
    public void a(T t10, String str, Object obj) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals(DownloadWorker.KEY_OUT_PROGRESS)) {
                    c10 = 0;
                    break;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c10 = 1;
                    break;
                }
                break;
            case -676876213:
                if (str.equals("typeAttr")) {
                    c10 = 2;
                    break;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    c10 = 3;
                    break;
                }
                break;
            case 633138363:
                if (str.equals("indeterminate")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1118509918:
                if (str.equals("animating")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1804741442:
                if (str.equals("styleAttr")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((d) this.f15748a).setProgress(t10, obj == null ? 0.0d : ((Double) obj).doubleValue());
                return;
            case 1:
                ((d) this.f15748a).setTestID(t10, obj == null ? "" : (String) obj);
                return;
            case 2:
                ((d) this.f15748a).setTypeAttr(t10, obj != null ? (String) obj : null);
                return;
            case 3:
                ((d) this.f15748a).setColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            case 4:
                ((d) this.f15748a).setIndeterminate(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((d) this.f15748a).setAnimating(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 6:
                ((d) this.f15748a).setStyleAttr(t10, obj != null ? (String) obj : null);
                return;
            default:
                super.a(t10, str, obj);
                return;
        }
    }
}
