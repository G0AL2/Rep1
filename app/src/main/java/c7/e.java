package c7;

import android.view.View;
import c7.f;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;

/* compiled from: AndroidSwipeRefreshLayoutManagerDelegate.java */
/* loaded from: classes.dex */
public class e<T extends View, U extends com.facebook.react.uimanager.b<T> & f<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public e(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.a1
    public void a(T t10, String str, Object obj) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1354842768:
                if (str.equals("colors")) {
                    c10 = 1;
                    break;
                }
                break;
            case -885150488:
                if (str.equals("progressBackgroundColor")) {
                    c10 = 2;
                    break;
                }
                break;
            case -416037467:
                if (str.equals("progressViewOffset")) {
                    c10 = 3;
                    break;
                }
                break;
            case -321826009:
                if (str.equals("refreshing")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((f) this.f15748a).setEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 1:
                ((f) this.f15748a).setColors(t10, (ReadableArray) obj);
                return;
            case 2:
                ((f) this.f15748a).setProgressBackgroundColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            case 3:
                ((f) this.f15748a).setProgressViewOffset(t10, obj == null ? 0.0f : ((Double) obj).floatValue());
                return;
            case 4:
                ((f) this.f15748a).setRefreshing(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((f) this.f15748a).setSize(t10, (String) obj);
                return;
            default:
                super.a(t10, str, obj);
                return;
        }
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.a1
    public void b(T t10, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing")) {
            ((f) this.f15748a).setNativeRefreshing(t10, readableArray.getBoolean(0));
        }
    }
}
